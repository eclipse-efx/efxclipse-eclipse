/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis	<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.converter;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.fx.ide.fxgraph.converter.FXGraphConverter;
import org.eclipse.fx.ide.fxgraph.converter.FXMLLoader;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

public class ConvertFXMLHandler extends AbstractConverterHandler {

	@Override
	protected String convert(IFile outFile, IFile file)
			throws ExecutionException {
		FXMLLoader loader = new FXMLLoader();
		Model m = loader.loadModel(file);
		return new FXGraphConverter().generate(m).toString();
	}

	@Override
	protected String getTargetFileExtension() {
		return ".fxgraph";
	}

	@Override
	protected String format(String contents, CodeFormatter codeFormatter) {
		if (codeFormatter instanceof CodeFormatter) {
			IDocument doc = new Document(contents);
			// FIXME always returns null
			TextEdit edit = ((CodeFormatter) codeFormatter).format(
					CodeFormatter.K_COMPILATION_UNIT, doc.get(), 0, doc.get()
							.length(), 0, null);

			if (edit != null) {
				try {
					edit.apply(doc);
					contents = doc.get();
				} catch (Exception e) {
					// TODO
					e.printStackTrace();
				}
			}
		}
		return contents;
	}
}
