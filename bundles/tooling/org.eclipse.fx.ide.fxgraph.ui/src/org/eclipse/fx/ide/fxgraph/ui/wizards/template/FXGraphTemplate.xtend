/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxgraph.ui.wizards.template

import org.eclipse.fx.ide.ui.wizards.template.IGenerator

class FXGraphTemplate implements IGenerator<FXGraphElement> {
	override generateContent(FXGraphElement element) '''
		«IF(element.packageFragment != null && ! element.packageFragment.elementName.empty)»package «element.packageFragment.elementName»«ENDIF»
		
		import «element.rootElement.fullyQualifiedName»
		
		«IF element.dynamic»dynamic «ENDIF»component «element.name» {
			«element.rootElement.elementName» {
				//TODO Add Nodes
			}
		}
	'''
}