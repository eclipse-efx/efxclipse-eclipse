package org.eclipse.fx.ide.rrobot.impl.generators

import org.eclipse.fx.ide.rrobot.model.bundle.BuildProperties
import org.eclipse.fx.ide.rrobot.model.task.Generator
import java.io.ByteArrayInputStream
import java.util.Map
import org.eclipse.fx.ide.rrobot.model.task.Resource
import org.eclipse.fx.ide.rrobot.model.bundle.BundleProject
import org.eclipse.fx.ide.rrobot.model.task.Folder

class BuildPropertiesGenerator implements Generator<BuildProperties> {
	

	override generate(BuildProperties file, Map<String,Object> data) {
		return new ByteArrayInputStream(generateContent(file,data).toString().bytes);
	}
	
	def generateContent(BuildProperties file, Map<String,Object> data) '''bin.includes = .,\
 META-INF/«IF (file.eContainer as BundleProject).pluginxml != null»,\
 plugin.xml«ENDIF»«IF ! file.binIncludes.empty»,\
«file.binIncludes.map([r|r.fullpath]).join(",\\\r\n ")»
«ENDIF»

source.. = src/
	'''
	
	def fullpath(Resource r) {
		var res = r;
		var rv = r.name;
		if( r instanceof Folder ) {
			rv = rv + "/";
		}
		
		while( res.eContainer instanceof Resource ) {
			res = res.eContainer as Resource;
			rv = res.name + "/" +rv;
		}
		
		return rv;
	}
}