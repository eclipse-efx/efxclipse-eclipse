package org.eclipse.fx.ide.fxml.compiler

import org.eclipse.fx.ide.fxgraph.fXGraph.Model
import org.eclipse.fx.ide.fxgraph.fXGraph.Element
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty
import org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty
import org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty
import org.eclipse.fx.ide.fxgraph.fXGraph.ValueProperty

class FXGraphGenerator {
	def generate(Model m) '''
	package «m.package.name»
	
	«FOR i : m.imports»
	import «i.importedNamespace»
	«ENDFOR»
	
	component «m.componentDef.name» {
		
		«element(m.componentDef.rootNode)»
	}
	'''
	
	def CharSequence element(Element e) '''
	«e.type.type.simpleName» {
		«FOR p : e.properties»
			«IF e.properties.head != p»,«ENDIF»«p.name» : «valueProp(p.value)»
		«ENDFOR»
		«FOR p : e.defaultChildren»
			«IF ! e.properties.empty || e.defaultChildren.head != p»,«ENDIF»«element(p)»
		«ENDFOR»
		«FOR p : e.staticProperties»
			«IF ! e.properties.empty || ! e.defaultChildren.empty || e.staticProperties.head != p»,«ENDIF»«p.name» : «valueProp(p.value)»
		«ENDFOR»
		«FOR p : e.staticCallProperties»
			«IF ! e.properties.empty || ! e.defaultChildren.empty || e.staticProperties.empty || e.staticCallProperties.head != p»,call «ENDIF»«p.type.type.simpleName»#«p.name» : «valueProp(p.value)»
		«ENDFOR»
	}
	'''
	
	def dispatch valueProp(ValueProperty p) '''
	// unhandled type «p»
	'''
	
	def dispatch valueProp(Element p) '''
	«element(p)»
	'''
	
	def dispatch valueProp(ListValueProperty lp) '''
	[
		«FOR p : lp.value»
		«listValue(p)»«IF lp.value.last != p»,«ENDIF»
		«ENDFOR»
	]
	'''
	
	def dispatch valueProp(SimpleValueProperty sp) '''
	«IF sp.booleanValue != null»
		«sp.booleanValue»
	«ELSEIF sp.number != null»
		«sp.number»
	«ELSE»
		"«sp.stringValue»"
	«ENDIF»
	'''
	
	def dispatch listValue(Element e) '''
	«element(e)»
	'''
	
	def dispatch listValue(ReferenceValueProperty rp) '''
	'''
}