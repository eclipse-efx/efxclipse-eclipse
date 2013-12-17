/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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