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

@SuppressWarnings("restriction")
public class PreviewAdapterFactory implements IAdapterFactory {

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] { IFXPreviewAdapter.class };
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		if (adapterType == IFXPreviewAdapter.class && adaptableObject instanceof XtextEditor) {
			final XtextEditor editor = (XtextEditor) adaptableObject;
			if ("org.eclipse.fx.ide.css.CssDsl".equals(editor.getLanguageName())) { //$NON-NLS-1$
				return (T) new IFXPreviewAdapter() {

					@Override
					public IEditorPart getEditorPart() {
						return editor;
					}
				};
			}
		}
		return (T) null;
	}

}
