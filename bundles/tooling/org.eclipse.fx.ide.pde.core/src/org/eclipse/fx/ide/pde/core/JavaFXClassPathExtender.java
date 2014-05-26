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
import org.eclipse.fx.ide.jdt.core.FXVersion;
import org.eclipse.fx.ide.jdt.core.FXVersionUtil;
import org.eclipse.fx.ide.jdt.core.JavaFXCore;
import org.eclipse.fx.ide.jdt.core.internal.BuildPathSupport;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.ImportPackageSpecification;
import org.eclipse.pde.core.IClasspathContributor;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.ClasspathUtilCore;
import org.omg.CORBA.UNKNOWN;

@SuppressWarnings("restriction")
public class JavaFXClassPathExtender implements IClasspathContributor {
	
	private IVMInstall findVMForEnv(IExecutionEnvironment env) {
		IVMInstall vm = env.getDefaultVM();
		if (vm == null) {
			for (IVMInstall compatibleVM : env.getCompatibleVMs()) {
				if (env.isStrictlyCompatible(compatibleVM)) {
					vm = compatibleVM;
					break;
				}
			}
		}
		return vm;
	}
	
	private IVMInstall getVM(BundleDescription project) {
		for( String e : project.getExecutionEnvironments() ) {
			IExecutionEnvironment env = JavaRuntime.getExecutionEnvironmentsManager().getEnvironment(e);
			IVMInstall vm = findVMForEnv(env);
			if (vm != null) {
				return vm;
			}
		}
		return null;
	}
	
	
	private IClasspathEntry getJavaCssExtEntry(FXVersion version) {
		switch (version) {
		case FX2: return getBundleAsEntryByName(JavaFXCore.CSSEXT_FX2_BUNDLE_NAME);
		case FX8: return getBundleAsEntryByName(JavaFXCore.CSSEXT_FX8_BUNDLE_NAME);
		}
		return null;
	}
	
	private IClasspathEntry getBundleAsEntryByName(String name) {
		final IPluginModelBase model = PluginRegistry.findModel(name);
		final IPath path = new Path(model.getInstallLocation());
		final IPath srcPath = ClasspathUtilCore.getSourceAnnotation(model, ".");
		return JavaCore.newLibraryEntry(path, srcPath, null);
	}
	
	private IClasspathEntry getSWTFXEntry(IVMInstall vm) {
		IPath[] swtFxJarPath = BuildPathSupport.getSwtFxJarPath(vm);
		if( swtFxJarPath != null ) {
			List<IAccessRule> l = new ArrayList<IAccessRule>();
			l.add(JavaCore.newAccessRule(new Path("javafx.embed.swt".replace('.', '/')+"/*"),IAccessRule.K_ACCESSIBLE));
			IClasspathAttribute[] extraAttributes = {
					JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, swtFxJarPath[1] == null || !swtFxJarPath[1].toFile().exists() ? BuildPathSupport.WEB_JAVADOC_LOCATION : swtFxJarPath[1].toFile().toURI().toString())
			};
			
			return JavaCore.newLibraryEntry(swtFxJarPath[0], swtFxJarPath[2], null, l.toArray(new IAccessRule[0]), extraAttributes, false);
		}
		return null;
	}
	
	private IClasspathEntry getJavaFX2RuntimeEntry(IVMInstall vm, BundleDescription project) {
		IPath[] paths = BuildPathSupport.getFxJarPath(vm);
		if( paths == null ) {
			return null;
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
				} else if( i.getName().startsWith("com.sun.javafx.scene.text") ) {
					l.add(JavaCore.newAccessRule(new Path(i.getName().replace('.', '/')+"/*"),IAccessRule.K_DISCOURAGED));
				} 
			}
			
			IClasspathAttribute[] extraAttributes = {
					JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, paths[1] == null || !paths[1].toFile().exists() ? BuildPathSupport.WEB_JAVADOC_LOCATION : paths[1].toFile().toURI().toString())
			};
			
			return JavaCore.newLibraryEntry(paths[0], null, null, l.toArray(new IAccessRule[0]), extraAttributes, false);
		}
	}
	
	@Override
	public List<IClasspathEntry> getInitialEntries(BundleDescription project) {
		final List<IClasspathEntry> entries = new ArrayList<>();
		
		final IVMInstall vm = getVM(project);
		final FXVersion version = FXVersionUtil.getFxVersion(vm);
		
		
		final IClasspathEntry javaCssExtEntry = getJavaCssExtEntry(version);
		if (javaCssExtEntry != null) {
			entries.add(javaCssExtEntry);
		}
		
		// FX8 classpath
		if (version == FXVersion.FX8) {
			
			final IClasspathEntry swtFxEntry = getSWTFXEntry(vm);
			if (swtFxEntry != null) {
				entries.add(swtFxEntry);
			}
			
		}
		
		// FX2 classpath
		if (version == FXVersion.FX2) {
		
			final IClasspathEntry jfx2Runtime = getJavaFX2RuntimeEntry(vm, project);
			if (jfx2Runtime != null) {
				entries.add(jfx2Runtime);
			}
			
		}
		
		return entries;
	}

	@Override
	public List<IClasspathEntry> getEntriesForDependency(BundleDescription project, BundleDescription addedDependency) {
		return Collections.emptyList();
	}
}
