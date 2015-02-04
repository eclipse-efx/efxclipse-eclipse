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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidExportImpl#getAndroidsdk <em>Androidsdk</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidExportImpl#getDalviksdk <em>Dalviksdk</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidExportImpl#getActivityLabel <em>Activity Label</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.impl.AndroidExportImpl#getPersmissionList <em>Persmission List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndroidExportImpl extends EObjectImpl implements AndroidExport {
	/**
	 * The default value of the '{@link #getAndroidsdk() <em>Androidsdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndroidsdk()
	 * @generated
	 * @ordered
	 */
	protected static final String ANDROIDSDK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAndroidsdk() <em>Androidsdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndroidsdk()
	 * @generated
	 * @ordered
	 */
	protected String androidsdk = ANDROIDSDK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDalviksdk() <em>Dalviksdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDalviksdk()
	 * @generated
	 * @ordered
	 */
	protected static final String DALVIKSDK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDalviksdk() <em>Dalviksdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDalviksdk()
	 * @generated
	 * @ordered
	 */
	protected String dalviksdk = DALVIKSDK_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivityLabel() <em>Activity Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityLabel() <em>Activity Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityLabel()
	 * @generated
	 * @ordered
	 */
	protected String activityLabel = ACTIVITY_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersmissionList() <em>Persmission List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersmissionList()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> persmissionList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndroidExportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidPackage.Literals.ANDROID_EXPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAndroidsdk() {
		return androidsdk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAndroidsdk(String newAndroidsdk) {
		String oldAndroidsdk = androidsdk;
		androidsdk = newAndroidsdk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ANDROID_EXPORT__ANDROIDSDK, oldAndroidsdk, androidsdk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDalviksdk() {
		return dalviksdk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDalviksdk(String newDalviksdk) {
		String oldDalviksdk = dalviksdk;
		dalviksdk = newDalviksdk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ANDROID_EXPORT__DALVIKSDK, oldDalviksdk, dalviksdk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityLabel() {
		return activityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityLabel(String newActivityLabel) {
		String oldActivityLabel = activityLabel;
		activityLabel = newActivityLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidPackage.ANDROID_EXPORT__ACTIVITY_LABEL, oldActivityLabel, activityLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPersmissionList() {
		if (persmissionList == null) {
			persmissionList = new EDataTypeUniqueEList<Permission>(Permission.class, this, AndroidPackage.ANDROID_EXPORT__PERSMISSION_LIST);
		}
		return persmissionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AndroidPackage.ANDROID_EXPORT__ANDROIDSDK:
				return getAndroidsdk();
			case AndroidPackage.ANDROID_EXPORT__DALVIKSDK:
				return getDalviksdk();
			case AndroidPackage.ANDROID_EXPORT__ACTIVITY_LABEL:
				return getActivityLabel();
			case AndroidPackage.ANDROID_EXPORT__PERSMISSION_LIST:
				return getPersmissionList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AndroidPackage.ANDROID_EXPORT__ANDROIDSDK:
				setAndroidsdk((String)newValue);
				return;
			case AndroidPackage.ANDROID_EXPORT__DALVIKSDK:
				setDalviksdk((String)newValue);
				return;
			case AndroidPackage.ANDROID_EXPORT__ACTIVITY_LABEL:
				setActivityLabel((String)newValue);
				return;
			case AndroidPackage.ANDROID_EXPORT__PERSMISSION_LIST:
				getPersmissionList().clear();
				getPersmissionList().addAll((Collection<? extends Permission>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AndroidPackage.ANDROID_EXPORT__ANDROIDSDK:
				setAndroidsdk(ANDROIDSDK_EDEFAULT);
				return;
			case AndroidPackage.ANDROID_EXPORT__DALVIKSDK:
				setDalviksdk(DALVIKSDK_EDEFAULT);
				return;
			case AndroidPackage.ANDROID_EXPORT__ACTIVITY_LABEL:
				setActivityLabel(ACTIVITY_LABEL_EDEFAULT);
				return;
			case AndroidPackage.ANDROID_EXPORT__PERSMISSION_LIST:
				getPersmissionList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AndroidPackage.ANDROID_EXPORT__ANDROIDSDK:
				return ANDROIDSDK_EDEFAULT == null ? androidsdk != null : !ANDROIDSDK_EDEFAULT.equals(androidsdk);
			case AndroidPackage.ANDROID_EXPORT__DALVIKSDK:
				return DALVIKSDK_EDEFAULT == null ? dalviksdk != null : !DALVIKSDK_EDEFAULT.equals(dalviksdk);
			case AndroidPackage.ANDROID_EXPORT__ACTIVITY_LABEL:
				return ACTIVITY_LABEL_EDEFAULT == null ? activityLabel != null : !ACTIVITY_LABEL_EDEFAULT.equals(activityLabel);
			case AndroidPackage.ANDROID_EXPORT__PERSMISSION_LIST:
				return persmissionList != null && !persmissionList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (androidsdk: ");
		result.append(androidsdk);
		result.append(", dalviksdk: ");
		result.append(dalviksdk);
		result.append(", activityLabel: ");
		result.append(activityLabel);
		result.append(", persmissionList: ");
		result.append(persmissionList);
		result.append(')');
		return result.toString();
	}

} //AndroidExportImpl
