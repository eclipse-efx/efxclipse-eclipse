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
package org.eclipse.fx.ide.rrobot.impl.dynamic;

import java.io.InputStream;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile;
import org.eclipse.fx.ide.rrobot.model.task.Generator;
import org.osgi.framework.Bundle;


public class JavaExecutor implements Generator<DynamicFile> {

	@Override
	public InputStream generate(DynamicFile file, Map<String, Object> data) {
		URI uri = URI.createURI(file.getExecutionURI());
		
		if( "bundleclass".equals(uri.scheme()) ) {
			Bundle b = Platform.getBundle(uri.host());
			try {
				Class<?> cl = b.loadClass(uri.segment(0));
				Generator<DynamicFile> g = (Generator<DynamicFile>) cl.newInstance();
				return g.generate(file, data);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		} 
		throw new IllegalArgumentException("Only bundleclass-urls are supported");
	}
	
}