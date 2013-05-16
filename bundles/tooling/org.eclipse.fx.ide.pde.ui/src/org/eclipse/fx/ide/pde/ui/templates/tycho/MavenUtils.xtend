package org.eclipse.fx.ide.pde.ui.templates.tycho

import org.eclipse.xtext.xbase.lib.Procedures$Procedure1

class MavenUtils {
	def static String toPomVersion(String version) {
		return version.replace(".qualifier", "-SNAPSHOT");
	}
	
	def static <T> void _forEach(Iterable<T> iterable, Procedure1<? super T> procedure) {
		if (procedure == null)
			throw new NullPointerException("procedure");
		for (T t : iterable) {
			procedure.apply(t);
		}
	}
}