package org.eclipse.fx.ide.pde.ui.wizard.app.tpl

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit
import static extension org.eclipse.fx.ide.pde.ui.wizard.Util.*

class DIApplicationClassTpl implements Generator<DynamicFile> {
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val cu = file.eContainer as CompilationUnit;
		return generate(cu.packagename).toStream; 
	}
	
	def generate(String packageName) '''package «packageName»;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.equinox.app.IApplicationContext;

public class MainApplication {
	@Inject
	public MainApplication() {
		
	}
	
	@PostConstruct
	void run(IApplicationContext applicationContext, javafx.application.Application jfxApplication, Stage primaryStage) {
		Scene s = new Scene(new Label("Hello World"));
		primaryStage.setScene(s);
		primaryStage.setWidth(300);
		primaryStage.setHeight(400);
		primaryStage.setTitle("Hello World");
		primaryStage.show();
	}
}
'''
}