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
package org.eclipse.fx.ide.ui.preview.skins.android.galaxyNote2;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import org.eclipse.fx.ide.ui.preview.skins.BasicPreviewer;

public class AndroidTabletHorizontalPreview extends BasicPreviewer {

	public AndroidTabletHorizontalPreview(double contentWidth, double contentHeight) {
		super(contentWidth, contentHeight);
	}

	@Override
	protected BorderPane createContentPane() {
		BorderPane pane = new BorderPane();
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/01.png"));
			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/02.png"));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/03.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/04.png"));
			
			pane.setTop(box);
		}

		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/05.png"));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/07.png"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/09.png"));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/11.png"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/13.png"));
			
			pane.setLeft(box);
		}
		
		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/06.png"));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/08.png"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/10.png"));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/08.png"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/14.png"));
			
			pane.setRight(box);
		}
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/15.png"));
			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/16.png"));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/17.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/horizontal/18.png"));
			
			pane.setBottom(box);
		}
		
		return pane;
	}

	@Override
	protected double marginWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double marginHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
