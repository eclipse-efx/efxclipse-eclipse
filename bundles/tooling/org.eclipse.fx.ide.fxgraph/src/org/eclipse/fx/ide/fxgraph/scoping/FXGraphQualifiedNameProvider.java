/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
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
package org.eclipse.fx.ide.fxgraph.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.eclipse.fx.ide.fxgraph.fXGraph.PackageDeclaration;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;

import com.google.inject.Inject;


public class FXGraphQualifiedNameProvider extends XbaseQualifiedNameProvider {
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if( obj instanceof ComponentDefinition ) {
			if( obj.eContainer() instanceof Model ) {
				ComponentDefinition compDef = (ComponentDefinition) obj;
				Model model = (Model) obj.eContainer();
				PackageDeclaration packageDec = model.getPackage();
				if( packageDec != null ) {
					return qualifiedNameConverter.toQualifiedName(packageDec.getName()+"."+compDef.getName());
				} else {
					return qualifiedNameConverter.toQualifiedName(compDef.getName());
				}
			}
			
		}
		// TODO Auto-generated method stub
		return super.getFullyQualifiedName(obj);
	}
}
