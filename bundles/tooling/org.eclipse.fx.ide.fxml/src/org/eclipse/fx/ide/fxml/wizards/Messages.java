/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
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
package org.eclipse.fx.ide.fxml.wizards;

import org.eclipse.osgi.util.NLS;

@SuppressWarnings("javadoc")
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.fx.ide.fxml.wizards.messages"; //$NON-NLS-1$

	public static String FXMLWizardPage_0;
	public static String FXMLWizardPage_1;
	public static String FXMLWizardPage_2;
	public static String FXMLWizardPage_3;
	public static String FXMLWizardPage_4;
	public static String FXMLWizardPage_5;
	public static String FXMLWizardPage_6;
	public static String FXMLWizardPage_9;
	public static String FXMLWizardPage_10;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
