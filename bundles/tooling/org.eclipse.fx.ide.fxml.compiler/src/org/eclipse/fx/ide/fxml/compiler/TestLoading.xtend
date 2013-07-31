package org.eclipse.fx.ide.fxml.compiler

import java.io.File
import javax.xml.parsers.SAXParserFactory
import org.eclipse.fx.ide.fxgraph.converter.FXMLSaxHandler
import org.eclipse.fx.ide.fxgraph.converter.FXGraphConverter

class TestLoading {
	def static void main(String[] args) {
		val f = SAXParserFactory.newInstance
		f.setNamespaceAware(true);
		val p = f.newSAXParser
		val h = new FXMLSaxHandler("test")
		
		p.parse(new File("/Users/tomschindl/git/efxclipse/bundles/tooling/org.eclipse.fx.ide.fxml.compiler/sample-src/sample/Sample.fxml"), h)
		val c = new FXGraphConverter
		c.generate(h.model); 
	}
	
}