/**
 * ******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 * ******************************************************************************
 */
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersFactory
 * @model kind="package"
 * @generated
 */
public interface ParametersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parameters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.fx.ide.jdt/parameters/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parameters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParametersPackage eINSTANCE = org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.FileSetImpl <em>File Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.FileSetImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getFileSet()
	 * @generated
	 */
	int FILE_SET = 0;

	/**
	 * The feature id for the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET__ARCH = 0;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET__EXCLUDES = 1;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET__INCLUDES = 2;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET__OS = 3;

	/**
	 * The feature id for the '<em><b>Requiredfor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET__REQUIREDFOR = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET__TYPE = 5;

	/**
	 * The number of structural features of the '<em>File Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PlatformImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__REFID = 0;

	/**
	 * The feature id for the '<em><b>Javafx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__JAVAFX = 1;

	/**
	 * The feature id for the '<em><b>J2se</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__J2SE = 2;

	/**
	 * The feature id for the '<em><b>JVm Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__JVM_ARGS = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.JVmArgImpl <em>JVm Arg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.JVmArgImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getJVmArg()
	 * @generated
	 */
	int JVM_ARG = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ARG__VALUE = 0;

	/**
	 * The number of structural features of the '<em>JVm Arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_ARG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PropertyImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PreferencesImpl <em>Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PreferencesImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getPreferences()
	 * @generated
	 */
	int PREFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Install</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__INSTALL = 0;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__MENU = 1;

	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__REFID = 2;

	/**
	 * The feature id for the '<em><b>Shortcut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES__SHORTCUT = 3;

	/**
	 * The number of structural features of the '<em>Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFERENCES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fallbackclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__FALLBACKCLASS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ID = 2;

	/**
	 * The feature id for the '<em><b>Mainclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MAINCLASS = 3;

	/**
	 * The feature id for the '<em><b>Preloaderclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PRELOADERCLASS = 4;

	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__REFID = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VERSION = 6;

	/**
	 * The feature id for the '<em><b>Toolkit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TOOLKIT = 7;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ARGUMENTS = 8;

	/**
	 * The feature id for the '<em><b>Html Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HTML_PARAMS = 9;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PARAMS = 10;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ArgumentImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 6;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.HtmlParamImpl <em>Html Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.HtmlParamImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getHtmlParam()
	 * @generated
	 */
	int HTML_PARAM = 7;

	/**
	 * The feature id for the '<em><b>Escape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_PARAM__ESCAPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_PARAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_PARAM__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Html Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_PARAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParamImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PermissionsImpl <em>Permissions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PermissionsImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getPermissions()
	 * @generated
	 */
	int PERMISSIONS = 9;

	/**
	 * The feature id for the '<em><b>Cachecertificates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__CACHECERTIFICATES = 0;

	/**
	 * The feature id for the '<em><b>Elevated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__ELEVATED = 1;

	/**
	 * The number of structural features of the '<em>Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.TemplateImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 10;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__FILE = 0;

	/**
	 * The feature id for the '<em><b>To File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__TO_FILE = 1;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.CallbackImpl <em>Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.CallbackImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getCallback()
	 * @generated
	 */
	int CALLBACK = 11;

	/**
	 * The feature id for the '<em><b>Refid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__REFID = 0;

	/**
	 * The feature id for the '<em><b>Callbacks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__CALLBACKS = 1;

	/**
	 * The number of structural features of the '<em>Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.InfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.InfoImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getInfo()
	 * @generated
	 */
	int INFO = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__VENDOR = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__ICON = 3;

	/**
	 * The feature id for the '<em><b>Splash</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__SPLASH = 4;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.IconImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 13;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__DEPTH = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__HREF = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__KIND = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__WIDTH = 4;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.SplashImpl <em>Splash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.SplashImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getSplash()
	 * @generated
	 */
	int SPLASH = 14;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLASH__HREF = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLASH__MODE = 1;

	/**
	 * The number of structural features of the '<em>Splash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLASH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.KeyValuePairImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 15;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSetType <em>File Set Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSetType
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getFileSetType()
	 * @generated
	 */
	int FILE_SET_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.IconType <em>Icon Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.IconType
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getIconType()
	 * @generated
	 */
	int ICON_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode <em>Splash Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getSplashMode()
	 * @generated
	 */
	int SPLASH_MODE = 18;


	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ApplicationToolkitType <em>Application Toolkit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ApplicationToolkitType
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getApplicationToolkitType()
	 * @generated
	 */
	int APPLICATION_TOOLKIT_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet <em>File Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Set</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet
	 * @generated
	 */
	EClass getFileSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getArch <em>Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getArch()
	 * @see #getFileSet()
	 * @generated
	 */
	EAttribute getFileSet_Arch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excludes</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getExcludes()
	 * @see #getFileSet()
	 * @generated
	 */
	EAttribute getFileSet_Excludes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Includes</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getIncludes()
	 * @see #getFileSet()
	 * @generated
	 */
	EAttribute getFileSet_Includes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getOs()
	 * @see #getFileSet()
	 * @generated
	 */
	EAttribute getFileSet_Os();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getRequiredfor <em>Requiredfor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requiredfor</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getRequiredfor()
	 * @see #getFileSet()
	 * @generated
	 */
	EAttribute getFileSet_Requiredfor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet#getType()
	 * @see #getFileSet()
	 * @generated
	 */
	EAttribute getFileSet_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getRefid <em>Refid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refid</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getRefid()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Refid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJavafx <em>Javafx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Javafx</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJavafx()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Javafx();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJ2se <em>J2se</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>J2se</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJ2se()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_J2se();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJVmArgs <em>JVm Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>JVm Args</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getJVmArgs()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_JVmArgs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform#getProperties()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.JVmArg <em>JVm Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JVm Arg</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.JVmArg
	 * @generated
	 */
	EClass getJVmArg();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.JVmArg#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.JVmArg#getValue()
	 * @see #getJVmArg()
	 * @generated
	 */
	EAttribute getJVmArg_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preferences</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences
	 * @generated
	 */
	EClass getPreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isInstall <em>Install</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isInstall()
	 * @see #getPreferences()
	 * @generated
	 */
	EAttribute getPreferences_Install();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Menu</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isMenu()
	 * @see #getPreferences()
	 * @generated
	 */
	EAttribute getPreferences_Menu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#getRefid <em>Refid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refid</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#getRefid()
	 * @see #getPreferences()
	 * @generated
	 */
	EAttribute getPreferences_Refid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isShortcut <em>Shortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shortcut</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences#isShortcut()
	 * @see #getPreferences()
	 * @generated
	 */
	EAttribute getPreferences_Shortcut();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getFallbackclass <em>Fallbackclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fallbackclass</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getFallbackclass()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Fallbackclass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getId()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getMainclass <em>Mainclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mainclass</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getMainclass()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Mainclass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getPreloaderclass <em>Preloaderclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preloaderclass</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getPreloaderclass()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Preloaderclass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getRefid <em>Refid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refid</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getRefid()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Refid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getVersion()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getToolkit <em>Toolkit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toolkit</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getToolkit()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Toolkit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getArguments()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getHtmlParams <em>Html Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Html Params</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getHtmlParams()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HtmlParams();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application#getParams()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Params();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.HtmlParam <em>Html Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Param</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.HtmlParam
	 * @generated
	 */
	EClass getHtmlParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.HtmlParam#isEscape <em>Escape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escape</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.HtmlParam#isEscape()
	 * @see #getHtmlParam()
	 * @generated
	 */
	EAttribute getHtmlParam_Escape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.HtmlParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.HtmlParam#getName()
	 * @see #getHtmlParam()
	 * @generated
	 */
	EAttribute getHtmlParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.HtmlParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.HtmlParam#getValue()
	 * @see #getHtmlParam()
	 * @generated
	 */
	EAttribute getHtmlParam_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param#getValue()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Permissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permissions</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Permissions
	 * @generated
	 */
	EClass getPermissions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Permissions#isCachecertificates <em>Cachecertificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cachecertificates</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Permissions#isCachecertificates()
	 * @see #getPermissions()
	 * @generated
	 */
	EAttribute getPermissions_Cachecertificates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Permissions#isElevated <em>Elevated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevated</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Permissions#isElevated()
	 * @see #getPermissions()
	 * @generated
	 */
	EAttribute getPermissions_Elevated();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Template#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Template#getFile()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_File();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Template#getToFile <em>To File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To File</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Template#getToFile()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_ToFile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Callback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callback</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Callback
	 * @generated
	 */
	EClass getCallback();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Callback#getRefid <em>Refid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refid</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Callback#getRefid()
	 * @see #getCallback()
	 * @generated
	 */
	EAttribute getCallback_Refid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Callback#getCallbacks <em>Callbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Callbacks</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Callback#getCallbacks()
	 * @see #getCallback()
	 * @generated
	 */
	EReference getCallback_Callbacks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info
	 * @generated
	 */
	EClass getInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info#getDescription()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info#getTitle()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info#getVendor()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Vendor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info#getIcon()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_Icon();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info#getSplash <em>Splash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Splash</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Info#getSplash()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_Splash();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon#getDepth()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Depth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon#getHref()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon#getHeight()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon#getKind()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Icon#getWidth()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash <em>Splash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Splash</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash
	 * @generated
	 */
	EClass getSplash();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash#getHref()
	 * @see #getSplash()
	 * @generated
	 */
	EAttribute getSplash_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Splash#getMode()
	 * @see #getSplash()
	 * @generated
	 */
	EAttribute getSplash_Mode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair#getKey()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair#getValue()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSetType <em>File Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Set Type</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSetType
	 * @generated
	 */
	EEnum getFileSetType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Icon Type</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.IconType
	 * @generated
	 */
	EEnum getIconType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode <em>Splash Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Splash Mode</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode
	 * @generated
	 */
	EEnum getSplashMode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ApplicationToolkitType <em>Application Toolkit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Toolkit Type</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ApplicationToolkitType
	 * @generated
	 */
	EEnum getApplicationToolkitType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParametersFactory getParametersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.FileSetImpl <em>File Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.FileSetImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getFileSet()
		 * @generated
		 */
		EClass FILE_SET = eINSTANCE.getFileSet();

		/**
		 * The meta object literal for the '<em><b>Arch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SET__ARCH = eINSTANCE.getFileSet_Arch();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SET__EXCLUDES = eINSTANCE.getFileSet_Excludes();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SET__INCLUDES = eINSTANCE.getFileSet_Includes();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SET__OS = eINSTANCE.getFileSet_Os();

		/**
		 * The meta object literal for the '<em><b>Requiredfor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SET__REQUIREDFOR = eINSTANCE.getFileSet_Requiredfor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SET__TYPE = eINSTANCE.getFileSet_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PlatformImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Refid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__REFID = eINSTANCE.getPlatform_Refid();

		/**
		 * The meta object literal for the '<em><b>Javafx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__JAVAFX = eINSTANCE.getPlatform_Javafx();

		/**
		 * The meta object literal for the '<em><b>J2se</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__J2SE = eINSTANCE.getPlatform_J2se();

		/**
		 * The meta object literal for the '<em><b>JVm Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__JVM_ARGS = eINSTANCE.getPlatform_JVmArgs();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__PROPERTIES = eINSTANCE.getPlatform_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.JVmArgImpl <em>JVm Arg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.JVmArgImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getJVmArg()
		 * @generated
		 */
		EClass JVM_ARG = eINSTANCE.getJVmArg();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JVM_ARG__VALUE = eINSTANCE.getJVmArg_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PropertyImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PreferencesImpl <em>Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PreferencesImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getPreferences()
		 * @generated
		 */
		EClass PREFERENCES = eINSTANCE.getPreferences();

		/**
		 * The meta object literal for the '<em><b>Install</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCES__INSTALL = eINSTANCE.getPreferences_Install();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCES__MENU = eINSTANCE.getPreferences_Menu();

		/**
		 * The meta object literal for the '<em><b>Refid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCES__REFID = eINSTANCE.getPreferences_Refid();

		/**
		 * The meta object literal for the '<em><b>Shortcut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFERENCES__SHORTCUT = eINSTANCE.getPreferences_Shortcut();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Fallbackclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__FALLBACKCLASS = eINSTANCE.getApplication_Fallbackclass();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__ID = eINSTANCE.getApplication_Id();

		/**
		 * The meta object literal for the '<em><b>Mainclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__MAINCLASS = eINSTANCE.getApplication_Mainclass();

		/**
		 * The meta object literal for the '<em><b>Preloaderclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PRELOADERCLASS = eINSTANCE.getApplication_Preloaderclass();

		/**
		 * The meta object literal for the '<em><b>Refid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__REFID = eINSTANCE.getApplication_Refid();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__VERSION = eINSTANCE.getApplication_Version();

		/**
		 * The meta object literal for the '<em><b>Toolkit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__TOOLKIT = eINSTANCE.getApplication_Toolkit();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ARGUMENTS = eINSTANCE.getApplication_Arguments();

		/**
		 * The meta object literal for the '<em><b>Html Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HTML_PARAMS = eINSTANCE.getApplication_HtmlParams();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PARAMS = eINSTANCE.getApplication_Params();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ArgumentImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.HtmlParamImpl <em>Html Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.HtmlParamImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getHtmlParam()
		 * @generated
		 */
		EClass HTML_PARAM = eINSTANCE.getHtmlParam();

		/**
		 * The meta object literal for the '<em><b>Escape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_PARAM__ESCAPE = eINSTANCE.getHtmlParam_Escape();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_PARAM__NAME = eINSTANCE.getHtmlParam_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_PARAM__VALUE = eINSTANCE.getHtmlParam_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParamImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__VALUE = eINSTANCE.getParam_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PermissionsImpl <em>Permissions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PermissionsImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getPermissions()
		 * @generated
		 */
		EClass PERMISSIONS = eINSTANCE.getPermissions();

		/**
		 * The meta object literal for the '<em><b>Cachecertificates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSIONS__CACHECERTIFICATES = eINSTANCE.getPermissions_Cachecertificates();

		/**
		 * The meta object literal for the '<em><b>Elevated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSIONS__ELEVATED = eINSTANCE.getPermissions_Elevated();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.TemplateImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__FILE = eINSTANCE.getTemplate_File();

		/**
		 * The meta object literal for the '<em><b>To File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__TO_FILE = eINSTANCE.getTemplate_ToFile();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.CallbackImpl <em>Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.CallbackImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getCallback()
		 * @generated
		 */
		EClass CALLBACK = eINSTANCE.getCallback();

		/**
		 * The meta object literal for the '<em><b>Refid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLBACK__REFID = eINSTANCE.getCallback_Refid();

		/**
		 * The meta object literal for the '<em><b>Callbacks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLBACK__CALLBACKS = eINSTANCE.getCallback_Callbacks();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.InfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.InfoImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getInfo()
		 * @generated
		 */
		EClass INFO = eINSTANCE.getInfo();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__DESCRIPTION = eINSTANCE.getInfo_Description();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__TITLE = eINSTANCE.getInfo_Title();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__VENDOR = eINSTANCE.getInfo_Vendor();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__ICON = eINSTANCE.getInfo_Icon();

		/**
		 * The meta object literal for the '<em><b>Splash</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__SPLASH = eINSTANCE.getInfo_Splash();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.IconImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__DEPTH = eINSTANCE.getIcon_Depth();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__HREF = eINSTANCE.getIcon_Href();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__HEIGHT = eINSTANCE.getIcon_Height();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__KIND = eINSTANCE.getIcon_Kind();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__WIDTH = eINSTANCE.getIcon_Width();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.SplashImpl <em>Splash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.SplashImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getSplash()
		 * @generated
		 */
		EClass SPLASH = eINSTANCE.getSplash();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLASH__HREF = eINSTANCE.getSplash_Href();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLASH__MODE = eINSTANCE.getSplash_Mode();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.KeyValuePairImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSetType <em>File Set Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSetType
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getFileSetType()
		 * @generated
		 */
		EEnum FILE_SET_TYPE = eINSTANCE.getFileSetType();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.IconType <em>Icon Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.IconType
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getIconType()
		 * @generated
		 */
		EEnum ICON_TYPE = eINSTANCE.getIconType();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode <em>Splash Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.SplashMode
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getSplashMode()
		 * @generated
		 */
		EEnum SPLASH_MODE = eINSTANCE.getSplashMode();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ApplicationToolkitType <em>Application Toolkit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ApplicationToolkitType
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl#getApplicationToolkitType()
		 * @generated
		 */
		EEnum APPLICATION_TOOLKIT_TYPE = eINSTANCE.getApplicationToolkitType();

	}

} //ParametersPackage
