/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
