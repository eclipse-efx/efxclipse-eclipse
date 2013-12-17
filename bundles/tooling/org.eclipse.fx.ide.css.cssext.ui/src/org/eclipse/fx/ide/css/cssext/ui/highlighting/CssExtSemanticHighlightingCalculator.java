/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui.highlighting;

import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Doku;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PseudoClassDefinition;

public class CssExtSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if( resource == null) {
			return;
		}
		
		IParseResult pr = resource.getParseResult();
		
		if( pr == null ) {
			return;
		}
		
		INode root = pr.getRootNode();
		BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
		while( it.hasNext() ) {
			INode node = it.next();
		
			
			if (node.getSemanticElement() instanceof CSSRuleRef) {
				CSSRuleRef ref = (CSSRuleRef) node.getSemanticElement();
				if (ref.getRef() instanceof CSSRuleDefinition) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.REFERENCES_ID);
				}
				else if (ref.getRef() instanceof PropertyDefinition) {
					acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.PROPERTY_ID);
				}
			}
			
			else if (node.getSemanticElement() instanceof Doku) {
				acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.CSSDOC_ID);
			}
			
			else if (node.getSemanticElement() instanceof ElementDefinition) {
				ElementDefinition el = (ElementDefinition) node.getSemanticElement();
				BidiTreeIterator<INode> innerIt = node.getAsTreeIterable().iterator();
				while(innerIt.hasNext()) {
					INode n = innerIt.next();
					if (n.getText().equals(el.getName())) {
						acceptor.addPosition(n.getOffset(), n.getLength(), CssExtHighlightingConfiguration.ELEMENT_ID);
						break;
					}
				}
			}
			
			else if (node.getSemanticElement() instanceof PseudoClassDefinition) {
				acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.ELEMENT_ID);
			}
			
			else if (node.getSemanticElement() instanceof PropertyDefinition) {
				PropertyDefinition el = (PropertyDefinition) node.getSemanticElement();
				BidiTreeIterator<INode> innerIt = node.getAsTreeIterable().iterator();
				while(innerIt.hasNext()) {
					INode n = innerIt.next();
					if (n.getText().equals(el.getName())) {
						acceptor.addPosition(n.getOffset(), n.getLength(), CssExtHighlightingConfiguration.PROPERTY_ID);
						break;
					}
				}
			}
			
			else if (node.getSemanticElement() instanceof CSSRuleDefinition) {
				CSSRuleDefinition el = (CSSRuleDefinition) node.getSemanticElement();
				BidiTreeIterator<INode> innerIt = node.getAsTreeIterable().iterator();
				while(innerIt.hasNext()) {
					INode n = innerIt.next();
					if (n.getText().equals(el.getName())) {
						acceptor.addPosition(n.getOffset(), n.getLength(), CssExtHighlightingConfiguration.RULE_ID);
						break;
					}
				}
//				acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.RULE_ID);
//				CSSRuleDefinition el = (CSSRuleDefinition) node.getSemanticElement();
//				BidiTreeIterator<INode> innerIt = node.getAsTreeIterable().iterator();
//				while(innerIt.hasNext()) {
//					INode n = innerIt.next();
//					if (n.getText().equals(el.getName())) {
//						acceptor.addPosition(n.getOffset(), n.getLength(), CssExtHighlightingConfiguration.RULE_ID);
//						break;
//					}
//				}
			}
			
			else if (node instanceof HiddenLeafNode  && node.getGrammarElement() instanceof TerminalRule) {
				if(((TerminalRule)node.getGrammarElement()).getName().equalsIgnoreCase("ID")) {
					
					acceptor.addPosition(node.getOffset(), node.getLength(), CssExtHighlightingConfiguration.ELEMENT_ID);
					
				}
				
			}
		}
	}

}
