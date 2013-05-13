package org.eclipse.fx.ide.pde.ui.e4.project.media.tpl.decoration

import org.eclipse.fx.ide.rrobot.model.task.DynamicFile
import java.util.Map
import org.eclipse.fx.ide.rrobot.model.task.CompilationUnit
import java.io.ByteArrayInputStream
import org.eclipse.fx.ide.rrobot.model.task.Generator

class TopAreaTpl implements Generator<DynamicFile> {
	override generate(DynamicFile file, Map<String,Object> data) {
		val cu = file.eContainer as CompilationUnit;
		return new ByteArrayInputStream(generate(cu.packagename).toString.bytes);
	}
	
	def generate(String packageName) '''<?xml version="1.0" encoding="UTF-8"?>

<?import java.lang.*?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ToolBar?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.layout.Region?>
<?import javafx.scene.layout.VBox?>

<ToolBar xmlns:fx="http://javafx.com/fxml" fx:id="decorationArea" fx:controller="«packageName».DecorationController" prefHeight="66" minHeight="66" maxHeight="66">
	<items>
		<Region> 
			<HBox.hgrow>ALWAYS</HBox.hgrow>
		</Region>
		<VBox spacing="3"> 
			<children>
				<Button fx:id="window_close" onAction="#handleClose"/> 
				<Button fx:id="window_min" onAction="#handleMin"/> 
				<Button fx:id="window_max" onAction="#handleMax"/> 
			</children>
		</VBox>
	</items>
</ToolBar>
	
'''
}