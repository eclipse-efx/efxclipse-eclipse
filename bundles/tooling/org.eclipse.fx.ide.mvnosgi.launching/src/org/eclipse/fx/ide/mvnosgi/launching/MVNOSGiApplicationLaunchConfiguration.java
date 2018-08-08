package org.eclipse.fx.ide.mvnosgi.launching;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.stream.Collectors;
import java.util.zip.ZipFile;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.model.Plugin;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.fx.core.SystemUtils;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.project.IMavenProjectFacade;

public class MVNOSGiApplicationLaunchConfiguration extends LaunchConfigurationDelegate {
	private static final String LF = System.getProperty("line.separator");

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		ILaunchConfigurationWorkingCopy wc = null;
		if (configuration.isWorkingCopy()) {
			wc = (ILaunchConfigurationWorkingCopy) configuration;
		} else {
			wc = configuration.getWorkingCopy();
		}
		String id = configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_SOURCE_PATH_PROVIDER,
				(String) null);
		if (!MVNSourcePathProvider.ID.equals(id)) {
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_SOURCE_PATH_PROVIDER, MVNSourcePathProvider.ID);
			wc.doSave();
		}

		IMavenProjectFacade facade = getMavenFacade(configuration);
		MavenProject mavenProject = facade.getMavenProject(null);
		Optional<Plugin> osgiLauncherPlugin = mavenProject.getBuildPlugins().stream().filter(
				b -> "at.bestsolution".equals(b.getGroupId()) && "maven-osgi-exec-plugin".equals(b.getArtifactId()))
				.findFirst();

		Optional<String> launcherJar = mavenProject.getArtifacts().stream()
				.filter(a -> "org.eclipse.equinox.launcher".equals(a.getArtifactId())).findFirst()
				.map(a -> a.getFile().toString());

		Path configIni = generateConfigIni(osgiLauncherPlugin, configuration);

		if (launcherJar.isPresent()) {
			VMRunnerConfiguration runnerConfig = new VMRunnerConfiguration("org.eclipse.equinox.launcher.Main",
					new String[] { launcherJar.get() });
			runnerConfig.setVMArguments(getVMArguments(osgiLauncherPlugin, configuration));
			runnerConfig.setProgramArguments(getProgramArgs(osgiLauncherPlugin, configIni, configuration));
			// runnerConfig.setWorkingDirectory(getWorkingDirectory(configuration).getAbsolutePath());
			// runnerConfig.setEnvironment(getEnvironment(configuration));
			// runnerConfig.setVMSpecificAttributesMap(getVMSpecificAttributesMap(configuration));

			// manageLaunch(launch);
			IVMInstall vmInstall = JavaRuntime.getVMInstall(getJavaProject(facade.getProject().getName()));
			vmInstall.getVMRunner(mode).run(runnerConfig, launch, new NullProgressMonitor());
		} else {
			System.err.println("NOT FOUND");
		}
	}

	private String[] getVMArguments(Optional<Plugin> osgiLauncherPlugin, ILaunchConfiguration configuration) {
		ArrayList<String> vmArgs = new ArrayList<>();

		if (osgiLauncherPlugin.isPresent()) {
			Xpp3Dom d = (Xpp3Dom) osgiLauncherPlugin.get().getConfiguration();
			for (Xpp3Dom c : d.getChildren()) {
				if ("vmProperties".equals(c.getName())) {
					for (Xpp3Dom cc : c.getChildren()) {
						if ("property".equals(cc.getName())) {
							String name = null;
							String value = null;
							for (Xpp3Dom ccc : cc.getChildren()) {
								if ("name".equals(ccc.getName())) {
									name = ccc.getValue();
								} else if ("value".equals(ccc.getName())) {
									value = ccc.getValue();
								}
							}

							if (name != null && value != null) {
								vmArgs.add("-D" + name + "=" + value);
							}
						}
					}
				}
			}
		}

		return vmArgs.toArray(new String[0]);
	}

	private String[] getProgramArgs(Optional<Plugin> osgiLauncherPlugin, Path configIni,
			ILaunchConfiguration configuration) {
		List<String> programArgs = new ArrayList<>();
		programArgs.add("-configuration"); //$NON-NLS-1$
		programArgs.add("file:" + configIni.toString()); //$NON-NLS-1$

		if (osgiLauncherPlugin.isPresent()) {
			Xpp3Dom d = (Xpp3Dom) osgiLauncherPlugin.get().getConfiguration();
			for (Xpp3Dom c : d.getChildren()) {
				if ("programArguments".equals(c.getName())) {
					for (Xpp3Dom cc : c.getChildren()) {
						if ("programArgument".equals(cc.getName())) {
							programArgs.add(cc.getValue());
						}
					}
				}
			}
		}
		return programArgs.toArray(new String[0]);
	}

	protected IJavaProject getJavaProject(String projectName) {
		return getJavaModel().getJavaProject(projectName);
	}

	/**
	 * Convenience method to get access to the java model.
	 */
	private IJavaModel getJavaModel() {
		return JavaCore.create(getWorkspaceRoot());
	}

	protected IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	private IMavenProjectFacade getMavenFacade(ILaunchConfiguration configuration) throws CoreException {
		String projectName = configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
				(String) null);
		IJavaProject project = getJavaProject(projectName);

		return MavenPlugin.getMavenProjectRegistry().getProject(project.getProject());
	}

	private Path generateConfigIni(Optional<Plugin> osgiLauncherPlugin, ILaunchConfiguration configuration)
			throws CoreException {
		IMavenProjectFacade facade = getMavenFacade(configuration);

		String projectName = facade.getProject().getName();
		Set<Bundle> bundles = facade.getMavenProject(new NullProgressMonitor()).getArtifacts().stream()
				.map(a -> map(osgiLauncherPlugin, a)).filter(Optional::isPresent).map(Optional::get)
				.collect(Collectors.toSet());

		IJavaProject project = getJavaProject(projectName);

		Path path = getWorkspaceRoot().getFolder(project.getOutputLocation()).getLocation().toFile().toPath();
		bundles.add(new Bundle(osgiLauncherPlugin, getManifest(path).get(), path));

		Path p = Paths.get(System.getProperty("java.io.tmpdir")).resolve(projectName).resolve("configuration");

		Optional<Bundle> simpleConfigurator = bundles.stream()
				.filter(b -> "org.eclipse.equinox.simpleconfigurator".equals(b.symbolicName)).findFirst();

		Optional<Bundle> equinox = bundles.stream().filter(b -> "org.eclipse.osgi".equals(b.symbolicName)).findFirst();

		try {
			Files.createDirectories(p);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (simpleConfigurator.isPresent()) {
			Path configIni = p.resolve("config.ini");
			try (BufferedWriter writer = Files.newBufferedWriter(configIni, StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING)) {
				Path bundlesInfo = generateBundlesInfo(p, bundles);

				writer.append("osgi.bundles=" + toReferenceURL(simpleConfigurator.get(), false));
				writer.append(LF);
				writer.append("osgi.bundles.defaultStartLevel=4");
				writer.append(LF);
				writer.append("osgi.install.area=" + toInstallAreaURL(p));
				writer.append(LF);
				writer.append("osgi.framework=" + toFrameworkURL(equinox.get()));
				writer.append(LF);
				writer.append("eclipse.p2.data.area=@config.dir/.p2");
				writer.append(LF);
				writer.append(
						"org.eclipse.equinox.simpleconfigurator.configUrl=" + toSimpleConfigurationURL(bundlesInfo));
				writer.append(LF);
				writer.append("osgi.configuration.cascaded=false");
				writer.append(LF);
			} catch (IOException e) {
				throw new CoreException(
						new Status(IStatus.ERROR, "org.eclipse.fx.ide.mvnosgi.launching", e.getMessage(), e));
			}

		} else {
			throw new CoreException(new Status(IStatus.ERROR, "org.eclipse.fx.ide.mvnosgi.launching",
					"Only simple-configurator is supported currently"));
		}

		return p;
	}

	private static String toInstallAreaURL(Path p) {
		String rv = p.getParent().resolve("install").toString();
		if (SystemUtils.isWindows()) {
			rv = rv.replace("\\", "\\\\").replace(":", "\\:");
		}
		return "file\\:" + rv;
	}

	private static String toFrameworkURL(Bundle bundle) {
		String rv = bundle.path.toString();
		if (SystemUtils.isWindows()) {
			rv = rv.replace('\\', '/').replace(":", "\\:");
		}
		return "file\\:" + rv;
	}

	private static String toSimpleConfigurationURL(Path bundlesInfo) {
		String rv = bundlesInfo.toAbsolutePath().toString();
		if( SystemUtils.isWindows() ) {
			rv = rv.replace('\\', '/').replace(":", "\\:");
		}
		return "file\\:" + rv;
	}

	private Optional<Manifest> getManifest(Path p) {
		if (Files.isDirectory(p)) {
			Path mf = p.resolve("META-INF").resolve("MANIFEST.MF");
			if (!Files.exists(mf)) {
				return Optional.empty();
			}
			try (InputStream in = Files.newInputStream(mf)) {
				return Optional.of(new Manifest(in));
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		} else {
			try (JarFile f = new JarFile(p.toFile())) {
				return Optional.ofNullable(f.getManifest());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	private Path generateBundlesInfo(Path configurationDir, Set<Bundle> bundles) throws CoreException {
		Path bundleInfo = configurationDir.resolve("org.eclipse.equinox.simpleconfigurator").resolve("bundles.info");
		try {
			Files.createDirectories(bundleInfo.getParent());
		} catch (IOException e) {
			throw new CoreException(
					new Status(IStatus.ERROR, "org.eclipse.fx.ide.mvnosgi.launching", e.getMessage(), e));
		}

		try (BufferedWriter writer = Files.newBufferedWriter(bundleInfo, StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING)) {
			writer.append("#encoding=UTF-8");
			writer.append(LF);
			writer.append("#version=1");
			writer.append(LF);

			for (Bundle b : bundles) {
				if ("org.eclipse.osgi".equals(b.symbolicName)) {
					continue;
				}
				writer.append(b.symbolicName);
				writer.append("," + b.version);
				writer.append("," + generateLocalPath(b, configurationDir.resolve(".explode")).toUri().toASCIIString());
				writer.append("," + b.startLevel); // Start Level
				writer.append("," + b.autoStart); // Auto-Start
				writer.append(LF);
			}

		} catch (IOException e) {
			throw new CoreException(
					new Status(IStatus.ERROR, "org.eclipse.fx.ide.mvnosgi.launching", e.getMessage(), e));
		}
		return bundleInfo;
	}

	private Path generateLocalPath(Bundle b, Path explodeDir) {
		if (b.dirShape && Files.isRegularFile(b.path)) {
			Path p = explodeDir.resolve(b.symbolicName + "_" + b.version);
			if (!Files.exists(p)) {
				try (ZipFile z = new ZipFile(b.path.toFile())) {
					z.stream().forEach(e -> {
						Path ep = p.resolve(e.getName());
						if (e.isDirectory()) {
							try {
								Files.createDirectories(ep);
							} catch (IOException e1) {
								throw new RuntimeException(e1);
							}
						} else {
							if (!Files.exists(ep.getParent())) {
								try {
									Files.createDirectories(ep.getParent());
								} catch (IOException e1) {
									throw new RuntimeException(e1);
								}
							}
							try (OutputStream out = Files.newOutputStream(ep); InputStream in = z.getInputStream(e)) {
								byte[] buf = new byte[1024];
								int l;
								while ((l = in.read(buf)) != -1) {
									out.write(buf, 0, l);
								}
							} catch (IOException e2) {
								throw new RuntimeException(e2);
							}
						}
					});
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			return p;
		}
		return b.path.toAbsolutePath();
	}

	private Optional<Bundle> map(Optional<Plugin> osgiLauncherPlugin, Artifact a) {
		return getManifest(a.getFile().toPath()).filter(MVNOSGiApplicationLaunchConfiguration::isBundle)
				.map(m -> new Bundle(osgiLauncherPlugin, m, a.getFile().toPath()));
	}

	private static boolean isBundle(Manifest m) {
		return m.getMainAttributes().getValue("Bundle-SymbolicName") != null;
	}

	private static String bundleName(Manifest m) {
		String name = m.getMainAttributes().getValue("Bundle-SymbolicName");
		return name.split(";")[0];
	}

	private Integer getStartLevel(Optional<Plugin> osgiLauncherPlugin, Manifest m) {
		String name = bundleName(m);
		if (osgiLauncherPlugin.isPresent()) {
			Xpp3Dom d = (Xpp3Dom) osgiLauncherPlugin.get().getConfiguration();
			for (Xpp3Dom c : d.getChildren()) {
				if ("startLevels".equals(c.getName())) {
					for (Xpp3Dom cc : c.getChildren()) {
						if (name.equals(cc.getName())) {
							return Integer.valueOf(cc.getValue());
						}
					}
				}
			}
		}

		switch (name) {
		case "org.eclipse.core.runtime":
			return 4;
		case "org.eclipse.equinox.common":
			return 2;
		case "org.eclipse.equinox.ds":
			return 2;
		case "org.eclipse.equinox.event":
			return 2;
		case "org.eclipse.equinox.simpleconfigurator":
			return 1;
		case "org.eclipse.osgi":
			return -1;
		default:
			return null;
		}
	}

	private String toReferenceURL(Bundle element, boolean project) throws IOException {
		StringBuilder w = new StringBuilder();
		String path = element.path.toString();
		if (SystemUtils.isWindows()) {
			path = path.replace('\\', '/').replace(":", "\\:");
		}
		w.append("reference\\:file\\:" + path);

		if (element.startLevel != null) {
			w.append("@" + element.startLevel + "\\:start");
		} else {
			w.append("@start");
		}
		return w.toString();
	}

	public class Bundle {
		public final String symbolicName;
		public final String version;
		public final Integer startLevel;
		public final Path path;
		public final boolean dirShape;
		public final boolean autoStart;

		public Bundle(Optional<Plugin> osgiLauncherPlugin, Manifest m, Path path) {
			this(bundleName(m), m.getMainAttributes().getValue("Bundle-Version"), getStartLevel(osgiLauncherPlugin, m),
					path, getStartLevel(osgiLauncherPlugin, m) != null,
					"dir".equals(m.getMainAttributes().getValue("Eclipse-BundleShape")));
		}

		public Bundle(String symbolicName, String version, Integer startLevel, Path path, boolean autoStart,
				boolean dirShape) {
			this.symbolicName = symbolicName;
			this.version = version;
			this.startLevel = startLevel == null ? 4 : startLevel;
			this.path = path;
			this.autoStart = autoStart;
			this.dirShape = dirShape;
		}
	}
}
