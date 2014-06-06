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
