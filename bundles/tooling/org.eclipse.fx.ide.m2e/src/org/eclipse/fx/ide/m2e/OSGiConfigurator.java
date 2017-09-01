package org.eclipse.fx.ide.m2e;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.configurator.AbstractBuildParticipant;
import org.eclipse.m2e.core.project.configurator.AbstractProjectConfigurator;
import org.eclipse.m2e.core.project.configurator.MojoExecutionBuildParticipant;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;
import org.eclipse.m2e.jdt.IClasspathDescriptor;
import org.eclipse.m2e.jdt.IClasspathEntryDescriptor;
import org.eclipse.m2e.jdt.IJavaProjectConfigurator;
import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;

public class OSGiConfigurator extends AbstractProjectConfigurator implements IJavaProjectConfigurator {
	
	public OSGiConfigurator() {
	}
	
	@Override
	public void configureClasspath(IMavenProjectFacade mavenFacade, IClasspathDescriptor desc, IProgressMonitor m)
			throws CoreException {
		for (IClasspathEntryDescriptor c : desc.getEntryDescriptors()) {
			if (c.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
				projectEntry(c);
			} else if (c.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
				libraryEntry(c);
			}
			// System.err.println("CHILD: " + c.getGroupId() + "/" + c.getArtifactId());
		}
	}

	private List<IAccessRule> getAccessRules(Manifest m) {
		String packages = m.getMainAttributes().getValue("Export-Package");
		if (packages != null) {
			try {
				ManifestElement[] packEntries = ManifestElement.parseHeader(Constants.EXPORT_PACKAGE, packages);
				List<IAccessRule> rv = new ArrayList<>(packEntries.length + 1);
				for (ManifestElement packEntry : packEntries) {
					rv.add(JavaCore.newAccessRule(new Path(packEntry.getValue().replace('.', '/') + "/*"),IAccessRule.K_ACCESSIBLE));
				}
				IAccessRule def = JavaCore.newAccessRule(new Path("**/*"),IAccessRule.K_NON_ACCESSIBLE);
				rv.add(def);
				return rv;
			} catch (BundleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return Collections.emptyList();
	}

	private void libraryEntry(IClasspathEntryDescriptor c) {
		try (JarFile f = new JarFile(c.getPath().toFile())) {
			List<IAccessRule> accessRules = getAccessRules(f.getManifest());
			if (!accessRules.isEmpty()) {
				for (IAccessRule r : accessRules) {
					c.addAccessRule(r);
				}
			}
		} catch (Throwable ex) {
			// log.error("Failure while reading manifest for " + entry, ex);
		}
	}

	private void projectEntry(IClasspathEntryDescriptor c) {
		IResource res = ResourcesPlugin.getWorkspace().getRoot().findMember(c.getPath());
		if (res.exists()) {
			IJavaProject jProject = JavaCore.create(res.getProject());
			try {
				IResource mFile = ResourcesPlugin.getWorkspace().getRoot()
						.findMember(jProject.getOutputLocation().append(new Path("META-INF/MANIFEST.MF")));
				if (mFile.exists()) {
					try (InputStream in = ((IFile) mFile).getContents()) {
						List<IAccessRule> accessRules = getAccessRules(new Manifest(in));
						if (!accessRules.isEmpty()) {
							for (IAccessRule r : accessRules) {
								c.addAccessRule(r);
							}
						}
					}
				}
			} catch (Throwable ex) {
				// log.error("Failure while reading manifest for " + entry, ex);
			}
		}
	}

	@Override
	public void configureRawClasspath(ProjectConfigurationRequest mavenFacade, IClasspathDescriptor desc,
			IProgressMonitor m) throws CoreException {
	}
	
	@Override
	public AbstractBuildParticipant getBuildParticipant(IMavenProjectFacade projectFacade, MojoExecution execution,
			IPluginExecutionMetadata executionMetadata) {
		MojoExecution _execution = new MojoExecution(execution.getPlugin(), execution.getGoal(), "bnd-process");
		_execution.setConfiguration(execution.getConfiguration());
	    _execution.setMojoDescriptor(execution.getMojoDescriptor());
	    _execution.setLifecyclePhase(execution.getLifecyclePhase());
		return new MojoExecutionBuildParticipant(_execution, true);
	}

	@Override
	public void configure(ProjectConfigurationRequest request, IProgressMonitor monitor) throws CoreException {
	}

}
