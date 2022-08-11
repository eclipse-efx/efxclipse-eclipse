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

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JDT Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.JDTProject#getSourceFragments <em>Source Fragments</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.task.JDTProject#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getJDTProject()
 * @model
 * @generated
 */
public interface JDTProject extends Project {
	/**
	 * Returns the value of the '<em><b>Source Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.task.SourceFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Fragments</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getJDTProject_SourceFragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceFragment> getSourceFragments();

	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.task.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getJDTProject_CompilationUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompilationUnit> getCompilationUnits();

} // JDTProject
