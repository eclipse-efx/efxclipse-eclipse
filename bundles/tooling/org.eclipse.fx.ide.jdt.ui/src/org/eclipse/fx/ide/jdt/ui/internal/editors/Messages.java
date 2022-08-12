/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
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
package org.eclipse.fx.ide.jdt.ui.internal.editors;

import org.eclipse.osgi.util.NLS;

/**
 * @author tomschindl
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.fx.ide.jdt.ui.internal.editors.messages"; //$NON-NLS-1$
	public static String JFXBuildConfigurationEditor_FileConflict;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
