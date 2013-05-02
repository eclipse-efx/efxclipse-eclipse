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
package org.eclipse.fx.ide.css.ui.doubleclicking;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.doubleClicking.LexerTokenAndCharacterPairAwareStrategy;
import org.eclipse.xtext.ui.editor.model.PartitionTokenScanner;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import org.eclipse.fx.ide.css.cssDsl.CssDslPackage;
import org.eclipse.fx.ide.css.cssDsl.URLType;

import com.google.inject.Inject;

/**
 * @author ccaks
 *
 */
public class CssGrammarAwareStrategy extends LexerTokenAndCharacterPairAwareStrategy {

	@Inject
	PartitionTokenScanner scanner;
	
	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;
	
	@Inject
	private ILocationInFileProvider locationInFileProvider;
	
	/**
	 * Call this method only from within an IUnitOfWork
	 */
	protected Pair<EObject, IRegion> getXtextElementAt(XtextResource resource, final int offset) {
		// check for cross reference
		EObject crossLinkedEObject = eObjectAtOffsetHelper.resolveCrossReferencedElementAt(resource, offset);
		if (crossLinkedEObject != null) {
			if (!crossLinkedEObject.eIsProxy()) {
				IParseResult parseResult = resource.getParseResult();
				if (parseResult != null) {
					ILeafNode leafNode = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
					if(leafNode != null && leafNode.isHidden() && leafNode.getOffset() == offset) {
						leafNode = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset - 1);
					}
					if (leafNode != null) {
						return Tuples.create(crossLinkedEObject, (IRegion) new Region(leafNode.getOffset(), leafNode.getLength()));
					}
				}
			}
		} else {
			EObject o = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
			
			// This allows us to select only the urls content on doubleclick
			if (o instanceof URLType) {
				final URLType urlType = (URLType) o;
				if (urlType.getUrl() != null) {
					ITextRegion r1 = locationInFileProvider.getFullTextRegion(o, CssDslPackage.Literals.URL_TYPE__URL, 0);
					int mod = 0;
					if (urlType.getUrl().startsWith("\"") || urlType.getUrl().startsWith("'")) {
						mod = 1;
					}
					IRegion r = new Region(r1.getOffset() + mod, r1.getLength() - 2 * mod);
					return Tuples.create(o, r);
				}
			}
			if (o != null) {
				ITextRegion region = locationInFileProvider.getSignificantTextRegion(o);
				final IRegion region2 = new Region(region.getOffset(), region.getLength());
				if (TextUtilities.overlaps(region2, new Region(offset, 0)))
					return Tuples.create(o, region2);
			}
		}
		return null;
	}
	
	@Override
	protected IRegion findWord(IDocument document, final int offset) {
		XtextDocument xdoc = (XtextDocument) document;

		IRegion result = xdoc.readOnly(new IUnitOfWork<IRegion, XtextResource>() {

			@Override
			public IRegion exec(XtextResource state) throws Exception {
				// resource can be null e.g. read only zip/jar entry
				if (state == null) {
					return null;
				}
				Pair<EObject, IRegion> element = getXtextElementAt(state, offset);
				if (element != null) {
					return element.getSecond();
				} else {
					return null;
				}
			}
			
		});
		
		
		
		return result;
	}
	
}
