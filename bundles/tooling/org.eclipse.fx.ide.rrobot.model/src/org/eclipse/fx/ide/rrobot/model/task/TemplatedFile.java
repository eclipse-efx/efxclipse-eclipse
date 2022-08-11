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
package org.eclipse.fx.ide.rrobot.model.task;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templated File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.TemplatedFile#getGeneratorType <em>Generator Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getTemplatedFile()
 * @model
 * @generated
 */
public interface TemplatedFile extends File {

	/**
	 * Returns the value of the '<em><b>Generator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Type</em>' attribute.
	 * @see #setGeneratorType(String)
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getTemplatedFile_GeneratorType()
	 * @model
	 * @generated
	 */
	String getGeneratorType();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.task.TemplatedFile#getGeneratorType <em>Generator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Type</em>' attribute.
	 * @see #getGeneratorType()
	 * @generated
	 */
	void setGeneratorType(String value);
} // TemplatedFile
