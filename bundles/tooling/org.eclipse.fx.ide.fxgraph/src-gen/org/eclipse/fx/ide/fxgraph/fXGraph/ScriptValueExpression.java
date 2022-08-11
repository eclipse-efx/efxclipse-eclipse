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
package org.eclipse.fx.ide.fxgraph.fXGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Value Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueExpression#getSourcecode <em>Sourcecode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getScriptValueExpression()
 * @model
 * @generated
 */
public interface ScriptValueExpression extends SingleValueProperty
{
  /**
   * Returns the value of the '<em><b>Sourcecode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sourcecode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sourcecode</em>' attribute.
   * @see #setSourcecode(String)
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage#getScriptValueExpression_Sourcecode()
   * @model
   * @generated
   */
  String getSourcecode();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueExpression#getSourcecode <em>Sourcecode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sourcecode</em>' attribute.
   * @see #getSourcecode()
   * @generated
   */
  void setSourcecode(String value);

} // ScriptValueExpression
