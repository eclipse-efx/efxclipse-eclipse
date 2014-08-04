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

import java.io.ByteArrayInputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISources;

/**
 * Basic handler for conversions
 */
public abstract class AbstractConverterHandler extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEvaluationContext context = (IEvaluationContext) event
				.getApplicationContext();
		ISelection s = (ISelection) context
				.getVariable(ISources.ACTIVE_MENU_SELECTION_NAME);
		if (s instanceof IStructuredSelection) {
			Object o = ((IStructuredSelection) s).getFirstElement();
			if (o instanceof IFile) {
				IFile f = (IFile) o;
				IContainer folder = f.getParent();
				IFile outFile = folder.getFile(new Path(f.getName().substring(
						0,
						f.getName().length() - f.getFileExtension().length()
								- 1)
						+ getTargetFileExtension()));
				if( outFile == null ) {
					throw new ExecutionException("Unable to get file from folder"); //$NON-NLS-1$
				}
				
				String content = convert(outFile, f);

				if (!outFile.exists()) {
					try {
						outFile.create(
								new ByteArrayInputStream(content.getBytes()),
								true, new NullProgressMonitor());
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					try {
						outFile.setContents(
								new ByteArrayInputStream(content.getBytes()),
								IResource.KEEP_HISTORY | IResource.FORCE,
								new NullProgressMonitor());
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}

	protected abstract String convert(@NonNull IFile outFile, @NonNull IFile file)
			throws ExecutionException;

	protected abstract String getTargetFileExtension();

}