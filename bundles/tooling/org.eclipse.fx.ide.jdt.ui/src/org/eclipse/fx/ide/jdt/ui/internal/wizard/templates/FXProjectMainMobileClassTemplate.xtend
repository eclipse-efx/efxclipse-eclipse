package org.eclipse.fx.ide.jdt.ui.internal.wizard.templates

import org.eclipse.fx.ide.jdt.ui.internal.wizard.JavaFXProjectWizard$ProjectData

class FXProjectMainMobileClassTemplate { 
	def generate(ProjectData data) '''
	package «data.packageName»;
	
	import javafx.scene.layout.Region;
	import «IF !data.declarativeUiType.equals("None")»«data.declarativeUiRootType»«ELSE»org.eclipse.fx.ui.mobile.Deck«ENDIF»;
	import org.eclipse.fx.ui.mobile.MobileApp;
	import java.util.Collections;
	«IF !data.declarativeUiType.equals("None")»
	import org.eclipse.fx.core.fxml.ExtendedFXMLLoader;
	import java.io.IOException;
	«ENDIF»

	public class Main extends MobileApp {
	
		public Region createUI() {
			«IF data.declarativeUiType.equals("None")»
				Deck root = new Deck();
				return root;
			«ELSE»
				try {
					«data.declarativeUiRootType.split("\\.").last» root = («data.declarativeUiRootType.split("\\.").last»)new ExtendedFXMLLoader().load(getClass().getClassLoader(),"«data.packageName.replace('.','/')»/«data.declarativeUiName».fxml"));
					return root;
				} catch(IOException e) {
					e.printStackTrace();
				}
				return null;
			«ENDIF»
		}
		
		public List<String> getInitialStylesheets() {
			return Collections.singletonList(getClass().getResource("application.css").toExternalForm());
		}
	}
	'''
}