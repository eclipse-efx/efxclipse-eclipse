/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.fx.code.editor.ldef.lDef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.code.editor.ldef.lDef.Token#isDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.fx.code.editor.ldef.lDef.Token#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.code.editor.ldef.lDef.Token#getScannerList <em>Scanner List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.code.editor.ldef.lDef.LDefPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject
{
  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(boolean)
   * @see org.eclipse.fx.code.editor.ldef.lDef.LDefPackage#getToken_Default()
   * @model
   * @generated
   */
  boolean isDefault();

  /**
   * Sets the value of the '{@link org.eclipse.fx.code.editor.ldef.lDef.Token#isDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #isDefault()
   * @generated
   */
  void setDefault(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.fx.code.editor.ldef.lDef.LDefPackage#getToken_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.code.editor.ldef.lDef.Token#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Scanner List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.code.editor.ldef.lDef.Scanner}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scanner List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scanner List</em>' containment reference list.
   * @see org.eclipse.fx.code.editor.ldef.lDef.LDefPackage#getToken_ScannerList()
   * @model containment="true"
   * @generated
   */
  EList<Scanner> getScannerList();

} // Token
