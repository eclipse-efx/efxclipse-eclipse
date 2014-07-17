/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.ui.preview;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.fx.ide.ui.preview.LivePreviewPart.ContentData;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.fx.ide.ui.editor.IFXMLProviderAdapter;
import org.eclipse.fx.ide.ui.editor.IFXPreviewAdapter;

import com.google.inject.Inject;

public class LivePreviewSynchronizer implements IPartListener, IPropertyListener {
	@Inject
	private LivePreviewPart view;

	private IFXPreviewAdapter currentEditor;
	private IFXMLProviderAdapter currentContentProvider;
	
	public void partActivated(IWorkbenchPart part) {
		updateView(part);
	}

	private void updateView(IWorkbenchPart part) {
		IFXPreviewAdapter adapted;
		if( part instanceof IFXPreviewAdapter ) {
			adapted = (IFXPreviewAdapter) part;
		} else {
			adapted = (IFXPreviewAdapter) part.getAdapter(IFXPreviewAdapter.class);
		}
		
		if( adapted != null ) {
			if( currentEditor == null || ! currentEditor.getEditorPart().equals(adapted.getEditorPart()) ) {
				if( currentEditor != null ) {
					currentEditor.getEditorPart().removePropertyListener(this);
				}
				currentEditor = (IFXPreviewAdapter) adapted;
				
				if( currentEditor != null ) {
					currentEditor.getEditorPart().addPropertyListener(this);	
				}
				
				if( currentEditor instanceof IFXMLProviderAdapter && ( currentContentProvider == null || ! currentContentProvider.getEditorPart().equals(currentEditor.getEditorPart()) ) ) {
					currentContentProvider = (IFXMLProviderAdapter) currentEditor;
					view.setContents(createContentData(currentContentProvider));
				}	
			}
		} else if( part instanceof EditorPart ) {
			if( currentEditor != null ) {
				currentEditor.getEditorPart().removePropertyListener(this);
			}
			
			currentContentProvider = null;
			currentEditor = null;
			view.setContents(null);
		}
	}
	
	@Override
	public void propertyChanged(Object source, int propId) {
		if( propId == IWorkbenchPartConstants.PROP_DIRTY ) {
			if( currentEditor != null && ! currentEditor.getEditorPart().isDirty() && currentContentProvider != null ) {
				view.setContents(createContentData(currentContentProvider));
			}
		}
	}

	public void refreshPreview() {
		if( currentContentProvider != null ) {
			view.setContents(createContentData(currentContentProvider));
		}
	}

	
	
	private ContentData createContentData(IFXMLProviderAdapter contentProvider) {
		String contents = contentProvider.getPreviewFXML();
		String previewSceneSetup = contentProvider.getPreviewSceneFXML();
		List<String> cssFiles = contentProvider.getPreviewCSSFiles();
		String resourceBundle = contentProvider.getPreviewResourceBundle();
		List<URL> previewUrls = contentProvider.getPreviewClasspath();
		IFile file = contentProvider.getFile();
		
		List<URL> extraJarPath = new ArrayList<URL>();
		extraJarPath.addAll(previewUrls);
		
		if( file != null ) {
			extraJarPath.addAll(calculateProjectClasspath(JavaCore.create(file.getProject())));
		}
		
//		System.err.println("RESOURCE BUNDLE: " + resourceBundle);
		
		return new ContentData(contents, previewSceneSetup, cssFiles, resourceBundle, extraJarPath, file);
	}

	
	private void resolveDataProject(IJavaProject project, Set<IPath> outputPath, Set<IPath> listRefLibraries) {
//		System.err.println("START RESOLVE: " + project.getElementName());
		try {
			IClasspathEntry[] entries = project.getRawClasspath();
			outputPath.add(project.getOutputLocation());
			for (IClasspathEntry e : entries) {
//				System.err.println(e + " ====> " + e.getEntryKind());
				if (e.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
					IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(e.getPath().lastSegment());
					if (p.exists()) {
						resolveDataProject(JavaCore.create(p), outputPath, listRefLibraries);
					}
				} else if (e.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
//					System.err.println("CPE_LIBRARY PUSHING: " + e.getPath());
					listRefLibraries.add(e.getPath());
				} else if( "org.eclipse.pde.core.requiredPlugins".equals(e.getPath().toString()) ) {
					IClasspathContainer cpContainer = JavaCore.getClasspathContainer(e.getPath(), project);
					for( IClasspathEntry cpEntry : cpContainer.getClasspathEntries() ) {
						if( cpEntry.getEntryKind() == IClasspathEntry.CPE_PROJECT ) {
							IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(cpEntry.getPath().lastSegment());
							if (p.exists()) {
								resolveDataProject(JavaCore.create(p), outputPath, listRefLibraries);
							}
						} else if( cpEntry.getEntryKind() == IClasspathEntry.CPE_LIBRARY ) {
//							System.err.println("requiredPlugins & CPE_LIBRARY PUSHING: " + e.getPath());
							listRefLibraries.add(cpEntry.getPath());
						}
					}
				} else if( e.getEntryKind() == IClasspathEntry.CPE_CONTAINER ) {
					if( ! e.getPath().toString().startsWith("org.eclipse.jdt.launching.JRE_CONTAINER")
							&& ! e.getPath().toString().startsWith("org.eclipse.fx.ide.jdt.core.JAVAFX_CONTAINER")) {
//						System.err.println("====> A container");
						
						IClasspathContainer cp = JavaCore.getClasspathContainer(e.getPath(), project);
						for( IClasspathEntry ce : cp.getClasspathEntries() ) {
//							System.err.println(ce.getEntryKind() + "=> " + ce);
							if( ce.getEntryKind() == IClasspathEntry.CPE_LIBRARY ) {
								listRefLibraries.add(ce.getPath());	
							} else if( ce.getEntryKind() == IClasspathEntry.CPE_PROJECT ) {
								IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(ce.getPath().lastSegment());
								if (p.exists()) {
									resolveDataProject(JavaCore.create(p), outputPath, listRefLibraries);
								}
							}
						}
					}
				} 
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.err.println("END RESOLVE");
	}

	private List<URL> calculateProjectClasspath(IJavaProject jp) {
		HashSet<IPath> outputPath = new HashSet<IPath>();
		HashSet<IPath> libraries = new HashSet<IPath>();
		resolveDataProject(jp, outputPath, libraries);

		IWorkspaceRoot root = jp.getProject().getWorkspace().getRoot();

		List<URL> rv = new ArrayList<URL>();
		for (IPath out : outputPath) {
			IFolder f = root.getFolder(out);
			if (f.exists()) {
				try {
					rv.add(f.getLocation().toFile().toURI().toURL());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		for (IPath lib : libraries) {
//			System.err.println("LIB: " + lib);
			IFile f = root.getFile(lib);
			if (f.exists()) {
				try {
					rv.add(f.getLocation().toFile().toURI().toURL());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if( lib.toFile().exists() ) {
				try {
					rv.add(lib.toFile().toURI().toURL());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return rv;
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
	}
}
