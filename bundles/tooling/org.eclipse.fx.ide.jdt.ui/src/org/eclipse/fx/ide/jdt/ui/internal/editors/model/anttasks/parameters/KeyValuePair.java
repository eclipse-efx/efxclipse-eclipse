/**
 * ******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 * ******************************************************************************
 */
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getKeyValuePair()
 * @model
 * @generated
 */
public interface KeyValuePair extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getKeyValuePair_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.ParametersPackage#getKeyValuePair_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.parameters.KeyValuePair#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // KeyValuePair
