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
package org.eclipse.fx.ide.converter;

import java.io.InputStream;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.fx.core.log.LoggerCreator;
import org.eclipse.fx.formats.svg.converter.FXMLConverter;
import org.eclipse.fx.formats.svg.handler.XMLLoader;
import org.eclipse.fx.formats.svg.svg.SvgSvgElement;
import org.eclipse.jdt.annotation.NonNull;

/**
 * Handler to convert SVG to FXML
 */
public class ConvertSVGHandler extends AbstractConverterHandler {

	@SuppressWarnings("null")
	@Override
	protected String convert(@NonNull IFile outFile, @NonNull IFile file) throws ExecutionException {
		try(InputStream contents = file.getContents()) {
			if( contents == null ) {
				throw new ExecutionException("Could not retrieve file contents"); //$NON-NLS-1$
			}
			SvgSvgElement root = XMLLoader.loadDocument(outFile.getFullPath().toOSString(), contents);
			return new FXMLConverter(root).generate().toString();
		} catch (Exception e) {
			LoggerCreator.createLogger(getClass()).error("Conversion failed", e); //$NON-NLS-1$
			throw new ExecutionException("Conversion failed", e); //$NON-NLS-1$
		}
	}

	@Override
	protected String getTargetFileExtension() {
		return ".fxml"; //$NON-NLS-1$
	}
}
