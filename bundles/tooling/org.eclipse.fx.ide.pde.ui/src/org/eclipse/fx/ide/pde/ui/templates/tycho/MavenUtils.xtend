package org.eclipse.fx.ide.pde.ui.templates.tycho

import org.eclipse.xtext.xbase.lib.Procedures$Procedure1
import com.google.common.base.Predicate

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
	
	def static <T> void removeAllElements(Iterable<T> iterable, Predicate<? super T> predicate) {
		if( predicate == null ) {
			throw new NullPointerException("predicate");
		}
		
		val _it = iterable.iterator
		while( _it.hasNext ) {
			if( predicate.apply(_it.next) ) {
				_it.remove;
			}
		}
	}
}