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
package org.eclipse.fx.ide.css.ui.occurrences;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.occurrences.DefaultOccurrenceComputer;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import org.eclipse.fx.ide.css.cssDsl.ClassSelector;
import org.eclipse.fx.ide.css.cssDsl.CssSelector;
import org.eclipse.fx.ide.css.cssDsl.ElementSelector;
import org.eclipse.fx.ide.css.cssDsl.IdSelector;
import org.eclipse.fx.ide.css.cssDsl.css_declaration;
import org.eclipse.fx.ide.css.cssDsl.css_property;
import org.eclipse.fx.ide.css.cssDsl.ruleset;
import org.eclipse.fx.ide.css.cssDsl.selector;
import org.eclipse.fx.ide.css.cssDsl.simple_selector;
import org.eclipse.fx.ide.css.cssDsl.stylesheet;

import com.google.inject.Inject;

public class CssDslOccurenceComputer extends DefaultOccurrenceComputer {

	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Inject
	private ILocationInFileProvider locationInFileProvider;
	
	@Override
	public Map<Annotation, Position> createAnnotationMap(XtextEditor editor, final ITextSelection selection, SubMonitor monitor) {
		Map<Annotation, Position> map = null;
		
		final IXtextDocument document = editor.getDocument();
		if(document != null) {
			map = document.readOnly(new IUnitOfWork<Map<Annotation, Position>, XtextResource>() {
				public Map<Annotation, Position> exec(final XtextResource resource) throws Exception {
					Map<Annotation,Position> m = new HashMap<Annotation, Position>();
					
					if(resource != null) {
						EObject target = eObjectAtOffsetHelper.resolveElementAt(resource, (selection).getOffset());
						
						// ElementSelectors:
						if (target instanceof ElementSelector) {
							stylesheet root = (stylesheet) resource.getContents().get(0);
							for (ruleset r : root.getRuleset()) {
								for (selector s : r.getSelectors()) {
									selector cur = s;
									while (cur != null) {
										for (simple_selector ss : cur.getSimpleselectors()) {
											if (ss.getElement() != null) {
												ElementSelector check = ss.getElement();
												if (check.getName().equals(((ElementSelector) target).getName())) {
													ITextRegion declarationRegion = locationInFileProvider.getFullTextRegion(ss.getElement());
													addOccurrenceAnnotation(DECLARATION_ANNOTATION_TYPE, document, declarationRegion, m);
												}
											}
										}
										cur = cur.getSelector();
									}
								}
							}
						}
						
						// ClassSelector:
						if (target instanceof ClassSelector) {
							stylesheet root = (stylesheet) resource.getContents().get(0);
							for (ruleset r : root.getRuleset()) {
								for (selector s : r.getSelectors()) {
									selector cur = s;
									while (cur != null) {
										for (simple_selector ss : cur.getSimpleselectors()) {
											for (CssSelector subSel : ss.getSubSelectors()) {
												if (subSel instanceof ClassSelector) {
													ClassSelector check = (ClassSelector) subSel;
													if (check.getName() != null) {
														// TODO i don't get get a ClassSelectors name can be null
														if (check.getName().equals(((ClassSelector) target).getName())) {
															ITextRegion declarationRegion = locationInFileProvider.getFullTextRegion(subSel);
															addOccurrenceAnnotation(DECLARATION_ANNOTATION_TYPE, document, declarationRegion, m);
														}
													}
												}
											}
											if (ss.getElement() != null) {
												
											}
										}
										cur = cur.getSelector();
									}
								}
							}
						}
						// ClassSelector:
						if (target instanceof IdSelector) {
							stylesheet root = (stylesheet) resource.getContents().get(0);
							for (ruleset r : root.getRuleset()) {
								for (selector s : r.getSelectors()) {
									selector cur = s;
									while (cur != null) {
										for (simple_selector ss : cur.getSimpleselectors()) {
											for (CssSelector subSel : ss.getSubSelectors()) {
												if (subSel instanceof IdSelector) {
													IdSelector check = (IdSelector) subSel;
													if (check.getName().equals(((IdSelector) target).getName())) {
														ITextRegion declarationRegion = locationInFileProvider.getFullTextRegion(subSel);
														addOccurrenceAnnotation(DECLARATION_ANNOTATION_TYPE, document, declarationRegion, m);
													}
												}
											}
											if (ss.getElement() != null) {
												
											}
										}
										cur = cur.getSelector();
									}
								}
							}
						}
						
						// Properties
						if (target instanceof css_property) {
							stylesheet root = (stylesheet) resource.getContents().get(0);
							for (ruleset r : root.getRuleset()) {
								for (css_declaration d : r.getDeclarations()) {
									if (d.getProperty().getName().equals(((css_property) target).getName())) {
										ITextRegion declarationRegion = locationInFileProvider.getFullTextRegion(d.getProperty());
										addOccurrenceAnnotation(DECLARATION_ANNOTATION_TYPE, document, declarationRegion, m);
									}
								}
							}
						}
					}
					return m;
				}
			});
		}
			
		
		return map;
	}
}
