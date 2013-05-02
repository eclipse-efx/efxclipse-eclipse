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
package org.eclipse.fx.ide.css.ui.outline;

import java.util.Iterator;

import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.css_declaration;
import org.eclipse.fx.ide.css.cssDsl.css_property;
import org.eclipse.fx.ide.css.cssDsl.ruleset;
import org.eclipse.fx.ide.css.cssDsl.selector;
import org.eclipse.fx.ide.css.cssDsl.stylesheet;

/**
 * customization of the default outline structure
 * 
 */
public class CssDslOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	protected void _createChildren(DocumentRootNode parentNode, stylesheet stylesheet) {
		for (ruleset ruleset : stylesheet.getRuleset()) {
			for (selector s : ruleset.getSelectors()) {
				boolean isLeaf = ruleset.getDeclarations().isEmpty();
				EObjectNode node = createEObjectNode(parentNode, ruleset, labelProvider.getImage(s), labelProvider.getText(s), isLeaf);
				node.setShortTextRegion(locationInFileProvider.getSignificantTextRegion(s));
				if (!isLeaf) {
					createChildren(node, ruleset);
				}
			}
			
		}
	}
	
	protected void _createChildren(IOutlineNode parentNode, ruleset ruleset) {
		for (css_declaration d : ruleset.getDeclarations()) {
			StringBuilder valueBuilder = new StringBuilder();
			Iterator<CssTok> iterator = d.getValueTokens().iterator();
			while (iterator.hasNext()) {
				CssTok next = iterator.next();
				valueBuilder.append(labelProvider.getText(next));
			}
			EObjectNode node = createEObjectNode(parentNode, d, labelProvider.getImage(d.getProperty()), labelProvider.getText(d.getProperty()) + ": " +valueBuilder.toString().trim() + (d.isImportant()?" !important":""), true);
			node.setShortTextRegion(locationInFileProvider.getSignificantTextRegion(d.getProperty()));
		}
	}
	
	protected Image _image(ruleset ruleset) {
		return labelProvider.getImage(ruleset);
	}
	
	protected Image _image(css_property property) {
		return labelProvider.getImage(property);
	}
	
	protected boolean _isLeaf(css_property property) {
		return true;
	}
	
	protected boolean _isLeaf(ruleset ruleset) {
		return ruleset.getDeclarations().isEmpty();
	}
		
}
