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
package org.eclipse.fx.ide.l10n.nLSDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NLS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.NLS#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.NLS#getBundleList <em>Bundle List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLS()
 * @model
 * @generated
 */
public interface NLS extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(PackageDeclaration)
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLS_Package()
   * @model containment="true"
   * @generated
   */
  PackageDeclaration getPackage();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLS#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(PackageDeclaration value);

  /**
   * Returns the value of the '<em><b>Bundle List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundle List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundle List</em>' containment reference list.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLS_BundleList()
   * @model containment="true"
   * @generated
   */
  EList<NLSBundle> getBundleList();

} // NLS
