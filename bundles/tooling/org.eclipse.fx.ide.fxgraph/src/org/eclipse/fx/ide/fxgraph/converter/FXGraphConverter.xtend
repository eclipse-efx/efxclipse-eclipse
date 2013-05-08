/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxgraph.converter

import org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition
import org.eclipse.fx.ide.fxgraph.fXGraph.Define
import org.eclipse.fx.ide.fxgraph.fXGraph.Element
import org.eclipse.fx.ide.fxgraph.fXGraph.FactoryValueElement
import org.eclipse.fx.ide.fxgraph.fXGraph.Import
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueElement
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty
import org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty
import org.eclipse.fx.ide.fxgraph.fXGraph.Model
import org.eclipse.fx.ide.fxgraph.fXGraph.Property
import org.eclipse.fx.ide.fxgraph.fXGraph.Script
import org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.common.types.JvmTypeReference

class FXGraphConverter {
	def generate(Model model) '''
	«IF model.getPackage()?.name?.length > 0»
	package «model.getPackage().name»
	«ENDIF»
	«generateImports(model.imports)»

	«generateComponentDefinition(model.componentDef)»
	'''

	def generateComponentDefinition(ComponentDefinition cd) '''
	«IF cd.dynamicRoot»dynamic «ENDIF»component «cd.name»«generateController(cd.controller)»«generateStyle(cd.previewCssFiles)»«generateResourceBundle(cd.previewResourceBundle)»«generateExtraClassPath(cd.previewClasspathEntries)»«generateSceneSetup(cd.sceneDefinition)» {
		«FOR Script s : cd.scripts»
			«generateScript(s)»
		«ENDFOR»	
		«var Boolean comma = false»
		«FOR Define d : cd.defines»
			«IF comma»,«ENDIF»
			«generateDefine(d)»
			«val nix = comma = true»
		«ENDFOR»	
		«generateElement(cd.rootNode)»
	}
	'''

	def generateDefine(Define define) '''
	define «generateElement(define.element)»'''

	
	def generateController(JvmTypeReference controller) '''
	«IF controller!=null» controlledby «controller.type.simpleName»«ENDIF»'''
	
	def generateStyle(EList<String> previewCssFiles) '''
	«IF !previewCssFiles.empty» styledwith ["«FOR String css : previewCssFiles»«css»«ENDFOR»"]«ENDIF»'''
	
	def generateResourceBundle(String previewResourceBundle) '''
	«IF previewResourceBundle != null» resourcefile "«previewResourceBundle»"«ENDIF»'''

	def generateExtraClassPath(EList<String> previewClasspathEntries) '''
	«IF !previewClasspathEntries.empty» extraClasspath ["«FOR String cp : previewClasspathEntries»«cp»«ENDFOR»"]«ENDIF»'''

	def generateSceneSetup(ComponentDefinition sceneDefinition) '''
	«IF sceneDefinition != null» sceneSetup "«generateComponentDefinition(sceneDefinition)»"«ENDIF»'''

	def generateImports(EList<Import> imports) '''
	««« if we got imports insert an empty line
	«IF imports.size > 0»

	«ENDIF»
	«FOR Import imp : imports»
		import «imp.importedNamespace»
	«ENDFOR»
	'''


	def generateScript(Script s) '''
	script «s.language» #{
		«IF s.source!=null»«s.source»«ELSE»«s.sourcecode»«ENDIF»
	}#	'''

	def generateElement(Element element) '''
		«IF element.factory!=null»«element.type.simpleName» createdby «element.factory» {
		«var Boolean comma = false»
		«FOR FactoryValueElement e : element.values»
			«IF comma»,«ENDIF»«IF e instanceof Element»«generateElement(new CastHelper().castToElement(e))»«ELSE»«IF e instanceof SimpleValueProperty»«ENDIF»«new ValuePropertyFormatter(e).formattedValue»«ENDIF»
			«val nix = comma = true»
		«ENDFOR»			
		}«ELSE»
		«element.type.simpleName»«IF element.value!=null» ( «element.value.stringValue» )«ENDIF»«IF element.name!=null» id «element.name»«ENDIF»«IF elementHasSubEntries(element)» {
		«var Boolean comma = false»
		«FOR Property p : element.properties»
			«IF comma»,«ENDIF»«IF p.value instanceof Element»«generatePropertyElement(p)»«ELSE»«IF p.value instanceof ListValueProperty»«generateListValueProperty(p)»«ELSE»«IF p.value instanceof MapValueProperty»«generateMapValueProperty(p)»«ELSE»«new ValuePropertyFormatter(p).formattedValue»«ENDIF»«ENDIF»«ENDIF»
			«val nix = comma = true»
		«ENDFOR»			
		«FOR StaticValueProperty p : element.staticProperties»
			«IF comma»,«ENDIF»«new ValuePropertyFormatter(p).formattedValue»
			«val nix = comma = true»
		«ENDFOR»			
		«FOR StaticCallValueProperty p : element.staticCallProperties»
			«IF comma»,«ENDIF»«new ValuePropertyFormatter(p).formattedValue»
			«val nix = comma = true»
		«ENDFOR»			
		«IF element.defaultChildren.size > 0»
			«IF comma»,«ENDIF»children : [
		«var Boolean internalComma = false»
		«FOR Element e : element.defaultChildren»
			«IF internalComma»,«ENDIF»«generateElement(e)»
			«val nix = internalComma = true»
		«ENDFOR»			
			]
		«ENDIF»				
	}«ENDIF»«ENDIF»'''
	
	def boolean elementHasSubEntries(Element element) {
		return element.properties.size>0 || element.staticProperties.size>0 ||element.staticCallProperties.size>0 ||element.defaultChildren.size>0 ;
	}
	
	def generateMapValueProperty(Property p) '''
		«val MapValueProperty list =new CastHelper().castToMapValueProperty(p.value)»
		«p.name» : [
		«var Boolean comma = false»
			«FOR Property inner : list.properties»
				«IF comma»,«ENDIF»«IF "Integer".equals(inner.name)||"Double".equals(inner.name)»«new ValuePropertyFormatter(inner).formattedValue»«ELSE»«inner.name»(«new ValuePropertyFormatter(inner.value).formattedValue»)«ENDIF»
				«val nix = comma = true»
			«ENDFOR»
		]'''

	
	def generateListValueProperty(Property p) '''
		«val ListValueProperty list =new CastHelper().castToListValueProperty(p.value)»
		«p.name» : [
		«var Boolean comma = false»
		«FOR ListValueElement e : list.value»
			«IF comma»,«ENDIF»
			«IF e instanceof Element»«generateElement(new CastHelper().castToElement(e))»«ELSE»«new ValuePropertyFormatter(e).formattedValue»«ENDIF»
			«val nix = comma = true»
		«ENDFOR»	
		]'''

	def generatePropertyElement(Property p) '''
		«IF p.name.charAt(0)==p.name.toFirstLower.charAt(0)»«p.name» : «ENDIF»«generateElement(new CastHelper().castToElement(p.value))»'''

	def generateFactory(Element element) '''
		«IF element.factory != null && !element.values.empty»createdby «element.factory» { 
		«var Boolean comma = false»
		«FOR FactoryValueElement e : element.values»
			«IF comma»,«ENDIF»
			«IF e instanceof Element»«generateElement(new CastHelper().castToElement(e))»
			«ELSE»
				«IF e instanceof SimpleValueProperty»«new ValuePropertyFormatter(e).formattedValue»«ENDIF»
			«ENDIF»
			«val nix = comma = true»
		«ENDFOR»	
		}«ENDIF»'''
}