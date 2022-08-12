/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
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
package org.eclipse.fx.ide.jdt.core.internal;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.internal.core.PDECore;

@SuppressWarnings("restriction")
public class MobileClasspathContainer extends ClasspathContainerInitializer {
	private static class SimulatorContainer implements IClasspathContainer {

		private final IClasspathEntry[] fEntries;
		private final IPath fPath;

		public SimulatorContainer(IPath path, IClasspathEntry[] entries) {
			fPath= path;
			fEntries= entries;
		}

		public IClasspathEntry[] getClasspathEntries() {
			return fEntries;
		}

		public String getDescription() {
			return "Mobile SDK Classpath";
		}

		public int getKind() {
			return IClasspathContainer.K_APPLICATION;
		}

		public IPath getPath() {
			return fPath;
		}

	}
	
	@Override
	public void initialize(IPath containerPath, IJavaProject project) throws CoreException {
		SimulatorContainer container = new SimulatorContainer(containerPath,createEntries());
		JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project }, 	new IClasspathContainer[] { container }, null);
	}

	public IClasspathEntry[] createEntries() {
		return new IClasspathEntry[] { 
				createPDEEntry("org.eclipse.fx.ui.mobile"),
				createPDEEntry("org.eclipse.fx.core")
		};
	}
	
	private IClasspathEntry createPDEEntry(String bundleName) {
		IPluginModelBase findModel = PDECore.getDefault().getModelManager().findModel(bundleName);
		
		String installLocation = findModel.getInstallLocation();
		File f = new File(installLocation);
		
		if( f.isDirectory() ) {
			return JavaCore.newLibraryEntry(new Path(installLocation+"/bin"), null,null);
		} else {
			return JavaCore.newLibraryEntry(new Path(installLocation), null,null);
		}
	}
}
