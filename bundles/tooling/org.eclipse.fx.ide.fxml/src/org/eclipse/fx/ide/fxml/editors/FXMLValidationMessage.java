/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxml.editors;

import org.eclipse.wst.validation.internal.core.Message;

/**
 * Validation message
 */
@SuppressWarnings("restriction")
public class FXMLValidationMessage extends Message {
	/**
	 * @param severity
	 * @param messageKey
	 * @param aParams
	 */
	public FXMLValidationMessage(int severity, String messageKey, String... aParams) {
		super("org.eclipse.fx.ide.fxml.editors.messages", severity, messageKey, aParams); //$NON-NLS-1$
	}
}