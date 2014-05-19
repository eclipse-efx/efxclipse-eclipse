package org.eclipse.fx.ide.pde.core;
/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.pde.core.IClasspathContributor;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.ClasspathUtilCore;

@SuppressWarnings("restriction")
public class JavaFXClassPathExtender implements IClasspathContributor {
	
	
	private IClasspathEntry getJava8CssExtEntry() {
		
		String bundleId = "org.eclipse.fx.ide.css.jfx8";
		
		IPluginModelBase model = PluginRegistry.findModel(bundleId);
		
		IPath srcPath = ClasspathUtilCore.getSourceAnnotation(model, ".");
		IPath path = new Path(model.getInstallLocation());
		
		
		return JavaCore.newLibraryEntry(path, srcPath, null);
	}
	
	@Override
	public List<IClasspathEntry> getInitialEntries(BundleDescription project) {
		final List<IClasspathEntry> entries = new ArrayList<>();
		
		entries.add(getJava8CssExtEntry());
		
		return entries;
	}

	@Override
	public List<IClasspathEntry> getEntriesForDependency(BundleDescription project, BundleDescription addedDependency) {
		return Collections.emptyList();
	}
}
