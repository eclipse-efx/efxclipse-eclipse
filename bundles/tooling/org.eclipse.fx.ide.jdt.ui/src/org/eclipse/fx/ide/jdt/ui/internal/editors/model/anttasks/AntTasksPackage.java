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
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks;

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
 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksFactory
 * @model kind="package"
 * @generated
 */
public interface AntTasksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "anttasks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.fx.ide.jdt/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "anttasks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AntTasksPackage eINSTANCE = org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl <em>Ant Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getAntTask()
	 * @generated
	 */
	int ANT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Deploy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__DEPLOY = 0;

	/**
	 * The feature id for the '<em><b>Jar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__JAR = 1;

	/**
	 * The feature id for the '<em><b>Signjar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__SIGNJAR = 2;

	/**
	 * The feature id for the '<em><b>Build Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__BUILD_DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Manifest Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__MANIFEST_ENTRIES = 4;

	/**
	 * The feature id for the '<em><b>Css To Bin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__CSS_TO_BIN = 5;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__FILES = 6;

	/**
	 * The feature id for the '<em><b>Fonts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK__FONTS = 7;

	/**
	 * The number of structural features of the '<em>Ant Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANT_TASK_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl <em>Deploy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getDeploy()
	 * @generated
	 */
	int DEPLOY = 1;

	/**
	 * The feature id for the '<em><b>Embedjnlp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__EMBEDJNLP = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Include DT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__INCLUDE_DT = 3;

	/**
	 * The feature id for the '<em><b>Offline Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__OFFLINE_ALLOWED = 4;

	/**
	 * The feature id for the '<em><b>Placeholderref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PLACEHOLDERREF = 5;

	/**
	 * The feature id for the '<em><b>Placeholderid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PLACEHOLDERID = 6;

	/**
	 * The feature id for the '<em><b>Updatemode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__UPDATEMODE = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__WIDTH = 8;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PLATFORM = 9;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PREFERENCES = 10;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__APPLICATION = 11;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PERMISSIONS = 12;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__TEMPLATE = 13;

	/**
	 * The feature id for the '<em><b>Callbacks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__CALLBACKS = 14;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__INFO = 15;

	/**
	 * The feature id for the '<em><b>Splash Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__SPLASH_IMAGE = 16;

	/**
	 * The feature id for the '<em><b>Packaging Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PACKAGING_FORMAT = 17;

	/**
	 * The feature id for the '<em><b>Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__VERBOSE = 18;

	/**
	 * The feature id for the '<em><b>Proxy Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PROXY_RESOLUTION = 19;

	/**
	 * The number of structural features of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.JarImpl <em>Jar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.JarImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getJar()
	 * @generated
	 */
	int JAR = 2;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR__PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Fileset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR__FILESET = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR__APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR__INFO = 3;

	/**
	 * The number of structural features of the '<em>Jar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl <em>Sign Jar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getSignJar()
	 * @generated
	 */
	int SIGN_JAR = 3;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Keypass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__KEYPASS = 1;

	/**
	 * The feature id for the '<em><b>Keystore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__KEYSTORE = 2;

	/**
	 * The feature id for the '<em><b>Storepass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__STOREPASS = 3;

	/**
	 * The feature id for the '<em><b>Storetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR__STORETYPE = 4;

	/**
	 * The number of structural features of the '<em>Sign Jar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_JAR_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.PackagingFormat <em>Packaging Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.PackagingFormat
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getPackagingFormat()
	 * @generated
	 */
	int PACKAGING_FORMAT = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask <em>Ant Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ant Task</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask
	 * @generated
	 */
	EClass getAntTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getDeploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deploy</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getDeploy()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_Deploy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getJar <em>Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jar</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getJar()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_Jar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getSignjar <em>Signjar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signjar</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getSignjar()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_Signjar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getBuildDirectory <em>Build Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Directory</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getBuildDirectory()
	 * @see #getAntTask()
	 * @generated
	 */
	EAttribute getAntTask_BuildDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getManifestEntries <em>Manifest Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manifest Entries</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getManifestEntries()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_ManifestEntries();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#isCssToBin <em>Css To Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Css To Bin</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#isCssToBin()
	 * @see #getAntTask()
	 * @generated
	 */
	EAttribute getAntTask_CssToBin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getFiles()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_Files();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getFonts <em>Fonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fonts</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask#getFonts()
	 * @see #getAntTask()
	 * @generated
	 */
	EReference getAntTask_Fonts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy
	 * @generated
	 */
	EClass getDeploy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isEmbedjnlp <em>Embedjnlp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedjnlp</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isEmbedjnlp()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Embedjnlp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isExtension()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getHeight()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isIncludeDT <em>Include DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include DT</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isIncludeDT()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_IncludeDT();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isOfflineAllowed <em>Offline Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offline Allowed</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isOfflineAllowed()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_OfflineAllowed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderref <em>Placeholderref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholderref</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderref()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Placeholderref();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderid <em>Placeholderid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholderid</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPlaceholderid()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Placeholderid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getUpdatemode <em>Updatemode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updatemode</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getUpdatemode()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Updatemode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getWidth()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Width();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPlatform()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Platform();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preferences</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPreferences()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Preferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getApplication()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Application();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Permissions</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPermissions()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Permissions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getTemplate()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getCallbacks <em>Callbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Callbacks</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getCallbacks()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Callbacks();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getInfo()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Info();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getSplashImage <em>Splash Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Splash Image</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getSplashImage()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_SplashImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPackagingFormat <em>Packaging Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packaging Format</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#getPackagingFormat()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_PackagingFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isVerbose <em>Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verbose</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isVerbose()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Verbose();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isProxyResolution <em>Proxy Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Resolution</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy#isProxyResolution()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_ProxyResolution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar <em>Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jar</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar
	 * @generated
	 */
	EClass getJar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getPlatform()
	 * @see #getJar()
	 * @generated
	 */
	EReference getJar_Platform();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getFileset <em>Fileset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fileset</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getFileset()
	 * @see #getJar()
	 * @generated
	 */
	EReference getJar_Fileset();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getApplication()
	 * @see #getJar()
	 * @generated
	 */
	EReference getJar_Application();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar#getInfo()
	 * @see #getJar()
	 * @generated
	 */
	EReference getJar_Info();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar <em>Sign Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sign Jar</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar
	 * @generated
	 */
	EClass getSignJar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar#getAlias()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar#getKeypass <em>Keypass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keypass</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar#getKeypass()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Keypass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar#getKeystore <em>Keystore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keystore</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar#getKeystore()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Keystore();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar#getStorepass <em>Storepass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storepass</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar#getStorepass()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Storepass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar#getStoretype <em>Storetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storetype</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar#getStoretype()
	 * @see #getSignJar()
	 * @generated
	 */
	EAttribute getSignJar_Storetype();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.PackagingFormat <em>Packaging Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Packaging Format</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.PackagingFormat
	 * @generated
	 */
	EEnum getPackagingFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AntTasksFactory getAntTasksFactory();

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
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl <em>Ant Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTaskImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getAntTask()
		 * @generated
		 */
		EClass ANT_TASK = eINSTANCE.getAntTask();

		/**
		 * The meta object literal for the '<em><b>Deploy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__DEPLOY = eINSTANCE.getAntTask_Deploy();

		/**
		 * The meta object literal for the '<em><b>Jar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__JAR = eINSTANCE.getAntTask_Jar();

		/**
		 * The meta object literal for the '<em><b>Signjar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__SIGNJAR = eINSTANCE.getAntTask_Signjar();

		/**
		 * The meta object literal for the '<em><b>Build Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANT_TASK__BUILD_DIRECTORY = eINSTANCE.getAntTask_BuildDirectory();

		/**
		 * The meta object literal for the '<em><b>Manifest Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__MANIFEST_ENTRIES = eINSTANCE.getAntTask_ManifestEntries();

		/**
		 * The meta object literal for the '<em><b>Css To Bin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANT_TASK__CSS_TO_BIN = eINSTANCE.getAntTask_CssToBin();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__FILES = eINSTANCE.getAntTask_Files();

		/**
		 * The meta object literal for the '<em><b>Fonts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANT_TASK__FONTS = eINSTANCE.getAntTask_Fonts();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl <em>Deploy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.DeployImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getDeploy()
		 * @generated
		 */
		EClass DEPLOY = eINSTANCE.getDeploy();

		/**
		 * The meta object literal for the '<em><b>Embedjnlp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__EMBEDJNLP = eINSTANCE.getDeploy_Embedjnlp();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__EXTENSION = eINSTANCE.getDeploy_Extension();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__HEIGHT = eINSTANCE.getDeploy_Height();

		/**
		 * The meta object literal for the '<em><b>Include DT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__INCLUDE_DT = eINSTANCE.getDeploy_IncludeDT();

		/**
		 * The meta object literal for the '<em><b>Offline Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__OFFLINE_ALLOWED = eINSTANCE.getDeploy_OfflineAllowed();

		/**
		 * The meta object literal for the '<em><b>Placeholderref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__PLACEHOLDERREF = eINSTANCE.getDeploy_Placeholderref();

		/**
		 * The meta object literal for the '<em><b>Placeholderid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__PLACEHOLDERID = eINSTANCE.getDeploy_Placeholderid();

		/**
		 * The meta object literal for the '<em><b>Updatemode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__UPDATEMODE = eINSTANCE.getDeploy_Updatemode();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__WIDTH = eINSTANCE.getDeploy_Width();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__PLATFORM = eINSTANCE.getDeploy_Platform();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__PREFERENCES = eINSTANCE.getDeploy_Preferences();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__APPLICATION = eINSTANCE.getDeploy_Application();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__PERMISSIONS = eINSTANCE.getDeploy_Permissions();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__TEMPLATE = eINSTANCE.getDeploy_Template();

		/**
		 * The meta object literal for the '<em><b>Callbacks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__CALLBACKS = eINSTANCE.getDeploy_Callbacks();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__INFO = eINSTANCE.getDeploy_Info();

		/**
		 * The meta object literal for the '<em><b>Splash Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__SPLASH_IMAGE = eINSTANCE.getDeploy_SplashImage();

		/**
		 * The meta object literal for the '<em><b>Packaging Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__PACKAGING_FORMAT = eINSTANCE.getDeploy_PackagingFormat();

		/**
		 * The meta object literal for the '<em><b>Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__VERBOSE = eINSTANCE.getDeploy_Verbose();

		/**
		 * The meta object literal for the '<em><b>Proxy Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__PROXY_RESOLUTION = eINSTANCE.getDeploy_ProxyResolution();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.JarImpl <em>Jar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.JarImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getJar()
		 * @generated
		 */
		EClass JAR = eINSTANCE.getJar();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAR__PLATFORM = eINSTANCE.getJar_Platform();

		/**
		 * The meta object literal for the '<em><b>Fileset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAR__FILESET = eINSTANCE.getJar_Fileset();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAR__APPLICATION = eINSTANCE.getJar_Application();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAR__INFO = eINSTANCE.getJar_Info();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl <em>Sign Jar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getSignJar()
		 * @generated
		 */
		EClass SIGN_JAR = eINSTANCE.getSignJar();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__ALIAS = eINSTANCE.getSignJar_Alias();

		/**
		 * The meta object literal for the '<em><b>Keypass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__KEYPASS = eINSTANCE.getSignJar_Keypass();

		/**
		 * The meta object literal for the '<em><b>Keystore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__KEYSTORE = eINSTANCE.getSignJar_Keystore();

		/**
		 * The meta object literal for the '<em><b>Storepass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__STOREPASS = eINSTANCE.getSignJar_Storepass();

		/**
		 * The meta object literal for the '<em><b>Storetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_JAR__STORETYPE = eINSTANCE.getSignJar_Storetype();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.PackagingFormat <em>Packaging Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.PackagingFormat
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl#getPackagingFormat()
		 * @generated
		 */
		EEnum PACKAGING_FORMAT = eINSTANCE.getPackagingFormat();

	}

} //AntTasksPackage
