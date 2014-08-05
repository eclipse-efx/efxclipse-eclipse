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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.fx.ide.jdt.core.FXVersionUtil;
import org.eclipse.fx.ide.jdt.core.JavaFXCore;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.osgi.framework.Bundle;


public class JavaFXClasspathContainerInitializer extends ClasspathContainerInitializer {

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
	
	public static IClasspathEntry getCssExtClasspathEntry(IJavaProject project) {
		try {
			return getCssExtClasspathEntry(JavaRuntime.getVMInstall(project));
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static IClasspathEntry getCssExtClasspathEntry(IVMInstall i) {
		switch (FXVersionUtil.getFxVersion(i)) {
		case FX2: return getBundleAsEntryByName(JavaFXCore.CSSEXT_FX2_BUNDLE_NAME);
		case FX8: return getBundleAsEntryByName(JavaFXCore.CSSEXT_FX8_BUNDLE_NAME);
		}
		return null;
	}
	
	private static IClasspathEntry getBundleAsEntryByName(String name) {
		try {
			final Bundle bundle = Platform.getBundle(name);
			if (bundle != null) {
				final File bundleFile = FileLocator.getBundleFile(bundle);
				final Path path = new Path(bundleFile.getAbsolutePath());
				return JavaCore.newLibraryEntry(path, null, null);
			}
			else {
				return null;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public boolean canUpdateClasspathContainer(IPath containerPath, IJavaProject project) {
		return true;
	}
	
	@Override
	public void requestClasspathContainerUpdate(IPath containerPath, IJavaProject project, IClasspathContainer containerSuggestion) throws CoreException {
		System.err.println("requestUpdate " + containerSuggestion);
		
		if (isValidJUnitContainerPath(containerPath)) {
			final JavaFXContainer container = getNewContainer(containerPath, project);
			JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project }, 	new IClasspathContainer[] { container }, null);
		}
	}
	
	
	@Override
	public void initialize(IPath containerPath, IJavaProject project) throws CoreException {
		if (isValidJUnitContainerPath(containerPath)) {
			final JavaFXContainer container = getNewContainer(containerPath, project);
			JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project }, 	new IClasspathContainer[] { container }, null);
		}
		
		// register update hook
		IElementChangedListener listener = new IElementChangedListener() {
			
			@Override
			public void elementChanged(ElementChangedEvent event) {
				if (event.getDelta().getKind() == IJavaElementDelta.CHANGED && (event.getDelta().getFlags() & IJavaElementDelta.F_CHILDREN) == IJavaElementDelta.F_CHILDREN) {
					// change on JavaModel
					for (IJavaElementDelta delta : event.getDelta().getAffectedChildren()) {
						if ((delta.getFlags() & IJavaElementDelta.F_CLASSPATH_CHANGED) == IJavaElementDelta.F_CLASSPATH_CHANGED) {
							// classpath change on ??
							if (delta.getElement().getElementType() == IJavaElement.JAVA_PROJECT && delta.getElement().getJavaProject().equals(project)) {
								// classpath change
								try {
									requestClasspathContainerUpdate(containerPath, project, null);
								}
								catch (CoreException e) {
									e.printStackTrace();
								}
							}
							
						}
					}
					
					
				}
			}
		};
		JavaCore.addElementChangedListener(listener);
		// TODO remove listener
		
	}
	
	
	private static JavaFXContainer getNewContainer(IPath containerPath, IJavaProject project) {
		final IClasspathEntry jfxLibEntry = BuildPathSupport.getJavaFXLibraryEntry(project);
		final IClasspathEntry cssExtEntry = getCssExtClasspathEntry(project);
		
		final List<IClasspathEntry> entries = new ArrayList<>();

		if (jfxLibEntry != null) {
			entries.add(jfxLibEntry);
		}
		
		if (cssExtEntry != null) {
			entries.add(cssExtEntry);
		}
		
		return new JavaFXContainer(containerPath, entries.toArray(new IClasspathEntry[0]));
	}

	private static boolean isValidJUnitContainerPath(IPath path) {
		return path != null && JavaFXCore.JAVAFX_CONTAINER_ID.equals(path.segment(0));
	}
}
