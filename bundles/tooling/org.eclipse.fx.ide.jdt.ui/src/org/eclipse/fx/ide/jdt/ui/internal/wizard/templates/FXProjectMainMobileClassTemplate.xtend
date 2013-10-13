package org.eclipse.fx.ide.jdt.ui.internal.wizard.templates

import org.eclipse.fx.ide.jdt.ui.internal.wizard.JavaFXProjectWizard$ProjectData

class FXProjectMainMobileClassTemplate { 
	def generate(ProjectData data) '''
	package «data.packageName»;
	
	import javafx.scene.Node;
	import «IF !data.declarativeUiType.equals("None")»«data.declarativeUiRootType»«ELSE»org.eclipse.fx.ui.mobile.Deck«ENDIF»;
	import org.eclipse.fx.ui.mobile.MobileApp;
	«IF !data.declarativeUiType.equals("None")»
	import javafx.fxml.FXMLLoader;
	import java.io.IOException;
	«ENDIF»

	public class Main extends MobileApp {
	
		public Node createUI() {
			«IF data.declarativeUiType.equals("None")»
				Deck root = new Deck();
				return root;
			«ELSE»
				try {
					«data.declarativeUiRootType.split("\\.").last» root = («data.declarativeUiRootType.split("\\.").last»)FXMLLoader.load(getClass().getResource("«data.declarativeUiName».fxml"));
					return root;
				} catch(IOException e) {
					e.printStackTrace();
				}
				return null;
			«ENDIF»
			
		}
	}
	'''
}