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
package org.eclipse.fx.ide.fxgraph.ui.handlers;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext; 
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.fx.ide.fxgraph.converter.FXGraphConverter;
import org.eclipse.fx.ide.fxgraph.converter.FXMLLoader;
import org.eclipse.fx.ide.fxgraph.converter.IFXMLFile;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.ISources;

public class ConvertFXMLHandler extends AbstractHandler {

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
				String content = convert(outFile, f);
				IProject project = outFile.getProject();
				Object codeFormatter = createCodeFormatter(project);
				if (codeFormatter != null) {
					content = format(content, (CodeFormatter) codeFormatter);
				}

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
	
	protected String convert(IFile outFile, final IFile file)
			throws ExecutionException {
		FXMLLoader loader = new FXMLLoader();
		Model m = loader.loadModel(new IFXMLFile() {
			
			@Override
			public String getPackagename() {
				String packName = null;
				IJavaElement j = JavaCore.create(file.getParent());
				if (j instanceof IPackageFragment) {
					IPackageFragment p = (IPackageFragment) j;
					packName = p.getElementName();
				}
				return packName;
			}
			
			@Override
			public String getName() {
				return file.getName();
			}
			
			@Override
			public InputStream getContent() {
				try {
					return file.getContents();
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
		});
		return new FXGraphConverter().generate(m).toString();
	}

	protected String getTargetFileExtension() {
		return ".fxgraph";
	}

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
	
	public static Object createCodeFormatter(IProject project) {
		IJavaProject javaProject = JavaCore.create(project);
		@SuppressWarnings("unchecked")
		Map<String,String> options = javaProject.getOptions(true);
		return ToolFactory.createCodeFormatter(options);
	}
}
