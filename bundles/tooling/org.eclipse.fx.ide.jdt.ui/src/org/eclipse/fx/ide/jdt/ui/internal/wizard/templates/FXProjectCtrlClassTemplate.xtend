package org.eclipse.fx.ide.jdt.ui.internal.wizard.templates

import org.eclipse.fx.ide.jdt.ui.internal.wizard.JavaFXProjectWizard$ProjectData

class FXProjectCtrlClassTemplate {
	def generate(ProjectData data) '''
	package «data.packageName»;
	
	public class «data.declarativeUiController» {
		
	}
	'''
}