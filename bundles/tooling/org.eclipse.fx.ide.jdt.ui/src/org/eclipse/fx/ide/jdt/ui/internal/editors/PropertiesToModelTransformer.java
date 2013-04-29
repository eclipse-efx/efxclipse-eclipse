/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.editors;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksFactory;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersFactory;


/**
 * A class to transform the build configuration from old properties style to new EMF model.
 * 
 * @author Martin Bluehweis
 */
public class PropertiesToModelTransformer {
	private static final String BUILD_DIRECTORY = "buildDirectory";
	private static final String BUILD_VENDOR_NAME = "buildVendorName";
	private static final String BUILD_APP_TITLE = "buildAppTitle";
	private static final String BUILD_APP_VERSION = "buildAppVersion";
	private static final String BUILD_APPLICATION_CLASS = "buildApplicationClass";
	private static final String BUILD_PRELOADER_CLASS = "buildPreloaderClass";
	private static final String BUILD_SPLASH_IMAGE = "buildSplashImage";
	private static final String BUILD_MANIFEST_ATTR_LIST = "buildManifestAttrList";

	// Sub-Elements ManifestAttr
	private static final String BUILD_MANIFEST_ATTR_NAME = "buildManifestAttrName";
	private static final String BUILD_MANIFEST_ATTR_VALUE = "buildManifestAttrValue";

	private static final String DEPLOY_APPLET_WIDTH = "deployAppletWith";
	private static final String DEPLOY_APPLET_HEIGHT = "deployAppletHeight";
	private static final String DEPLOY_NATIVE_PACKAGE = "deployNativePackage";
	private static final String DEPLOY_SPLASH_LIST = "deploySplashList";
	private static final String DEPLOY_ICON_LIST = "deployIconList";

	// Sub-Elements Splash
	private static final String DEPLOY_SPLASH_HREF = "deploySplashHref";
	private static final String DEPLOY_SPLASH_MODE = "deploySplashMode";

	// Sub-Element Icon
	private static final String DEPLOY_ICON_DEPTH = "deployIconDepth";
	private static final String DEPLOY_ICON_HREF = "deployIconHref";
	private static final String DEPLOY_ICON_HEIGHT = "deployIconHeight";
	private static final String DEPLOY_ICON_KIND = "deployIconKind";
	private static final String DEPLOY_ICON_WIDTH = "deployIconWidth";

	// Sub-Element Keystore
	private static final String SIGN_KEYSTORE = "signKeystore";
	private static final String SIGN_ALIAS = "signAlias";
	private static final String SIGN_PASSWORD = "signPassword";
	private static final String SIGN_KEYPASSWOARD = "signKeyPassword";

	private static final Map<String, String> MAPPING = new HashMap<String, String>() {
		private static final long serialVersionUID = 1L;

		{
			// put(BUILD_JFXSDK,"jfx.build.jfxsdkdir");
			put( BUILD_DIRECTORY, "jfx.build.stagingdir" );
			put( BUILD_VENDOR_NAME, "jfx.build.vendorname" );
			put( BUILD_APP_TITLE, "jfx.build.apptitle" );
			put( BUILD_APP_VERSION, "jfx.build.appversion" );
			put( BUILD_APPLICATION_CLASS, "jfx.build.applicationClass" );
			put( BUILD_PRELOADER_CLASS, "jfx.build.preloaderClass" );
			put( BUILD_SPLASH_IMAGE, "jfx.build.splashImage" );
			put( BUILD_MANIFEST_ATTR_LIST, "jfx.build.manifestAttrList" );

			put( DEPLOY_APPLET_WIDTH, "jfx.deploy.appletWith" );
			put( DEPLOY_APPLET_HEIGHT, "jfx.deploy.appletHeight" );
			put( DEPLOY_NATIVE_PACKAGE, "jfx.deploy.nativePackage" );
			put( DEPLOY_SPLASH_LIST, "jfx.deploy.splashlist" );
			put( DEPLOY_ICON_LIST, "jfx.deploy.iconlist" );

			put( SIGN_KEYSTORE, "jfx.sign.keystore" );
			put( SIGN_ALIAS, "jfx.sign.alias" );
			put( SIGN_PASSWORD, "jfx.sign.password" );
			put( SIGN_KEYPASSWOARD, "jfx.sign.keypassword" );
		}
	};

	/**
	 * @param properties
	 *            properties
	 * @return the created ant task instance.
	 */
	public static AntTask transform( final Properties properties ) {
		// This is an old properties file -> transform to EMF/XMI
		AntTask task = AntTasksFactory.eINSTANCE.createAntTask();
		task.setBuildDirectory( properties.getProperty( MAPPING.get( BUILD_DIRECTORY ) ) );

		// TODO extract Manifest entries from properties.

		// Deploy
		task.setDeploy( AntTasksFactory.eINSTANCE.createDeploy() );
		task.getDeploy().setSplashImage( properties.getProperty( MAPPING.get( BUILD_SPLASH_IMAGE ) ) );

		// Deploy -> Info
		task.getDeploy().setInfo( ParametersFactory.eINSTANCE.createInfo() );
		task.getDeploy().getInfo().setVendor( properties.getProperty( MAPPING.get( BUILD_VENDOR_NAME ) ) );

		task.getDeploy().setWidth( properties.getProperty( MAPPING.get( DEPLOY_APPLET_WIDTH ) ) );
		task.getDeploy().setHeight( properties.getProperty( MAPPING.get( DEPLOY_APPLET_HEIGHT ) ) );

		// TODO Webstart Splash

		// TODO Webstart Icons

		// Deploy -> Application
		task.getDeploy().setApplication( ParametersFactory.eINSTANCE.createApplication() );
		task.getDeploy().getApplication().setName( properties.getProperty( MAPPING.get( BUILD_APP_TITLE ) ) );
		task.getDeploy().getApplication().setVersion( properties.getProperty( MAPPING.get( BUILD_APP_VERSION ) ) );
		task.getDeploy().getApplication().setMainclass( properties.getProperty( MAPPING.get( BUILD_APPLICATION_CLASS ) ) );
		task.getDeploy().getApplication().setPreloaderclass( properties.getProperty( MAPPING.get( BUILD_PRELOADER_CLASS ) ) );

		// SignJar
		task.setSignjar( AntTasksFactory.eINSTANCE.createSignJar() );
		task.getSignjar().setKeystore( properties.getProperty( MAPPING.get( SIGN_KEYSTORE ) ) );
		task.getSignjar().setStorepass( properties.getProperty( MAPPING.get( SIGN_PASSWORD ) ) );
		task.getSignjar().setAlias( properties.getProperty( MAPPING.get( SIGN_ALIAS ) ) );
		task.getSignjar().setKeypass( properties.getProperty( MAPPING.get( SIGN_KEYPASSWOARD ) ) );

		return task;
	}
}
