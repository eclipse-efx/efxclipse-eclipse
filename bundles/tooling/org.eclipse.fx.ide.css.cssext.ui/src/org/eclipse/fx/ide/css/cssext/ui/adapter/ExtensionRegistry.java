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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.internal.resources.WorkspaceRoot;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceRuleFactory;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.generator.Main;
import org.eclipse.fx.osgi.util.LoggerCreator;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ltk.internal.core.refactoring.resource.ResourceModifications.CreateDescription;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.linking.impl.Linker;
import org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractGlobalScopeDelegatingScopeProvider;
import org.eclipse.xtext.scoping.impl.IDelegatingScopeProvider;
import org.eclipse.xtext.scoping.impl.IScopeWrapper;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xtext.XtextLinker;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class ExtensionRegistry {

	public static class Dummy {
		
		@Inject
		XtextLinker linker;
		
		
	}
	
	
	
	
	
	/**
	 * a simple holder class for a css extension. it allows to defer the model loading, and to invalidate the model 
	 * @author ccaks
	 *
	 */
	public static class ExtensionHolder {
		public final URI uri;
		private CssExtension model;
		
		private static ResourceSet rs;
		private static IResourceDescription.Manager manager;
		private static IResourceDescriptions x;
		public static Dummy create() {
			final Injector injector = new org.eclipse.fx.ide.css.cssext.CssExtDslStandaloneSetupGenerated().createInjector();
			return injector.getInstance(Dummy.class);
		}
		
		Dummy dummy;
		
		protected ExtensionHolder(URI uri) {
			this.uri = uri;
			dummy = create();
			
		}
		
		/**
		 * gets the extension model
		 * @return
		 */
		public CssExtension getModel() {
			return loadModel();
//			if (model == null) {
//				model = loadModel();
//			}
//			return model;
		}
		
		public static Set<CssExtension> exts = new HashSet<>();
		
		private void register(IScopeProvider scopeProvider, IScopeWrapper wrap) {
			if (scopeProvider instanceof AbstractGlobalScopeDelegatingScopeProvider) {
				AbstractGlobalScopeDelegatingScopeProvider provider = (AbstractGlobalScopeDelegatingScopeProvider) scopeProvider;
				provider.setWrapper(wrap);
				System.err.println("REGISTERED WRAPPER on " + scopeProvider);
			}
			else if (scopeProvider instanceof IDelegatingScopeProvider) {
				IDelegatingScopeProvider p = (IDelegatingScopeProvider) scopeProvider;
				register(((IDelegatingScopeProvider) scopeProvider).getDelegate(), wrap);
			}
		}
		
		private void logScope(IScopeProvider scopeProvider) {
			System.err.println(" * " + scopeProvider);
			if (scopeProvider instanceof IDelegatingScopeProvider) {
				IDelegatingScopeProvider p = (IDelegatingScopeProvider) scopeProvider;
				logScope(((IDelegatingScopeProvider) scopeProvider).getDelegate());
			}
		}
		
		final IScopeWrapper wrap = new IScopeWrapper() {
			@Override
			public IScope wrap(final IScope scope) {
				return new IScope() {
					
					@Override
					public IEObjectDescription getSingleElement(EObject object) {
						System.err.println("WRAPPING FUN getSingleElement " + object);
						// TODO Auto-generated method stub
						return scope.getSingleElement(object);
					}
					
					@Override
					public IEObjectDescription getSingleElement(QualifiedName name) {
						System.err.println("WRAPPING FUN getSingleElement " + name);
						// TODO Auto-generated method stub
						return scope.getSingleElement(name);
					}
					
					@Override
					public Iterable<IEObjectDescription> getElements(EObject object) {
						// TODO Auto-generated method stub
						return scope.getElements(object);
					}
					
					@Override
					public Iterable<IEObjectDescription> getElements(QualifiedName name) {
						// TODO Auto-generated method stub
						return scope.getElements(name);
					}
					
					@Override
					public Iterable<IEObjectDescription> getAllElements() {
						// TODO Auto-generated method stub
						return scope.getAllElements();
					}
				};
			}
		};
		
		private void load(URI uri) {
			System.err.println("LOADING " + uri);
			rs.getResource(uri, true);
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
		
		private CssExtension loadModel() {
			System.err.println("LOADING " + uri);
			
			if (rs == null) {
				IResourceServiceProvider rsp = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(uri);
				
				IResourceSetProvider rp = rsp.get(IResourceSetProvider.class);
				rs = rp.get(ResourcesPlugin.getWorkspace().getRoot().getProject("javap"));
				manager = rsp.getResourceDescriptionManager();
//				x = rsp.get(IResourceDescriptions.class);
//				System.err.println("RsourceDescriptions: " + x);
				
//				if (x != null) {
//					IResourceDescription resourceDescription = x.getResourceDescription(jfx8Uri);
//					System.err.println(resourceDescription);
//				}
//				
//				for (IResourceDescription d : x.getAllResourceDescriptions()) {
//					System.err.println(d);
//				}
			}
			
//				final ResourceSet rs = new ResourceSetImpl();
				LazyLinkingResource resource = (LazyLinkingResource) rs.getResource(uri, true);
				
				if (resource.getContents().isEmpty()) {
					System.err.println("COULD NOT LOAD " + uri);
					return null;
				}
				final CssExtension ext = (CssExtension) resource.getContents().get(0);
				exts.add(ext);
				
//				IResourceDescription resourceDescription = manager.getResourceDescription(resource);
//				System.err.println("EXPORTS:");
//				for (IEObjectDescription o : resourceDescription.getExportedObjects()) {
//					System.err.println(" * " + o);
//					
//				}
				
				System.err.println("(re)linking");
				for (Resource r : rs.getResources()) {
					System.err.println(" * " + r);
					
					r.getErrors().clear();
					EcoreUtil2.resolveLazyCrossReferences(r, CancelIndicator.NullImpl);
					for (Resource.Diagnostic d : r.getErrors()) {
						if (d instanceof XtextLinkingDiagnostic) {
							XtextLinkingDiagnostic x = (XtextLinkingDiagnostic) d;
							System.err.println( "   x " + x.getMessage());
						}
					}
				}
				
				
				return ext;
		}
		
		// TODO do we need this=?
		public String getRootPackageName() {
			CssExtension model = getModel();
			if (model != null) {
				return getModel().getPackageDef().getName();
			}
			return "error";
		}
		
		/**
		 * invalidates the extionsion
		 */
		public void invalidate() {
			this.model = null;
		}
	}
	
	/**
	 * access to the singleton registry instance
	 */
	public final static ExtensionRegistry REGISTRY = new ExtensionRegistry();
	
	private Map<URI, ExtensionHolder> extensions = new HashMap<>();
	
	private Logger logger;
	
	private void recCheckChangedExtensions(IJavaElementDelta d, List<URI> changedExtensions) {
		if (IJavaElementDelta.F_CONTENT == (IJavaElementDelta.F_CONTENT & d.getFlags())) {
			// content change
			for (IResourceDelta rd : d.getResourceDeltas()) {
				final IResource res = rd.getResource();
				if ("cssext".equals(res.getFileExtension())) { //$NON-NLS-1$
					changedExtensions.add(URI.createPlatformResourceURI( res.getProject().getName() + "/" + res.getProjectRelativePath().toString(), true)); //$NON-NLS-1$
				}
			}
		}
		if (IJavaElementDelta.F_CHILDREN == (IJavaElementDelta.F_CHILDREN & d.getFlags())) {
			// check children
			for (IJavaElementDelta child : d.getChangedChildren()) {
				recCheckChangedExtensions(child, changedExtensions);
			}
		}
		
	}
	
	private IElementChangedListener listener = new IElementChangedListener() {
		@Override
		public void elementChanged(ElementChangedEvent event) {
			List<URI> changedExtensions = new ArrayList<URI>();
			recCheckChangedExtensions(event.getDelta(), changedExtensions);
			for (URI changedEx : changedExtensions) {
				invalidateExtension(changedEx);
			}
		}
	};
	
	private ExtensionRegistry() {
		JavaCore.addElementChangedListener(listener, ElementChangedEvent.POST_CHANGE);
	}
	
	private Logger getLogger() {
		if (logger == null) {
			logger = LoggerCreator.createLogger(ExtensionRegistry.class);
		}
		return logger;
	}
	
	
	/**
	 * gets or creates an extension by uri
	 * @param uri
	 * @return
	 */
	public ExtensionHolder getExtension(URI uri) {
		getLogger().debug("getExtension("+uri+")");
		ExtensionHolder holder = extensions.get(uri);
		if (holder == null) {
			getLogger().debug(" => creating new holder");
			holder = new ExtensionHolder(uri);
			extensions.put(uri, holder);
		}
		else {
			getLogger().debug(" => result from cache");
		}
		return holder;
	}
	
	/**
	 * invalidates an extension to be reloaded on next request
	 * @param uri
	 */
	public void invalidateExtension(URI uri) {
		getLogger().debug("invalidateExtension("+uri+")");
		ExtensionHolder holder = extensions.get(uri);
		if (holder != null) {
			getLogger().debug(" invalididating " + uri);
			holder.invalidate();
		}
		else {
			getLogger().debug(" not found!");
		}
	}
	
	
}
