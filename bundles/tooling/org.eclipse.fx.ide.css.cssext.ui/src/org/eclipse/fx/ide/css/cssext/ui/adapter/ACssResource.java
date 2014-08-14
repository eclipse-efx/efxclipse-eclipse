/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui.adapter;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.osgi.util.LoggerCreator;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic;
import org.eclipse.xtext.parser.packrat.tokens.ParsedAction;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.CancelIndicator;

public abstract class ACssResource implements ICssResource {

	private final String PLUGIN_ID = "org.eclipse.fx.ide.css.cssext.ui"; //$NON-NLS-1$
	
	protected QualifiedName KEY_USE_CUSTOM = new QualifiedName(PLUGIN_ID, "useCustom"); //$NON-NLS-1$
	protected QualifiedName KEY_CUSTOM_EXTENSIONS = new QualifiedName(PLUGIN_ID, "customExtensions"); //$NON-NLS-1$
	protected QualifiedName KEY_DISABLED_EXTENSIONS = new QualifiedName(PLUGIN_ID, "disabledExtensions"); //$NON-NLS-1$
	
	private Logger logger;
	protected Logger getLogger() {
		if (this.logger == null) {
			this.logger = LoggerCreator.createLogger(getClass());
		}
		return this.logger;
	}
	
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	
	private ICssResource parent;
	private IResource adaptedObject;
	
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.propertyChangeSupport.addPropertyChangeListener(listener);
	}
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		this.propertyChangeSupport.removePropertyChangeListener(listener);
	}
	
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		this.propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}
	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		this.propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
	}
	
	
	@Override
	public ICssResource getParentResource() {
		if (parent == null) {
			parent = findParent();
		}
		return parent;
	}
	
	public ACssResource(IResource adaptedObject) {
		this.adaptedObject = adaptedObject;
		
		try {
			load();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean useCustom;
	private List<URI> disabledExtensions = new ArrayList<>();
	private List<URI> customExtensions = new ArrayList<>();

	private ResourceSet rs;

	private Manager manager;

	private IResourceDescriptions x;
	
	public void save() throws CoreException {
		this.adaptedObject.setPersistentProperty(KEY_USE_CUSTOM, Boolean.toString(useCustom));
		
		try {
			getLogger().debug("after save: " + adaptedObject.getPersistentProperties());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		String disabled = disabledExtensions.stream().map((uri)->uri.toString()).collect(Collectors.joining(","));
		this.adaptedObject.setPersistentProperty(KEY_DISABLED_EXTENSIONS, disabled);
		
		String custom = customExtensions.stream().map((uri)->uri.toString()).collect(Collectors.joining(","));
		this.adaptedObject.setPersistentProperty(KEY_CUSTOM_EXTENSIONS, custom);
	}
	
	private List<URI> parseURIs(String data) {
		getLogger().debug("parseURIs(" + data + ")");
		String[] disabledExtensionURIs = data.split(",");
		List<URI> uris = new ArrayList<>();
		for (String uriString : disabledExtensionURIs) {
			if (uriString != null && uriString.trim().length() > 0) {
				URI uri = URI.createURI(uriString);
				uris.add(uri);
			}
		}
		getLogger().debug(" result = " + uris.size() + " / " + uris);
		return uris;
	}
	
	public void load() throws CoreException {
		setUseCustom(Boolean.parseBoolean(this.adaptedObject.getPersistentProperty(KEY_USE_CUSTOM)));
		
		final String disabledExtensionsData = this.adaptedObject.getPersistentProperty(KEY_DISABLED_EXTENSIONS);
		if (disabledExtensionsData != null) {
			List<URI> uris = parseURIs(disabledExtensionsData);
			propertyChangeSupport.firePropertyChange("disabledCssExtensions", disabledExtensions, disabledExtensions = uris);
		}
		else {
			propertyChangeSupport.firePropertyChange("disabledCssExtensions", disabledExtensions, disabledExtensions = new ArrayList<>());
		}
		
		
		final String customExtensionsData = this.adaptedObject.getPersistentProperty(KEY_CUSTOM_EXTENSIONS);
		if (customExtensionsData != null) {
			List<URI> uris = parseURIs(customExtensionsData);
			propertyChangeSupport.firePropertyChange("customCssExtensions", customExtensions, customExtensions = uris);
		}
		else {
			propertyChangeSupport.firePropertyChange("customCssExtensions", customExtensions, customExtensions = new ArrayList<>());
		}
		
		getLogger().debug("load done");
		getLogger().debug("disabled: " + disabledExtensions);
		getLogger().debug("custom: " + customExtensions);
	}
	
	protected IProject findProject() {
		IResource res = (IResource) Platform.getAdapterManager().getAdapter(this.getAdaptedObject(), IResource.class);
		IProject project = (IProject) Platform.getAdapterManager().getAdapter(res, IProject.class);
		while (project == null && res.getParent() != null) {
			res = res.getParent();
			project = (IProject) Platform.getAdapterManager().getAdapter(res, IProject.class);
		}
		return project;
	}
	
	
	private ICssResource findParent() {
		ICssResource parent = null;
		
		getLogger().debug(adaptedObject +  " searching parent for " + adaptedObject + " " + adaptedObject.getClass().getName());
		IContainer container = adaptedObject.getParent();
		parent = (ICssResource) Platform.getAdapterManager().getAdapter(container, ICssResource.class);
		
//		if (adaptedObject instanceof IPackageFragment) {
//			// we have a package
//			final IPackageFragment pck = (IPackageFragment) adaptedObject;
//			final IJavaElement parent2 = pck.getParent();
//			parent = (ICssResource) Platform.getAdapterManager().getAdapter(parent2, ICssResource.class);
//		}
//		else if (adaptedObject instanceof IPackageFragmentRoot) {
//			// source folder
//			final IPackageFragmentRoot pck = (IPackageFragmentRoot) adaptedObject;
//			final IJavaElement parent2 = pck.getParent();
//			parent = (ICssResource) Platform.getAdapterManager().getAdapter(parent2, ICssResource.class);
//		}
//		else if (adaptedObject instanceof IFolder) {
//			// folder
//			final IFolder folder = (IFolder) adaptedObject;
//			final IContainer parent2 = folder.getParent();
//			parent = (ICssResource) Platform.getAdapterManager().getAdapter(parent2, ICssResource.class);
//		}
//		else if (adaptedObject instanceof IProject) {
//			// project
//			parent = null;
//		}
//		else if (adaptedObject instanceof IFile) {
//			final IFile file = (IFile) adaptedObject;
//			final IContainer parent2 = file.getParent();
//			parent = (ICssResource) Platform.getAdapterManager().getAdapter(parent2, ICssResource.class);
//		}
		
		getLogger().debug(adaptedObject + " => returning parent " + parent);
		return parent;
	}
	
	protected Object getAdaptedObject() {
		return this.adaptedObject;
	}
	
	
	public boolean isUseCustom() {
		return this.useCustom;
	}
	public void setUseCustom(boolean useCustom) {
		this.propertyChangeSupport.firePropertyChange("useCustom", this.useCustom, this.useCustom = useCustom); //$NON-NLS-1$
	}
	
	
	@Override
	public CssExtension getExtension(URI uri) {
		try {
			final ResourceSet rs = new ResourceSetImpl();
			Resource resource = rs.createResource(uri);
			resource.setURI(uri);
			resource.load(Collections.emptyMap());
			
			return (CssExtension) resource.getContents().get(0);
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private CssExtension loadModel(URI uri) {
		try {
			final ResourceSet rs = new ResourceSetImpl();
			Resource resource = rs.createResource(uri);
			resource.setURI(uri);
			resource.load(Collections.emptyMap());
			
			return (CssExtension) resource.getContents().get(0);
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public List<URI> getAllEnabledExtensions() {
		getLogger().trace("getAllEnabledExtensions()");
		List<URI> allEnabled = new ArrayList<>();
		
		ICssResource parentResource = getParentResource();
		if (parentResource != null) {
			allEnabled.addAll(parentResource.getAllEnabledExtensions());
		}
		allEnabled.addAll(getClasspathExtensions());
		
		if (useCustom) {
			allEnabled.addAll(getCustomExtensions());
			allEnabled.removeAll(getDisabledExtensions());
		}
		
		return allEnabled;
	}
	
	private CssExtension load(URI uri, boolean linkAll) {
		System.err.println("LOADING " + uri);
		Resource resource = rs.getResource(uri, true);
		if (linkAll) {
			System.err.println("(re)linking all");
			for (Resource r : rs.getResources()) {
				System.err.println(" * " + r);
				EcoreUtil2.resolveLazyCrossReferences(r, CancelIndicator.NullImpl);
				for (Resource.Diagnostic d : r.getErrors()) {
					if (d instanceof XtextLinkingDiagnostic) {
						XtextLinkingDiagnostic x = (XtextLinkingDiagnostic) d;
						System.err.println( "  x " + x.getMessage());
					}
				}
			}
		}
		
		IResourceDescription desc = manager.getResourceDescription(resource);
		System.err.println("description uri: " + desc.getURI());
		
		return (CssExtension) resource.getContents().get(0);
	}
	
	private ExtensionHolder cachedExtensionHolder;
	
	@Override
	public Set<CssExtension> getEnabledCssExtensions(EObject context) {
//		Set<CssExtension> result = new HashSet<>();
//		URI jfx8Uri = URI.createURI("file:/opt/projects/efxclipse/git/org.eclipse.efxclipse/bundles/tooling/org.eclipse.fx.ide.css.jfx8/bin/jfx8.cssext");
//		
//		if (rs == null) {
//			IResourceServiceProvider rsp = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(jfx8Uri);
//			
//			IResourceSetProvider rp = rsp.get(IResourceSetProvider.class);
//			rs = rp.get(ResourcesPlugin.getWorkspace().getRoot().getProject("javap"));
//			manager = rsp.getResourceDescriptionManager();
//			x = rsp.get(IResourceDescriptions.class);
//			System.err.println("RsourceDescriptions: " + x);
//			
//			if (x != null) {
//				IResourceDescription resourceDescription = x.getResourceDescription(jfx8Uri);
//				System.err.println(resourceDescription);
//			}
//			
//			for (IResourceDescription d : x.getAllResourceDescriptions()) {
//				System.err.println(d);
//			}
//		}
//		
//		URI p2Uri = URI.createURI("jar:platform:/resource/javap/lib/p2.jar!/p2.cssext");
//
//		load(jfx8Uri, false);
//		load(p2Uri, false);
//		
//		return result;
		if (cachedExtensionHolder == null) {
			cachedExtensionHolder = new ExtensionHolder(findProject(), context, getAllEnabledExtensions());
		}
		return new HashSet<>(cachedExtensionHolder.getModels());
		
//		return getAllEnabledExtensions().stream().map((uri)-> getRegistry().getExtension(uri).getModel()).collect(Collectors.toSet());
	}
	
	public ExtensionRegistry getRegistry() {
		return ExtensionRegistry.REGISTRY;
	}
	
	@Override
	public List<URI> getClasspathExtensions() {
		return Collections.emptyList();
	}

	@Override
	public List<URI> getDisabledExtensions() {
		return Collections.unmodifiableList(disabledExtensions);
	}

	@Override
	public List<URI> getCustomExtensions() {
		return Collections.unmodifiableList(customExtensions);
	}
	
	@Override
	public List<URI> getInheritedClasspathExtensions() {
		List<URI> result = new ArrayList<>();
		ICssResource parentResource = getParentResource();
		if (parentResource != null) {
			result.addAll(parentResource.getClasspathExtensions());
			result.addAll(parentResource.getInheritedClasspathExtensions());
		}
		return Collections.unmodifiableList(result);
	}
	
	@Override
	public List<URI> getInheritedCustomExtensions() {
		List<URI> result = new ArrayList<>();
		ICssResource parentResource = getParentResource();
		if (parentResource != null) {
			result.addAll(parentResource.getCustomExtensions());
			result.addAll(parentResource.getInheritedCustomExtensions());
		}
		return Collections.unmodifiableList(result);
	}
	
	@Override
	public List<URI> getInheritedDisabledExtensions() {
		List<URI> result = new ArrayList<>();
		ICssResource parentResource = getParentResource();
		if (parentResource != null) {
			result.addAll(parentResource.getDisabledExtensions());
			result.addAll(parentResource.getInheritedDisabledExtensions());
		}
		return Collections.unmodifiableList(result);
	}

	@Override
	public void addDisabledExtension(URI uri) {
		disabledExtensions.add(uri);
	}
	
	@Override
	public void removeDisabledExtension(URI uri) {
		disabledExtensions.remove(uri);
	}
	
	@Override
	public void addCustomExtension(URI uri) {
		customExtensions.add(uri);
	}
	
	@Override
	public void removeCustomExtension(URI uri) {
		customExtensions.remove(uri);
	}
	
	@Override
	public void clearCustomExtensions() {
		customExtensions.clear();
	}
	
	@Override
	public void clearDisabledExtensions() {
		disabledExtensions.clear();
	}
}
