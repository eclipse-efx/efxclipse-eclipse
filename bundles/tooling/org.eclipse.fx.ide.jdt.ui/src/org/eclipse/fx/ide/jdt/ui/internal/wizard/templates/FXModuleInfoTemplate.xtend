/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.wizard.templates

import org.eclipse.fx.ide.jdt.ui.internal.wizard.JavaFXProjectWizard.ProjectData

class FXModuleInfoTemplate {
	def generateModuleInfo(ProjectData data) '''
		module «data.projectName» {
			requires javafx.controls;
			«IF data.declarativeUiType != "None"»
			requires javafx.fxml;
			«ENDIF»
			
			opens «data.packageName» to javafx.graphics, javafx.fxml;
		}
	'''
}