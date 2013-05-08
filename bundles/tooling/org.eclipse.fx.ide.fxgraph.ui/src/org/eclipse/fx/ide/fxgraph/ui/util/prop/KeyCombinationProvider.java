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
package org.eclipse.fx.ide.fxgraph.ui.util.prop;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.fx.ide.fxgraph.ui.util.JDTHelper.HoverImpl;
import org.eclipse.fx.ide.fxgraph.ui.util.JDTHelper.Proposal;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;


public class KeyCombinationProvider implements IProposalProvider {
	private List<String> list = new ArrayList<String>();
	
	public KeyCombinationProvider() {
		list.add("\"<mod>+<key>\"");
	}
	
	protected IMethod findMethod(IJavaProject jp) {
		try {
			IType t = jp.findType("javafx.scene.input.KeyCombination");
			for( IMethod m : t.getMethods() ) {
				if( Flags.isStatic(m.getFlags()) && "valueOf".equals(m.getElementName()) ) {
					return m;
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return null;
	}
	
	@Override
	public List<Proposal> getProposals(IJavaProject jp) {
		List<Proposal> rv = new ArrayList<Proposal>();
		
		HoverImpl h = null;
		IMethod m = findMethod(jp);
		
		if( m != null ) {
			h = new HoverImpl(m);	
		}
		
		for( String s : list ) {
			Proposal p = new Proposal(s);
			p.hover = h;
		}
		return rv;
	}

}
