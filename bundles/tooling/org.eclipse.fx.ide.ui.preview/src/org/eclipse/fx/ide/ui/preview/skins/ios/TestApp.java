/*******************************************************************************
 * Copyright (c) 2013 __COMPANY/CONTRIBUTOR__ and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tomschindl<__EMAIL__> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.ui.preview.skins.ios;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;

import org.eclipse.fx.ide.ui.preview.skins.ios.galaxyS3.AndroidPhoneVerticalPreview;
import org.eclipse.fx.ide.ui.preview.skins.ios.iphone4.AppleIPhone4HorizontalPreview;
import org.eclipse.fx.ide.ui.preview.skins.ios.iphone4.AppleIPhone4VerticalPreview;

public class TestApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		AppleIPhone4VerticalPreview skin = new AppleIPhone4VerticalPreview(640,960);
//		AppleIPhone4HorizontalPreview skin = new AppleIPhone4HorizontalPreview(960,640);
//		AndroidPhoneVerticalPreview skin = new AndroidPhoneVerticalPreview(640,960);
		
//		skin.setPrefWidth(700);
//		skin.setPrefHeight(1000);
//		
//		skin.setMinWidth(700);
//		skin.setMinHeight(1000);
//		
//		skin.setMaxWidth(700);
//		skin.setMaxHeight(1000);
		
		BorderPane p = new BorderPane();
		
		Node n = skin.getSimulatorNode();
//		Rectangle n = new Rectangle(200, 200, Color.RED);
//		n.setStroke(Color.BLACK);
		p.setTop(n);
		n.getTransforms().addAll(Transform.scale(0.5, 0.5));
//		n.setScaleX(0.5);
//		n.setScaleY(0.5);
		
		
		p.setStyle("-fx-background-color: green");
		
		Scene s = new Scene(p,1400,1400);
		primaryStage.setScene(s);
		primaryStage.show();
	}

}
