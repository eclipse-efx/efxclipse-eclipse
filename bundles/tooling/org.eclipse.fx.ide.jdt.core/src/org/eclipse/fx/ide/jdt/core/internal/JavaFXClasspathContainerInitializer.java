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
package org.eclipse.fx.ide.jdt.core.internal;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.fx.ide.jdt.core.JavaFXCore;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.eval.InstallException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;


public class JavaFXClasspathContainerInitializer extends
		ClasspathContainerInitializer {

	private static class JavaFXContainer implements IClasspathContainer {

		private final IClasspathEntry[] fEntries;
		private final IPath fPath;

		public JavaFXContainer(IPath path, IClasspathEntry[] entries) {
			fPath= path;
			fEntries= entries;
		}

		public IClasspathEntry[] getClasspathEntries() {
			return fEntries;
		}

		public String getDescription() {
			return "JavaFX SDK";
		}

		public int getKind() {
			return IClasspathContainer.K_APPLICATION;
		}

		public IPath getPath() {
			return fPath;
		}

	}
	
	private static IClasspathEntry getJavaFX8CssExt() {
		try {
		String pluginId = "org.eclipse.fx.ide.css.jfx8";
		Bundle bundle = Platform.getBundle(pluginId);
		System.err.println("bundle location: " + bundle.getLocation());
		File bundleFile = FileLocator.getBundleFile(bundle);
		
	
		Path path = new Path(bundleFile.getAbsolutePath());
		
		return JavaCore.newLibraryEntry(path, null, null);
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public void initialize(IPath containerPath, IJavaProject project)
			throws CoreException {
		if (isValidJUnitContainerPath(containerPath)) {
			JavaFXContainer container = getNewContainer(containerPath, project);

			JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project }, 	new IClasspathContainer[] { container }, null);
		}
	}
	
	private static JavaFXContainer getNewContainer(IPath containerPath, IJavaProject project) {
		IClasspathEntry entry= null;
		entry= BuildPathSupport.getJavaFXLibraryEntry(project);
		
		
		IClasspathEntry[] entries;
		if (entry == null) {
			entries= new IClasspathEntry[] { getJavaFX8CssExt() };
		} else {
			entries= new IClasspathEntry[] { getJavaFX8CssExt(), entry };
		}
		return new JavaFXContainer(containerPath, entries);
	}

	private static boolean isValidJUnitContainerPath(IPath path) {
		return path != null && JavaFXCore.JAVAFX_CONTAINER_ID.equals(path.segment(0));
	}
}
