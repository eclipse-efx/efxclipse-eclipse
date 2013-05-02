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
package org.eclipse.fx.ide.css.ui.internal;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.fx.ide.ui.editor.IFXPreviewAdapter;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;


public class PreviewAdapterFactory implements IAdapterFactory {

	@Override
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if(adapterType == IFXPreviewAdapter.class && adaptableObject instanceof XtextEditor ) {
			final XtextEditor editor = (XtextEditor) adaptableObject;
			if( "at.bestsolution.efxclipse.tooling.css.CssDsl".equals(editor.getLanguageName()) ) {
				return new IFXPreviewAdapter() {
					
					@Override
					public IEditorPart getEditorPart() {
						return editor;
					}
				};
			}
		}
		return null;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[]{IFXPreviewAdapter.class};
	}

}
