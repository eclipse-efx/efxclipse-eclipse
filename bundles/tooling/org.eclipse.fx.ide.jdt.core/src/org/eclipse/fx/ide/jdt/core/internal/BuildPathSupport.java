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
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.core.log.LoggerCreator;
import org.eclipse.fx.ide.jdt.core.FXVersion;
import org.eclipse.fx.ide.jdt.core.FXVersionUtil;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstall2;
import org.eclipse.jdt.launching.IVMInstall3;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;

public class BuildPathSupport {
	public static final String WEB_JAVADOC_LOCATION = "http://docs.oracle.com/javase/8/javafx/api/";

	private static final Logger LOGGER = LoggerCreator.createLogger(BuildPathSupport.class);

	public static IClasspathEntry getJavaFXLibraryEntry(IJavaProject project) {
		IPath[] paths = getFxJarPath(project);
		if( paths != null ) {

			IPath jarLocationPath = paths[0];
			IPath javadocLocation = paths[1];
			IPath fxSource = paths[3];

			IClasspathAttribute[] attributes;
			IAccessRule[] accessRules= { };
			if (javadocLocation == null || !javadocLocation.toFile().exists()) {
				attributes= new IClasspathAttribute[] { JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, WEB_JAVADOC_LOCATION) };
			} else {
				attributes= new IClasspathAttribute[] { JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, javadocLocation.toFile().toURI().toString()) };
			}

			if( jarLocationPath.toFile().exists() ) {
				return JavaCore.newLibraryEntry(jarLocationPath, fxSource, null, accessRules, attributes, false);
			}
		}

		return null;
	}

	public static IPath[] getFxJarPath(IJavaProject project) {
		IPath jarLocationPath = null;
		IPath javadocLocation = null;
		IPath antJarLocationPath = null;
		IPath sourceLocationPath = null;

		try {
			IVMInstall i = JavaRuntime.getVMInstall(project);
			if( i == null ) {
				i = JavaRuntime.getDefaultVMInstall();
			}

			if( FXVersionUtil.getFxVersion(i) != FXVersion.FX9 ) {
				return getFxJarPath(i);
			}
			return null;
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new IPath[] { jarLocationPath, javadocLocation, antJarLocationPath, sourceLocationPath };
	}


	public static IPath[] getSwtFxJarPath(IVMInstall i) {
		File installDir = i.getInstallLocation();
		IPath[] checkPaths = {
				// JDK 8
				new Path(installDir.getAbsolutePath()).append("jre").append("lib").append("jfxswt.jar"),
				new Path(installDir.getAbsolutePath()).append("lib").append("jfxswt.jar"), // JRE
				new Path(installDir.getAbsolutePath()).append("lib").append("javafx-swt.jar")
			};

		IPath jarLocationPath = null;
		IPath javadocLocation = null;
		IPath sourceLocationPath = null;

		jarLocationPath = checkPaths[0];

		if( ! jarLocationPath.toFile().exists() ) {
			for( IPath p : checkPaths ) {
				if( p.toFile().exists() ) {
					jarLocationPath = p;
					break;
				}
			}
		}

		if( jarLocationPath.toFile().exists() ) {
			sourceLocationPath = new Path(installDir.getAbsolutePath()).append("javafx-src.zip");

			return new IPath[] { jarLocationPath, javadocLocation, sourceLocationPath };
		}

		return null;
	}

	public static IPath[] getFxJarPath(IVMInstall i) {
		for( LibraryLocation l : JavaRuntime.getLibraryLocations(i) ) {
			if( "jfxrt.jar".equals(l.getSystemLibraryPath().lastSegment()) ) {
				return null;
			}
		}

		IPath jarLocationPath = null;
		IPath javadocLocation = null;
		IPath antJarLocationPath = null;
		IPath sourceLocationPath = null;

		File installDir = i.getInstallLocation();

		IPath[] checkPaths = {
			// Java 7
			new Path(installDir.getAbsolutePath()).append("jre").append("lib").append("jfxrt.jar"),
			new Path(installDir.getAbsolutePath()).append("lib").append("jfxrt.jar") // JRE

		};

		jarLocationPath = checkPaths[0];

		if( ! jarLocationPath.toFile().exists() ) {
			for( IPath p : checkPaths ) {
				if( p.toFile().exists() ) {
					jarLocationPath = p;
					break;
				}
			}
		}

		if( ! jarLocationPath.toFile().exists() ) {
			LOGGER.error("Unable to detect JavaFX jar for JRE " + i.getName());
			LOGGER.error("	JRE: " + installDir.getAbsolutePath());
			LOGGER.error("	Checked paths:" );
			for( IPath p : checkPaths ) {
				LOGGER.error("		" + p.toFile().getAbsolutePath());
			}

			return null;
		}

		javadocLocation = new Path(installDir.getParentFile().getAbsolutePath()).append("docs").append("api"); //TODO Not shipped yet
		if( ! javadocLocation.toFile().exists() ) {
			IPath p = new Path(System.getProperty("user.home")).append("javafx-api-"+ i.getName()).append("docs").append("api");
			if( p.toFile().exists() ) {
				javadocLocation = p;
			}
		}

		antJarLocationPath = new Path(installDir.getParent()).append("lib").append("ant-javafx.jar");

		sourceLocationPath = new Path(installDir.getAbsolutePath()).append("javafx-src.zip");

		if( ! sourceLocationPath.toFile().exists() ) {
			sourceLocationPath = null;
		}

		return new IPath[] { jarLocationPath, javadocLocation, antJarLocationPath, sourceLocationPath };
	}
}
