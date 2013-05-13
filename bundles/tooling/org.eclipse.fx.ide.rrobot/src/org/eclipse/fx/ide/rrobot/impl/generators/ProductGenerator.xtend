package org.eclipse.fx.ide.rrobot.impl.generators

import org.eclipse.fx.ide.rrobot.model.bundle.ProductFile
import org.eclipse.fx.ide.rrobot.model.task.Generator
import java.util.Map
import java.io.ByteArrayInputStream
import org.eclipse.fx.ide.rrobot.model.bundle.ProductFileFeaturebase

class ProductGenerator implements Generator<ProductFile> {
	
	override generate(ProductFile file, Map<String,Object> data) {
		return new ByteArrayInputStream(generateContent(file,data).toString().bytes);
	}
	
	def generateContent(ProductFile file, Map<String,Object> data) '''<?xml version="1.0" encoding="UTF-8"?>
<?pde version="3.5"?>

<product name="«file.productName»" uid="«file.id»" id="«file.id»" application="«file.application»" version="«file.version»" useFeatures="«file instanceof ProductFileFeaturebase»" includeLaunchers="«file.includeLaunchers»">

	<configIni use="default">
	</configIni>
	<launcherArgs>
		<programArgs>«file.programArgs»</programArgs>
		<vmArgs>«file.vmArgs»</vmArgs>
	</launcherArgs>
	
	<windowImages/>
	
	«IF file instanceof ProductFileFeaturebase»
	<features>
		«FOR pf : (file as ProductFileFeaturebase).features»
		<feature id="«pf.id»" version="«pf.version»"/>
		«ENDFOR»
	</features>
	«ENDIF»
	«IF !file.startconfigurations.empty»
	<configurations>
		«FOR c : file.startconfigurations»
		<plugin id="«c.id»" autoStart="«c.autoStart»" startLevel="«c.startLevel»" />
		«ENDFOR»
	</configurations>
	«ENDIF»
</product>
   
	'''
}