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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

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
			System.err.println("project = " + project);
			final IJavaProject javaProject = JavaCore.create(project);
			System.err.println("javaProject = " + javaProject);
			
			for (IClasspathEntry e : javaProject.getResolvedClasspath(true)) {
				System.err.println("ENTRY " + e);
				switch (e.getEntryKind()) {
				case IClasspathEntry.CPE_LIBRARY: {
					if ("jar".equals(e.getPath().getFileExtension())) {
						System.err.println(" file ends with .jar - using jar check");
						List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkJar(e.getPath().toFile().getAbsolutePath());
						System.err.println("-> "  + result);
						allFiles.addAll(result);
					}
					else {
						System.err.println(" trying java file api");
						// try folder
						List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkFolder(e.getPath().toFile().getAbsolutePath());
						System.err.println("-> " + result);
						allFiles.addAll(result);
					}
				}
				break;
				case IClasspathEntry.CPE_PROJECT: {
					IProject p = (IProject) project.getParent().findMember(e.getPath());
					System.err.println("project " + p);
					IJavaProject jp = JavaCore.create(p);
//					System.err.println("javaproject " + jp);
					System.err.println("javaproject outputloc " + jp.getOutputLocation());
					IResource output = project.getParent().findMember(jp.getOutputLocation());
					System.err.println("outputfolder " + output);
					List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkResource(output);
					System.err.println("-> "  + result);
					allFiles.addAll(result);
				}
				break;
					
				default: {
					System.err.println("NOT HANDLED!");
				}
					
				}
				
				
				
			}
		}
		catch (JavaModelException e) {
			e.printStackTrace();
		}
		
		Set<CssExtensionNfo> extensions = new HashSet<>();
		for (ClassPathSearchUtil.Entry entry : allFiles) {
			
			// load model
			try {
				URI uri = entry.toURI();
				ResourceSet rs = new ResourceSetImpl();
				Resource resource = rs.getResource(uri, true);
				CssExtension ex = (CssExtension) resource.getContents().get(0);
				extensions.add(new CssExtensionNfo(uri, ex));
			}
			catch (Exception e) {
				System.err.println("could not load model : " + entry.toURI());
				e.printStackTrace();
			}
			
		}
		return extensions;
	}
}
