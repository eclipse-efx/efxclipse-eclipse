package org.eclipse.fx.ide.fxml.editors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.AbstractHyperlinkDetector;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.wst.sse.core.internal.provisional.IndexedRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocumentRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.ITextRegion;
import org.eclipse.wst.sse.ui.internal.contentassist.ContentAssistUtils;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.eclipse.wst.xml.core.internal.regions.DOMRegionContext;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;

@SuppressWarnings("restriction")
public class FXMLHyperlinkDetector extends AbstractHyperlinkDetector {

	public FXMLHyperlinkDetector() {
	}

	@Override
	public IHyperlink[] detectHyperlinks(ITextViewer textViewer, IRegion hoverRegion, boolean canShowMultipleHyperlinks) {
		if ((hoverRegion == null) || (textViewer == null) || (textViewer.getDocument() == null)) {
			return null;
		}
		
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
				
				IHyperlink link = null;
				
				if (regionType == DOMRegionContext.XML_TAG_NAME) {
					IDOMNode dom = (IDOMNode)treeNode;
					if( !(dom instanceof ProcessingInstruction) ) {
						link = new FXMLJavaElementHyperLink(null,new Region(flatNode.getStartOffset(region), region.getTextLength()), dom, regionType, documentOffset);
					}
				}
				else if (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_NAME) {
					IDOMNode dom = (IDOMNode)treeNode;
					if( dom instanceof ProcessingInstruction ) {
						String fqn = dom.getNodeValue();
						if( fqn.endsWith("?") ) {
							fqn = fqn.substring(0,fqn.length()-1);
						}
						link = new FXMLJavaElementHyperLink(Util.findType(fqn, dom.getOwnerDocument()),new Region(flatNode.getStartOffset(region), region.getTextLength()), (IDOMNode)treeNode, regionType, documentOffset);
					} else {
						link = new FXMLJavaElementHyperLink(null,new Region(flatNode.getStartOffset(region), region.getTextLength()), (IDOMNode)treeNode, regionType, documentOffset);	
					}
				}
				else if (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_VALUE) {
					IJavaElement element = FXMLTextHover.computeTagAttValueHelp((IDOMNode) treeNode, documentOffset);
					if( element != null ) {
						link = new FXMLJavaElementHyperLink(element,new Region(flatNode.getStartOffset(region), region.getTextLength()), (IDOMNode)treeNode, regionType, documentOffset);	
					}
				} else if( regionType == DOMRegionContext.XML_PI_CONTENT ) {
					IDOMNode dom = (IDOMNode)treeNode;
					String value = dom.getNodeValue();
					
					// Strip the ? it is part of the value
					if( value.endsWith("?") ) {
						value = value.substring(0,value.length()-1);
					}
					
					if( value.endsWith(".css") || value.endsWith(".properties")  ) {
						link = new ResourceHyperLink(new Region(flatNode.getStartOffset(region), region.getTextLength()), (IDOMNode) treeNode, value);	
					} else {
						if(!  value.endsWith("*") ) {
							link = new FXMLJavaElementHyperLink(Util.findType(value, dom.getOwnerDocument()),new Region(flatNode.getStartOffset(region), region.getTextLength()), (IDOMNode)treeNode, regionType, documentOffset);
						}						
					}
				}
				
				if( link != null ) {
					return new IHyperlink[] {link};
				}
			}
		}
		
		return null;
	}

	static class ResourceHyperLink implements IHyperlink {
		private final IRegion region;
		private final IDOMNode xmlnode;
		private final String resourceValue;
		
		public ResourceHyperLink(IRegion region, IDOMNode xmlnode, String resourceValue) {
			this.region = region;
			this.xmlnode = xmlnode;
			this.resourceValue = resourceValue;
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
			String baseLocation = xmlnode.getModel().getBaseLocation();
			IContainer c = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(baseLocation)).getParent();
			IFile f = c.getFile(new Path(resourceValue));
			if( resourceValue.endsWith(".css") ) {
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(new FileEditorInput(f), "org.eclipse.fx.ide.css.CssDsl");
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		}
		
	}
	
	static class FXMLJavaElementHyperLink implements IHyperlink {

		private final IRegion region;
		private final IDOMNode xmlnode;
		private final String regionType;
		private final int documentOffset;
		private final IJavaElement element;
		
		public FXMLJavaElementHyperLink(IJavaElement element, IRegion region, IDOMNode xmlnode, String regionType, int documentOffset) {
			this.element = element;
			this.region = region;
			this.xmlnode = xmlnode;
			this.regionType = regionType;
			this.documentOffset = documentOffset;
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
			IJavaElement element = this.element;
			if( element == null ) {
				if (regionType == DOMRegionContext.XML_TAG_NAME) {
					element = FXMLTextHover.computeTagNameHelp(xmlnode);
				}
				else if (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_NAME) {
					element = FXMLTextHover.computeTagAttNameHelp(xmlnode, documentOffset);
				}
				else if (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_VALUE) {
					element = FXMLTextHover.computeTagAttValueHelp(xmlnode, documentOffset);
				}				
			}

			if( element != null ) {
				try {
					JavaUI.openInEditor(element);
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
