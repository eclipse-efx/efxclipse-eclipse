package org.eclipse.fx.ide.pde.ui.templates.tycho

@Data class PomData {
	String description;
	String groupId;
	String artifactId;
//	String version;
	
	String parentGroupId;
	String parentArtifactId;
	String parentVersion;
	
	String parentPomPath;
}