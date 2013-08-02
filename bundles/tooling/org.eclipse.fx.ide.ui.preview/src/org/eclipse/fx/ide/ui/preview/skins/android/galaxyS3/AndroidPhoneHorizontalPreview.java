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
package org.eclipse.fx.ide.ui.preview.skins.android.galaxyS3;

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

public class AndroidPhoneHorizontalPreview extends BasicPreviewer {

	public AndroidPhoneHorizontalPreview(int contentWidth, int contentHeight) {
		super(contentWidth, contentHeight);
	}
	
	protected BorderPane createContentPane() {
		BorderPane pane = new BorderPane();
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/01.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/02.png")));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/03.png")), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/04.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/05.png")));
			
			pane.setTop(box);
		}
		
		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/06.png")));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/08.png")), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/10.png")));
			
			
			pane.setLeft(box);
		}
		
		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/07.png")));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/09.png")), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/11.png")));
			
			
			pane.setRight(box);
		}
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/12.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/13.png")));
			
			{
				Region r = new Region();
				Background g = new Background(new BackgroundImage(new Image(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/14.png")), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT));
				r.setBackground(g);
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/15.png")));
			box.getChildren().add(new ImageView(getIconUrl("org/eclipse/fx/ide/ui/preview/skins/android/resources/galaxyS3/horizontal/16.png")));
			
			pane.setBottom(box);
		}
		
		return pane;
	}
	
	@Override
	protected double marginHeight() {
		return 35+33;
	}
	
	@Override
	protected double marginWidth() {
		return 79+95;
	}
}
