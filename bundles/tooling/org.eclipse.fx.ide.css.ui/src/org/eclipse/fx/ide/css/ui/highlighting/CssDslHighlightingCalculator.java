/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.ui.highlighting;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.ElementSelector;
import org.eclipse.fx.ide.css.cssDsl.FuncTok;
import org.eclipse.fx.ide.css.cssDsl.IdentifierTok;
import org.eclipse.fx.ide.css.cssDsl.StringTok;
import org.eclipse.fx.ide.css.cssDsl.SymbolTok;
import org.eclipse.fx.ide.css.cssDsl.URLType;
import org.eclipse.fx.ide.css.cssDsl.css_declaration;
import org.eclipse.fx.ide.css.cssDsl.simple_selector;

public class CssDslHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if( resource == null ) {
			return;
		}
		
		TreeIterator<Object> it = EcoreUtil.getAllContents(resource, true);
		
		while( it.hasNext() ) {
			Object o = it.next();
			
			if (o instanceof ElementSelector) {
				final ICompositeNode n = NodeModelUtils.getNode((EObject)o);
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), n.getLength(), CssDslHighlightingConfiguration.ELEMENT);	
				}
			}
			else if (o instanceof IdentifierTok) {
				final ICompositeNode n = NodeModelUtils.getNode((EObject)o);
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);	
				}
			}
			else if( o instanceof css_declaration ) {
				css_declaration dec = (css_declaration) o;
				if( dec.getProperty() != null && dec.getProperty().getName() != null && dec.getProperty().getName().trim().length() > 0 ) {
					ICompositeNode n = NodeModelUtils.getNode(dec);
					if( n != null ) {
						if( n.hasChildren() ) {
							acceptor.addPosition(n.getFirstChild().getOffset(), n.getFirstChild().getLength(), CssDslHighlightingConfiguration.DECLARATIONNAME);
						}							
					}
				}
			} 
			else if( o instanceof simple_selector ) {
				final ICompositeNode n = NodeModelUtils.getNode((EObject)o);
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), n.getLength(), CssDslHighlightingConfiguration.SELECTOR);	
				}
			}
			else if (o instanceof URLType) {
				final URLType url = (URLType) o;
				final ICompositeNode n = NodeModelUtils.getNode(url);
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), 4, CssDslHighlightingConfiguration.FUNCTION);
					acceptor.addPosition(n.getOffset()+4, n.getLength()-5, CssDslHighlightingConfiguration.URL);
					acceptor.addPosition(n.getOffset() + n.getLength() - 1, 1, CssDslHighlightingConfiguration.FUNCTION);					
				}
			}
			else if (o instanceof FuncTok) {
				final FuncTok funcTok = (FuncTok) o;
				final ICompositeNode n = NodeModelUtils.getNode(funcTok);
				
				int nameLength = funcTok.getName().getName().length();
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), nameLength + 1, CssDslHighlightingConfiguration.FUNCTION);	
				}
				
				for (CssTok tok : ((FuncTok) o).getParams()) {
					if (tok instanceof SymbolTok) {
						if (",".equals(((SymbolTok) tok).getSymbol())) { //$NON-NLS-1$
							ICompositeNode colonNode = NodeModelUtils.getNode(tok);
							if( colonNode != null ) {
								acceptor.addPosition(colonNode.getOffset(), colonNode.getLength(), CssDslHighlightingConfiguration.FUNCTION);	
							}
						}
					}
				}
				
				if( n != null ) {
					acceptor.addPosition(n.getOffset() + n.getLength() - 1, 1, CssDslHighlightingConfiguration.FUNCTION);	
				}
			}
			else if (o instanceof StringTok) {
				final ICompositeNode n = NodeModelUtils.getNode((EObject)o);
				if( n != null ) {
					acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.STRING_ID);	
				}
			}
		}
	}
}