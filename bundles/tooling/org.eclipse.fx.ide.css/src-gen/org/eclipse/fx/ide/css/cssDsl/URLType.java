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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.URLType#getMediaList <em>Media List</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.URLType#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getURLType()
 * @model
 * @generated
 */
public interface URLType extends importExpression
{
  /**
   * Returns the value of the '<em><b>Media List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Media List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Media List</em>' attribute.
   * @see #setMediaList(String)
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getURLType_MediaList()
   * @model
   * @generated
   */
  String getMediaList();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.URLType#getMediaList <em>Media List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Media List</em>' attribute.
   * @see #getMediaList()
   * @generated
   */
  void setMediaList(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getURLType_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.URLType#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

} // URLType
