package org.eclipse.fx.ide.rrobot.impl.generators

import org.eclipse.fx.ide.rrobot.model.bundle.PluginXMLFile
import org.eclipse.fx.ide.rrobot.model.task.Generator
import java.io.ByteArrayInputStream
import java.util.Map
import org.eclipse.fx.ide.rrobot.model.bundle.Element
import org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin

class PluginXMLGenerator implements Generator<PluginXMLFile> {
	

	override generate(PluginXMLFile file, Map<String,Object> data) {
		return new ByteArrayInputStream(generateContent(file,data).toString().bytes);
	}
	
	def generateContent(PluginXMLFile file, Map<String,Object> data) '''<?xml version="1.0" encoding="UTF-8"?>
<?eclipse version="3.0"?>
<plugin>
«FOR ext : file.extensions.filter([e | e.excludeExpression(data)])»
	<extension «IF ext.id != null»id="«ext.id»"«ENDIF» point="«ext.point»">
		«FOR el : ext.elements»
			«el.elementBuilder»
		«ENDFOR»
	</extension>
«ENDFOR»
</plugin>
	'''
	
	def excludeExpression(ExcludeableElementMixin mixin, Map<String,Object> data) {
		if( mixin.excludeExpression != null ) {
			return ! mixin.excludeExpression.execute(data)
		}
		return true;
	}
	
	def elementBuilder(Element el) '''
	<«el.name» «el.attributes.map([a|a.name+"=\""+a.value+"\""]).join(" ")» «IF el.children.empty»/«ENDIF»>
	«IF !el.children.empty»
		«FOR c : el.children»
			«c.elementBuilder»
		«ENDFOR»
	</«el.name»>
	«ENDIF»
	
	'''
}