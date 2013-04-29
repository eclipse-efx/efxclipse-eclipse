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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.JVmArg;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Platform;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Property;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PlatformImpl#getRefid <em>Refid</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PlatformImpl#getJavafx <em>Javafx</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PlatformImpl#getJ2se <em>J2se</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PlatformImpl#getJVmArgs <em>JVm Args</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.PlatformImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlatformImpl extends EObjectImpl implements Platform {
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
	 * The default value of the '{@link #getJavafx() <em>Javafx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavafx()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVAFX_EDEFAULT = "2.1";

	/**
	 * The cached value of the '{@link #getJavafx() <em>Javafx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavafx()
	 * @generated
	 * @ordered
	 */
	protected String javafx = JAVAFX_EDEFAULT;

	/**
	 * The default value of the '{@link #getJ2se() <em>J2se</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJ2se()
	 * @generated
	 * @ordered
	 */
	protected static final String J2SE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJ2se() <em>J2se</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJ2se()
	 * @generated
	 * @ordered
	 */
	protected String j2se = J2SE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJVmArgs() <em>JVm Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJVmArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<JVmArg> jVmArgs;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PLATFORM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PLATFORM__REFID, oldRefid, refid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJavafx() {
		return javafx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavafx(String newJavafx) {
		String oldJavafx = javafx;
		javafx = newJavafx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PLATFORM__JAVAFX, oldJavafx, javafx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJ2se() {
		return j2se;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJ2se(String newJ2se) {
		String oldJ2se = j2se;
		j2se = newJ2se;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PLATFORM__J2SE, oldJ2se, j2se));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JVmArg> getJVmArgs() {
		if (jVmArgs == null) {
			jVmArgs = new EObjectContainmentEList<JVmArg>(JVmArg.class, this, ParametersPackage.PLATFORM__JVM_ARGS);
		}
		return jVmArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ParametersPackage.PLATFORM__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.PLATFORM__JVM_ARGS:
				return ((InternalEList<?>)getJVmArgs()).basicRemove(otherEnd, msgs);
			case ParametersPackage.PLATFORM__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.PLATFORM__REFID:
				return getRefid();
			case ParametersPackage.PLATFORM__JAVAFX:
				return getJavafx();
			case ParametersPackage.PLATFORM__J2SE:
				return getJ2se();
			case ParametersPackage.PLATFORM__JVM_ARGS:
				return getJVmArgs();
			case ParametersPackage.PLATFORM__PROPERTIES:
				return getProperties();
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
			case ParametersPackage.PLATFORM__REFID:
				setRefid((String)newValue);
				return;
			case ParametersPackage.PLATFORM__JAVAFX:
				setJavafx((String)newValue);
				return;
			case ParametersPackage.PLATFORM__J2SE:
				setJ2se((String)newValue);
				return;
			case ParametersPackage.PLATFORM__JVM_ARGS:
				getJVmArgs().clear();
				getJVmArgs().addAll((Collection<? extends JVmArg>)newValue);
				return;
			case ParametersPackage.PLATFORM__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case ParametersPackage.PLATFORM__REFID:
				setRefid(REFID_EDEFAULT);
				return;
			case ParametersPackage.PLATFORM__JAVAFX:
				setJavafx(JAVAFX_EDEFAULT);
				return;
			case ParametersPackage.PLATFORM__J2SE:
				setJ2se(J2SE_EDEFAULT);
				return;
			case ParametersPackage.PLATFORM__JVM_ARGS:
				getJVmArgs().clear();
				return;
			case ParametersPackage.PLATFORM__PROPERTIES:
				getProperties().clear();
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
			case ParametersPackage.PLATFORM__REFID:
				return REFID_EDEFAULT == null ? refid != null : !REFID_EDEFAULT.equals(refid);
			case ParametersPackage.PLATFORM__JAVAFX:
				return JAVAFX_EDEFAULT == null ? javafx != null : !JAVAFX_EDEFAULT.equals(javafx);
			case ParametersPackage.PLATFORM__J2SE:
				return J2SE_EDEFAULT == null ? j2se != null : !J2SE_EDEFAULT.equals(j2se);
			case ParametersPackage.PLATFORM__JVM_ARGS:
				return jVmArgs != null && !jVmArgs.isEmpty();
			case ParametersPackage.PLATFORM__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (refid: ");
		result.append(refid);
		result.append(", javafx: ");
		result.append(javafx);
		result.append(", j2se: ");
		result.append(j2se);
		result.append(')');
		return result.toString();
	}

} //PlatformImpl
