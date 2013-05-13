package org.eclipse.fx.ide.pde.ui.wizard.rcp.tpl

import org.eclipse.fx.ide.rrobot.model.task.Generator
import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import static extension org.eclipse.fx.ide.pde.ui.wizard.Util.*

class ViewPartTpl implements Generator<DynamicFile> {
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val bundleId = file.getVariableValue("bundleId");
		val packageName = file.getCuPackagename;
		return generate(bundleId,packageName).toStream 
	}
	
	def generate(String bundleId, String packageName) '''package «packageName»;

import org.eclipse.fx.ui.workbench3.FXViewPart;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class ViewPart extends FXViewPart {
	public static final String ID = "«bundleId».ViewPart";
	
	private Button button;
	
	@Override
	protected Scene createFxScene() {
		BorderPane p = new BorderPane();
		button = new Button("Hello JavaFX/RCP");
		p.setCenter(button);
		Scene s = new Scene(p);
		return s;
	}

	@Override
	protected void setFxFocus() {
		button.requestFocus();
	}
}'''
}