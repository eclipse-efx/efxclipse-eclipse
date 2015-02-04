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
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidFactory
 * @model kind="package"
 * @generated
 */
public interface AndroidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "android";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.fx.ide.jdt/1.0/android";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "android";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndroidPackage eINSTANCE = org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidExportImpl <em>Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidExportImpl
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidPackageImpl#getAndroidExport()
	 * @generated
	 */
	int ANDROID_EXPORT = 0;

	/**
	 * The feature id for the '<em><b>Androidsdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_EXPORT__ANDROIDSDK = 0;

	/**
	 * The feature id for the '<em><b>Dalviksdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_EXPORT__DALVIKSDK = 1;

	/**
	 * The feature id for the '<em><b>Activity Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_EXPORT__ACTIVITY_LABEL = 2;

	/**
	 * The feature id for the '<em><b>Persmission List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_EXPORT__PERSMISSION_LIST = 3;

	/**
	 * The number of structural features of the '<em>Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANDROID_EXPORT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission <em>Permission</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport
	 * @generated
	 */
	EClass getAndroidExport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getAndroidsdk <em>Androidsdk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Androidsdk</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getAndroidsdk()
	 * @see #getAndroidExport()
	 * @generated
	 */
	EAttribute getAndroidExport_Androidsdk();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getDalviksdk <em>Dalviksdk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dalviksdk</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getDalviksdk()
	 * @see #getAndroidExport()
	 * @generated
	 */
	EAttribute getAndroidExport_Dalviksdk();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getActivityLabel <em>Activity Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Label</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getActivityLabel()
	 * @see #getAndroidExport()
	 * @generated
	 */
	EAttribute getAndroidExport_ActivityLabel();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getPersmissionList <em>Persmission List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Persmission List</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getPersmissionList()
	 * @see #getAndroidExport()
	 * @generated
	 */
	EAttribute getAndroidExport_PersmissionList();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission</em>'.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission
	 * @generated
	 */
	EEnum getPermission();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AndroidFactory getAndroidFactory();

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
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidExportImpl <em>Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidExportImpl
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidPackageImpl#getAndroidExport()
		 * @generated
		 */
		EClass ANDROID_EXPORT = eINSTANCE.getAndroidExport();

		/**
		 * The meta object literal for the '<em><b>Androidsdk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDROID_EXPORT__ANDROIDSDK = eINSTANCE.getAndroidExport_Androidsdk();

		/**
		 * The meta object literal for the '<em><b>Dalviksdk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDROID_EXPORT__DALVIKSDK = eINSTANCE.getAndroidExport_Dalviksdk();

		/**
		 * The meta object literal for the '<em><b>Activity Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDROID_EXPORT__ACTIVITY_LABEL = eINSTANCE.getAndroidExport_ActivityLabel();

		/**
		 * The meta object literal for the '<em><b>Persmission List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANDROID_EXPORT__PERSMISSION_LIST = eINSTANCE.getAndroidExport_PersmissionList();

		/**
		 * The meta object literal for the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission <em>Permission</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission
		 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidPackageImpl#getPermission()
		 * @generated
		 */
		EEnum PERMISSION = eINSTANCE.getPermission();

	}

} //AndroidPackage
