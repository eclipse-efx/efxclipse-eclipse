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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.osgi.util.LoggerCreator;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class ClasspathManager {

	private static ClasspathManager INSTANCE = new ClasspathManager();
	
	public static ClasspathManager getInstance() {
		return INSTANCE;
	}
	
	private Map<IProject, List<URI>> cache = new HashMap<>();
	
	private Logger logger;
	
	
	private IElementChangedListener listener = new IElementChangedListener() {
		@Override
		public void elementChanged(ElementChangedEvent event) {
			for (IJavaElementDelta d : event.getDelta().getChangedChildren()) {
				if (d.getElement().getElementType() == IJavaElement.JAVA_PROJECT) {
					try {
						final IResource r = d.getElement().getCorrespondingResource();
						if (r instanceof IProject) {
							invalidateClasspath((IProject) r);
						}
					}
					catch (JavaModelException e) {
						e.printStackTrace();
					}
				}
			}
		}
	};
	
	private ClasspathManager() {
		JavaCore.addElementChangedListener(this.listener, ElementChangedEvent.POST_CHANGE);
	}
	
	private Logger getLogger() {
		if (this.logger == null) {
			this.logger = LoggerCreator.createLogger(ClasspathManager.class);
		}
		return this.logger;
	}

	
	public void invalidateClasspath(IProject project) {
		getLogger().debug("invalidateClasspath(" + project + ")");
		this.cache.remove(project);
	}
	
	public List<URI> getClasspath(IProject project) {
		getLogger().debug("getClasspath(" + project + ")");
		List<URI> result = this.cache.get(project);
		if (result == null) {
			result = scanClasspath(project);
			this.cache.put(project, result);
		}
		else {
			getLogger().debug(" => result from cache");
		}
		return result;
	}
	
	
	private List<URI> scanClasspath(IProject project) {
		getLogger().debug("scanClasspath("+project+")");
		List<ClassPathSearchUtil.Entry> allFiles = new ArrayList<>();
		try  {
			final IContainer workspace = project.getParent();
			final IJavaProject javaProject = JavaCore.create(project);
			final IWorkspaceRoot root = workspace.getWorkspace().getRoot();
			
			long locCount = 0;
			IClasspathEntry[] resolvedClasspath = javaProject.getResolvedClasspath(true);
			

			allFiles.addAll(ClassPathSearchUtil.checkEntries(root, resolvedClasspath));
		}
		catch (JavaModelException e) {
			e.printStackTrace();
		}
//			System.err.println("found : " + entries);
			
//			HashSet externalFolders = ExternalFoldersManager.getExternalFolders(resolvedClasspath);
////			System.err.println("externalFolders " + externalFolders);
//			for (IClasspathEntry e : resolvedClasspath) {
////				System.err.println(e);
//				locCount++;
//				switch (e.getEntryKind()) {
//				case IClasspathEntry.CPE_SOURCE: {
//					final IResource resource = workspace.findMember(e.getPath());
//					final List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkResource(resource);
//					allFiles.addAll(result);
//				}
//				break;
//				case IClasspathEntry.CPE_LIBRARY: {
//					final IPath path = e.getPath();
//					java.net.URI lU = null;
//					String libUri = "file://" + path.toFile().getAbsolutePath(); // = external representation
////					System.err.println("cp path: " + path);
//					
//					IFolder folder = ExternalFoldersManager.getExternalFoldersManager().getFolder(path);
////					System.err.println("external Folder: " + folder);
//					if (folder != null) {
////						System.err.println(" .location = " + folder.getLocation());
////						System.err.println(" .locationURI = " + folder.getLocationURI());
////						System.err.println(" .fullPath = " + folder.getFullPath());
//						libUri = folder.getLocationURI().toString();
//						//libUri = "platform://resource" + folder.getFullPath();
//						lU = folder.getLocationURI();
//					}
//					
////					System.err.println("Using libUri = " + libUri);
//					
//					if ("jar".equals(e.getPath().getFileExtension())) {
//						IFile f = root.getFile(path);
//						if (f.exists()) {
//							List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkJar(f.getLocation().toFile().getAbsolutePath(), f.getLocationURI().toString());
//							allFiles.addAll(result);
//						}
//						else {
//							List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkJar(path.toFile().getAbsolutePath(), libUri);
//							allFiles.addAll(result);
//						}
//					}
//					else {
//						
//						IPath binPath = path.append("bin");
//						if (binPath.toFile().exists()) {
//							// try bin path
//							List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkFolder(binPath.toFile().getAbsolutePath(), libUri + "/bin");
//							allFiles.addAll(result);
//						}
//						else {
//							// try whole folder
//							List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkFolder(path.toFile().getAbsolutePath(), libUri);
//							allFiles.addAll(result);
//						}
//						
//					}
//				}
//				break;
//				case IClasspathEntry.CPE_PROJECT: {
//					final IPath path = e.getPath();
//					final IProject p = (IProject) project.getParent().findMember(path);
//					final IJavaProject jp = JavaCore.create(p);
//					final IResource output = project.getParent().findMember(jp.getOutputLocation());
//					final List<ClassPathSearchUtil.Entry> result = ClassPathSearchUtil.checkResource(output);
//					allFiles.addAll(result);
//				}
//				break;
//					
//				default: {
//					getLogger().warning("entry not handled! " + e);
//				}
//					
//				}
//				
//				
//				
//			}
//			getLogger().debug("Checked " + locCount + " entries and found " + allFiles.size() + " cssext definitions: " + allFiles);
//		}
//		catch (JavaModelException e) {
//			e.printStackTrace();
//		}
		
		List<URI> extensions = new ArrayList<>();
		for (ClassPathSearchUtil.Entry entry : allFiles) {
			// load model
			final URI uri = entry.toURI();
			extensions.add(uri);
		}
		getLogger().debug(" => " + extensions);
		return extensions;
	}
}
