package org.eclipse.fx.ide.pde.ui.templates.tycho

import java.util.List

@Data class RootPomData extends PomData {
	String version;
	String tychoVersion;
	String junitVersion;
	String mockitoVersion;
	String platformVersion;
	String efxVersion;
	boolean envLinux32 = true;
	boolean envLinux64 = true;
	boolean envWin32 = true;
	boolean envWin64 = true;
	boolean envMacOS = true;
	String javaFXArtifactVersion; 
	List<String> modulePaths;
	List<Repository> repositories;
}