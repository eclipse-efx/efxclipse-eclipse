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
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.fx.ide.rrobot.model.task.Resource;
import org.eclipse.fx.ide.rrobot.model.task.TemplatedFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.BuildProperties#getBinIncludes <em>Bin Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getBuildProperties()
 * @model
 * @generated
 */
public interface BuildProperties extends TemplatedFile {

	/**
	 * Returns the value of the '<em><b>Bin Includes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.task.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin Includes</em>' reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getBuildProperties_BinIncludes()
	 * @model
	 * @generated
	 */
	EList<Resource> getBinIncludes();
} // BuildProperties
