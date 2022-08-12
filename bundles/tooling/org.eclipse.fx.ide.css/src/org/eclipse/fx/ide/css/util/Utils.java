/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class Utils {
	public static IFile getFile(Resource resource) {
		URI uri = resource.getURI();
		if( uri.isPlatformResource() ) {
			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(URI.decode(uri.segment(1)));
			
			IPath path = null;
			for( int i = 2; i < uri.segmentCount(); i++ ) {
				if( path == null ) {
					path = new Path(URI.decode(uri.segment(i)));
				} else {
					path = path.append(URI.decode(uri.segment(i)));
				}
			}
			
			if( path != null ) {
				return p.getFile(path);
			}			
		}
		return null;
	}
	
}
