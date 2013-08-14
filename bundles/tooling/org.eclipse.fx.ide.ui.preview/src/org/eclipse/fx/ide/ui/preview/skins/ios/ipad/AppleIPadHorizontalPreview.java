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
package org.eclipse.fx.ide.ui.preview.skins.ios.ipad;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import org.eclipse.fx.ide.ui.preview.skins.BasicPreviewer;

public class AppleIPadHorizontalPreview extends BasicPreviewer {

	public AppleIPadHorizontalPreview(double contentWidth, double contentHeight) {
		super(contentWidth, contentHeight);
	}

	@Override
	protected BorderPane createContentPane() {
		BorderPane pane = new BorderPane();
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/01.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/02.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/03.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/04.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/05.png")));
			
			pane.setTop(box);
		}
		
		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/06.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/08.png")+"'); -fx-background-repeat: repeat-y;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/10.png")));

			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/12.png")+"'); -fx-background-repeat: repeat-y;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/14.png")));
			
			pane.setLeft(box);
		}
		
		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/07.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/09.png")+"'); -fx-background-repeat: repeat-y;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/11.png")));

			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/13.png")+"'); -fx-background-repeat: repeat-y;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/15.png")));
			
			pane.setRight(box);
		}
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/16.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/17.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/18.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/19.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/ios/resources/ipad/horizontal/20.png")));
			
			pane.setBottom(box);
		}
		
		return pane;
	}

	@Override
	protected double marginWidth() {
		return 2*80;
	}

	@Override
	protected double marginHeight() {
		return 2*76;
	}

}