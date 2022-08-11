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

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.fx.ide.rrobot.model.task.Resource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.fx.ide.rrobot.model.task.TaskPackage#getFile()
 * @model abstract="true"
 * @generated
 */
public interface File extends Resource {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.fx.ide.rrobot.model.task.InputStream" exceptions="org.eclipse.fx.ide.rrobot.model.task.IOException" progressMonitorDataType="org.eclipse.fx.ide.rrobot.model.task.IProgressMonitor"
	 * @generated
	 */
	InputStream getContent(IProgressMonitor progressMonitor, Map<String, Object> data) throws IOException;
} // File
