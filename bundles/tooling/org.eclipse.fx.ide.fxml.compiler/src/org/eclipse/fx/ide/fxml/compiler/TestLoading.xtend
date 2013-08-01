package org.eclipse.fx.ide.fxml.compiler

import org.eclipse.fx.ide.fxgraph.FXGraphStandaloneSetupGenerated
import javax.xml.parsers.SAXParserFactory
import java.io.File

class TestLoading {
	def static void main(String[] args) {
		val injector = new FXGraphStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		val h = injector.getInstance(FXMLSaxHandler);
		
		val f = SAXParserFactory.newInstance
		f.setNamespaceAware(true);
		val p = f.newSAXParser
		p.parse(new File("/Users/tomschindl/git/efxclipse/bundles/tooling/org.eclipse.fx.ide.fxml.compiler/sample-src/sample/Sample.fxml"), h)
		val c = new FXGraphGenerator
		println(c.generate(h.model)); 
	}
	
}