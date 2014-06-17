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
package org.eclipse.fx.ide.jdt.ui.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.CompletionContext;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.NamingConventions;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.ui.text.java.ContentAssistInvocationContext;
import org.eclipse.jdt.ui.text.java.IJavaCompletionProposalComputer;
import org.eclipse.jdt.ui.text.java.JavaContentAssistInvocationContext;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension6;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

public class FXBeanJavaCompletionProposalComputer implements IJavaCompletionProposalComputer {
	
	public enum Type {
		GETTER,
		SETTER,
		ACCESSOR
	}
	
	@Override
	public List<ICompletionProposal> computeCompletionProposals(ContentAssistInvocationContext context, IProgressMonitor monitor) {
		if (context instanceof JavaContentAssistInvocationContext && Boolean.FALSE == true) {
			JavaContentAssistInvocationContext javaContext= (JavaContentAssistInvocationContext) context;
			CompletionContext completionContext = javaContext.getCoreContext();
			IJavaElement enclosingElement= null;
			if( completionContext.isExtended() ) {
				enclosingElement = completionContext.getEnclosingElement();	
			} else {
				try {
					enclosingElement = javaContext.getCompilationUnit().getElementAt(context.getInvocationOffset() + 1);
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
						
			List<ICompletionProposal> l = new ArrayList<ICompletionProposal>();
			
			if( enclosingElement != null ) {
				IType type = (IType) enclosingElement.getAncestor(IJavaElement.TYPE);
				if( type == null ) {
					return l;
				}
				
				try {
					IField[] fields= type.getFields();
					IMethod[] methods= type.getMethods();
					int offset = context.getInvocationOffset() - 3;
					if( offset > 0 ) {
						String prefix = context.getDocument().get(offset, 3);
						IType propType = type.getJavaProject().findType("javafx.beans.property.Property");
						IType writableType = type.getJavaProject().findType("javafx.beans.value.WritableValue");
						
						// Primitives
						IType booleanType = type.getJavaProject().findType("javafx.beans.property.ReadOnlyBooleanProperty");
						IType doubleType = type.getJavaProject().findType("javafx.beans.property.ReadOnlyDoubleProperty");
						IType floatType = type.getJavaProject().findType("javafx.beans.property.ReadOnlyFloatProperty");
						IType intType = type.getJavaProject().findType("javafx.beans.property.ReadOnlyIntegerProperty");
						IType longType = type.getJavaProject().findType("javafx.beans.property.ReadOnlyLongProperty");
						IType stringType = type.getJavaProject().findType("javafx.beans.property.ReadOnlyStringProperty");
						
						for (int i= 0; i < fields.length; i++) {
							IField curr= fields[i];
							if (!Flags.isEnum(curr.getFlags())) {
								IType fieldType = toType(type, curr.getTypeSignature());
								if( fieldType != null ) {
									if( assignable(fieldType, propType) ) {
										if( "set".equals(prefix) ) {
											if( assignable(fieldType, writableType) ) {
												String setterName = NamingConventions.suggestSetterName(type.getJavaProject(), curr.getElementName(), curr.getFlags(), false, null);
												if( ! hasMethod(methods, setterName) ) {
													StyledString s = new StyledString(setterName+"("+toValue(fieldType, booleanType, doubleType, floatType, intType, longType, stringType)+")" + " : void" ); //$NON-NLS-1$
													s.append( " - Setter for '" + curr.getElementName() + "'", StyledString.QUALIFIER_STYLER); //$NON-NLS-1$ //$NON-NLS-2$
													l.add(new CompletionProposalImpl(setterName,s, setterName + "("+toValue(fieldType, booleanType, doubleType, floatType, intType, longType, stringType)+" "+curr.getElementName()+")",curr,Type.SETTER,offset));
												}
											}
										} else if( Character.isWhitespace(prefix.charAt(0)) && prefix.endsWith("is") ) {
											if( assignable(fieldType, booleanType) ) {
												String getterName = NamingConventions.suggestGetterName(type.getJavaProject(), curr.getElementName(), curr.getFlags(), false, null);
												getterName = "is" + getterName.substring(3);
												if( ! hasMethod(methods, getterName) ) {
													StyledString s = new StyledString(getterName+"() : boolean" );
													s.append( " - Getter for '" + curr.getElementName() + "'", StyledString.QUALIFIER_STYLER );
													l.add(new CompletionProposalImpl(getterName,s,getterName+"()",curr,Type.GETTER,offset));
												}
											}
										} else if( "get".equals(prefix) ) {
											if( ! assignable(fieldType, booleanType) ) {
												String getterName = NamingConventions.suggestGetterName(type.getJavaProject(), curr.getElementName(), curr.getFlags(), false, null);
												if( ! hasMethod(methods, getterName) ) {
													StyledString s = new StyledString(getterName+"() : " + toValue(fieldType, booleanType, doubleType, floatType, intType, longType, stringType));
													s.append( " - Getter for '" + curr.getElementName() + "'", StyledString.QUALIFIER_STYLER );
													l.add(new CompletionProposalImpl(getterName,s,toValue(fieldType, booleanType, doubleType, floatType, intType, longType, stringType) + " " + getterName+"()",curr,Type.GETTER,offset));
												}
											}
										} else if( Character.isWhitespace(prefix.charAt(2)) ) {
											String propertyName = curr.getElementName()+"Property() : " + fieldType.getElementName();
											if( ! hasMethod(methods, propertyName) ) {
												StyledString s = new StyledString(propertyName);
												l.add(new CompletionProposalImpl(propertyName,s,fieldType.getElementName() + " " + curr.getElementName()+"Property()",curr,Type.ACCESSOR,offset));
											}
										}
									}
								}
							}
						}
					}
					
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.err.println(l);
			
			return l;
		}
		return Collections.emptyList();
	}
	
	private static String toValue(IType fieldType,
			IType booleanType,
			IType doubleType,
			IType floatType,
			IType intType,
			IType longType,
			IType stringType) {
		 if( assignable(fieldType, booleanType) ) {
			 return "boolean";
		 } else if( assignable(fieldType, doubleType) ) {
			 return "double";
		 } else if( assignable(fieldType, floatType) ) {
			 return "float";
		 } else if( assignable(fieldType, intType) ) {
			 return "int";
		 } else if( assignable(fieldType, longType) ) {
			 return "long";
		 } else if( assignable(fieldType, stringType) ) {
			 return "String";
		 }
		 return null;
	}

	private IType toType(IType t, String typeSig) throws JavaModelException {
		String erasedType = Signature.getTypeErasure( Signature.toString(typeSig));
		String[][] types = t.resolveType(erasedType);
		if( types != null && types.length == 1 ) {
			StringBuilder b = new StringBuilder();
			for( String p : types[0] ) {
				if( b.length() > 0 ) {
					b.append(".");
				}
				b.append(p);
			}
			return t.getJavaProject().findType(b.toString());
		}
		return null;
	}
	
	private static boolean hasMethod(IMethod[] methods, String name) {
		for (int i= 0; i < methods.length; i++) {
			if (methods[i].getElementName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean assignable(IType fromType, IType toType) {
		if( fromType.equals(toType) ) {
			return true;
		}
		
		try {
			return fromType.newSupertypeHierarchy(new NullProgressMonitor()).contains(toType);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public void sessionStarted() {
		
	}

	@Override
	public List<IContextInformation> computeContextInformation(ContentAssistInvocationContext context, IProgressMonitor monitor) {
		return null;
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	@Override
	public void sessionEnded() {
		
	}	
	
	static class CompletionProposalImpl implements ICompletionProposal, ICompletionProposalExtension6 {
		private final String label;
		private final StyledString styledString;
		private final IField field;
		private final Type type;
		private final int offset;
		private final String method;
		
		public CompletionProposalImpl(String label, StyledString styledString, String method, IField field, Type type, int offset) {
			this.label = label;
			this.styledString = styledString;
			this.field = field;
			this.type = type;
			this.offset = offset;
			this.method = method;
		}
		
		@Override
		public void apply(IDocument document) {
			//FIXME We need to get smarter (ident, ....)
			switch (type) {
			case SETTER:
			{
				StringBuilder b = new StringBuilder("public void " +method);
				b.append(" {\n");
				b.append("		this." + field.getElementName()+".set("+field.getElementName()+");\n");
				b.append("	}");
				try {
					document.replace(offset, 3, b.toString());
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case GETTER:
			{
				StringBuilder b = new StringBuilder("public "+method);
				b.append(" {\n");
				b.append("		return this."+ field.getElementName() + ".get();\n");
				b.append("	}");
				try {
					document.replace(offset, 3, b.toString());
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			default:
			{
				StringBuilder b = new StringBuilder("public "+method);
				b.append(" {\n");
				b.append("		return this."+ field.getElementName() + ";\n");
				b.append("	}");
				try {
					document.replace(offset+3, 0, b.toString());
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			}
		}

		@Override
		public Point getSelection(IDocument document) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getAdditionalProposalInfo() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getDisplayString() {
			return styledString.getString();
		}

		@Override
		public Image getImage() {
			return JavaPluginImages.get(JavaPluginImages.IMG_MISC_PUBLIC);
		}

		@Override
		public IContextInformation getContextInformation() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public StyledString getStyledDisplayString() {
			return styledString;
		}
		
	}
}