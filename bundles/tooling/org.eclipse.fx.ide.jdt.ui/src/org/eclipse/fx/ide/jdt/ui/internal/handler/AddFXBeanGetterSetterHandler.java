/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
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
package org.eclipse.fx.ide.jdt.ui.internal.handler;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.core.log.LoggerCreator;
import org.eclipse.fx.ide.jdt.ui.internal.Util;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.NodeFinder;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jdt.internal.core.manipulation.StubUtility;
import org.eclipse.jdt.internal.corext.CorextMessages;
import org.eclipse.jdt.internal.corext.codemanipulation.StubUtility2Core;
import org.eclipse.jdt.internal.corext.dom.ASTNodes;
import org.eclipse.jdt.internal.corext.dom.IASTSharedValues;
import org.eclipse.jdt.internal.corext.refactoring.structure.ASTNodeSearchUtil;
import org.eclipse.jdt.internal.corext.refactoring.util.RefactoringASTParser;
import org.eclipse.jdt.internal.corext.util.CodeFormatterUtil;
import org.eclipse.jdt.internal.corext.util.Resources;
import org.eclipse.jdt.internal.ui.actions.ActionMessages;
import org.eclipse.jdt.internal.ui.actions.SelectionConverter;
import org.eclipse.jdt.internal.ui.javaeditor.ASTProvider;
import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.handlers.HandlerUtil;

