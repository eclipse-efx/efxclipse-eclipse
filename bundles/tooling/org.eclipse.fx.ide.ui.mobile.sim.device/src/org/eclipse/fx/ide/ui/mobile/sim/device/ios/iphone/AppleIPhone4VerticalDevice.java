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
package org.eclipse.fx.ide.ui.mobile.sim.device.ios.iphone;

import org.eclipse.fx.ide.ui.mobile.sim.device.BasicDevice;

import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class AppleIPhone4VerticalDevice extends BasicDevice {
	private static final String ROOT_URL = "org/eclipse/fx/ide/ui/mobile/sim/device/ios/resources/iphone/vertical";
	
	public AppleIPhone4VerticalDevice(int contentWidth, int contentHeight) {
		super(contentWidth, contentHeight);
	}
	
	protected BorderPane createContentPane() {
		BorderPane pane = new BorderPane();
		
		{
			HBox box = new HBox();
			
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/03.png")));
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/04.png")));
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl(ROOT_URL +"/05.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/06.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl(ROOT_URL +"/07.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/08.png")));
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/09.png")));
			
			pane.setTop(box);			
		}
		
		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/11.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl(ROOT_URL +"/14.png")+"'); -fx-background-repeat: repeat-y;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			pane.setLeft(box);
		}

		{
			VBox box = new VBox();
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/13.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl(ROOT_URL +"/16.png")+"'); -fx-background-repeat: repeat-y;");
				VBox.setVgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			pane.setRight(box);
		}
		
		{
			HBox box = new HBox();
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/17.png")));
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/18.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl(ROOT_URL +"/19.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/20.png")));
			
			{
				Region r = new Region();
				r.setStyle("-fx-background-image: url('"+getIconUrl(ROOT_URL +"/21.png")+"'); -fx-background-repeat: repeat-x;");
				HBox.setHgrow(r, Priority.ALWAYS);
				box.getChildren().add(r);
			}
			
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/22.png")));
			box.getChildren().add(new ImageView(getIconUrl(ROOT_URL +"/23.png")));
			
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
