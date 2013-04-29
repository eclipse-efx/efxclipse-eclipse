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
package org.eclipse.fx.ide.ui.util;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class RelativeFileLocator {
	public static File locateFile(IFile file, String filePath) {
		URI uri = URI.createPlatformResourceURI(file.getProject().getName() + "/" + file.getProjectRelativePath().toString(),true);
		return locateFile(uri, filePath);
	}
	
	public static File locateFile(URI uri, String filePath) {
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1));
		IJavaProject jp = JavaCore.create(p);
		
		// Absolute to project
		if( filePath.startsWith("/") ) {
			filePath = filePath.substring(1); // Remove the leading /
			IFile f = p.getFile(filePath);
			if( f.exists() ) {
				return f.getLocation().toFile().getAbsoluteFile();
			} else if( jp != null ) {
				try {
					for( IPackageFragmentRoot r : jp.getPackageFragmentRoots() ) {
						if( r.isArchive() ) {
							//TODO We should allow to load styles from the referenced jars
						} else if( r.getResource() instanceof IFolder ) {
							IFolder folder = (IFolder) r.getResource();
							if( folder.exists() ) {
								f = folder.getFile(filePath);
								if( f.exists() ) {
									return f.getLocation().toFile().getAbsoluteFile();
								}
							}	
						}
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			URI fileUri = null;
			
			try {
				fileUri = URI.createURI(filePath);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			if( fileUri != null && fileUri.isPlatformResource() ) {
				Path path = new Path(fileUri.toPlatformString(true));
				IWorkspaceRoot root = jp.getProject().getWorkspace().getRoot();
				IFile file = root.getFile(path);
				if( file.exists() ) {
					return file.getLocation().toFile().getAbsoluteFile();
				}
			} else {
				IPath path = null;
				for( int i = 2; i < uri.segmentCount() - 1; i++ ) {
					if( path == null ) {
						path = new Path(uri.segment(i));
					} else {
						path = path.append(uri.segment(i));
					}
				}
				
				if( path != null ) {
					IFile f = p.getFile(path.append(filePath));
					if( f.exists() ) {
						return f.getLocation().toFile().getAbsoluteFile();
					}
				}
			}
		}
		
		return null;
	}
}
