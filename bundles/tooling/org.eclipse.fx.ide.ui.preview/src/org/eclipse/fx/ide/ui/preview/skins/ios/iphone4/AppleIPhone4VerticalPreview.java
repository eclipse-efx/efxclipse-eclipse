/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.ui.preview.skins.ios.iphone4;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import org.eclipse.fx.ide.ui.preview.skins.BasicPreviewer;

public class AppleIPhone4VerticalPreview extends BasicPreviewer {
	public AppleIPhone4VerticalPreview(int contentWidth, int contentHeight) {
		super(contentWidth, contentHeight);
	}
	
	protected BorderPane createContentPane() {
		BorderPane pane = new BorderPane();
		
		{
			HBox box = new HBox();
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/03.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/04.png")));
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/05.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/06.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/07.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/08.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/09.png")));
			
			pane.setTop(box);			
		}
		
		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/11.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/14.png")+"'); -fx-background-repeat: repeat-y;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			pane.setLeft(box);
		}

		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/13.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/16.png")+"'); -fx-background-repeat: repeat-y;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			pane.setRight(box);
		}
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/17.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/18.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/19.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/20.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/21.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/22.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/vertical/23.png")));
			
			pane.setBottom(box);
		}
		
		return pane;
	}
	
	@Override
	protected double marginHeight() {
		return 117+158;
	}
	
	@Override
	protected double marginWidth() {
		return 2*29;
	}	
}
