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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.SignJar;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sign Jar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getKeypass <em>Keypass</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getKeystore <em>Keystore</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getStorepass <em>Storepass</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.SignJarImpl#getStoretype <em>Storetype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignJarImpl extends EObjectImpl implements SignJar {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeypass() <em>Keypass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypass()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYPASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeypass() <em>Keypass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeypass()
	 * @generated
	 * @ordered
	 */
	protected String keypass = KEYPASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeystore() <em>Keystore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystore()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYSTORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeystore() <em>Keystore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystore()
	 * @generated
	 * @ordered
	 */
	protected String keystore = KEYSTORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorepass() <em>Storepass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorepass()
	 * @generated
	 * @ordered
	 */
	protected static final String STOREPASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorepass() <em>Storepass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorepass()
	 * @generated
	 * @ordered
	 */
	protected String storepass = STOREPASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoretype() <em>Storetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoretype()
	 * @generated
	 * @ordered
	 */
	protected static final String STORETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoretype() <em>Storetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoretype()
	 * @generated
	 * @ordered
	 */
	protected String storetype = STORETYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignJarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AntTasksPackage.Literals.SIGN_JAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeypass() {
		return keypass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeypass(String newKeypass) {
		String oldKeypass = keypass;
		keypass = newKeypass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__KEYPASS, oldKeypass, keypass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeystore() {
		return keystore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeystore(String newKeystore) {
		String oldKeystore = keystore;
		keystore = newKeystore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__KEYSTORE, oldKeystore, keystore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStorepass() {
		return storepass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorepass(String newStorepass) {
		String oldStorepass = storepass;
		storepass = newStorepass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__STOREPASS, oldStorepass, storepass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoretype() {
		return storetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoretype(String newStoretype) {
		String oldStoretype = storetype;
		storetype = newStoretype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AntTasksPackage.SIGN_JAR__STORETYPE, oldStoretype, storetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AntTasksPackage.SIGN_JAR__ALIAS:
				return getAlias();
			case AntTasksPackage.SIGN_JAR__KEYPASS:
				return getKeypass();
			case AntTasksPackage.SIGN_JAR__KEYSTORE:
				return getKeystore();
			case AntTasksPackage.SIGN_JAR__STOREPASS:
				return getStorepass();
			case AntTasksPackage.SIGN_JAR__STORETYPE:
				return getStoretype();
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
			case AntTasksPackage.SIGN_JAR__ALIAS:
				setAlias((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__KEYPASS:
				setKeypass((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__KEYSTORE:
				setKeystore((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__STOREPASS:
				setStorepass((String)newValue);
				return;
			case AntTasksPackage.SIGN_JAR__STORETYPE:
				setStoretype((String)newValue);
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
			case AntTasksPackage.SIGN_JAR__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__KEYPASS:
				setKeypass(KEYPASS_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__KEYSTORE:
				setKeystore(KEYSTORE_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__STOREPASS:
				setStorepass(STOREPASS_EDEFAULT);
				return;
			case AntTasksPackage.SIGN_JAR__STORETYPE:
				setStoretype(STORETYPE_EDEFAULT);
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
			case AntTasksPackage.SIGN_JAR__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case AntTasksPackage.SIGN_JAR__KEYPASS:
				return KEYPASS_EDEFAULT == null ? keypass != null : !KEYPASS_EDEFAULT.equals(keypass);
			case AntTasksPackage.SIGN_JAR__KEYSTORE:
				return KEYSTORE_EDEFAULT == null ? keystore != null : !KEYSTORE_EDEFAULT.equals(keystore);
			case AntTasksPackage.SIGN_JAR__STOREPASS:
				return STOREPASS_EDEFAULT == null ? storepass != null : !STOREPASS_EDEFAULT.equals(storepass);
			case AntTasksPackage.SIGN_JAR__STORETYPE:
				return STORETYPE_EDEFAULT == null ? storetype != null : !STORETYPE_EDEFAULT.equals(storetype);
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
		result.append(" (alias: ");
		result.append(alias);
		result.append(", keypass: ");
		result.append(keypass);
		result.append(", keystore: ");
		result.append(keystore);
		result.append(", storepass: ");
		result.append(storepass);
		result.append(", storetype: ");
		result.append(storetype);
		result.append(')');
		return result.toString();
	}

} //SignJarImpl
