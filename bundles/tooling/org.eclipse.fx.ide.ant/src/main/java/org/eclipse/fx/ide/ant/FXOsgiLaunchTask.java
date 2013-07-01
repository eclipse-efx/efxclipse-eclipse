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
package org.eclipse.fx.ide.ant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.resources.FileResource;
import org.apache.tools.ant.util.ClasspathUtils;
import org.apache.tools.ant.util.FileUtils;
import org.apache.tools.ant.util.ResourceUtils;

public class FXOsgiLaunchTask extends Task {
	private String classpathRef;
	private String outDir;
	private String equinoxLauncherJarRef;
	
	private static final String PREFIX = "resources/classes/";
	
	private static final String[] LAUNCHER_FILES = new String[] {
		"com/javafx/main/Main.class",
		"com/javafx/main/Main$1.class",
		"com/javafx/main/Main$2.class",
		"com/javafx/main/NoJavaFXFallback.class"
	};
	
	public void setClasspathRef(String classpathRef) {
		this.classpathRef = classpathRef;
	}
	
	public void setOutDir(String outDir) {
		this.outDir = outDir;
	}
	
	public void setEquinoxLauncherJarRef(String equinoxLauncherJarRef) {
		this.equinoxLauncherJarRef = equinoxLauncherJarRef;
	}
	
	public void execute() throws BuildException {
		try {
			ClassLoader cl = ClasspathUtils.getClassLoaderForPath(getProject(), (Path) getProject().getReference(classpathRef), UUID.randomUUID().toString());
			
			FileSet p = (FileSet) getProject().getReference(equinoxLauncherJarRef);
			FileResource r = (FileResource) p.iterator().next();
			String equinoxLauncherJar = "plugins/"+r.getFile().getName();
			
			Manifest m = new Manifest();
			m.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
			m.getMainAttributes().put(new Attributes.Name("JavaFX-Version"), "2.2");
			m.getMainAttributes().put(Attributes.Name.IMPLEMENTATION_VENDOR, "BestSolution.at");
			m.getMainAttributes().put(Attributes.Name.IMPLEMENTATION_TITLE, "JavaFX App");
			m.getMainAttributes().put(Attributes.Name.IMPLEMENTATION_VERSION, "1.0.0");
			m.getMainAttributes().put(new Attributes.Name("JavaFX-Application-Class"), "org.eclipse.equinox.launcher.Main");
			m.getMainAttributes().put(new Attributes.Name("JavaFX-Class-Path"), equinoxLauncherJar);
			m.getMainAttributes().put(new Attributes.Name("Main-Class"), "com/javafx/main/Main");

			FileOutputStream out = new FileOutputStream(new File(outDir,"fx-osgi-launcher.jar"));
			
			JarOutputStream jOut = new JarOutputStream(out,m);
			jOut.putNextEntry(new JarEntry("com/"));
			jOut.closeEntry();
			
			jOut.putNextEntry(new JarEntry("com/javafx/"));
			jOut.closeEntry();
			
			jOut.putNextEntry(new JarEntry("com/javafx/main"));
			jOut.closeEntry();
			
			for( String f : LAUNCHER_FILES ) { 
				JarEntry e = new JarEntry(f);
				jOut.putNextEntry(e);
				
				byte[] buf = new byte[1024];
				int len;
				InputStream in = cl.getResourceAsStream(PREFIX+f);
				
				while( (len = in.read(buf)) != -1 ) {
					jOut.write(buf, 0, len);
				}
				jOut.closeEntry();
			}
			jOut.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
