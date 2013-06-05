package org.eclipse.fx.ide.jdt.ui.internal.wizard.templates

import org.eclipse.fx.ide.jdt.ui.internal.wizard.JavaFXProjectWizard$ProjectData

class FXProjectFXGraphTemplate {
	def generate(ProjectData data) '''
	package «data.packageName»
	
	import «data.declarativeUiRootType»
	«IF !data.declarativeUiController.empty»import «data.packageName».«data.declarativeUiController»«ENDIF»
	
	component «data.declarativeUiName» controlledby «IF !data.declarativeUiController.empty»«data.declarativeUiController»«ENDIF» {
		«data.declarativeUiRootType.split("\\.").last» {
			//TODO Add Nodes
		}
	}
	'''
}