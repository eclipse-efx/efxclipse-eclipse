package org.eclipse.fx.ide.jdt.ui.internal.wizard.templates

import org.eclipse.fx.ide.jdt.ui.internal.wizard.JavaFXProjectWizard$ProjectData

class FXProjectMainClassTemplate {
	def generate(ProjectData data) '''
	package «data.packageName»;
		
	import javafx.application.Application;
	import javafx.stage.Stage;
	import javafx.scene.Scene;
	import «IF !data.declarativeUiType.equals("None")»«data.declarativeUiRootType»«ELSE»javafx.scene.layout.BorderPane«ENDIF»;
	import javafx.fxml.FXMLLoader;
	
	public class Main extends Application {
		@Override
		public void start(Stage primaryStage) {
			try {
				«IF data.declarativeUiType.equals("None")»
				BorderPane root = new BorderPane();
				«ELSE»
				«data.declarativeUiRootType.split("\\.").last» root = FXMLLoader.load(getClass().getResource("«data.declarativeUiName».fxml"));
				«ENDIF»
				Scene scene = new Scene(root,400,400);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}
	'''
}