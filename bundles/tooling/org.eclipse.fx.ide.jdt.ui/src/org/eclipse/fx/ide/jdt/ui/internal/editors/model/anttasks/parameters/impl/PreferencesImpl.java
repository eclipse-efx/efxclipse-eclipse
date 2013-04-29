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
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Preferences;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PreferencesImpl#isInstall <em>Install</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PreferencesImpl#isMenu <em>Menu</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PreferencesImpl#getRefid <em>Refid</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PreferencesImpl#isShortcut <em>Shortcut</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreferencesImpl extends EObjectImpl implements Preferences {
	/**
	 * The default value of the '{@link #isInstall() <em>Install</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstall() <em>Install</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstall()
	 * @generated
	 * @ordered
	 */
	protected boolean install = INSTALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isMenu() <em>Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMenu()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MENU_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMenu() <em>Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMenu()
	 * @generated
	 * @ordered
	 */
	protected boolean menu = MENU_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefid() <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefid()
	 * @generated
	 * @ordered
	 */
	protected static final String REFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefid() <em>Refid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefid()
	 * @generated
	 * @ordered
	 */
	protected String refid = REFID_EDEFAULT;

	/**
	 * The default value of the '{@link #isShortcut() <em>Shortcut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShortcut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHORTCUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShortcut() <em>Shortcut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShortcut()
	 * @generated
	 * @ordered
	 */
	protected boolean shortcut = SHORTCUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstall() {
		return install;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstall(boolean newInstall) {
		boolean oldInstall = install;
		install = newInstall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PREFERENCES__INSTALL, oldInstall, install));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(boolean newMenu) {
		boolean oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PREFERENCES__MENU, oldMenu, menu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefid() {
		return refid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefid(String newRefid) {
		String oldRefid = refid;
		refid = newRefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PREFERENCES__REFID, oldRefid, refid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShortcut() {
		return shortcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortcut(boolean newShortcut) {
		boolean oldShortcut = shortcut;
		shortcut = newShortcut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PREFERENCES__SHORTCUT, oldShortcut, shortcut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.PREFERENCES__INSTALL:
				return isInstall();
			case ParametersPackage.PREFERENCES__MENU:
				return isMenu();
			case ParametersPackage.PREFERENCES__REFID:
				return getRefid();
			case ParametersPackage.PREFERENCES__SHORTCUT:
				return isShortcut();
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
			case ParametersPackage.PREFERENCES__INSTALL:
				setInstall((Boolean)newValue);
				return;
			case ParametersPackage.PREFERENCES__MENU:
				setMenu((Boolean)newValue);
				return;
			case ParametersPackage.PREFERENCES__REFID:
				setRefid((String)newValue);
				return;
			case ParametersPackage.PREFERENCES__SHORTCUT:
				setShortcut((Boolean)newValue);
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
			case ParametersPackage.PREFERENCES__INSTALL:
				setInstall(INSTALL_EDEFAULT);
				return;
			case ParametersPackage.PREFERENCES__MENU:
				setMenu(MENU_EDEFAULT);
				return;
			case ParametersPackage.PREFERENCES__REFID:
				setRefid(REFID_EDEFAULT);
				return;
			case ParametersPackage.PREFERENCES__SHORTCUT:
				setShortcut(SHORTCUT_EDEFAULT);
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
			case ParametersPackage.PREFERENCES__INSTALL:
				return install != INSTALL_EDEFAULT;
			case ParametersPackage.PREFERENCES__MENU:
				return menu != MENU_EDEFAULT;
			case ParametersPackage.PREFERENCES__REFID:
				return REFID_EDEFAULT == null ? refid != null : !REFID_EDEFAULT.equals(refid);
			case ParametersPackage.PREFERENCES__SHORTCUT:
				return shortcut != SHORTCUT_EDEFAULT;
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
		result.append(" (install: ");
		result.append(install);
		result.append(", menu: ");
		result.append(menu);
		result.append(", refid: ");
		result.append(refid);
		result.append(", shortcut: ");
		result.append(shortcut);
		result.append(')');
		return result.toString();
	}

} //PreferencesImpl
