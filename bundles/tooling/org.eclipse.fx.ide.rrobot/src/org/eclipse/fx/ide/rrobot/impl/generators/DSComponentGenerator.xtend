/*******************************************************************************
 * Copyright (c) 2015 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.rrobot.impl.generators

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.File
import java.util.Map
import java.util.List
import org.eclipse.fx.ide.rrobot.model.bundle.ComponentDefinitionFile
import org.eclipse.fx.ide.rrobot.model.bundle.Cardinality
import org.eclipse.fx.ide.rrobot.model.bundle.Policy
import java.io.ByteArrayInputStream

class DSComponentGenerator implements Generator<ComponentDefinitionFile> {

	override generate(ComponentDefinitionFile file, Map<String, Object> data) {
		return new ByteArrayInputStream(generateContent(file).toString().bytes);
	}

	def generateContent(ComponentDefinitionFile file) '''
		<?xml version="1.0" encoding="UTF-8"?>
		<scr:component xmlns:scr="http://www.osgi.org/xmlns/scr/v1.1.0" name="«file.id»">
			<implementation class="«file.componentClass»"/>
			<service>
				«FOR s : file.serviceInterfaceList»
					<provide interface="«s»"/>
				«ENDFOR»
			</service>
			«FOR r : file.referenceList»
				<reference bind="«r.bind»" cardinality="«cardinality(r.cardinality)»" interface="«r.typeName»" name="«r.name»" policy="«policy(r.policy)»" unbind="«r.unbind»"/>
			«ENDFOR»
		</scr:component>
	'''

	def cardinality(Cardinality c) {
		switch(c) {
			case SINGLE_OPTIONAL: return "0..1"
			case SINGLE_REQUIRED: return "1..1"
			case MULTI_OPTIONAL: return "0..n"
			default: return "1..n"
		}
	}

	def policy(Policy p) {
		switch(p) {
			case DYNAMIC: return "dynamic"
			default: return "static"
		}
	}
}