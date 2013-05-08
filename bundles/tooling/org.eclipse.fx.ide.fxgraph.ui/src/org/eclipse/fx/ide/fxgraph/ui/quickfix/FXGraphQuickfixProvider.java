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
package org.eclipse.fx.ide.fxgraph.ui.quickfix;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.fx.ide.fxgraph.validation.FXGraphJavaValidator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.Signature;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;


import com.google.inject.Inject;

public class FXGraphQuickfixProvider extends DefaultQuickfixProvider {
	@Inject
	IJavaProjectProvider provider;
	
//	@Fix(MyJavaValidator.INVALID_NAME)
//	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
//			public void apply(IModificationContext context) throws BadLocationException {
//				IXtextDocument xtextDocument = context.getXtextDocument();
//				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
//				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
//			}
//		});
//	}

	@Fix(FXGraphJavaValidator.UNKNOWN_CONTROLLER_FIELD)
	public void fixAddControllerField(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add controller field", "Add a field of '"+issue.getData()[0]+"' to the controller '"+issue.getData()[1]+"'", null, new IModification() {
			
			@Override
			public void apply(IModificationContext context) throws Exception {
				IJavaProject p = context.getXtextDocument().readOnly(new IUnitOfWork<IJavaProject, XtextResource>() {

					@Override
					public IJavaProject exec(XtextResource state) throws Exception {
						return provider.getJavaProject(state.getResourceSet());
					}
					
				});
				
				IType type = p.findType(issue.getData()[1]);
				
				String[][] resolvedType = type.resolveType("FXML");
				
				if( resolvedType == null ) {
					type.getCompilationUnit().createImport("javafx.fxml.FXML", null, new NullProgressMonitor());	
				}
				
				resolvedType = type.resolveType(Signature.getSimpleName(issue.getData()[2]));
				
				if( resolvedType == null ) {
					type.getCompilationUnit().createImport(issue.getData()[2], null, new NullProgressMonitor());
				}
				
				type.createField("@FXML " + Signature.getSimpleName(issue.getData()[2]) + " " + issue.getData()[0] + ";", null, true, new NullProgressMonitor());
			}
		});
		acceptor.accept(issue, "Remove id field", "Remove the id field from the element", null, new IModification() {
			
			@Override
			public void apply(IModificationContext context) throws Exception {
				IXtextDocument xtextDocument = context.getXtextDocument();
				StringBuilder b = new StringBuilder();
				int start = issue.getOffset();
				while( ! b.toString().startsWith("id") ) {
					b.insert(0,xtextDocument.getChar(--start));	
				}
				
				xtextDocument.replace(start, (b + issue.getData()[0]).length(),"");
			}
		});
	}
	
	@Fix(FXGraphJavaValidator.UNKNOWN_CONTROLLER_METHOD)
	public void fixAddControllerMethod(final Issue issue, IssueResolutionAcceptor acceptor) {
		final String methodName = issue.getData()[0];
		final String controllerClass = issue.getData()[1];
		final String argType = issue.getData()[2];
		final String simpleArgType = Signature.getSimpleName(argType);
		acceptor.accept(issue, "Add controller method "+methodName+"("+simpleArgType+")", "Add a controller method '"+methodName+"("+simpleArgType+")' to controller '"+controllerClass+"'", null, new IModification() {
			
			@Override
			public void apply(IModificationContext context) throws Exception {
				IJavaProject p = context.getXtextDocument().readOnly(new IUnitOfWork<IJavaProject, XtextResource>() {

					@Override
					public IJavaProject exec(XtextResource state) throws Exception {
						return provider.getJavaProject(state.getResourceSet());
					}
					
				});
				
				IType type = p.findType(controllerClass);
				
				String[][] resolvedType = type.resolveType("FXML");
				
				if( resolvedType == null ) {
					type.getCompilationUnit().createImport("javafx.fxml.FXML", null, new NullProgressMonitor());	
				}
				
				resolvedType = type.resolveType(simpleArgType);
				
				if( resolvedType == null ) {
					type.getCompilationUnit().createImport(argType, null, new NullProgressMonitor());	
				}
				
				type.createMethod("@FXML public void " + methodName + "("+simpleArgType+" event) {}", null, true, new NullProgressMonitor());
			}
		});
		acceptor.accept(issue, "Add controller method "+methodName+"()", "Add a controller method '"+methodName+"()' to controller '"+controllerClass+"'", null, new IModification() {
			
			@Override
			public void apply(IModificationContext context) throws Exception {
				IJavaProject p = context.getXtextDocument().readOnly(new IUnitOfWork<IJavaProject, XtextResource>() {

					@Override
					public IJavaProject exec(XtextResource state) throws Exception {
						return provider.getJavaProject(state.getResourceSet());
					}
					
				});
				
				IType type = p.findType(controllerClass);
				
				String[][] resolvedType = type.resolveType("FXML");
				
				if( resolvedType == null ) {
					type.getCompilationUnit().createImport("javafx.fxml.FXML", null, new NullProgressMonitor());	
				}
				
				type.createMethod("@FXML public void " + methodName + "() {}", null, true, new NullProgressMonitor());
			}
		});
	}
	
//	@Fix(FXGraphJavaValidator.CONTROLLER_FIELD_NOT_ASSIGNABLE)
//	public void fixModifyControllerFieldType(final Issue issue, IssueResolutionAcceptor acceptor) {
//		final String fieldname = issue.getData()[0];
//		final String controllername = issue.getData()[1];
//		String currentType = issue.getData()[2];
//		String newType = issue.getData()[3];
//		acceptor.accept(issue, "Modify controller field type", "Modify the field type from '"+currentType+"' to '"+newType+"'", null, new IModification() {
//			
//			@Override
//			public void apply(IModificationContext context) throws Exception {
//				IJavaProject p = context.getXtextDocument().readOnly(new IUnitOfWork<IJavaProject, XtextResource>() {
//
//					@Override
//					public IJavaProject exec(XtextResource state) throws Exception {
//						return provider.getJavaProject(state.getResourceSet());
//					}
//					
//				});
//				
//				IFXCtrlClass cl = FXPlugin.getClassmodel().findCtrlClass(p, p.findType(controllername));
//				IFXCtrlField f = cl.getAllFields().get(fieldname);
//				IField field = (IField) f.getJavaElement();
////				field.getCompilationUnit().applyTextEdit(new , monitor)
//			}
//		});
//	}
}
