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
package org.eclipse.fx.ide.fxml.editors;

import org.eclipse.fx.ide.fxml.editors.FXMLCompletionProposalComputer.JavadocHoverWrapper;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextHoverExtension2;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.wst.sse.core.internal.provisional.IndexedRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocumentRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.ITextRegion;
import org.eclipse.wst.sse.ui.internal.contentassist.ContentAssistUtils;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.eclipse.wst.xml.core.internal.regions.DOMRegionContext;
import org.eclipse.wst.xml.ui.internal.Logger;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;

import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXClass;
import org.eclipse.fx.ide.model.IFXCtrlClass;
import org.eclipse.fx.ide.model.IFXCtrlEventMethod;
import org.eclipse.fx.ide.model.IFXEnumProperty;
import org.eclipse.fx.ide.model.IFXEventHandlerProperty;
import org.eclipse.fx.ide.model.IFXProperty;

@SuppressWarnings("restriction")
public class FXMLTextHover implements ITextHover, ITextHoverExtension, ITextHoverExtension2 {
	private JavadocHoverWrapper javadocWrapper = new JavadocHoverWrapper();
	private IJavaElement element;
	
	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		Object o = getHoverInfo2(textViewer, hoverRegion);
		return o != null ? o.toString() : null;
	}
	
	@Override
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		if ((textViewer == null) || (textViewer.getDocument() == null)) {
			return null;
		}
		
		IStructuredDocumentRegion flatNode = ((IStructuredDocument) textViewer.getDocument()).getRegionAtCharacterOffset(offset);
		ITextRegion region = null;

		if (flatNode != null) {
			region = flatNode.getRegionAtCharacterOffset(offset);
		}

		
		if (region != null) {
			// only supply hoverhelp for tag name, attribute name, or
			// attribute value
			String regionType = region.getType();
			if ((regionType == DOMRegionContext.XML_TAG_NAME) || (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_NAME) || (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_VALUE) || (regionType == DOMRegionContext.XML_PI_CONTENT)) {
				try {
					// check if we are at whitespace before or after line
					IRegion line = textViewer.getDocument().getLineInformationOfOffset(offset);
					if ((offset > (line.getOffset())) && (offset < (line.getOffset() + line.getLength()))) {
						// check if we are in region's trailing whitespace
						// (whitespace after relevant info)
						if (offset < flatNode.getTextEndOffset(region)) {
							return new Region(flatNode.getStartOffset(region), region.getTextLength());
						}
					}
				}
				catch (BadLocationException e) {
					Logger.logException(e);
				}
			}
		}
		return null;
	}

	
	public static IJavaElement computeTagNameHelp(IDOMNode xmlnode) {
		if( Character.isLowerCase(xmlnode.getNodeName().charAt(0)) ) {
			Node parent = xmlnode.getParentNode();
			if( parent == null || parent.getNodeName() == null ||  parent.getOwnerDocument() == null) {
				return null;
			}
			IType ownerType = Util.findType(parent.getNodeName(), parent.getOwnerDocument());
			if( ownerType != null ) {
				IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
				if( fxClass != null ) {
					IFXProperty p = fxClass.getProperty(xmlnode.getNodeName());
					if( p != null ) {
						return p.getJavaElement();
					}
				}
			}
		} else {
			if( xmlnode.getNodeName().contains(".") ) {
				String[] parts = xmlnode.getNodeName().split("\\.");
				IType ownerType = Util.findType(parts[0], xmlnode.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						IFXProperty p = fxClass.getStaticProperty(parts[1]);
						if( p != null ) {
							return p.getJavaElement();
						}
					}
				}
			} else {
				IType ownerType = Util.findType(xmlnode.getNodeName(), xmlnode.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						try {
							return Util.findProject(xmlnode.getOwnerDocument()).findType(fxClass.getFQN());
						} catch (JavaModelException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}				
			}
		}
		
		return null;
	}
	
	public static IJavaElement computeTagAttNameHelp(IDOMNode xmlnode,int offset) {
		NamedNodeMap m = xmlnode.getAttributes();
		IDOMNode attribute = null;
		if( m != null ) {
			for( int i = 0; i < m.getLength(); i++ ) {
				IDOMNode a = (IDOMNode) m.item(i);
				if( a.contains(offset) ) {
					attribute = a;
				}
			}	
		}
		
		if( attribute != null ) {
			Node parent = xmlnode;
			
			if( attribute.getNodeName().contains(".") ) {
				String[] parts = attribute.getNodeName().split("\\.");
				IType ownerType = Util.findType(parts[0], parent.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						IFXProperty p = fxClass.getStaticProperty(parts[1]);
						if( p != null ) {
							return p.getJavaElement();
						}
					}
				}
			} else {
				IType ownerType = Util.findType(parent.getNodeName(), parent.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						IFXProperty p = fxClass.getProperty(attribute.getNodeName());
						if( p != null ) {
							return p.getJavaElement();
						}
					}
				}
			}
		}
		
		return null;
	}
	
	public static IJavaElement computeTagAttValueHelp(IDOMNode xmlnode, int offset) {
		NamedNodeMap m = xmlnode.getAttributes();
		IDOMNode attribute = null;
		if( m == null ) {
			return null;
		}
		for( int i = 0; i < m.getLength(); i++ ) {
			IDOMNode a = (IDOMNode) m.item(i);
			if( a.contains(offset) ) {
				attribute = a;
			}
		}
		
		if( attribute != null ) {
			Node parent = xmlnode;
			IFXProperty p = null;
			
			if( "http://javafx.com/fxml".equals(attribute.getNamespaceURI()) ) {
				Document d = xmlnode.getOwnerDocument();
				return Util.findType(attribute.getNodeValue(), d);
			}
			
			if( attribute.getNodeName().contains(".") ) {
				String[] parts = attribute.getNodeName().split("\\.");
				IType ownerType = Util.findType(parts[0], parent.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						p = fxClass.getStaticProperty(parts[1]);
						
					}
				}
			} else {
				IType ownerType = Util.findType(parent.getNodeName(), parent.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						p = fxClass.getProperty(attribute.getNodeName());
						
					}
				}
			}
			
			if( p instanceof IFXEnumProperty ) {
				IType t = ((IFXEnumProperty) p).getEnumType();
				try {
					for (IField f : t.getFields()) {
						if (Flags.isEnum(f.getFlags())) {
							if( f.getElementName().equals(attribute.getNodeValue()) ) {
								return f;
							}
						}
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if( p instanceof IFXEventHandlerProperty && attribute.getNodeValue().startsWith("#") ) {
				Document d = xmlnode.getOwnerDocument();
				Element e = d.getDocumentElement();
				Attr a = e.getAttributeNodeNS("http://javafx.com/fxml", "controller");
				if (a != null) {
					IType t = Util.findType(a.getValue(), d);
					if( t != null ) {
						IFXCtrlClass cl = FXPlugin.getClassmodel().findCtrlClass(t.getJavaProject(), t);
						 IFXCtrlEventMethod method = cl.getAllEventMethods().get(attribute.getNodeValue().substring(1));
						 if( method != null ) {
							 return method.getJavaElement();
						 }
					}
				}
			}
		}
		
		return null;
	}
	
	
	@Override
	public IInformationControlCreator getHoverControlCreator() {
		if( element != null ) {
			javadocWrapper.setJavaElement(element);
			return javadocWrapper.getHoverControlCreator();
		}
		return null;
	}

	@Override
	public Object getHoverInfo2(ITextViewer textViewer, IRegion hoverRegion) {
		if ((hoverRegion == null) || (textViewer == null) || (textViewer.getDocument() == null)) {
			return null;
		}
		
		element = null;

		int documentOffset = hoverRegion.getOffset();
		
		IndexedRegion treeNode = ContentAssistUtils.getNodeAt(textViewer, documentOffset);
		if (treeNode == null) {
			return null;
		}
		Node node = (Node) treeNode;
		
		while ((node != null) && (node.getNodeType() == Node.TEXT_NODE) && (node.getParentNode() != null)) {
			node = node.getParentNode();
		}
		IStructuredDocumentRegion flatNode = ((IStructuredDocument) textViewer.getDocument()).getRegionAtCharacterOffset(documentOffset);
		
		if (flatNode != null) {
			ITextRegion region = flatNode.getRegionAtCharacterOffset(documentOffset);
			if (region != null) {
				String regionType = region.getType();
				if (regionType == DOMRegionContext.XML_TAG_NAME) {
					element = computeTagNameHelp((IDOMNode) treeNode);
				}
				else if (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_NAME) {
					IDOMNode dom = (IDOMNode)treeNode;
					if( dom instanceof ProcessingInstruction ) {
						String fqn = dom.getNodeValue();
						if( fqn.endsWith("?") ) {
							fqn = fqn.substring(0,fqn.length()-1);
						}
						element = Util.findType(fqn, dom.getOwnerDocument());
					} else {
						element = computeTagAttNameHelp((IDOMNode) treeNode, documentOffset);	
					}
				}
				else if( regionType == DOMRegionContext.XML_PI_CONTENT) {
					IDOMNode dom = (IDOMNode)treeNode;
					String fqn = dom.getNodeValue();
					if( fqn.endsWith("?") ) {
						fqn = fqn.substring(0,fqn.length()-1);
					}
					if( !(fqn.endsWith(".css") || fqn.endsWith(".properties") || fqn.endsWith("*"))  ) {
						element = Util.findType(fqn, dom.getOwnerDocument());	
					}
				}
				else if (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_VALUE) {
					element = computeTagAttValueHelp((IDOMNode) treeNode, documentOffset);
				}
			}
		}
		
		
		if( element != null ) {
			javadocWrapper.setJavaElement(element);
			return javadocWrapper.getHoverInfo2(textViewer, hoverRegion);
		}
		return null;
	}

}
