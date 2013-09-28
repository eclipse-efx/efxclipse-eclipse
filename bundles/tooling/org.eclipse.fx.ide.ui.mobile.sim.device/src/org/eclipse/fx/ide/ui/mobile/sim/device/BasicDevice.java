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
package org.eclipse.fx.ide.ui.mobile.sim.device;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;


public abstract class BasicDevice {
	private BorderPane pane;
	private AnchorPane contentPane;
	
	private double contentWidth;
	private double contentHeight;
	
	protected abstract BorderPane createContentPane();
	protected abstract double marginWidth();
	protected abstract double marginHeight();
	
	public BasicDevice(double contentWidth, double contentHeight) {
		this.contentWidth = contentWidth;
		this.contentHeight = contentHeight;
	}
	
	public void setContentSize(double width, double height) {
		if( pane == null ) {
			this.contentWidth = width;
			this.contentHeight = height;
		} else {
			contentPane.setClip(new Rectangle(0,0,width,height));
			contentPane.setPrefSize(width,height);
			contentPane.setMinSize(width,height);
			contentPane.setMaxSize(width,height);

			double wPlus = marginWidth();
			double hPlus = marginHeight();
			
			pane.setMinSize(width+wPlus, height+hPlus);
			pane.setPrefSize(width+wPlus, height+hPlus);
			pane.setMaxSize(width+wPlus, height+hPlus);			
		}
	}
	
	public void setContent(Node node) {
		AnchorPane.setLeftAnchor(node, 0.0);
		AnchorPane.setRightAnchor(node, 0.0);
		AnchorPane.setTopAnchor(node, 0.0);
		AnchorPane.setBottomAnchor(node, 0.0);
		contentPane.getChildren().setAll(node);
	}
	
	public Node getSimulatorNode() {
		if( pane == null ) {
			pane = createContentPane();
			contentPane = new AnchorPane();
			pane.setCenter(contentPane);
			setContentSize(contentWidth, contentHeight);
		}
		return pane;
	}
	
	protected static String getIconUrl(String url) {
		return BasicDevice.class.getClassLoader().getResource(url).toExternalForm();
	}

}
