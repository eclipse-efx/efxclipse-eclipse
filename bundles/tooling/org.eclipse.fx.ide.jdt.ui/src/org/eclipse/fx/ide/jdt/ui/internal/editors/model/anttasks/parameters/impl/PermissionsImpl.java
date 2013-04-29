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
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Permissions;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PermissionsImpl#isCachecertificates <em>Cachecertificates</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PermissionsImpl#isElevated <em>Elevated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PermissionsImpl extends EObjectImpl implements Permissions {
	/**
	 * The default value of the '{@link #isCachecertificates() <em>Cachecertificates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCachecertificates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHECERTIFICATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCachecertificates() <em>Cachecertificates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCachecertificates()
	 * @generated
	 * @ordered
	 */
	protected boolean cachecertificates = CACHECERTIFICATES_EDEFAULT;

	/**
	 * The default value of the '{@link #isElevated() <em>Elevated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElevated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELEVATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElevated() <em>Elevated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElevated()
	 * @generated
	 * @ordered
	 */
	protected boolean elevated = ELEVATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PERMISSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCachecertificates() {
		return cachecertificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCachecertificates(boolean newCachecertificates) {
		boolean oldCachecertificates = cachecertificates;
		cachecertificates = newCachecertificates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PERMISSIONS__CACHECERTIFICATES, oldCachecertificates, cachecertificates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isElevated() {
		return elevated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevated(boolean newElevated) {
		boolean oldElevated = elevated;
		elevated = newElevated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PERMISSIONS__ELEVATED, oldElevated, elevated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.PERMISSIONS__CACHECERTIFICATES:
				return isCachecertificates();
			case ParametersPackage.PERMISSIONS__ELEVATED:
				return isElevated();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParametersPackage.PERMISSIONS__CACHECERTIFICATES:
				setCachecertificates((Boolean)newValue);
				return;
			case ParametersPackage.PERMISSIONS__ELEVATED:
				setElevated((Boolean)newValue);
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
			case ParametersPackage.PERMISSIONS__CACHECERTIFICATES:
				setCachecertificates(CACHECERTIFICATES_EDEFAULT);
				return;
			case ParametersPackage.PERMISSIONS__ELEVATED:
				setElevated(ELEVATED_EDEFAULT);
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
			case ParametersPackage.PERMISSIONS__CACHECERTIFICATES:
				return cachecertificates != CACHECERTIFICATES_EDEFAULT;
			case ParametersPackage.PERMISSIONS__ELEVATED:
				return elevated != ELEVATED_EDEFAULT;
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
		result.append(" (cachecertificates: ");
		result.append(cachecertificates);
		result.append(", elevated: ");
		result.append(elevated);
		result.append(')');
		return result.toString();
	}

} //PermissionsImpl
