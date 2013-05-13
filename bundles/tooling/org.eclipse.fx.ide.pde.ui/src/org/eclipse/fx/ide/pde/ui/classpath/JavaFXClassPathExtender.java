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
package org.eclipse.fx.ide.pde.ui.classpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.launching.environments.EnvironmentsManager;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.ImportPackageSpecification;
import org.eclipse.pde.core.IClasspathContributor;

import org.eclipse.fx.ide.jdt.core.internal.BuildPathSupport;

@SuppressWarnings("restriction")
public class JavaFXClassPathExtender implements IClasspathContributor {

	@Override
	public List<IClasspathEntry> getInitialEntries(BundleDescription project) {
		for( String e : project.getExecutionEnvironments() ) {
			IExecutionEnvironment env = EnvironmentsManager.getDefault().getEnvironment(e);
			
			if( env == null ) {
				continue;
			}
			
			IVMInstall vm = env.getDefaultVM();
			
			if( vm == null ) {
				for( IVMInstall i : env.getCompatibleVMs() ) {
					vm = i;
					break;
				}
			}
			
			if( vm != null ) {
				IPath[] paths = BuildPathSupport.getFxJarPath(vm);
				if( paths == null ) {
					return Collections.emptyList();
				} else {
					List<IAccessRule> l = new ArrayList<IAccessRule>();
					for( ImportPackageSpecification i : project.getImportPackages() ) {
						if( i.getName().startsWith("javafx") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_ACCESSIBLE));
						} else if( i.getName().startsWith("com.sun.browser") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						} else if( i.getName().startsWith("com.sun.deploy") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						} else if( i.getName().startsWith("com.sun.glass") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						} else if( i.getName().startsWith("com.sun.javafx") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						} else if( i.getName().startsWith("com.sun.media") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						} else if( i.getName().startsWith("com.sun.openpisces") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						} else if( i.getName().startsWith("com.sun.prism") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						} else if( i.getName().startsWith("com.sun.scenario") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						} else if( i.getName().startsWith("com.sun.t2k") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						} else if( i.getName().startsWith("com.sun.webpane") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						} else if( i.getName().startsWith("netscape.javascript") ) {
							l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
						}
					}
					
					IClasspathAttribute[] extraAttributes = {
							JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, paths[1] == null || !paths[1].toFile().exists() ? BuildPathSupport.WEB_JAVADOC_LOCATION : paths[1].toFile().toURI().toString())
					};
					
					return Collections.singletonList(JavaCore.newContainerEntry(paths[0], l.toArray(new IAccessRule[0]), extraAttributes, false));
				}
			}
		}
		return Collections.emptyList();
	}

	@Override
	public List<IClasspathEntry> getEntriesForDependency(BundleDescription project, BundleDescription addedDependency) {
		return Collections.emptyList();
	}
}
