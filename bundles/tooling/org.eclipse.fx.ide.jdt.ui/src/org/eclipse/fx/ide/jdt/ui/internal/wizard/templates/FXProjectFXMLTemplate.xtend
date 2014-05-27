package org.eclipse.fx.ide.jdt.ui.internal.wizard.templates

import org.eclipse.fx.ide.jdt.ui.internal.wizard.JavaFXProjectWizard$ProjectData

class FXProjectFXMLTemplate {
	def generate(ProjectData data) '''
	<?xml version="1.0" encoding="UTF-8"?>
		
	<?import «data.declarativeUiRootType»?>
		
	<«data.declarativeUiRootType.split("\\.").last» xmlns:fx="http://javafx.com/fxml/1" «IF !data.declarativeUiController.empty»fx:controller="«data.packageName».«data.declarativeUiController»"«ENDIF»>
		<!-- TODO Add Nodes -->
	</«data.declarativeUiRootType.split("\\.").last»>
	'''
}