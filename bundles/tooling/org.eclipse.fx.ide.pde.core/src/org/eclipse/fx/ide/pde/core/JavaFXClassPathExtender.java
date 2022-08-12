/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/

package org.eclipse.fx.ide.pde.core;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.InstanceScope;
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
import org.osgi.framework.Bundle;

@SuppressWarnings("restriction")
public class JavaFXClassPathExtender implements IClasspathContributor {
	private static boolean DEBUG = Boolean.getBoolean("efxclipse.pde.debug");

	private IVMInstall findVMForEnv(IExecutionEnvironment env) {
		if( DEBUG ) {
			System.err.println("JavaFXClasspathExtender - Look up vm for: " + env.getId() );
		}
		IVMInstall vm = env.getDefaultVM();


		if (vm == null) {
			for (IVMInstall compatibleVM : env.getCompatibleVMs()) {
				if (env.isStrictlyCompatible(compatibleVM)) {
					vm = compatibleVM;
					break;
				}
			}
		}

		if( DEBUG ) {
			if( vm == null ) {
				System.err.println("JavaFXClasspathExtender - No vm found");
			} else {
				System.err.println("JavaFXClasspathExtender - The default VM is: " +  vm.getInstallLocation());
			}
		}

		return vm;
	}

	private IVMInstall getVM(BundleDescription project) {
		for( String e : project.getExecutionEnvironments() ) {
			IExecutionEnvironment env = JavaRuntime.getExecutionEnvironmentsManager().getEnvironment(e);
			if( env != null ) {
				IVMInstall vm = findVMForEnv(env);
				if (vm != null) {
					return vm;
				}
			}
		}
		return null;
	}


	private IClasspathEntry getJavaCssExtEntry(FXVersion version) {
		switch (version) {
			case FX2: return getBundleAsEntryByName(JavaFXCore.CSSEXT_FX2_BUNDLE_NAME);
			case FX8: return getBundleAsEntryByName(JavaFXCore.CSSEXT_FX8_BUNDLE_NAME);
			case FX9: return getBundleAsEntryByName(JavaFXCore.CSSEXT_FX8_BUNDLE_NAME);
			default: return getBundleAsEntryByName(JavaFXCore.CSSEXT_FX8_BUNDLE_NAME);
		}
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

	private IClasspathEntry getSWTFXEntry(IVMInstall vm) {
		IPath[] swtFxJarPath = BuildPathSupport.getSwtFxJarPath(vm);
		if( swtFxJarPath != null ) {
			if( DEBUG ) {
				System.err.println("JavaFXClasspathExtender - SWTFX is located at: " + swtFxJarPath[0]);
			}
			List<IAccessRule> l = new ArrayList<IAccessRule>();
			l.add(JavaCore.newAccessRule(new Path("javafx.embed.swt".replace('.', '/')+"/*"),IAccessRule.K_ACCESSIBLE));
			IClasspathAttribute[] extraAttributes = {
					JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, swtFxJarPath[1] == null || !swtFxJarPath[1].toFile().exists() ? BuildPathSupport.WEB_JAVADOC_LOCATION : swtFxJarPath[1].toFile().toURI().toString())
			};

			return JavaCore.newLibraryEntry(swtFxJarPath[0], swtFxJarPath[2], null, l.toArray(new IAccessRule[0]), extraAttributes, false);
		} else {
			if( DEBUG ) {
				System.err.println("JavaFXClasspathExtender - Could not find swtfx.jar");
			}
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
		
		if( DEBUG ) {
			System.err.println("JavaFXClasspathExtender - The javafx version is: " + version);
		}

		final IClasspathEntry javaCssExtEntry = getJavaCssExtEntry(version);
		if (javaCssExtEntry != null) {
			entries.add(javaCssExtEntry);
		}
		
		if( version == FXVersion.FX11 || version == FXVersion.FX11PLUS ) {
			String sdkPath = InstanceScope.INSTANCE.getNode("org.eclipse.fx.ide.ui").get("javafx-sdk", null);
			if( sdkPath != null ) {
				java.nio.file.Path path = Paths.get(sdkPath);
				if( Files.exists(path) ) {
					
					java.nio.file.Path srcZip;
					if( ! Files.exists(path.resolve("src.zip")) ) {
						srcZip = path.getParent().resolve("src.zip"); // since v17 the source is found in the parent of the lib dir
					} else {
						srcZip = path.resolve("src.zip");
					}
					
					try {
						entries.addAll(Files.list(path).filter( p -> p.getFileName().toString().endsWith(".jar")).map( p -> {
							return JavaCore.newLibraryEntry( 
									new Path(p.toAbsolutePath().toString()), 
									new Path(srcZip.toAbsolutePath().toString()),
									new Path("."),
									new IAccessRule[]{ 
											JavaCore.newAccessRule(new Path("javafx/*"),IAccessRule.K_ACCESSIBLE),
											JavaCore.newAccessRule(new Path("com/sun/*"),IAccessRule.K_DISCOURAGED),
											JavaCore.newAccessRule(new Path("netscape/javascript/*"),IAccessRule.K_DISCOURAGED)},
									null,
									false);
						}).collect(Collectors.toList()));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		// FX8 classpath
		if (version == FXVersion.FX8 || version == FXVersion.FX9) {
			if( DEBUG ) {
				System.err.println("JavaFXClasspathExtender - This is FX8 only add the SWT-Lib ");
			}
			final IClasspathEntry swtFxEntry = getSWTFXEntry(vm);

			if (swtFxEntry != null) {
				if( DEBUG ) {
					System.err.println("JavaFXClasspathExtender - Adding swt entry");
				}
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
