package org.eclipse.fx.ide.pde.ui.wizard

import java.io.InputStream
import java.io.ByteArrayInputStream
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit

class Util {
	def static String getValidId(String projectName) {
		return projectName.replaceAll("[^a-zA-Z0-9\\._-]", "_"); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	def static InputStream toStream(CharSequence value) {
		return new ByteArrayInputStream(value.toString.bytes);
	}
	
	def static String getVariableValue(DynamicFile file, String name) {
		return file.variables.findFirst([e| e.key.equals(name)])?.defaultValue;
	}
	
	def static String getCuPackagename(DynamicFile file) {
		val cu = file.eContainer as CompilationUnit
		return cu.packagename
	}
}