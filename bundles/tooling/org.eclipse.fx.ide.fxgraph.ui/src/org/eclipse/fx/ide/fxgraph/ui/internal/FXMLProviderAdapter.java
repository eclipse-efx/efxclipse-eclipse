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
package org.eclipse.fx.ide.fxgraph.ui.internal;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import org.eclipse.fx.ide.fxgraph.generator.FXGraphGenerator;
import org.eclipse.fx.ide.ui.editor.IFXMLProviderAdapter;
import org.eclipse.fx.ide.ui.util.RelativeFileLocator;

public class FXMLProviderAdapter implements IFXMLProviderAdapter {
	private XtextEditor editor;
	
	public FXMLProviderAdapter(XtextEditor editor) {
		this.editor = editor;
	}

	@Override
	public IEditorPart getEditorPart() {
		return editor;
	}
	
	@Override
	public String getPreviewFXML() {
		return editor.getDocument().readOnly(new IUnitOfWork<String, XtextResource>() {

			@Override
			public String exec(XtextResource resource) throws Exception {
				FXGraphGenerator generator = new FXGraphGenerator();
				return generator.doGeneratePreview(resource, false, false);
			}
			 
		});
	}
		
	@Override
	public String getPreviewSceneFXML() {
		return editor.getDocument().readOnly(new IUnitOfWork<String, XtextResource>() {

			@Override
			public String exec(XtextResource resource) throws Exception {
				if( ! resource.getContents().isEmpty() && ((Model)resource.getContents().get(0)).getComponentDef() != null ) {
					ComponentDefinition def = ((Model)resource.getContents().get(0)).getComponentDef();
					if( def.getSceneDefinition() != null ) {
						FXGraphGenerator generator = new FXGraphGenerator();
						return generator.doGeneratePreview(def.getSceneDefinition().eResource(), false, false);
					}
				}
				
				return null;
			}
			 
		});
	}

	@Override
	public List<String> getPreviewCSSFiles() {
		return editor.getDocument().readOnly(new IUnitOfWork<List<String>, XtextResource>() {

			@Override
			public List<String> exec(XtextResource resource) throws Exception {
				List<String> cssFiles = new ArrayList<String>();
				EList<EObject> contents = resource.getContents();
				if (!contents.isEmpty()) {
					URI uri = resource.getURI();
					EObject rootObject = contents.get(0);
					if (rootObject instanceof Model) {
						ComponentDefinition def = ((Model) rootObject).getComponentDef();
						cssFiles = new ArrayList<String>(def.getPreviewCssFiles().size());
						for (String cssFile : def.getPreviewCssFiles()) {
							File absFile = RelativeFileLocator.locateFile(uri, cssFile);

							if (absFile != null) {
								try {
									cssFiles.add(absFile.toURI().toURL().toExternalForm());
								} catch (Throwable e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}
				return cssFiles;
			}
			
		});
	}

	@Override
	public String getPreviewResourceBundle() {
		return editor.getDocument().readOnly(new IUnitOfWork<String, XtextResource>() {

			@Override
			public String exec(XtextResource resource) throws Exception {
				EList<EObject> contents = resource.getContents();
				if (!contents.isEmpty()) {
					URI uri = resource.getURI();
					EObject rootObject = contents.get(0);
					if (rootObject instanceof Model) {
						ComponentDefinition def = ((Model) rootObject).getComponentDef();
						
						if (def != null && def.getPreviewResourceBundle() != null) {
							File f = RelativeFileLocator.locateFile(uri, def.getPreviewResourceBundle());
							if (f != null && f.exists()) {
								return f.getAbsolutePath();
							}
						}
					}
				}
				return null;
			}			
		});
	}

	@Override
	public List<URL> getPreviewClasspath() {
		return editor.getDocument().readOnly(new IUnitOfWork<List<URL>, XtextResource>() {

			@Override
			public List<URL> exec(XtextResource resource) throws Exception {
				List<URL> extraPaths = new ArrayList<URL>();
				EList<EObject> contents = resource.getContents();
				if (!contents.isEmpty()) {
					URI uri = resource.getURI();
					IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1));
					IJavaProject jp = JavaCore.create(p);
					EObject rootObject = contents.get(0);
					if (rootObject instanceof Model) {
						ComponentDefinition def = ((Model) rootObject).getComponentDef();
						
						for (String path : def.getPreviewClasspathEntries()) {
							try {
								URI cpUri = URI.createURI(path);
								if (cpUri.isPlatformResource()) {
									if (cpUri.lastSegment().equals("*")) {
										cpUri = cpUri.trimSegments(1);
										Path cpPath = new Path(cpUri.toPlatformString(true));
										IWorkspaceRoot root = jp.getProject().getWorkspace().getRoot();
										IFolder f = root.getFolder(cpPath);
										if (f.exists()) {
											for (IResource r : f.members()) {
												IFile jarFile = (IFile) r;
												if (r instanceof IFile) {
													if ("jar".equals(jarFile.getFileExtension())) {
														extraPaths.add(jarFile.getLocation().toFile().toURI().toURL());
													}
												}
											}
										}
									} else {
										Path cpPath = new Path(cpUri.toPlatformString(true));
										IWorkspaceRoot root = jp.getProject().getWorkspace().getRoot();
										IFile jarFile = root.getFile(cpPath);
										if (jarFile.exists()) {
											try {
												extraPaths.add(jarFile.getLocation().toFile().toURI().toURL());
											} catch (MalformedURLException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									}
								} else if (cpUri.isFile()) {
									if (cpUri.toFileString().endsWith("*")) {
										File ioFile = new File(cpUri.toFileString()).getParentFile();
										if (ioFile.exists()) {
											try {
												for (File jarFile : ioFile.listFiles()) {
													if (jarFile.getName().endsWith(".jar")) {
														extraPaths.add(jarFile.toURI().toURL());
													}
												}
											} catch (MalformedURLException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									} else {
										File ioFile = new File(cpUri.toFileString());
										if (ioFile.exists()) {
											try {
												extraPaths.add(ioFile.toURI().toURL());
											} catch (MalformedURLException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									}
								}
							} catch (Exception e) {
								// TODO: handle exception
								e.printStackTrace();
							}
						}
					}
				}
				
				return extraPaths;
			}
			
		});
	}

	@Override
	public IFile getFile() {
		return editor.getDocument().readOnly(new IUnitOfWork<IFile, XtextResource>() {

			@Override
			public IFile exec(XtextResource resource) throws Exception {
				URI uri = resource.getURI();
				Path structureFilePath = new Path(uri.toPlatformString(true));
				IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(structureFilePath);
				if( f.exists() ) {
					return f;
				}
				return null;
			}
			
		});
	}
}
