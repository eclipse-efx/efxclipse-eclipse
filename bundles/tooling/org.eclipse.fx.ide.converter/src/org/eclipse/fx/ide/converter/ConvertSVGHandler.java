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
package org.eclipse.fx.ide.converter;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.fx.formats.svg.converter.FXMLConverter;
import org.eclipse.fx.formats.svg.handler.XMLLoader;
import org.eclipse.fx.formats.svg.svg.SvgSvgElement;

public class ConvertSVGHandler extends AbstractConverterHandler {

	@Override
	protected String convert(IFile outFile, IFile file) throws ExecutionException {
		try {
			XMLLoader loader = new XMLLoader();
			SvgSvgElement root = loader.loadDocument(outFile.getFullPath().toOSString(), file.getContents());
			return new FXMLConverter(root).generate().toString();
		} catch (Exception e) {
			throw new ExecutionException("Conversion failed", e);
		}
	}

	@Override
	protected String getTargetFileExtension() {
		return ".fxml";
	}
}
