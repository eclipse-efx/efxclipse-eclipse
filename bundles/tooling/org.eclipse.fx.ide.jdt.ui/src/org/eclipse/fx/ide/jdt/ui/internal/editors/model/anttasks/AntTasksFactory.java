/**
 * ******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 * ******************************************************************************
 */
package org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.AntTasksPackage
 * @generated
 */
public interface AntTasksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AntTasksFactory eINSTANCE = org.eclipse.fx.ide.jdt.ui.internal.editors.model.anttasks.impl.AntTasksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ant Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ant Task</em>'.
	 * @generated
	 */
	AntTask createAntTask();

	/**
	 * Returns a new object of class '<em>Deploy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deploy</em>'.
	 * @generated
	 */
	Deploy createDeploy();

	/**
	 * Returns a new object of class '<em>Jar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jar</em>'.
	 * @generated
	 */
	Jar createJar();

	/**
	 * Returns a new object of class '<em>Sign Jar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sign Jar</em>'.
	 * @generated
	 */
	SignJar createSignJar();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AntTasksPackage getAntTasksPackage();

} //AntTasksFactory
