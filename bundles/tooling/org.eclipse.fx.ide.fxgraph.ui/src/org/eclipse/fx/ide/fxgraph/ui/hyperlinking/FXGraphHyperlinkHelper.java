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
package org.eclipse.fx.ide.fxgraph.ui.hyperlinking;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition;
import org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXCtrlClass;
import org.eclipse.fx.ide.model.IFXCtrlEventMethod;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.PartInitException;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;


import com.google.inject.Inject;

public class FXGraphHyperlinkHelper extends org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper {
	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;
	
	@Inject
	private IJavaProjectProvider javaProjectProvider;
	
	private IType getJDTType(JvmType jvmTypeRef) {
		try {
			IJavaProject javaProject = javaProjectProvider.getJavaProject(jvmTypeRef.eResource().getResourceSet());
			return javaProject.findType(jvmTypeRef.getQualifiedName());			
		} catch(JavaModelException e) {
			//TODO Logging
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public IHyperlink[] createHyperlinksByOffset(XtextResource resource, int offset, boolean createMultipleHyperlinks) {
		IHyperlink[] links = super.createHyperlinksByOffset(resource, offset, createMultipleHyperlinks);
		
		EObject eo = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
		if( eo instanceof ControllerHandledValueProperty ) {
			INode n = NodeModelUtils.getNode(eo);
			
			if( n != null ) {
				INode currentNode = NodeModelUtils.findLeafNodeAtOffset(n, offset);
				List<INode> l = NodeModelUtils.findNodesForFeature(eo, FXGraphPackage.Literals.CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME);
				if( l.contains(currentNode) ) {
					Region region = new Region(currentNode.getOffset(), currentNode.getLength());
					
					Model m = (Model) eo.eResource().getContents().get(0);
					
					if( m != null ) {
						ComponentDefinition def = m.getComponentDef();
						if( def != null ) {
							if( def.getController() != null && def.getController().getType() != null) {
								IType t = getJDTType(def.getController().getType());
								if( t != null ) {
									IFXCtrlClass fxClass = FXPlugin.getClassmodel().findCtrlClass(t.getJavaProject(), t);
									if( fxClass != null ) {
										IFXCtrlEventMethod fxp = fxClass.getAllEventMethods().get(currentNode.getText());
										if( fxp != null ) {
											HyperlinkImpl h = new HyperlinkImpl(region, fxp.getJavaElement());
											if( links == null || links.length == 0 ) {
												return new IHyperlink[] { h };
											} else {
												IHyperlink[] rv = new IHyperlink[links.length+1];
												System.arraycopy(links, 0, rv, 0, rv.length);
												rv[rv.length-1] = h;
												return rv;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		return links;
	}
		
	public void createHyperlinksTo(XtextResource from, Region region, EObject to, IHyperlinkAcceptor acceptor) {
		super.createHyperlinksTo(from, region, to, acceptor);
	}
	
	static class HyperlinkImpl implements IHyperlink {
		private final IRegion region;
		private final IJavaElement element;
		
		public HyperlinkImpl(IRegion region, IJavaElement element) {
			this.region = region;
			this.element = element;
		}
		
		@Override
		public IRegion getHyperlinkRegion() {
			return region;
		}

		@Override
		public String getTypeLabel() {
			return null;
		}

		@Override
		public String getHyperlinkText() {
			return null;
		}

		@Override
		public void open() {
			try {
				JavaUI.openInEditor(element);
			} catch (PartInitException | JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
