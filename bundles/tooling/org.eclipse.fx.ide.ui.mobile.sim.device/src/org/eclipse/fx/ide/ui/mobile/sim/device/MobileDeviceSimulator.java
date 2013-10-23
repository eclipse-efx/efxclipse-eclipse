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

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.eclipse.fx.ide.ui.mobile.sim.device.android.galaxyNote2.AndroidTabletHorizontalDevice;
import org.eclipse.fx.ide.ui.mobile.sim.device.android.galaxyNote2.AndroidTabletVerticalDevice;
import org.eclipse.fx.ide.ui.mobile.sim.device.android.galaxyS3.AndroidPhoneHorizontalDevice;
import org.eclipse.fx.ide.ui.mobile.sim.device.android.galaxyS3.AndroidPhoneVerticalDevice;
import org.eclipse.fx.ide.ui.mobile.sim.device.ios.ipad.AppleIPadHorizontalDevice;
import org.eclipse.fx.ide.ui.mobile.sim.device.ios.ipad.AppleIPadVerticalDevice;
import org.eclipse.fx.ide.ui.mobile.sim.device.ios.iphone.AppleIPhone4HorizontalDevice;
import org.eclipse.fx.ide.ui.mobile.sim.device.ios.iphone.AppleIPhone4VerticalDevice;
import org.eclipse.fx.ui.mobile.MobileApp;

public class MobileDeviceSimulator extends Application {
	public static final String DEVICE_TYPE 			= "-deviceType";
	public static final String DEVICE_ORIENTATION 	= "-deviceOrientation";
	public static final String DISPLAYSIZE 			= "-displaySize";
	public static final String APPLICATION_CLASS	= "-applicationClass";
	
	private static String[] ARGS;
	
	public static void main(String[] args) {
		ARGS = args;
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BasicDevice dev = createDevice();
		Parent root = (Parent) dev.getSimulatorNode();
		
		String mainClass = findParam(APPLICATION_CLASS, null);
		if( mainClass != null ) {
			Class<MobileApp> clazz = (Class<MobileApp>) Class.class.forName(mainClass);
			MobileApp app = clazz.newInstance();
			root.getStylesheets().addAll(app.getInitialStylesheets());
			dev.setContent(app.createUI());
		}
		
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	
	private BasicDevice createDevice() {
		String type = findParam(DEVICE_TYPE,"IPHONE");
		String orientation = findParam(DEVICE_ORIENTATION,"VERTICAL");
		String displaySize = findParam(DISPLAYSIZE,"768x1024");
		
		int width = Integer.parseInt(displaySize.substring(0,displaySize.indexOf('x')));
		int height = Integer.parseInt(displaySize.substring(displaySize.indexOf('x')+1));
		
		if( orientation.equals("VERTICAL") ) {
			if( "ANDROID_PHONE".equals(type) ) {
				return new AndroidPhoneVerticalDevice(width, height);
			} else if( "ANDROID_TABLET".equals(type) ) {
				return new AndroidTabletVerticalDevice(width, height);
			} else if( "IPAD".equals(type) ) {
				return new AppleIPadVerticalDevice(width, height);
			} else {
				return new AppleIPhone4VerticalDevice(width, height);
			}
		} else {
			if( "ANDROID_PHONE".equals(type) ) {
				return new AndroidPhoneHorizontalDevice(width, height);
			} else if( "ANDROID_TABLET".equals(type) ) {
				return new AndroidTabletHorizontalDevice(width, height);
			} else if( "IPAD".equals(type) ) {
				return new AppleIPadHorizontalDevice(width, height);
			} else {
				return new AppleIPhone4HorizontalDevice(width, height);
			}
		}		
	}

	private static String findParam(String name, String defaultValue) {
		for( int i = 0; i < ARGS.length; i++ ) {
			if( name.equals(ARGS[i]) ) {
				return ARGS[i+1];
			}
		}
		return defaultValue;
	}
}