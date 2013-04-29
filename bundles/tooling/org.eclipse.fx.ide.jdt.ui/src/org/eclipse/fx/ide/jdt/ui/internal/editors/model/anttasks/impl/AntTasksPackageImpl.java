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
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTask;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksFactory;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Deploy;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.Jar;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.PackagingFormat;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AntTasksPackageImpl extends EPackageImpl implements AntTasksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signJarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum packagingFormatEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AntTasksPackageImpl() {
		super(eNS_URI, AntTasksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AntTasksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AntTasksPackage init() {
		if (isInited) return (AntTasksPackage)EPackage.Registry.INSTANCE.getEPackage(AntTasksPackage.eNS_URI);

		// Obtain or create and register package
		AntTasksPackageImpl theAntTasksPackage = (AntTasksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AntTasksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AntTasksPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) instanceof ParametersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) : ParametersPackage.eINSTANCE);

		// Create package meta-data objects
		theAntTasksPackage.createPackageContents();
		theParametersPackage.createPackageContents();

		// Initialize created meta-data
		theAntTasksPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAntTasksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AntTasksPackage.eNS_URI, theAntTasksPackage);
		return theAntTasksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntTask() {
		return antTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntTask_Deploy() {
		return (EReference)antTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntTask_Jar() {
		return (EReference)antTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntTask_Signjar() {
		return (EReference)antTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAntTask_BuildDirectory() {
		return (EAttribute)antTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntTask_ManifestEntries() {
		return (EReference)antTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAntTask_CssToBin() {
		return (EAttribute)antTaskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntTask_Files() {
		return (EReference)antTaskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntTask_Fonts() {
		return (EReference)antTaskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploy() {
		return deployEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_Embedjnlp() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_Extension() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_Height() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_IncludeDT() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_OfflineAllowed() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_Placeholderref() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_Placeholderid() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_Updatemode() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_Width() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploy_Platform() {
		return (EReference)deployEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploy_Preferences() {
		return (EReference)deployEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploy_Application() {
		return (EReference)deployEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploy_Permissions() {
		return (EReference)deployEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploy_Template() {
		return (EReference)deployEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploy_Callbacks() {
		return (EReference)deployEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploy_Info() {
		return (EReference)deployEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_SplashImage() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_PackagingFormat() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_Verbose() {
		return (EAttribute)deployEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJar() {
		return jarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJar_Platform() {
		return (EReference)jarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJar_Fileset() {
		return (EReference)jarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJar_Application() {
		return (EReference)jarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJar_Info() {
		return (EReference)jarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignJar() {
		return signJarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignJar_Alias() {
		return (EAttribute)signJarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignJar_Keypass() {
		return (EAttribute)signJarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignJar_Keystore() {
		return (EAttribute)signJarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignJar_Storepass() {
		return (EAttribute)signJarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignJar_Storetype() {
		return (EAttribute)signJarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPackagingFormat() {
		return packagingFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntTasksFactory getAntTasksFactory() {
		return (AntTasksFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		antTaskEClass = createEClass(ANT_TASK);
		createEReference(antTaskEClass, ANT_TASK__DEPLOY);
		createEReference(antTaskEClass, ANT_TASK__JAR);
		createEReference(antTaskEClass, ANT_TASK__SIGNJAR);
		createEAttribute(antTaskEClass, ANT_TASK__BUILD_DIRECTORY);
		createEReference(antTaskEClass, ANT_TASK__MANIFEST_ENTRIES);
		createEAttribute(antTaskEClass, ANT_TASK__CSS_TO_BIN);
		createEReference(antTaskEClass, ANT_TASK__FILES);
		createEReference(antTaskEClass, ANT_TASK__FONTS);

		deployEClass = createEClass(DEPLOY);
		createEAttribute(deployEClass, DEPLOY__EMBEDJNLP);
		createEAttribute(deployEClass, DEPLOY__EXTENSION);
		createEAttribute(deployEClass, DEPLOY__HEIGHT);
		createEAttribute(deployEClass, DEPLOY__INCLUDE_DT);
		createEAttribute(deployEClass, DEPLOY__OFFLINE_ALLOWED);
		createEAttribute(deployEClass, DEPLOY__PLACEHOLDERREF);
		createEAttribute(deployEClass, DEPLOY__PLACEHOLDERID);
		createEAttribute(deployEClass, DEPLOY__UPDATEMODE);
		createEAttribute(deployEClass, DEPLOY__WIDTH);
		createEReference(deployEClass, DEPLOY__PLATFORM);
		createEReference(deployEClass, DEPLOY__PREFERENCES);
		createEReference(deployEClass, DEPLOY__APPLICATION);
		createEReference(deployEClass, DEPLOY__PERMISSIONS);
		createEReference(deployEClass, DEPLOY__TEMPLATE);
		createEReference(deployEClass, DEPLOY__CALLBACKS);
		createEReference(deployEClass, DEPLOY__INFO);
		createEAttribute(deployEClass, DEPLOY__SPLASH_IMAGE);
		createEAttribute(deployEClass, DEPLOY__PACKAGING_FORMAT);
		createEAttribute(deployEClass, DEPLOY__VERBOSE);

		jarEClass = createEClass(JAR);
		createEReference(jarEClass, JAR__PLATFORM);
		createEReference(jarEClass, JAR__FILESET);
		createEReference(jarEClass, JAR__APPLICATION);
		createEReference(jarEClass, JAR__INFO);

		signJarEClass = createEClass(SIGN_JAR);
		createEAttribute(signJarEClass, SIGN_JAR__ALIAS);
		createEAttribute(signJarEClass, SIGN_JAR__KEYPASS);
		createEAttribute(signJarEClass, SIGN_JAR__KEYSTORE);
		createEAttribute(signJarEClass, SIGN_JAR__STOREPASS);
		createEAttribute(signJarEClass, SIGN_JAR__STORETYPE);

		// Create enums
		packagingFormatEEnum = createEEnum(PACKAGING_FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theParametersPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(antTaskEClass, AntTask.class, "AntTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntTask_Deploy(), this.getDeploy(), null, "deploy", null, 0, 1, AntTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntTask_Jar(), this.getJar(), null, "jar", null, 0, 1, AntTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntTask_Signjar(), this.getSignJar(), null, "signjar", null, 0, 1, AntTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntTask_BuildDirectory(), ecorePackage.getEString(), "buildDirectory", null, 0, 1, AntTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntTask_ManifestEntries(), theParametersPackage.getParam(), null, "manifestEntries", null, 0, -1, AntTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntTask_CssToBin(), ecorePackage.getEBoolean(), "cssToBin", null, 0, 1, AntTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAntTask_Files(), theParametersPackage.getKeyValuePair(), null, "files", null, 0, -1, AntTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntTask_Fonts(), theParametersPackage.getKeyValuePair(), null, "fonts", null, 0, -1, AntTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployEClass, Deploy.class, "Deploy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploy_Embedjnlp(), ecorePackage.getEBoolean(), "embedjnlp", "false", 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_Extension(), ecorePackage.getEBoolean(), "extension", "false", 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_Height(), ecorePackage.getEString(), "height", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_IncludeDT(), ecorePackage.getEBoolean(), "includeDT", "false", 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_OfflineAllowed(), ecorePackage.getEBoolean(), "offlineAllowed", "true", 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_Placeholderref(), ecorePackage.getEString(), "placeholderref", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_Placeholderid(), ecorePackage.getEString(), "placeholderid", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_Updatemode(), ecorePackage.getEString(), "updatemode", "background", 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_Width(), ecorePackage.getEString(), "width", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploy_Platform(), theParametersPackage.getPlatform(), null, "platform", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploy_Preferences(), theParametersPackage.getPreferences(), null, "preferences", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploy_Application(), theParametersPackage.getApplication(), null, "application", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploy_Permissions(), theParametersPackage.getPermissions(), null, "permissions", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploy_Template(), theParametersPackage.getTemplate(), null, "template", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploy_Callbacks(), theParametersPackage.getCallback(), null, "callbacks", null, 0, -1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploy_Info(), theParametersPackage.getInfo(), null, "info", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_SplashImage(), ecorePackage.getEString(), "splashImage", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_PackagingFormat(), ecorePackage.getEString(), "packagingFormat", null, 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_Verbose(), ecorePackage.getEBoolean(), "verbose", "false", 0, 1, Deploy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jarEClass, Jar.class, "Jar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJar_Platform(), theParametersPackage.getPlatform(), null, "platform", null, 0, 1, Jar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJar_Fileset(), theParametersPackage.getFileSet(), null, "fileset", null, 0, 1, Jar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJar_Application(), theParametersPackage.getApplication(), null, "application", null, 0, 1, Jar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJar_Info(), theParametersPackage.getInfo(), null, "info", null, 0, 1, Jar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signJarEClass, SignJar.class, "SignJar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignJar_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, SignJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignJar_Keypass(), ecorePackage.getEString(), "keypass", null, 0, 1, SignJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignJar_Keystore(), ecorePackage.getEString(), "keystore", null, 0, 1, SignJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignJar_Storepass(), ecorePackage.getEString(), "storepass", null, 0, 1, SignJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignJar_Storetype(), ecorePackage.getEString(), "storetype", null, 0, 1, SignJar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(packagingFormatEEnum, PackagingFormat.class, "PackagingFormat");
		addEEnumLiteral(packagingFormatEEnum, PackagingFormat.NONE);
		addEEnumLiteral(packagingFormatEEnum, PackagingFormat.ALL);
		addEEnumLiteral(packagingFormatEEnum, PackagingFormat.IMAGE);
		addEEnumLiteral(packagingFormatEEnum, PackagingFormat.EXE);
		addEEnumLiteral(packagingFormatEEnum, PackagingFormat.MSI);
		addEEnumLiteral(packagingFormatEEnum, PackagingFormat.DMG);
		addEEnumLiteral(packagingFormatEEnum, PackagingFormat.RPM);
		addEEnumLiteral(packagingFormatEEnum, PackagingFormat.DEB);

		// Create resource
		createResource(eNS_URI);
	}

} //AntTasksPackageImpl
