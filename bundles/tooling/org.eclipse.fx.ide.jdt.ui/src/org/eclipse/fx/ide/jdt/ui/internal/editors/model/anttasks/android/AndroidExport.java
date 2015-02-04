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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getAndroidsdk <em>Androidsdk</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getDalviksdk <em>Dalviksdk</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getActivityLabel <em>Activity Label</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getPersmissionList <em>Persmission List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidPackage#getAndroidExport()
 * @model
 * @generated
 */
public interface AndroidExport extends EObject {
	/**
	 * Returns the value of the '<em><b>Androidsdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Androidsdk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Androidsdk</em>' attribute.
	 * @see #setAndroidsdk(String)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidPackage#getAndroidExport_Androidsdk()
	 * @model
	 * @generated
	 */
	String getAndroidsdk();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getAndroidsdk <em>Androidsdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Androidsdk</em>' attribute.
	 * @see #getAndroidsdk()
	 * @generated
	 */
	void setAndroidsdk(String value);

	/**
	 * Returns the value of the '<em><b>Dalviksdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dalviksdk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dalviksdk</em>' attribute.
	 * @see #setDalviksdk(String)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidPackage#getAndroidExport_Dalviksdk()
	 * @model
	 * @generated
	 */
	String getDalviksdk();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getDalviksdk <em>Dalviksdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dalviksdk</em>' attribute.
	 * @see #getDalviksdk()
	 * @generated
	 */
	void setDalviksdk(String value);

	/**
	 * Returns the value of the '<em><b>Activity Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Label</em>' attribute.
	 * @see #setActivityLabel(String)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidPackage#getAndroidExport_ActivityLabel()
	 * @model
	 * @generated
	 */
	String getActivityLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidExport#getActivityLabel <em>Activity Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Label</em>' attribute.
	 * @see #getActivityLabel()
	 * @generated
	 */
	void setActivityLabel(String value);

	/**
	 * Returns the value of the '<em><b>Persmission List</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission}.
	 * The literals are from the enumeration {@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persmission List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persmission List</em>' attribute list.
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.Permission
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.android.AndroidPackage#getAndroidExport_PersmissionList()
	 * @model
	 * @generated
	 */
	EList<Permission> getPersmissionList();

} // AndroidExport
