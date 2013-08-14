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

public class AppleIPhone4HorizontalPreview extends BasicPreviewer {
	
	public AppleIPhone4HorizontalPreview(int contentWidth, int contentHeight) {
		super(contentWidth, contentHeight);
	}
	
	protected BorderPane createContentPane() {
		BorderPane pane = new BorderPane();
		{
			HBox box = new HBox();
			
			box.getChildren().add(new ImageView(getIconUrl("/org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/03.png")));
			box.getChildren().add(new ImageView(getIconUrl("/org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/04.png")));
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/05.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("/org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/06.png")));
			
			pane.setTop(box);			
		}
		
		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl("/org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/08.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/11.png")+"'); -fx-background-repeat: repeat-x;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("/org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/13.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/15.png")+"'); -fx-background-repeat: repeat-x;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			pane.setLeft(box);
		}

		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl("/org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/10.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/12.png")+"'); -fx-background-repeat: repeat-y;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("/org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/14.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/16.png")+"'); -fx-background-repeat: repeat-y;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			pane.setRight(box);
		}
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView(getIconUrl("/org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/19.png")));
			box.getChildren().add(new ImageView(getIconUrl("/org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/20.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/21.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("/org/eclipse/fx/ide/ui/preview/skins/ios/resources/iphone4/horizontal/22.png")));
				
			pane.setBottom(box);
		}
		
		return pane;
	}
	
	@Override
	protected double marginHeight() {
		return 2*29;
	}

	@Override
	protected double marginWidth() {
		return 117+158;
	}	
}
