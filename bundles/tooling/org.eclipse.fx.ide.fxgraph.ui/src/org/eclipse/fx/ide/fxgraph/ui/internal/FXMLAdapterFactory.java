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
package org.eclipse.fx.ide.fxgraph.ui.internal;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.xtext.ui.editor.XtextEditor;

import org.eclipse.fx.ide.ui.editor.IFXMLProviderAdapter;
import org.eclipse.fx.ide.ui.editor.IFXPreviewAdapter;

public class FXMLAdapterFactory implements IAdapterFactory {

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if((adapterType == IFXMLProviderAdapter.class || adapterType == IFXPreviewAdapter.class) && adaptableObject instanceof XtextEditor ) {
			XtextEditor editor = (XtextEditor) adaptableObject;
			if( "org.eclipse.fx.ide.fxgraph.FXGraph".equals(editor.getLanguageName()) ) {
				return new FXMLProviderAdapter(editor);
			}
		}
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[]{IFXMLProviderAdapter.class, IFXPreviewAdapter.class};
	}

}
