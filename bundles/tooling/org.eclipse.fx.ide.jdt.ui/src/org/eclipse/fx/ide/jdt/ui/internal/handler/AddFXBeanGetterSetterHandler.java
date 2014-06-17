/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.handler;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import javafx.beans.property.StringProperty;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.ITypedParameter;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.fx.ide.jdt.ui.internal.Util;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeParameter;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.NodeFinder;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jdt.internal.corext.ValidateEditException;
import org.eclipse.jdt.internal.corext.codemanipulation.StubUtility;
import org.eclipse.jdt.internal.corext.codemanipulation.StubUtility2;
import org.eclipse.jdt.internal.corext.dom.ASTNodes;
import org.eclipse.jdt.internal.corext.refactoring.util.RefactoringASTParser;
import org.eclipse.jdt.internal.corext.util.CodeFormatterUtil;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.actions.SelectionConverter;
import org.eclipse.jdt.internal.ui.javaeditor.ASTProvider;
import org.eclipse.jdt.internal.ui.javaeditor.CompilationUnitEditor;
import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor;
import org.eclipse.jdt.internal.ui.viewsupport.JavaElementImageProvider;
import org.eclipse.jdt.ui.JavaElementImageDescriptor;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.IEditorPart;
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
			List list = ((IStructuredSelection) selection).toList();
			System.err.println(list);
		}
		
		if( type != null ) {
			GetterSetterDialog dialog = new GetterSetterDialog(s, type);
			dialog.open();
		}
		
		return null;
	}

	
	
	public static class GetterSetterDialog extends TitleAreaDialog {
		private final IType type;
		private Util util;
		private CheckboxTableViewer viewer;
		
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
			content.setLayout(new GridLayout());
			
			viewer = new CheckboxTableViewer(new Table(content, SWT.FULL_SELECTION|SWT.CHECK|SWT.BORDER|SWT.V_SCROLL|SWT.H_SCROLL));
			GridData gd = new GridData(GridData.FILL_BOTH);
			gd.heightHint=200;
			viewer.getControl().setLayoutData(gd);
			viewer.setContentProvider(ArrayContentProvider.getInstance());
//			viewer.getTable().setHeaderVisible(true);
//			viewer.getTable().setLinesVisible(true);
			viewer.setLabelProvider(new JavaElementLabelProvider());
			try {
				List<IField> candidates = new ArrayList<>();
				for( IField f : this.type.getFields() ) {
					if( this.util.isPropertyField(this.type, f) 
							&& ! this.type.getMethod("get" + Util.toFirstUpper(f.getElementName()), new String[0]).exists() //$NON-NLS-1$
							&& ! this.type.getMethod("is" + Util.toFirstUpper(f.getElementName()), new String[0]).exists() //$NON-NLS-1$
							&& ! this.type.getMethod(f.getElementName()+"Property", new String[0]).exists()) { //$NON-NLS-1$
						candidates.add(f);
					}
				}
				viewer.setInput(candidates);
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return container;
		}
		
		@Override
		protected void okPressed() {
			try {
				CompilationUnit astRoot = new RefactoringASTParser(ASTProvider.SHARED_AST_LEVEL).parse(type.getCompilationUnit(), true);
				
				final ICompilationUnit unit= type.getCompilationUnit();
				final ASTRewrite astRewrite= ASTRewrite.create(astRoot.getAST());
				ListRewrite listRewriter= null;
				if (type.isAnonymous()) {
					final ClassInstanceCreation creation= (ClassInstanceCreation) ASTNodes.getParent(NodeFinder.perform(astRoot, type.getNameRange()), ClassInstanceCreation.class);
					if (creation != null) {
						final AnonymousClassDeclaration declaration= creation.getAnonymousClassDeclaration();
						if (declaration != null)
							listRewriter= astRewrite.getListRewrite(declaration, AnonymousClassDeclaration.BODY_DECLARATIONS_PROPERTY);
					}
				} else {
					final AbstractTypeDeclaration declaration= (AbstractTypeDeclaration) ASTNodes.getParent(NodeFinder.perform(astRoot, type.getNameRange()), AbstractTypeDeclaration.class);
					if (declaration != null)
						listRewriter= astRewrite.getListRewrite(declaration, declaration.getBodyDeclarationsProperty());
				}
				
				IType propertyType = type.getJavaProject().findType("javafx.beans.property.Property");
				
				for( Object o : viewer.getCheckedElements() ) {
					IField f = (IField) o;
					generateAccessors(type, propertyType, listRewriter, f, null);
				}
				
				TextEdit fEdit = astRewrite.rewriteAST();
				JavaModelUtil.applyEdit(unit, fEdit, true, new SubProgressMonitor(new NullProgressMonitor(), 1));
				
			} catch(JavaModelException e) {
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			catch (ValidateEditException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			super.okPressed();
		}
	}
	
	static void generateAccessors(IType ownerType, IType propertyType, ListRewrite rewrite, IField f, IJavaElement sibling) throws JavaModelException {
		IType fieldType = Util.toType(ownerType, f.getTypeSignature());
		
		boolean readonlyWrapper = isReadonlyWrapper(fieldType);
		
		String propertyContent = generatePropertyAccessContent(f, fieldType, readonlyWrapper);
		
		ASTNode insertion= StubUtility2.getNodeToInsertBefore(rewrite, sibling);
		addNewAccessor(ownerType, f, propertyContent , rewrite, insertion);
		
		String getterContent = generateGetAccessContent(f, fieldType);
		insertion= StubUtility2.getNodeToInsertBefore(rewrite, sibling);
		addNewAccessor(ownerType, f, getterContent , rewrite, insertion);
		
		if( ! readonlyWrapper && ! isReadonly(fieldType, propertyType) ) {
			String setterContent = generateSetAccessContent(f, fieldType);
			insertion= StubUtility2.getNodeToInsertBefore(rewrite, sibling);
			addNewAccessor(ownerType, f, setterContent , rewrite, insertion);
		}
		
	}
	
	static IMethod getMethod(IType type, String methodName, String... arguments) throws JavaModelException {
		IMethod method = type.getMethod(methodName, new String[0]);
		if( ! method.exists() ) {
			for( String s : type.getSuperInterfaceNames() ) {
				IMethod m = getMethod(type.getJavaProject().findType(s), methodName, arguments);
				if( m.exists() ) {
					return m;
				}
			}
			
			String[][] resolveType = type.resolveType(type.getSuperclassName());
			String fqn = resolveType[0][0]+"."+resolveType[0][1]; //$NON-NLS-1$
			if( ! "java.lang.Object".equals(fqn) ) {
				return getMethod(type.getJavaProject().findType(fqn), methodName, arguments);	
			}
		}
		return method;
	}
	
	static String generateSetAccessContent(IField f, IType fieldType) throws JavaModelException {
		String lineDelim = "\n";
		StringBuffer buf = new StringBuffer();
		buf.append("public void");
		
		IMethod method = getMethod(fieldType, "get"); //$NON-NLS-1$
		if( !method.exists() ) {
			method = getMethod(fieldType,"getValue"); //$NON-NLS-1$
		}
		
		String sig = getType(f, method);
		
		buf.append(" set" + Util.toFirstUpper(f.getElementName()) + "(final "+sig+" "+f.getElementName()+") {");
		buf.append(lineDelim);
		buf.append("this."+f.getElementName()+"."+ method.getElementName().replace("get", "set") + "("+f.getElementName()+");");
		buf.append(lineDelim);
		buf.append("}");
		buf.append(lineDelim);
		
		return buf.toString();
	}
	
	static String generateGetAccessContent(IField f, IType fieldType) throws JavaModelException {
		String lineDelim = "\n";
		StringBuffer buf = new StringBuffer();
		buf.append("public ");
		
		IMethod method = getMethod(fieldType, "get"); //$NON-NLS-1$
		if( !method.exists() ) {
			method = getMethod(fieldType,"getValue"); //$NON-NLS-1$
		}
		
		String sig = getType(f, method);
		buf.append(sig);
		
		if( "boolean".equals(sig) ) {
			buf.append(" is" + Util.toFirstUpper(f.getElementName()) + "() {");
		} else {
			buf.append(" get" + Util.toFirstUpper(f.getElementName()) + "() {");
		}
		buf.append(lineDelim);
		buf.append("return this."+f.getElementName()+"."+method.getElementName() + "();");
		buf.append(lineDelim);
		buf.append("}");
		buf.append(lineDelim);
		
		return buf.toString();
	}
	
	static String getType(IField f, IMethod method) throws JavaModelException {
		String returnType = method.getReturnType();
		String sig = Signature.toString(returnType);
		
		String typedParameter = null;
		ITypeParameter[] typeParameterSignatures = method.getDeclaringType().getTypeParameters();
		if( typeParameterSignatures.length == 1 ) {
			typedParameter = typeParameterSignatures[0].getElementName();
		}
		if( sig.equals(typedParameter) ) {
			String[] typeArgs = Signature.getTypeArguments(f.getTypeSignature());
			if( typeArgs.length > 0 ) {
				return Signature.toString(typeArgs[0]);
			} else {
				//FIXME We need to search now!!!
				return "String";	
			}
			
		} else {
			return sig;			
		}
	}
	
	static String generatePropertyAccessContent(IField f, IType fieldType, boolean readonlyWrapper) throws IllegalArgumentException, JavaModelException {
		String lineDelim = "\n";
		StringBuffer buf = new StringBuffer();
		buf.append("public ");
		if( readonlyWrapper ) {
			String returnType = fieldType.getMethod("getReadOnlyProperty", new String[0]).getReturnType();
			String sig = Signature.toString(returnType);
			String[] typeArguments = Signature.getTypeArguments(returnType);
			if( typeArguments.length == 0 ) {
				buf.append(sig);				
			} else {
				String[] typeArgs = Signature.getTypeArguments(f.getTypeSignature());
				buf.append(Signature.toString(returnType.replace(typeArguments[0], typeArgs[0])));
			}
			
		} else {
			buf.append(Signature.toString(f.getTypeSignature()));	
		}
		
		buf.append(" " + f.getElementName()+"Property() {");
		buf.append(lineDelim);
		buf.append("return this."+f.getElementName() + ( readonlyWrapper ? ".getReadOnlyProperty()" : "" ) + ";");
		buf.append(lineDelim);
		buf.append("}");
		buf.append(lineDelim);
		
		return buf.toString();
	}
	
	static boolean isReadonlyWrapper(IType fieldType) throws JavaModelException {
		return fieldType.getMethod("getReadOnlyProperty", new String[0]).exists();
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

}
