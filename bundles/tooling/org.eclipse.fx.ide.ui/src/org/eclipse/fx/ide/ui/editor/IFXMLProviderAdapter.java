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
package org.eclipse.fx.ide.ui.editor;

import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.IFile;

public interface IFXMLProviderAdapter extends IFXPreviewAdapter {
	public String getPreviewSceneFXML();

	public String getPreviewFXML();

	public List<String> getPreviewCSSFiles();

	public String getPreviewResourceBundle();

	public List<URL> getPreviewClasspath();

	public IFile getFile();

	default <P> void renderedRootNode(P rootNode) {
		// do nothing
	}
}
