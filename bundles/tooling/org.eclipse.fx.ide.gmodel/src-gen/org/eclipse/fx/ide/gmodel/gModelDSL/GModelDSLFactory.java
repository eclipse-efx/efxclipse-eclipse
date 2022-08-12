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
package org.eclipse.fx.ide.gmodel.gModelDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage
 * @generated
 */
public interface GModelDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GModelDSLFactory eINSTANCE = org.eclipse.fx.ide.gmodel.gModelDSL.impl.GModelDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>GModel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GModel</em>'.
   * @generated
   */
  GModel createGModel();

  /**
   * Returns a new object of class '<em>GDomain Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GDomain Element</em>'.
   * @generated
   */
  GDomainElement createGDomainElement();

  /**
   * Returns a new object of class '<em>GDomain Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GDomain Map</em>'.
   * @generated
   */
  GDomainMap createGDomainMap();

  /**
   * Returns a new object of class '<em>GDomain Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GDomain Property</em>'.
   * @generated
   */
  GDomainProperty createGDomainProperty();

  /**
   * Returns a new object of class '<em>GDefault</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GDefault</em>'.
   * @generated
   */
  GDefault createGDefault();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GModelDSLPackage getGModelDSLPackage();

} //GModelDSLFactory
