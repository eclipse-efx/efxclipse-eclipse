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
package org.eclipse.fx.ide.jdt.ui.internal;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

/**
 * 
 */
public class Util {
	private IJavaProject project;
	private IType property;
	private IType readonlyProperty;
	
	public Util(IJavaProject project) {
		this.project = project;
	}
	
	public static final String toFirstUpper(String s) {
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}
	
	private IType getReadOnlyProperty() {
		if( readonlyProperty == null ) {
			try {
				readonlyProperty = project.findType("javafx.beans.property.ReadOnlyProperty");
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return readonlyProperty;
	}
	
	public boolean isPropertyField(IType owerType, IField f) {
		try {
			IType type = toType(owerType, f.getTypeSignature());
			if( type != null ) {
				return assignable(type,getReadOnlyProperty());	
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean assignable(IType fromType, IType toType) {
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
	
	public static IType toType(IType t, String typeSig) throws JavaModelException {
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
}
