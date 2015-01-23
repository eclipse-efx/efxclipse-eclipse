package org.eclipse.fx.ide.pde.ui.e4.project.template

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.File
import java.util.Map
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit
import java.io.ByteArrayInputStream

class ThemeClassGenerator implements Generator<File> {
	override generate(File file, Map<String,Object> data) {
		val cp = file.eContainer as CompilationUnit
		return new ByteArrayInputStream(generate(cp).toString.bytes);
	}

	def generate(CompilationUnit cp) '''
	package «cp.packagename»;

	import org.eclipse.fx.ui.theme.AbstractTheme;

	public class «cp.file.name.split("\\.").head» extends AbstractTheme {
		public «cp.file.name.split("\\.").head»() {
			super("theme.default", "Default theme", «cp.file.name.split("\\.").head».class.getClassLoader().getResource("css/default.css"));
		}
	}
	'''
}