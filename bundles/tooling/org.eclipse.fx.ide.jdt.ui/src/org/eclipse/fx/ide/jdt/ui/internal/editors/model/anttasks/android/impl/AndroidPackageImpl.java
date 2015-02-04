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
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage;

import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidFactory;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission;

import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksPackageImpl;

import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage;

import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ParametersPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidPackageImpl extends EPackageImpl implements AndroidPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass androidExportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionEEnum = null;

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
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AndroidPackageImpl() {
		super(eNS_URI, AndroidFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AndroidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AndroidPackage init() {
		if (isInited) return (AndroidPackage)EPackage.Registry.INSTANCE.getEPackage(AndroidPackage.eNS_URI);

		// Obtain or create and register package
		AndroidPackageImpl theAndroidPackage = (AndroidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AndroidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AndroidPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AntTasksPackageImpl theAntTasksPackage = (AntTasksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AntTasksPackage.eNS_URI) instanceof AntTasksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AntTasksPackage.eNS_URI) : AntTasksPackage.eINSTANCE);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) instanceof ParametersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI) : ParametersPackage.eINSTANCE);

		// Create package meta-data objects
		theAndroidPackage.createPackageContents();
		theAntTasksPackage.createPackageContents();
		theParametersPackage.createPackageContents();

		// Initialize created meta-data
		theAndroidPackage.initializePackageContents();
		theAntTasksPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAndroidPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AndroidPackage.eNS_URI, theAndroidPackage);
		return theAndroidPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndroidExport() {
		return androidExportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndroidExport_Androidsdk() {
		return (EAttribute)androidExportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndroidExport_Dalviksdk() {
		return (EAttribute)androidExportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndroidExport_ActivityLabel() {
		return (EAttribute)androidExportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndroidExport_PersmissionList() {
		return (EAttribute)androidExportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPermission() {
		return permissionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidFactory getAndroidFactory() {
		return (AndroidFactory)getEFactoryInstance();
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
		androidExportEClass = createEClass(ANDROID_EXPORT);
		createEAttribute(androidExportEClass, ANDROID_EXPORT__ANDROIDSDK);
		createEAttribute(androidExportEClass, ANDROID_EXPORT__DALVIKSDK);
		createEAttribute(androidExportEClass, ANDROID_EXPORT__ACTIVITY_LABEL);
		createEAttribute(androidExportEClass, ANDROID_EXPORT__PERSMISSION_LIST);

		// Create enums
		permissionEEnum = createEEnum(PERMISSION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(androidExportEClass, AndroidExport.class, "AndroidExport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAndroidExport_Androidsdk(), ecorePackage.getEString(), "androidsdk", null, 0, 1, AndroidExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndroidExport_Dalviksdk(), ecorePackage.getEString(), "dalviksdk", null, 0, 1, AndroidExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndroidExport_ActivityLabel(), ecorePackage.getEString(), "activityLabel", null, 0, 1, AndroidExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndroidExport_PersmissionList(), this.getPermission(), "persmissionList", null, 0, -1, AndroidExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(permissionEEnum, Permission.class, "Permission");
		addEEnumLiteral(permissionEEnum, Permission.ACCESS_CHECKIN_PROPERTIES);
		addEEnumLiteral(permissionEEnum, Permission.ACCESS_COARSE_LOCATION);
		addEEnumLiteral(permissionEEnum, Permission.ACCESS_FINE_LOCATION);
		addEEnumLiteral(permissionEEnum, Permission.ACCESS_LOCATION_EXTRA_COMMANDS);
		addEEnumLiteral(permissionEEnum, Permission.ACCESS_MOCK_LOCATION);
		addEEnumLiteral(permissionEEnum, Permission.ACCESS_NETWORK_STATE);
		addEEnumLiteral(permissionEEnum, Permission.ACCESS_SURFACE_FLINGER);
		addEEnumLiteral(permissionEEnum, Permission.ACCESS_WIFI_STATE);
		addEEnumLiteral(permissionEEnum, Permission.ACCOUNT_MANAGER);
		addEEnumLiteral(permissionEEnum, Permission.ADD_VOICEMAIL);
		addEEnumLiteral(permissionEEnum, Permission.AUTHENTICATE_ACCOUNTS);
		addEEnumLiteral(permissionEEnum, Permission.BATTERY_STATS);
		addEEnumLiteral(permissionEEnum, Permission.BIND_ACCESSIBILITY_SERVICE);
		addEEnumLiteral(permissionEEnum, Permission.BIND_APPWIDGET);
		addEEnumLiteral(permissionEEnum, Permission.BIND_DEVICE_ADMIN);
		addEEnumLiteral(permissionEEnum, Permission.BIND_DREAM_SERVICE);
		addEEnumLiteral(permissionEEnum, Permission.BIND_INPUT_METHOD);
		addEEnumLiteral(permissionEEnum, Permission.BIND_NFC_SERVICE);
		addEEnumLiteral(permissionEEnum, Permission.BIND_NOTIFICATION_LISTENER_SERVICE);
		addEEnumLiteral(permissionEEnum, Permission.BIND_PRINT_SERVICE);
		addEEnumLiteral(permissionEEnum, Permission.BIND_REMOTEVIEWS);
		addEEnumLiteral(permissionEEnum, Permission.BIND_TEXT_SERVICE);
		addEEnumLiteral(permissionEEnum, Permission.BIND_TV_INPUT);
		addEEnumLiteral(permissionEEnum, Permission.BIND_VOICE_INTERACTION);
		addEEnumLiteral(permissionEEnum, Permission.BIND_VPN_SERVICE);
		addEEnumLiteral(permissionEEnum, Permission.BIND_WALLPAPER);
		addEEnumLiteral(permissionEEnum, Permission.BLUETOOTH);
		addEEnumLiteral(permissionEEnum, Permission.BLUETOOTH_ADMIN);
		addEEnumLiteral(permissionEEnum, Permission.BLUETOOTH_PRIVILEGED);
		addEEnumLiteral(permissionEEnum, Permission.BODY_SENSORS);
		addEEnumLiteral(permissionEEnum, Permission.BRICK);
		addEEnumLiteral(permissionEEnum, Permission.BROADCAST_PACKAGE_REMOVED);
		addEEnumLiteral(permissionEEnum, Permission.BROADCAST_SMS);
		addEEnumLiteral(permissionEEnum, Permission.BROADCAST_STICKY);
		addEEnumLiteral(permissionEEnum, Permission.BROADCAST_WAP_PUSH);
		addEEnumLiteral(permissionEEnum, Permission.CALL_PHONE);
		addEEnumLiteral(permissionEEnum, Permission.CALL_PRIVILEGED);
		addEEnumLiteral(permissionEEnum, Permission.CAMERA);
		addEEnumLiteral(permissionEEnum, Permission.CAPTURE_AUDIO_OUTPUT);
		addEEnumLiteral(permissionEEnum, Permission.CAPTURE_SECURE_VIDEO_OUTPUT);
		addEEnumLiteral(permissionEEnum, Permission.CAPTURE_VIDEO_OUTPUT);
		addEEnumLiteral(permissionEEnum, Permission.CHANGE_COMPONENT_ENABLED_STATE);
		addEEnumLiteral(permissionEEnum, Permission.CHANGE_CONFIGURATION);
		addEEnumLiteral(permissionEEnum, Permission.CHANGE_NETWORK_STATE);
		addEEnumLiteral(permissionEEnum, Permission.CHANGE_WIFI_MULTICAST_STATE);
		addEEnumLiteral(permissionEEnum, Permission.CHANGE_WIFI_STATE);
		addEEnumLiteral(permissionEEnum, Permission.CLEAR_APP_CACHE);
		addEEnumLiteral(permissionEEnum, Permission.CLEAR_APP_USER_DATA);
		addEEnumLiteral(permissionEEnum, Permission.CONTROL_LOCATION_UPDATES);
		addEEnumLiteral(permissionEEnum, Permission.DELETE_CACHE_FILES);
		addEEnumLiteral(permissionEEnum, Permission.DELETE_PACKAGES);
		addEEnumLiteral(permissionEEnum, Permission.DEVICE_POWER);
		addEEnumLiteral(permissionEEnum, Permission.DIAGNOSTIC);
		addEEnumLiteral(permissionEEnum, Permission.DISABLE_KEYGUARD);
		addEEnumLiteral(permissionEEnum, Permission.DUMP);
		addEEnumLiteral(permissionEEnum, Permission.EXPAND_STATUS_BAR);
		addEEnumLiteral(permissionEEnum, Permission.FACTORY_TEST);
		addEEnumLiteral(permissionEEnum, Permission.FLASHLIGHT);
		addEEnumLiteral(permissionEEnum, Permission.FORCE_BACK);
		addEEnumLiteral(permissionEEnum, Permission.GET_ACCOUNTS);
		addEEnumLiteral(permissionEEnum, Permission.GET_PACKAGE_SIZE);
		addEEnumLiteral(permissionEEnum, Permission.GET_TASKS);
		addEEnumLiteral(permissionEEnum, Permission.GET_TOP_ACTIVITY_INFO);
		addEEnumLiteral(permissionEEnum, Permission.GLOBAL_SEARCH);
		addEEnumLiteral(permissionEEnum, Permission.HARDWARE_TEST);
		addEEnumLiteral(permissionEEnum, Permission.INJECT_EVENTS);
		addEEnumLiteral(permissionEEnum, Permission.INSTALL_LOCATION_PROVIDER);
		addEEnumLiteral(permissionEEnum, Permission.INSTALL_PACKAGES);
		addEEnumLiteral(permissionEEnum, Permission.INSTALL_SHORTCUT);
		addEEnumLiteral(permissionEEnum, Permission.INTERNAL_SYSTEM_WINDOW);
		addEEnumLiteral(permissionEEnum, Permission.INTERNET);
		addEEnumLiteral(permissionEEnum, Permission.KILL_BACKGROUND_PROCESSES);
		addEEnumLiteral(permissionEEnum, Permission.LOCATION_HARDWARE);
		addEEnumLiteral(permissionEEnum, Permission.MANAGE_ACCOUNTS);
		addEEnumLiteral(permissionEEnum, Permission.MANAGE_APP_TOKENS);
		addEEnumLiteral(permissionEEnum, Permission.MANAGE_DOCUMENTS);
		addEEnumLiteral(permissionEEnum, Permission.MASTER_CLEAR);
		addEEnumLiteral(permissionEEnum, Permission.MEDIA_CONTENT_CONTROL);
		addEEnumLiteral(permissionEEnum, Permission.MODIFY_AUDIO_SETTINGS);
		addEEnumLiteral(permissionEEnum, Permission.MODIFY_PHONE_STATE);
		addEEnumLiteral(permissionEEnum, Permission.MOUNT_FORMAT_FILESYSTEMS);
		addEEnumLiteral(permissionEEnum, Permission.MOUNT_UNMOUNT_FILESYSTEMS);
		addEEnumLiteral(permissionEEnum, Permission.NFC);
		addEEnumLiteral(permissionEEnum, Permission.PERSISTENT_ACTIVITY);
		addEEnumLiteral(permissionEEnum, Permission.PROCESS_OUTGOING_CALLS);
		addEEnumLiteral(permissionEEnum, Permission.READ_CALENDAR);
		addEEnumLiteral(permissionEEnum, Permission.READ_CALL_LOG);
		addEEnumLiteral(permissionEEnum, Permission.READ_CONTACTS);
		addEEnumLiteral(permissionEEnum, Permission.READ_EXTERNAL_STORAGE);
		addEEnumLiteral(permissionEEnum, Permission.READ_FRAME_BUFFER);
		addEEnumLiteral(permissionEEnum, Permission.READ_HISTORY_BOOKMARKS);
		addEEnumLiteral(permissionEEnum, Permission.READ_INPUT_STATE);
		addEEnumLiteral(permissionEEnum, Permission.READ_LOGS);
		addEEnumLiteral(permissionEEnum, Permission.READ_PHONE_STATE);
		addEEnumLiteral(permissionEEnum, Permission.READ_PROFILE);
		addEEnumLiteral(permissionEEnum, Permission.READ_SMS);
		addEEnumLiteral(permissionEEnum, Permission.READ_SOCIAL_STREAM);
		addEEnumLiteral(permissionEEnum, Permission.READ_SYNC_SETTINGS);
		addEEnumLiteral(permissionEEnum, Permission.READ_SYNC_STATS);
		addEEnumLiteral(permissionEEnum, Permission.READ_USER_DICTIONARY);
		addEEnumLiteral(permissionEEnum, Permission.READ_VOICEMAIL);
		addEEnumLiteral(permissionEEnum, Permission.REBOOT);
		addEEnumLiteral(permissionEEnum, Permission.RECEIVE_BOOT_COMPLETED);
		addEEnumLiteral(permissionEEnum, Permission.RECEIVE_MMS);
		addEEnumLiteral(permissionEEnum, Permission.RECEIVE_SMS);
		addEEnumLiteral(permissionEEnum, Permission.RECEIVE_WAP_PUSH);
		addEEnumLiteral(permissionEEnum, Permission.RECORD_AUDIO);
		addEEnumLiteral(permissionEEnum, Permission.REORDER_TASKS);
		addEEnumLiteral(permissionEEnum, Permission.RESTART_PACKAGES);
		addEEnumLiteral(permissionEEnum, Permission.SEND_RESPOND_VIA_MESSAGE);
		addEEnumLiteral(permissionEEnum, Permission.SEND_SMS);
		addEEnumLiteral(permissionEEnum, Permission.SET_ACTIVITY_WATCHER);
		addEEnumLiteral(permissionEEnum, Permission.SET_ALARM);
		addEEnumLiteral(permissionEEnum, Permission.SET_ALWAYS_FINISH);
		addEEnumLiteral(permissionEEnum, Permission.SET_ANIMATION_SCALE);
		addEEnumLiteral(permissionEEnum, Permission.SET_DEBUG_APP);
		addEEnumLiteral(permissionEEnum, Permission.SET_ORIENTATION);
		addEEnumLiteral(permissionEEnum, Permission.SET_POINTER_SPEED);
		addEEnumLiteral(permissionEEnum, Permission.SET_PREFERRED_APPLICATIONS);
		addEEnumLiteral(permissionEEnum, Permission.SET_PROCESS_LIMIT);
		addEEnumLiteral(permissionEEnum, Permission.SET_TIME);
		addEEnumLiteral(permissionEEnum, Permission.SET_TIME_ZONE);
		addEEnumLiteral(permissionEEnum, Permission.SET_WALLPAPER);
		addEEnumLiteral(permissionEEnum, Permission.SET_WALLPAPER_HINTS);
		addEEnumLiteral(permissionEEnum, Permission.SIGNAL_PERSISTENT_PROCESSES);
		addEEnumLiteral(permissionEEnum, Permission.STATUS_BAR);
		addEEnumLiteral(permissionEEnum, Permission.SUBSCRIBED_FEEDS_READ);
		addEEnumLiteral(permissionEEnum, Permission.SUBSCRIBED_FEEDS_WRITE);
		addEEnumLiteral(permissionEEnum, Permission.SYSTEM_ALERT_WINDOW);
		addEEnumLiteral(permissionEEnum, Permission.TRANSMIT_IR);
		addEEnumLiteral(permissionEEnum, Permission.UNINSTALL_SHORTCUT);
		addEEnumLiteral(permissionEEnum, Permission.UPDATE_DEVICE_STATS);
		addEEnumLiteral(permissionEEnum, Permission.USE_CREDENTIALS);
		addEEnumLiteral(permissionEEnum, Permission.USE_SIP);
		addEEnumLiteral(permissionEEnum, Permission.VIBRATE);
		addEEnumLiteral(permissionEEnum, Permission.WAKE_LOCK);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_APN_SETTINGS);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_CALENDAR);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_CALL_LOG);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_CONTACTS);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_EXTERNAL_STORAGE);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_GSERVICES);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_HISTORY_BOOKMARKS);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_PROFILE);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_SECURE_SETTINGS);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_SETTINGS);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_SMS);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_SOCIAL_STREAM);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_SYNC_SETTINGS);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_USER_DICTIONARY);
		addEEnumLiteral(permissionEEnum, Permission.WRITE_VOICEMAIL);
	}

} //AndroidPackageImpl
