package org.eclipse.fx.ide.rrobot.impl.generators

import org.eclipse.fx.ide.rrobot.model.bundle.FeatureFile
import org.eclipse.fx.ide.rrobot.model.task.Generator
import java.util.Map
import java.io.ByteArrayInputStream
import org.eclipse.fx.ide.rrobot.model.bundle.MatchRule
import org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin

class FeatureGenerator implements Generator<FeatureFile> {
	
	override generate(FeatureFile file, Map<String,Object> data) {
		return new ByteArrayInputStream(generateContent(file,data).toString().bytes);
	}
	
	def generateContent(FeatureFile file, Map<String,Object> data) '''<?xml version="1.0" encoding="UTF-8"?>
<feature
	id="«file.featureid»"
	label="«file.featurename»"
	version="«file.version»"
	provider-name="«file.vendor»"
	«IF file.license_feature != null && file.license_feature_version != null»license-feature="«file.license_feature»"
	license-feature-version="«file.license_feature_version»"«ENDIF»>
		«IF file.description != null»
		<description «IF file.description.weburl != null»url="«file.description.weburl»"«ELSE»url="http://www.example.com/description"«ENDIF»>
			«file.description.value»
		</description>
		«ELSE»
		<description url="http://www.example.com/description">
			[Enter Feature Description here.]
		</description>
		«ENDIF»

		«IF file.copyright != null»
		<copyright «IF file.copyright != null»url="«file.copyright.weburl»"«ELSE»url="http://www.example.com/copyright"«ENDIF»>
			«file.copyright.value»
		</copyright>
   		«ELSE»
		<copyright url="http://www.example.com/copyright">
			[Enter Copyright Description here.]
		</copyright>
   		«ENDIF»

		«IF file.license != null»
		<license «IF file.license != null»url="«file.license.weburl»"«ELSE»url="http://www.example.com/license"«ENDIF»>
			«file.license.value»
		</license>
		«ELSE»
		<license url="http://www.example.com/license">
			[Enter License Description here.]
		</license>
   		«ENDIF»

   		«FOR p : file.plugins.filter([e|e.excludeExpression(data)])»
   		<plugin id="«p.id»" install-size="0" version="0.0.0" unpack="«p.unpack»" «IF p.fragment»fragment="true"«ENDIF»/>
		«ENDFOR»

   		«FOR i : file.includedfeatures.filter([e|e.excludeExpression(data)])»
   		<includes id="«i.id»" version="«IF i.version != null»«i.version»«ELSE»0.0.0«ENDIF»" />
   		«ENDFOR»

   		«IF !file.requiredfeatures.filter([e|e.excludeExpression(data)]).empty»
   		<requires>
   			«FOR rf : file.requiredfeatures.filter([e|e.excludeExpression(data)])»
   			<import feature="«rf.id»" «IF rf.version != null»version="«rf.version»" «IF rf.match != MatchRule::NONE»match="«rf.match.literal»"«ENDIF»«ENDIF» />
   			«ENDFOR»
   		</requires>
   		«ENDIF»
</feature>
	'''
	
	def excludeExpression(ExcludeableElementMixin mixin, Map<String,Object> data) {
		if( mixin.excludeExpression != null ) {
			return ! mixin.excludeExpression.execute(data)
		}
		return true;
	}
}