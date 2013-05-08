/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxml.compile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaModelMarker;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.compiler.BuildContext;
import org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.eclipse.jdt.core.compiler.CompilationParticipant;
import org.eclipse.jdt.core.compiler.IProblem;
import org.eclipse.jdt.core.compiler.ReconcileContext;
import org.eclipse.jdt.internal.compiler.problem.DefaultProblem;
import org.eclipse.jdt.internal.compiler.problem.ProblemSeverities;

import org.eclipse.fx.ide.model.Util;

/**
 * A compilation participant which checks @FXML annotated methods in JavaFX
 * Controller classes. - Method name must be UNIQUE - Method must have 0 or
 * exactly 1 argument which must be javafx.event.Event
 * 
 * @author martin.bluehweis@bestsolution.at
 */
@SuppressWarnings("restriction")
public class FxmlAnnotationCompilationParticipant extends
		CompilationParticipant {

	private static final String MARKER = IJavaModelMarker.JAVA_MODEL_PROBLEM_MARKER;

	@Override
	public boolean isActive(IJavaProject project) {
		return true;
	}

	@Override
	public void buildStarting(BuildContext[] files, boolean isBatch) {
		super.buildStarting(files, isBatch);
		for (BuildContext context : files) {
			List<CategorizedProblem> problems = null;
			try {
				ICompilationUnit unit = JavaCore
						.createCompilationUnitFrom(context.getFile());
				problems = checkCU(unit, null);
				context.recordNewProblems(problems
						.toArray(new CategorizedProblem[problems.size()]));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (problems != null) {
					problems.clear();
				}
			}
		}
	}

	@Override
	public void reconcile(final ReconcileContext context) {
		super.reconcile(context);
		List<CategorizedProblem> problems = null;
		try {
			List<CategorizedProblem> existingProblems = null;
			if (context.getProblems(MARKER) != null) {
				existingProblems = Arrays.asList(context.getProblems(MARKER));
			}
			problems = checkCU(context.getWorkingCopy(), existingProblems);
			context.putProblems(MARKER,
					problems.toArray(new CategorizedProblem[problems.size()]));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (problems != null) {
				problems.clear();
			}
		}
	}

	/**
	 * @param context
	 */
	private List<CategorizedProblem> checkCU(final ICompilationUnit unit,
			final Collection<CategorizedProblem> existingProblems) {
		List<CategorizedProblem> problems = new ArrayList<CategorizedProblem>();
		if (existingProblems != null) {
			problems.addAll(existingProblems);
		}
		List<String> fxmlMethods = new ArrayList<String>();
		try {
			IJavaProject project = unit.getJavaProject();
			for (IType type : unit.getTypes()) {
				for (IMethod method : type.getMethods()) {
					for (IAnnotation a : method.getAnnotations()) {
						if ("FXML".equals(a.getElementName())) { ////$NON-NLS-1$
							if (fxmlMethods.contains(method.getElementName())) {
								DefaultProblem problem = new DefaultProblem(
										unit.getElementName().toCharArray(),
										"JavaFX controller method name is not unique: " //$NON-NLS-1$
												+ method.getElementName(),
										IProblem.ExternalProblemNotFixable,
										new String[0],
										ProblemSeverities.Warning, method
												.getSourceRange().getOffset(),
										method.getSourceRange().getOffset()
												+ method.getSourceRange()
														.getLength(),
										getMethodLineNumber(type, method), 0);
								problems.add(problem);
							}
							fxmlMethods.add(method.getElementName());

							switch (method.getNumberOfParameters()) {
							case 0:
								break;
							case 1: {
								ILocalVariable pType = method.getParameters()[0];
								String[][] resolvedType = type
										.resolveType(Signature.toString(pType
												.getTypeSignature()));
								IType parameterType = null;
								if (resolvedType != null) {
									parameterType = project
											.findType(resolvedType[0][0]
													+ "." + resolvedType[0][1]); //$NON-NLS-1$
								}
								if (resolvedType == null
										|| !Util.assignable(
												parameterType,
												project.findType("javafx.event.Event"))) { ////$NON-NLS-1$
									DefaultProblem problem = new DefaultProblem(
											unit.getElementName().toCharArray(),
											"Parameter '" //$NON-NLS-1$
													+ pType.getElementName()
													+ "' is not assignable to javafx.event.Event", //$NON-NLS-1$
											IProblem.ExternalProblemNotFixable,
											new String[0],
											ProblemSeverities.Warning, pType
													.getSourceRange()
													.getOffset(), pType
													.getSourceRange()
													.getOffset()
													+ pType.getSourceRange()
															.getLength(),
											getMethodLineNumber(type, method),
											0);
									problems.add(problem);
								}

							}
								break;
							default: {
								DefaultProblem problem = new DefaultProblem(
										unit.getElementName().toCharArray(),
										"JavaFX controller method must have 0 or exactly 1 argument", //$NON-NLS-1$
										IProblem.ExternalProblemNotFixable,
										new String[0],
										ProblemSeverities.Warning, method
												.getSourceRange().getOffset(),
										method.getSourceRange().getOffset()
												+ method.getSourceRange()
														.getLength(),
										getMethodLineNumber(type, method), 0);
								problems.add(problem);
							}
							}
						}
					}
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return problems;
	}

	private int getMethodLineNumber(final IType type, final IMethod method)
			throws JavaModelException {
		String source = type.getCompilationUnit().getSource();
		String sourceUpToMethod = source.substring(0, method.getSourceRange()
				.getOffset());
		Pattern lineEnd = Pattern.compile(
				"$", Pattern.MULTILINE | Pattern.DOTALL); //$NON-NLS-1$
		return lineEnd.split(sourceUpToMethod).length;
	}
}
