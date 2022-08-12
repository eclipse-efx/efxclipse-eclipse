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
 * A representation of the model object '<em><b>Integration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.code.editor.ldef.lDef.Integration#getCodeIntegrationList <em>Code Integration List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.code.editor.ldef.lDef.LDefPackage#getIntegration()
 * @model
 * @generated
 */
public interface Integration extends EObject
{
  /**
   * Returns the value of the '<em><b>Code Integration List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.code.editor.ldef.lDef.CodeIntegration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code Integration List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code Integration List</em>' containment reference list.
   * @see org.eclipse.fx.code.editor.ldef.lDef.LDefPackage#getIntegration_CodeIntegrationList()
   * @model containment="true"
   * @generated
   */
  EList<CodeIntegration> getCodeIntegrationList();

} // Integration
