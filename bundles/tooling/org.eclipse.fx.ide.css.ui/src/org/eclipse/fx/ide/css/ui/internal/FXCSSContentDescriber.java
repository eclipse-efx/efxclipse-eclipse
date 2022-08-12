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
package org.eclipse.fx.ide.css.ui.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.ITextContentDescriber;

public class FXCSSContentDescriber implements ITextContentDescriber {

	@Override
	public int describe(InputStream contents, IContentDescription description) throws IOException {
		return describe(new InputStreamReader(contents),description);

	}

	@Override
	public QualifiedName[] getSupportedOptions() {
		return new QualifiedName[0];
	}


	@Override
	public int describe(Reader contents, IContentDescription description) throws IOException {
		BufferedReader reader = new BufferedReader(contents);

		String l = reader.readLine();
		if( l == null ) {
			return INVALID;
		}

		if( l.contains("JavaFX CSS") ) { //$NON-NLS-1$
			return VALID;
		}

		int i = 1;
		while( i++ < 20 ) {
			String line = reader.readLine();
			if( line == null ) {
				return INVALID;
			}

			if( line.trim().startsWith("-fx") ) { //$NON-NLS-1$
				return VALID;
			}
		}

		return INVALID;
	}


}
