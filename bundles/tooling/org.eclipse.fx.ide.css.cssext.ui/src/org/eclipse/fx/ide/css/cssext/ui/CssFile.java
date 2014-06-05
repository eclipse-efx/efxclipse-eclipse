/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.fx.ide.css.cssext.CssExtDslStandaloneSetup;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;

/**
 * @author ccaks
 *
 */
public class CssFile {

	public static class CssExtensionNfo {
		public final URI uri;
		public final CssExtension model;
		public CssExtensionNfo(URI uri, CssExtension model) {
			this.uri = uri;
			this.model = model;
		}
	}
	
	
	private Object adaptedObject;
	
	public CssFile(Object adaptedObject) {
		this.adaptedObject = adaptedObject;
	}
	
	@Override
	public String toString() {
		return "CssFile(" + adaptedObject + ")";
	}

	/**
	 * @return
	 */
	public List<Object> getExtList() {
		
	//	Platform.getAdapterManager().getAdapter(adaptedObject, Css.class);
		
		ArrayList<Object> l = new ArrayList<>();
		
		l.add("jfx2.cssext");
		l.add("jfx8.cssext");
		l.add("somestuff.cssext");
		
		return l;
	}

	public List<CssExtension> getCssExtensions() {
//		System.err.println(findProject());
		collectCssExtension();
		return null;
	}
	
	
	
	private IJavaProject findJavaProject() {
		IResource res = (IResource) Platform.getAdapterManager().getAdapter(this.adaptedObject, IResource.class);
		IJavaProject project = (IJavaProject) Platform.getAdapterManager().getAdapter(res, IJavaProject.class);
		while (project == null && res.getParent() != null) {
			res = res.getParent();
			project = (IJavaProject) Platform.getAdapterManager().getAdapter(res, IJavaProject.class);
		}
		return project;
	}
	
	private IProject findProject() {
		IResource res = (IResource) Platform.getAdapterManager().getAdapter(this.adaptedObject, IResource.class);
		IProject project = (IProject) Platform.getAdapterManager().getAdapter(res, IProject.class);
		while (project == null && res.getParent() != null) {
			res = res.getParent();
			project = (IProject) Platform.getAdapterManager().getAdapter(res, IProject.class);
		}
		return project;
	}
	
	public Set<CssExtension> getEnabledCssExtensions() {
		return collectCssExtension().stream().map((x)->x.model).collect(Collectors.toSet());
	}
	
	/**
	 * @return
	 */
	public Set<CssExtensionNfo> collectCssExtension() {
		List<ClassPathSearchUtil.Entry> allFiles = new ArrayList<>();
		try  {
			final IProject project = findProject();
			final IContainer workspace = project.getParent();
//			System.err.println("project = " + project);
			final IJavaProject javaProject = JavaCore.create(project);
//			System.err.println("javaProject? " + (javaProject==null));
			
			long locCount = 0;
			
			for (IClasspathEntry e : javaProject.getResolvedClasspath(true)) {
//				System.err.println("ENTRY " + e);
				locCount++;
				switch (e.getEntryKind()) {
				case IClasspathEntry.CPE_SOURCE: {
					final IResource resource = workspace.findMember(e.getPath());
//					System.err.println("CPE_SOURCE: Resource= " + resource);
					final List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkResource(resource);
					allFiles.addAll(result);
				}
				break;
				case IClasspathEntry.CPE_LIBRARY: {
					final IPath path = e.getPath();
					if ("jar".equals(e.getPath().getFileExtension())) {
//						System.err.println(" file ends with .jar - using jar check");
						List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkJar(path.toFile().getAbsolutePath());
//						System.err.println("-> " + result.size() + " hits: " + result);
						allFiles.addAll(result);
					}
					else {
//						System.err.println(" trying java file api");
						
						IPath binPath = path.append("bin");
						if (binPath.toFile().exists()) {
							// try bin path
							List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkFolder(binPath.toFile().getAbsolutePath());
//							System.err.println("-> " + result.size() + " hits: " + result);
							allFiles.addAll(result);
						}
						else {
							// try whole folder
							List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkFolder(path.toFile().getAbsolutePath());
//							System.err.println("-> " + result.size() + " hits: " + result);
							allFiles.addAll(result);
						}
						
					}
				}
				break;
				case IClasspathEntry.CPE_PROJECT: {
					final IPath path = e.getPath();
					final IProject p = (IProject) project.getParent().findMember(path);
//					System.err.println("project " + p);
					final IJavaProject jp = JavaCore.create(p);
//					System.err.println("javaproject " + jp);
//					System.err.println("javaproject outputloc " + jp.getOutputLocation());
					final IResource output = project.getParent().findMember(jp.getOutputLocation());
//					System.err.println("outputfolder " + output);
					final List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkResource(output);
//					System.err.println("-> " + result.size() + " hits: " + result);
					allFiles.addAll(result);
				}
				break;
					
				default: {
					System.err.println("Entry not handled!! " + e);
				}
					
				}
				
				
				
			}
			System.err.println("Checked " + locCount + " entries and found " + allFiles.size() + " cssext definitions: " + allFiles);
		}
		catch (JavaModelException e) {
			e.printStackTrace();
		}
		
		Set<CssExtensionNfo> extensions = new HashSet<>();
		final ResourceSet rs = new ResourceSetImpl();
		for (ClassPathSearchUtil.Entry entry : allFiles) {
			// load model
			final URI uri = entry.toURI();
			try {
				Resource resource = rs.createResource(uri);
				resource.setURI(uri);
				resource.load(Collections.emptyMap());
				
				final CssExtension ex = (CssExtension) resource.getContents().get(0);
				extensions.add(new CssExtensionNfo(uri, ex));
			}
			catch (Exception e) {
				System.err.println("could not load model : " + uri);
				e.printStackTrace();
			}
			
		}
		return extensions;
	}
}
