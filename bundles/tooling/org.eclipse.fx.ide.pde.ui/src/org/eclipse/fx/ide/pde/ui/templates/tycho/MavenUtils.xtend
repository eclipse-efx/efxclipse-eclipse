package org.eclipse.fx.ide.pde.ui.templates.tycho

class MavenUtils {
	def static String toPomVersion(String version) {
		return version.replace(".qualifier", "-SNAPSHOT");
	}
}