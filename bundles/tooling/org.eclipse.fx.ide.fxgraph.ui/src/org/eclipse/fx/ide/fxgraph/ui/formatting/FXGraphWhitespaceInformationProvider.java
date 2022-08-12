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
package org.eclipse.fx.ide.fxgraph.ui.formatting;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.xtext.ui.editor.formatting.PreferenceStoreWhitespaceInformationProvider;

public class FXGraphWhitespaceInformationProvider extends PreferenceStoreWhitespaceInformationProvider {

	protected String getLineSeparatorPreference(IScopeContext scopeContext) {
		return "\r\n";
//		String lineDelimiter = Platform.getPreferencesService().getString(Platform.PI_RUNTIME,
//				Platform.PREF_LINE_SEPARATOR, null, new IScopeContext[] { scopeContext });
//		return lineDelimiter;
	}

}
