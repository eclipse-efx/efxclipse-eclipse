/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxml.refactoring;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.fx.ide.fxml.editors.Util;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextChange;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.eclipse.search.core.text.TextSearchEngine;
import org.eclipse.search.core.text.TextSearchMatchAccess;
import org.eclipse.search.core.text.TextSearchRequestor;
import org.eclipse.search.ui.text.FileTextSearchScope;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEditGroup;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;


/**
 * This RenameParticipant does refactoring for all ICompilationUnits which
 * FXML-annotated fields or methods.
 * 
 * @author martin
 */
public class RenameJFXControllerParticipant extends RenameParticipant {
	private ICompilationUnit renamedElement;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant#
	 * initialize(java.lang.Object)
	 */
	@Override
	protected boolean initialize(Object element) {
		if (element instanceof ICompilationUnit) {
			renamedElement = (ICompilationUnit) element;
			try {
				for (IJavaElement e : renamedElement.getChildren()) {
					if (e instanceof IType) {
						// check fields
						for (IField m : ((IType) e).getFields()) {
							for (IAnnotation a : m.getAnnotations()) {
								if (isFxmlAnnotation(a)) {
									return true;
								}
							}
						}
						// check methods
						for (IMethod m : ((IType) e).getMethods()) {
							for (IAnnotation a : m.getAnnotations()) {
								if (isFxmlAnnotation(a)) {
									return true;
								}
							}
						}
					}

				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		} else {
			return false;
		}
	}

	/**
	 * @param an
	 *            an annotation
	 */
	private boolean isFxmlAnnotation(IAnnotation a) {
		if ("FXML".equals(a.getElementName())) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant#
	 * getName()
	 */
	@Override
	public String getName() {
		return "e(fx)clipse RenameJFXControllerParticipant"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant#
	 * checkConditions(org.eclipse.core.runtime.IProgressMonitor,
	 * org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext)
	 */
	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm,
			CheckConditionsContext context) throws OperationCanceledException {
		return new RefactoringStatus();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant#
	 * createChange(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException,
			OperationCanceledException {
		final HashMap<Object, Change> changes = new HashMap<Object, Change>();

		if (renamedElement != null) {
			String fullname = renamedElement.getElementName();
			String extension = "."
					+ renamedElement.getCorrespondingResource()
							.getFileExtension();
			String controllerClassName = fullname.substring(0,
					fullname.length() - extension.length());
			IResource[] roots = renamedElement.getCorrespondingResource()
					.getWorkspace().getRoot().getProjects();
			String pack = "";
			if (renamedElement.getPackageDeclarations().length > 0) {
				pack = renamedElement.getPackageDeclarations()[0]
						.getElementName() + ".";
			}
			final String oldFullyQualifiedName = pack + controllerClassName;
			final String newFullyQualifiedName = pack
					+ getArguments().getNewName().replace(".java", "");
			createChangesForFullyQualifiedOccurrences(pm, changes, roots,
					oldFullyQualifiedName, newFullyQualifiedName);
			createChangesForNotFullyQualifiedOccurrences(pm, changes, roots,
					pack, controllerClassName, getArguments().getNewName()
							.replace(".java", ""));
		}
		if (changes.isEmpty()) {
			return null;
		}
		CompositeChange result = new CompositeChange("FXML updates"); //$NON-NLS-1$
		for (Change change : changes.values()) {
			result.add(change);
		}
		return result;
	}

	/**
	 * @param pm
	 * @param changes
	 * @param roots
	 * @param oldFullyQualifiedName
	 * @param newFullyQualifiedName
	 */
	private void createChangesForFullyQualifiedOccurrences(IProgressMonitor pm,
			final HashMap<Object, Change> changes, IResource[] roots,
			final String oldFullyQualifiedName,
			final String newFullyQualifiedName) {
		String[] fileNamePatterns = { "*.fxml", "*.fxgraph" }; //$NON-NLS-1$
		FileTextSearchScope scope = FileTextSearchScope.newSearchScope(roots,
				fileNamePatterns, false);

		Pattern pattern = Pattern.compile(oldFullyQualifiedName);

		TextSearchRequestor collector = new TextSearchRequestor() {
			@Override
			public boolean acceptPatternMatch(
					final TextSearchMatchAccess matchAccess)
					throws CoreException {
				IFile file = matchAccess.getFile();
				TextFileChange change = (TextFileChange) changes.get(file);
				if (change == null) {
					// an other participant already modified that file?
					TextChange textChange = getTextChange(file);
					if (textChange != null) {
						return false; // don't try to merge changes
					}
					change = new TextFileChange(file.getName(), file);
					change.setEdit(new MultiTextEdit());
					changes.put(file, change);
				}
				ReplaceEdit edit = new ReplaceEdit(
						matchAccess.getMatchOffset(),
						matchAccess.getMatchLength(), newFullyQualifiedName);
				change.addEdit(edit);
				change.addTextEditGroup(new TextEditGroup(
						"Update type reference", edit)); //$NON-NLS-1$
				return true;
			}
		};
		TextSearchEngine.create().search(scope, collector, pattern, pm);
	}

	/**
	 * @param pm
	 * @param changes
	 * @param roots
	 * @param oldFullyQualifiedName
	 * @param newFullyQualifiedName
	 */
	private void createChangesForNotFullyQualifiedOccurrences(
			IProgressMonitor pm, final HashMap<Object, Change> changes,
			IResource[] roots, final String pack, final String oldName,
			final String newName) {
		String[] fileNamePatterns = { "*.fxml" }; //$NON-NLS-1$
		FileTextSearchScope scope = FileTextSearchScope.newSearchScope(roots,
				fileNamePatterns, false);

		Pattern pattern = Pattern.compile("\"" + oldName + "\"");

		TextSearchRequestor collector = new TextSearchRequestor() {
			@Override
			public boolean acceptPatternMatch(
					final TextSearchMatchAccess matchAccess)
					throws CoreException {
				IFile file = matchAccess.getFile();
				boolean found = false;
				try {
					DocumentBuilderFactory dbf = DocumentBuilderFactory
							.newInstance();
					DocumentBuilder db = dbf.newDocumentBuilder();
					Document doc = db.parse(file.getContents());
					List<String> l = Util.getImportedTypes(doc);

					for (String imp : l) {
						if (imp.startsWith(pack + "*")
								|| imp.startsWith(pack + oldName)) {
							found = true;
							break;
						}
					}
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (found) {
					String content = matchAccess.getFileContent(0,
							matchAccess.getFileContentLength());
					TextFileChange change = (TextFileChange) changes.get(file);
					if (change == null) {
						// an other participant already modified that file?
						TextChange textChange = getTextChange(file);
						if (textChange != null) {
							return false; // don't try to merge changes
						}
						change = new TextFileChange(file.getName(), file);
						change.setEdit(new MultiTextEdit());
						changes.put(file, change);
					}

					int index = content.indexOf("\"" + oldName + "\"");
					if (index >= 0) {
						ReplaceEdit edit = new ReplaceEdit(index + 1,
								oldName.length(), newName);
						change.addEdit(edit);
						change.addTextEditGroup(new TextEditGroup(
								"Update type reference", edit)); //$NON-NLS-1$
					}
				}
				return true;
			}
		};
		TextSearchEngine.create().search(scope, collector, pattern, pm);
	}
}
