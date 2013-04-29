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
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Application;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Argument;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.HtmlParam;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.Param;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getFallbackclass <em>Fallbackclass</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getMainclass <em>Mainclass</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getPreloaderclass <em>Preloaderclass</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getRefid <em>Refid</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getToolkit <em>Toolkit</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getHtmlParams <em>Html Params</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.ApplicationImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFallbackclass() <em>Fallbackclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallbackclass()
	 * @generated
	 * @ordered
	 */
	protected static final String FALLBACKCLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFallbackclass() <em>Fallbackclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallbackclass()
	 * @generated
	 * @ordered
	 */
	protected String fallbackclass = FALLBACKCLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainclass() <em>Mainclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainclass()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINCLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainclass() <em>Mainclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainclass()
	 * @generated
	 * @ordered
	 */
	protected String mainclass = MAINCLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreloaderclass() <em>Preloaderclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreloaderclass()
	 * @generated
	 * @ordered
	 */
	protected static final String PRELOADERCLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreloaderclass() <em>Preloaderclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreloaderclass()
	 * @generated
	 * @ordered
	 */
	protected String preloaderclass = PRELOADERCLASS_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getToolkit() <em>Toolkit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolkit()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLKIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToolkit() <em>Toolkit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolkit()
	 * @generated
	 * @ordered
	 */
	protected String toolkit = TOOLKIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The cached value of the '{@link #getHtmlParams() <em>Html Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtmlParams()
	 * @generated
	 * @ordered
	 */
	protected EList<HtmlParam> htmlParams;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Param> params;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFallbackclass() {
		return fallbackclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFallbackclass(String newFallbackclass) {
		String oldFallbackclass = fallbackclass;
		fallbackclass = newFallbackclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.APPLICATION__FALLBACKCLASS, oldFallbackclass, fallbackclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.APPLICATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainclass() {
		return mainclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainclass(String newMainclass) {
		String oldMainclass = mainclass;
		mainclass = newMainclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.APPLICATION__MAINCLASS, oldMainclass, mainclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreloaderclass() {
		return preloaderclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreloaderclass(String newPreloaderclass) {
		String oldPreloaderclass = preloaderclass;
		preloaderclass = newPreloaderclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.APPLICATION__PRELOADERCLASS, oldPreloaderclass, preloaderclass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.APPLICATION__REFID, oldRefid, refid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.APPLICATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToolkit() {
		return toolkit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolkit(String newToolkit) {
		String oldToolkit = toolkit;
		toolkit = newToolkit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.APPLICATION__TOOLKIT, oldToolkit, toolkit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, ParametersPackage.APPLICATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HtmlParam> getHtmlParams() {
		if (htmlParams == null) {
			htmlParams = new EObjectContainmentEList<HtmlParam>(HtmlParam.class, this, ParametersPackage.APPLICATION__HTML_PARAMS);
		}
		return htmlParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Param> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Param>(Param.class, this, ParametersPackage.APPLICATION__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.APPLICATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case ParametersPackage.APPLICATION__HTML_PARAMS:
				return ((InternalEList<?>)getHtmlParams()).basicRemove(otherEnd, msgs);
			case ParametersPackage.APPLICATION__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
			case ParametersPackage.APPLICATION__NAME:
				return getName();
			case ParametersPackage.APPLICATION__FALLBACKCLASS:
				return getFallbackclass();
			case ParametersPackage.APPLICATION__ID:
				return getId();
			case ParametersPackage.APPLICATION__MAINCLASS:
				return getMainclass();
			case ParametersPackage.APPLICATION__PRELOADERCLASS:
				return getPreloaderclass();
			case ParametersPackage.APPLICATION__REFID:
				return getRefid();
			case ParametersPackage.APPLICATION__VERSION:
				return getVersion();
			case ParametersPackage.APPLICATION__TOOLKIT:
				return getToolkit();
			case ParametersPackage.APPLICATION__ARGUMENTS:
				return getArguments();
			case ParametersPackage.APPLICATION__HTML_PARAMS:
				return getHtmlParams();
			case ParametersPackage.APPLICATION__PARAMS:
				return getParams();
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
			case ParametersPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case ParametersPackage.APPLICATION__FALLBACKCLASS:
				setFallbackclass((String)newValue);
				return;
			case ParametersPackage.APPLICATION__ID:
				setId((String)newValue);
				return;
			case ParametersPackage.APPLICATION__MAINCLASS:
				setMainclass((String)newValue);
				return;
			case ParametersPackage.APPLICATION__PRELOADERCLASS:
				setPreloaderclass((String)newValue);
				return;
			case ParametersPackage.APPLICATION__REFID:
				setRefid((String)newValue);
				return;
			case ParametersPackage.APPLICATION__VERSION:
				setVersion((String)newValue);
				return;
			case ParametersPackage.APPLICATION__TOOLKIT:
				setToolkit((String)newValue);
				return;
			case ParametersPackage.APPLICATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case ParametersPackage.APPLICATION__HTML_PARAMS:
				getHtmlParams().clear();
				getHtmlParams().addAll((Collection<? extends HtmlParam>)newValue);
				return;
			case ParametersPackage.APPLICATION__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Param>)newValue);
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
			case ParametersPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ParametersPackage.APPLICATION__FALLBACKCLASS:
				setFallbackclass(FALLBACKCLASS_EDEFAULT);
				return;
			case ParametersPackage.APPLICATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ParametersPackage.APPLICATION__MAINCLASS:
				setMainclass(MAINCLASS_EDEFAULT);
				return;
			case ParametersPackage.APPLICATION__PRELOADERCLASS:
				setPreloaderclass(PRELOADERCLASS_EDEFAULT);
				return;
			case ParametersPackage.APPLICATION__REFID:
				setRefid(REFID_EDEFAULT);
				return;
			case ParametersPackage.APPLICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ParametersPackage.APPLICATION__TOOLKIT:
				setToolkit(TOOLKIT_EDEFAULT);
				return;
			case ParametersPackage.APPLICATION__ARGUMENTS:
				getArguments().clear();
				return;
			case ParametersPackage.APPLICATION__HTML_PARAMS:
				getHtmlParams().clear();
				return;
			case ParametersPackage.APPLICATION__PARAMS:
				getParams().clear();
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
			case ParametersPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ParametersPackage.APPLICATION__FALLBACKCLASS:
				return FALLBACKCLASS_EDEFAULT == null ? fallbackclass != null : !FALLBACKCLASS_EDEFAULT.equals(fallbackclass);
			case ParametersPackage.APPLICATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ParametersPackage.APPLICATION__MAINCLASS:
				return MAINCLASS_EDEFAULT == null ? mainclass != null : !MAINCLASS_EDEFAULT.equals(mainclass);
			case ParametersPackage.APPLICATION__PRELOADERCLASS:
				return PRELOADERCLASS_EDEFAULT == null ? preloaderclass != null : !PRELOADERCLASS_EDEFAULT.equals(preloaderclass);
			case ParametersPackage.APPLICATION__REFID:
				return REFID_EDEFAULT == null ? refid != null : !REFID_EDEFAULT.equals(refid);
			case ParametersPackage.APPLICATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ParametersPackage.APPLICATION__TOOLKIT:
				return TOOLKIT_EDEFAULT == null ? toolkit != null : !TOOLKIT_EDEFAULT.equals(toolkit);
			case ParametersPackage.APPLICATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case ParametersPackage.APPLICATION__HTML_PARAMS:
				return htmlParams != null && !htmlParams.isEmpty();
			case ParametersPackage.APPLICATION__PARAMS:
				return params != null && !params.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", fallbackclass: ");
		result.append(fallbackclass);
		result.append(", id: ");
		result.append(id);
		result.append(", mainclass: ");
		result.append(mainclass);
		result.append(", preloaderclass: ");
		result.append(preloaderclass);
		result.append(", refid: ");
		result.append(refid);
		result.append(", version: ");
		result.append(version);
		result.append(", toolkit: ");
		result.append(toolkit);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
