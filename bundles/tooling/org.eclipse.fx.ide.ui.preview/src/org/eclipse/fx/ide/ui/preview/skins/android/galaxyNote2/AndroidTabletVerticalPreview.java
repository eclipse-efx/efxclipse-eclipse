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

public class AndroidTabletVerticalPreview extends BasicPreviewer {

	public AndroidTabletVerticalPreview(double contentWidth, double contentHeight) {
		super(contentWidth, contentHeight);
	}

	@Override
	protected BorderPane createContentPane() {
		BorderPane pane = new BorderPane();
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/01.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/02.png")));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/03.png")), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/04.png")));

			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/05.png")), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/06.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/07.png")));
			
			
			pane.setTop(box);
		}
		
		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/08.png")));

			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/10.png")), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			pane.setLeft(box);
		}
		
		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/09.png")));

			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/11.png")), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			pane.setRight(box);
		}
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/12.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/13.png")));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/14.png")), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/15.png")));

			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/16.png")), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}

			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/17.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyNote2/vertical/18.png")));
			
			
			pane.setBottom(box);
		}
		
		return pane;
	}

	@Override
	protected double marginWidth() {
		return 2*27;
	}

	@Override
	protected double marginHeight() {
		return 2*84;
	}

}
