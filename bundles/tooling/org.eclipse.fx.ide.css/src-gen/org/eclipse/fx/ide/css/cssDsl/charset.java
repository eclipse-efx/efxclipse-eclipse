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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>charset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.charset#getCharset <em>Charset</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getcharset()
 * @model
 * @generated
 */
public interface charset extends EObject
{
  /**
   * Returns the value of the '<em><b>Charset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Charset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Charset</em>' attribute.
   * @see #setCharset(String)
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getcharset_Charset()
   * @model
   * @generated
   */
  String getCharset();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.charset#getCharset <em>Charset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Charset</em>' attribute.
   * @see #getCharset()
   * @generated
   */
  void setCharset(String value);

} // charset