@SuppressWarnings("restriction")
public class AddFXBeanGetterSetterHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell s = HandlerUtil.getActiveShell(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		IType type = null;

		if( selection instanceof ITextSelection ) {
			JavaEditor editor = (JavaEditor) HandlerUtil.getActiveEditor(event);
			try {
				IJavaElement[] items = SelectionConverter.codeResolveForked((editor),true);
				if( items.length > 0 ) {
					type = (IType) items[0].getAncestor(IJavaElement.TYPE);
				} else {
					IJavaElement element= SelectionConverter.getElementAtOffset(editor);
					if( element != null ) {
						type = (IType) element.getAncestor(IJavaElement.TYPE);
					}
				}
			} catch (InvocationTargetException | InterruptedException | JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if( selection instanceof IStructuredSelection ) {
			IStructuredSelection selected= (IStructuredSelection) selection;
			Object firstelement = selected.getFirstElement();
			try {
				if (firstelement instanceof IType) {
					type = (IType) firstelement;
				} else if (firstelement instanceof ICompilationUnit) {
					type = ((ICompilationUnit) firstelement).findPrimaryType();
				}
				else if(firstelement instanceof IField){
					type=((IField)firstelement).getDeclaringType();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if( type != null ) {
			GetterSetterDialog dialog = new GetterSetterDialog(s, type);
			dialog.open();
		}
        else {
			MessageDialog.openInformation(s, ActionMessages.AddGetterSetterAction_error_title, ActionMessages.AddGetterSetterAction_not_applicable);
		}
		return null;
	}

	static class PropertyItem {
		final IField field;
//		boolean makeFinal = true;

		public PropertyItem(IField field) {
			this.field = field;
		}
	}

	public static class GetterSetterDialog extends TitleAreaDialog {
		private Logger logger = LoggerCreator.createLogger(getClass());
		private final IType type;
		private Util util;
		private CheckboxTableViewer viewer;
		private Button makeMethodsFinal;

		public GetterSetterDialog(Shell parentShell, IType type) {
			super(parentShell);
			this.type = type;
			this.util = new Util(type.getJavaProject());
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = (Composite) super.createDialogArea(parent);

			getShell().setText("Generate JavaFX Property accessors");
			setTitle("Generate JavaFX Property accessors");
			setMessage("Select the items you want the accessors created");

			Composite content = new Composite(container, SWT.NONE);
			content.setLayoutData(new GridData(GridData.FILL_BOTH));
			content.setLayout(new GridLayout(2,false));

			this.viewer = new CheckboxTableViewer(new Table(content, SWT.FULL_SELECTION|SWT.CHECK|SWT.BORDER|SWT.V_SCROLL|SWT.H_SCROLL));
			GridData gd = new GridData(GridData.FILL_BOTH);
			gd.heightHint=200;
			this.viewer.getControl().setLayoutData(gd);
			this.viewer.setContentProvider(ArrayContentProvider.getInstance());
			JavaElementLabelProvider provider = new JavaElementLabelProvider();
			this.viewer.setLabelProvider(new ColumnLabelProvider() {
				@Override
				public Image getImage(Object element) {
					return provider.getImage(((PropertyItem)element).field);
				}

				@Override
				public String getText(Object element) {
					PropertyItem i = (PropertyItem) element;
					return provider.getText(i.field);
				}
			});


			try {
				List<PropertyItem> candidates = new ArrayList<>();
				for( IField f : this.type.getFields() ) {
					if( this.util.isPropertyField(this.type, f)
							&& ! this.type.getMethod("get" + Util.toFirstUpper(f.getElementName()), new String[0]).exists() //$NON-NLS-1$
							&& ! this.type.getMethod("is" + Util.toFirstUpper(f.getElementName()), new String[0]).exists() //$NON-NLS-1$
							&& ! this.type.getMethod(f.getElementName()+"Property", new String[0]).exists()) { //$NON-NLS-1$
						candidates.add(new PropertyItem(f));
					}
				}
				this.viewer.setInput(candidates);
			} catch (JavaModelException e) {
				this.logger.error("Failure while analyzing the class", e); //$NON-NLS-1$
			}

			Composite buttonContainer = new Composite(content, SWT.NONE);
			buttonContainer.setLayout(GridLayoutFactory.fillDefaults().create());
			buttonContainer.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
			{
				Button b = new Button(buttonContainer, SWT.PUSH);
				b.setText("Select All");
				b.addListener(SWT.Selection, (e) -> this.viewer.setAllChecked(true));
				b.setLayoutData(new GridData(SWT.FILL,SWT.DEFAULT,false,false));
			}

			{
				Button b = new Button(buttonContainer, SWT.PUSH);
				b.setText("Deselect All");
				b.addListener(SWT.Selection, (e) -> this.viewer.setAllChecked(false));
				b.setLayoutData(new GridData(SWT.FILL,SWT.DEFAULT,false,false));
			}

			{
				IEclipsePreferences node = InstanceScope.INSTANCE.getNode("org.eclipse.fx.ide.jdt.ui"); //$NON-NLS-1$
				String key = "beans.final.api"; //$NON-NLS-1$

				this.makeMethodsFinal = new Button(buttonContainer, SWT.CHECK);
				this.makeMethodsFinal.setText("make methods final");
				this.makeMethodsFinal.addListener(SWT.Selection, (e) -> {
					try {
						node.putBoolean(key, this.makeMethodsFinal.getSelection());
						node.flush();
					} catch (Exception e1) {
						this.logger.error("Unable to store preference", e1); //$NON-NLS-1$
					}
				});
				this.makeMethodsFinal.setSelection(node.getBoolean(key, true));
				this.makeMethodsFinal.setLayoutData(new GridData(SWT.FILL,SWT.DEFAULT,false,false));
			}

			return container;
		}
		
		private static final int getAstLevelNotInlined() {
			try {
				Field f = IASTSharedValues.class.getDeclaredField("SHARED_AST_LEVEL");
				return ((Integer)f.get(null)).intValue();
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				throw new IllegalStateException(e);
			}
		}

		@Override
		protected void okPressed() {
			try {
				this.type.getCompilationUnit().getJavaProject();
				CompilationUnit astRoot = new RefactoringASTParser(getAstLevelNotInlined()).parse(this.type.getCompilationUnit(), true);

				final ICompilationUnit unit= this.type.getCompilationUnit();
				final ASTRewrite astRewrite= ASTRewrite.create(astRoot.getAST());
				ListRewrite listRewriter= null;
				if (this.type.isAnonymous()) {
					final ClassInstanceCreation creation= (ClassInstanceCreation) ASTNodes.getParent(NodeFinder.perform(astRoot, this.type.getNameRange()), ClassInstanceCreation.class);
					if (creation != null) {
						final AnonymousClassDeclaration declaration= creation.getAnonymousClassDeclaration();
						if (declaration != null)
							listRewriter= astRewrite.getListRewrite(declaration, AnonymousClassDeclaration.BODY_DECLARATIONS_PROPERTY);
					}
				} else {
					final AbstractTypeDeclaration declaration= (AbstractTypeDeclaration) ASTNodes.getParent(NodeFinder.perform(astRoot, this.type.getNameRange()), AbstractTypeDeclaration.class);
					if (declaration != null)
						listRewriter= astRewrite.getListRewrite(declaration, declaration.getBodyDeclarationsProperty());
				}

				IType propertyType = this.type.getJavaProject().findType("javafx.beans.property.Property"); //$NON-NLS-1$

				for( Object o : this.viewer.getCheckedElements() ) {
					PropertyItem i = (PropertyItem) o;
					generateAccessors(astRoot, this.type, propertyType, listRewriter, i.field, null, this.makeMethodsFinal.getSelection());
				}

				TextEdit fEdit = astRewrite.rewriteAST();
				applyEdit(unit, fEdit, true, new SubProgressMonitor(new NullProgressMonitor(), 1));

			} catch(CoreException e) {
				this.logger.error("Failure while generating accessor code", e); //$NON-NLS-1$
			}

			super.okPressed();
		}
	}
	
	// From JavaModelUtil
	private static void applyEdit(ICompilationUnit cu, TextEdit edit, boolean save, IProgressMonitor monitor) throws CoreException {
		IFile file= (IFile) cu.getResource();
		if (!save || !file.exists()) {
			cu.applyTextEdit(edit, monitor);
		} else {
			if (monitor == null) {
				monitor= new NullProgressMonitor();
			}
			monitor.beginTask(CorextMessages.JavaModelUtil_applyedit_operation, 2);
			try {
				IStatus status= Resources.makeCommittable(file, null);
				if (!status.isOK()) {
					throw new CoreException(status);
				}

				cu.applyTextEdit(edit, new SubProgressMonitor(monitor, 1));

				cu.save(new SubProgressMonitor(monitor, 1), true);
			} finally {
				monitor.done();
			}
		}
	}

	static IMethodBinding findMethodBinding(ITypeBinding type, String name) throws JavaModelException {
		for( IMethodBinding b : type.getDeclaredMethods() ) {
			if( name.equals(b.getName()) && b.getParameterTypes().length == 0 ) {
				return b;
			}
		}

		for( ITypeBinding tp : type.getInterfaces() ) {
			IMethodBinding b = findMethodBinding(tp, name);
			if( b != null ) {
				return b;
			}
		}

		if( "java.lang.Object".equals(type.getQualifiedName()) ) { //$NON-NLS-1$
			return null;
		}
		ITypeBinding superclass = type.getSuperclass();
		if( superclass != null ) {
			return findMethodBinding(superclass, name);
		}
		return null;
	}

	static void generateAccessors(CompilationUnit cu, IType ownerType, IType propertyType, ListRewrite rewrite, IField f, IJavaElement sibling, boolean makeFinal) throws JavaModelException {
		ASTNode astNode = ASTNodeSearchUtil.getAstNode(cu, f.getSourceRange().getOffset(), f.getSourceRange().getLength());
		FieldDeclaration fDec = (FieldDeclaration) astNode;

		ITypeBinding tp = fDec.getType().resolveBinding();
		// first search for get which returns the primitive type
		IMethodBinding accessMethod = findMethodBinding(tp, "get"); //$NON-NLS-1$
		if( accessMethod == null ) {
			accessMethod = findMethodBinding(tp, "getValue"); //$NON-NLS-1$
		}

		if( accessMethod == null ) {
			return;
		}

		IMethodBinding readonlyMethod = findMethodBinding(tp, "getReadOnlyProperty"); //$NON-NLS-1$

		Set<String> imports = new HashSet<>();

		String propertyContent = generatePropertyAccessContent(f, makeFinal, readonlyMethod, imports);
		String getterContent = generateGetAccessContent(f, makeFinal, accessMethod, imports);
		String setterContent = null;

		// TODO We skip the import because the Type is already imported, does this always hold true?

		IType fieldType = Util.toType(ownerType, f.getTypeSignature());
		if( readonlyMethod == null && ! isReadonly(fieldType, propertyType) ) {
			setterContent = generateSetAccessContent(f, makeFinal, accessMethod, imports);
		}

		ASTNode insertion= StubUtility2Core.getNodeToInsertBefore(rewrite, sibling);
		addNewAccessor(ownerType, f, propertyContent , rewrite, insertion);

		insertion= StubUtility2Core.getNodeToInsertBefore(rewrite, sibling);
		addNewAccessor(ownerType, f, getterContent , rewrite, insertion);

		if( setterContent != null ) {
			insertion= StubUtility2Core.getNodeToInsertBefore(rewrite, sibling);
			addNewAccessor(ownerType, f, setterContent , rewrite, insertion);
		}
	}

	static String generateSetAccessContent(IField f, boolean makeFinal, IMethodBinding accessMethod, Set<String> imports) throws JavaModelException {
		String lineDelim = "\n"; //$NON-NLS-1$
		StringBuffer buf = new StringBuffer();
		buf.append("public "+(makeFinal?"final ":"")+" void");    //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$

		String sig = Signature.getSimpleName(accessMethod.getReturnType().getQualifiedName());

		buf.append(" set" + Util.toFirstUpper(f.getElementName()) + "(final "+sig+" "+f.getElementName()+") {"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		buf.append(lineDelim);
		buf.append("this."+f.getElementName()+"Property()."+ accessMethod.getName().replace("get", "set") + "("+f.getElementName()+");");    //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$//$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
		buf.append(lineDelim);
		buf.append("}"); //$NON-NLS-1$
		buf.append(lineDelim);

		return buf.toString();
	}

	static String generateGetAccessContent(IField f, boolean makeFinal, IMethodBinding accessMethod, Set<String> imports) throws JavaModelException {
		String lineDelim = "\n"; //$NON-NLS-1$
		StringBuffer buf = new StringBuffer();
		buf.append("public "+(makeFinal?"final ":""));   //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$

		String sig = Signature.getSimpleName(accessMethod.getReturnType().getQualifiedName());
		buf.append(sig);

		if( "boolean".equals(sig) ) { //$NON-NLS-1$
			buf.append(" is" + Util.toFirstUpper(f.getElementName()) + "() {");  //$NON-NLS-1$//$NON-NLS-2$
		} else {
			buf.append(" get" + Util.toFirstUpper(f.getElementName()) + "() {");  //$NON-NLS-1$//$NON-NLS-2$
		}
		buf.append(lineDelim);
		buf.append("return this."+f.getElementName()+"Property()."+accessMethod.getName() + "();");   //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
		buf.append(lineDelim);
		buf.append("}"); //$NON-NLS-1$
		buf.append(lineDelim);

		return buf.toString();
	}

	static String generatePropertyAccessContent(IField f, boolean makeFinal, IMethodBinding readonlyBinding, Set<String> imports) throws IllegalArgumentException, JavaModelException {
		String lineDelim = "\n"; //$NON-NLS-1$
		StringBuffer buf = new StringBuffer();
		buf.append("public "+(makeFinal?"final ":""));   //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
		if( readonlyBinding != null ) {
			buf.append(readonlyBinding.getReturnType().getQualifiedName());
		} else {
			buf.append(Signature.toString(f.getTypeSignature()));
		}

		buf.append(" " + f.getElementName()+"Property() {");  //$NON-NLS-1$//$NON-NLS-2$
		buf.append(lineDelim);
		buf.append("return this."+f.getElementName() + ( readonlyBinding != null ? ".getReadOnlyProperty()" : "" ) + ";"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		buf.append(lineDelim);
		buf.append("}"); //$NON-NLS-1$
		buf.append(lineDelim);

		return buf.toString();
	}

	static boolean isReadonlyWrapper(IType fieldType) throws JavaModelException {
		return fieldType.getMethod("getReadOnlyProperty", new String[0]).exists(); //$NON-NLS-1$
	}

	static boolean isReadonly(IType fieldType, IType propertyType) {
		return ! Util.assignable(fieldType, propertyType);
	}

	private static void addNewAccessor(final IType type, final IField field, final String contents, final ListRewrite rewrite, final ASTNode insertion) throws JavaModelException {
		final String delimiter= StubUtility.getLineDelimiterUsed(type);
		final MethodDeclaration declaration= (MethodDeclaration) rewrite.getASTRewrite().createStringPlaceholder(CodeFormatterUtil.format(CodeFormatter.K_CLASS_BODY_DECLARATIONS, contents, 0, delimiter, field.getJavaProject()), ASTNode.METHOD_DECLARATION);
		if (insertion != null)
			rewrite.insertBefore(declaration, insertion, null);
		else
			rewrite.insertLast(declaration, null);
	}

	static String getSimpleName(String value, Set<String> imports) {
		if( value.startsWith("java.lang.") ) { //$NON-NLS-1$
			return value.substring("java.lang.".length()); //$NON-NLS-1$
		} else if( imports.contains(value) ) {
			String[] split = value.split("\\."); //$NON-NLS-1$
			return split[split.length-1];
		} else {
			// TODO We need to check if this leads to a conflict
			imports.add(value);
			String[] split = value.split("\\."); //$NON-NLS-1$
			return split[split.length-1];
		}
	}
}
