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
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSet;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.FileSetType;
import org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.FileSetImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.FileSetImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.FileSetImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.FileSetImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.FileSetImpl#getRequiredfor <em>Requiredfor</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.impl.FileSetImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSetImpl extends EObjectImpl implements FileSet {
	/**
	 * The default value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected String arch = ARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludes() <em>Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected String excludes = EXCLUDES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludes() <em>Includes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected String includes = INCLUDES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredfor() <em>Requiredfor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredfor()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIREDFOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredfor() <em>Requiredfor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredfor()
	 * @generated
	 * @ordered
	 */
	protected String requiredfor = REQUIREDFOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FileSetType TYPE_EDEFAULT = FileSetType.AUTO;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FileSetType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.FILE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArch() {
		return arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArch(String newArch) {
		String oldArch = arch;
		arch = newArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.FILE_SET__ARCH, oldArch, arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExcludes() {
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludes(String newExcludes) {
		String oldExcludes = excludes;
		excludes = newExcludes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.FILE_SET__EXCLUDES, oldExcludes, excludes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludes() {
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludes(String newIncludes) {
		String oldIncludes = includes;
		includes = newIncludes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.FILE_SET__INCLUDES, oldIncludes, includes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.FILE_SET__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredfor() {
		return requiredfor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredfor(String newRequiredfor) {
		String oldRequiredfor = requiredfor;
		requiredfor = newRequiredfor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.FILE_SET__REQUIREDFOR, oldRequiredfor, requiredfor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FileSetType newType) {
		FileSetType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.FILE_SET__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.FILE_SET__ARCH:
				return getArch();
			case ParametersPackage.FILE_SET__EXCLUDES:
				return getExcludes();
			case ParametersPackage.FILE_SET__INCLUDES:
				return getIncludes();
			case ParametersPackage.FILE_SET__OS:
				return getOs();
			case ParametersPackage.FILE_SET__REQUIREDFOR:
				return getRequiredfor();
			case ParametersPackage.FILE_SET__TYPE:
				return getType();
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
			case ParametersPackage.FILE_SET__ARCH:
				setArch((String)newValue);
				return;
			case ParametersPackage.FILE_SET__EXCLUDES:
				setExcludes((String)newValue);
				return;
			case ParametersPackage.FILE_SET__INCLUDES:
				setIncludes((String)newValue);
				return;
			case ParametersPackage.FILE_SET__OS:
				setOs((String)newValue);
				return;
			case ParametersPackage.FILE_SET__REQUIREDFOR:
				setRequiredfor((String)newValue);
				return;
			case ParametersPackage.FILE_SET__TYPE:
				setType((FileSetType)newValue);
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
			case ParametersPackage.FILE_SET__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case ParametersPackage.FILE_SET__EXCLUDES:
				setExcludes(EXCLUDES_EDEFAULT);
				return;
			case ParametersPackage.FILE_SET__INCLUDES:
				setIncludes(INCLUDES_EDEFAULT);
				return;
			case ParametersPackage.FILE_SET__OS:
				setOs(OS_EDEFAULT);
				return;
			case ParametersPackage.FILE_SET__REQUIREDFOR:
				setRequiredfor(REQUIREDFOR_EDEFAULT);
				return;
			case ParametersPackage.FILE_SET__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ParametersPackage.FILE_SET__ARCH:
				return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
			case ParametersPackage.FILE_SET__EXCLUDES:
				return EXCLUDES_EDEFAULT == null ? excludes != null : !EXCLUDES_EDEFAULT.equals(excludes);
			case ParametersPackage.FILE_SET__INCLUDES:
				return INCLUDES_EDEFAULT == null ? includes != null : !INCLUDES_EDEFAULT.equals(includes);
			case ParametersPackage.FILE_SET__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case ParametersPackage.FILE_SET__REQUIREDFOR:
				return REQUIREDFOR_EDEFAULT == null ? requiredfor != null : !REQUIREDFOR_EDEFAULT.equals(requiredfor);
			case ParametersPackage.FILE_SET__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (arch: ");
		result.append(arch);
		result.append(", excludes: ");
		result.append(excludes);
		result.append(", includes: ");
		result.append(includes);
		result.append(", os: ");
		result.append(os);
		result.append(", requiredfor: ");
		result.append(requiredfor);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //FileSetImpl
