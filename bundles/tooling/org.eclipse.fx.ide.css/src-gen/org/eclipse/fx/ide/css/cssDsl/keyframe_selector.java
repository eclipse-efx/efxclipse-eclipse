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
package org.eclipse.fx.ide.css.cssDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>keyframe selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.keyframe_selector#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.keyframe_selector#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.keyframe_selector#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getkeyframe_selector()
 * @model
 * @generated
 */
public interface keyframe_selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getkeyframe_selector_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.keyframe_selector#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Percentage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Percentage</em>' attribute.
   * @see #setPercentage(double)
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getkeyframe_selector_Percentage()
   * @model
   * @generated
   */
  double getPercentage();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.keyframe_selector#getPercentage <em>Percentage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Percentage</em>' attribute.
   * @see #getPercentage()
   * @generated
   */
  void setPercentage(double value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssDsl.css_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getkeyframe_selector_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<css_declaration> getDeclarations();

} // keyframe_selector
