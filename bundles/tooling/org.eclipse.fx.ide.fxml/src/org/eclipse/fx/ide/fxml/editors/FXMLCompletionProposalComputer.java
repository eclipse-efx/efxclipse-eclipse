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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

import org.eclipse.core.internal.registry.osgi.Activator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.TypeNameRequestor;
import org.eclipse.jdt.internal.ui.text.java.hover.JavadocHover;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentRewriteSession;
import org.eclipse.jface.text.DocumentRewriteSessionType;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocumentRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.ITextRegion;
import org.eclipse.wst.sse.ui.contentassist.CompletionProposalInvocationContext;
import org.eclipse.wst.sse.ui.contentassist.ICompletionProposalComputer;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.eclipse.wst.xml.ui.internal.contentassist.AbstractXMLCompletionProposalComputer;
import org.eclipse.wst.xml.ui.internal.contentassist.ContentAssistRequest;
import org.eclipse.xtext.common.types.xtext.ui.IntersectingJavaSearchScope;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal.IReplacementTextApplier;
import org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.CamelCase;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;
import org.osgi.framework.ServiceReference;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXClass;
import org.eclipse.fx.ide.model.IFXCollectionProperty;
import org.eclipse.fx.ide.model.IFXCtrlClass;
import org.eclipse.fx.ide.model.IFXCtrlEventMethod;
import org.eclipse.fx.ide.model.IFXCtrlField;
import org.eclipse.fx.ide.model.IFXEnumProperty;
import org.eclipse.fx.ide.model.IFXEventHandlerProperty;
import org.eclipse.fx.ide.model.IFXObjectProperty;
import org.eclipse.fx.ide.model.IFXPrimitiveProperty;
import org.eclipse.fx.ide.model.IFXPrimitiveProperty.Type;
import org.eclipse.fx.ide.model.IFXProperty;
import org.eclipse.fx.ide.ui.editor.IValueOfContributor;
import org.eclipse.fx.ide.ui.editor.IValueOfContributor.DialogProposal;
import org.eclipse.fx.ide.ui.editor.IValueOfContributor.Proposal;
import org.eclipse.fx.ide.ui.editor.ValueOfContributionCollector;
import org.eclipse.fx.ide.ui.util.IconKeys;

/**
 * Computes proposals for FXML documents
 */
@SuppressWarnings("restriction")
public class FXMLCompletionProposalComputer extends AbstractXMLCompletionProposalComputer implements ICompletionProposalComputer {
	private static final CamelCase MATCHER = new CamelCase();
	private static final PrefixMatcher ATTRIBUTE_MATCHER = new CamelCase() {
		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			return super.isCandidateMatchingPrefix(name.startsWith("\"") ? name.substring(1) : name, prefix.startsWith("\"") ? prefix.substring(1) : prefix); //$NON-NLS-1$ //$NON-NLS-2$
		}
	};

	private static final PrefixMatcher STATIC_ELEMENT_MATCHER = new CamelCase() {
		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			String n = name;
			n = n.substring(n.indexOf('.') + 1, n.indexOf('>')).trim();
			return super.isCandidateMatchingPrefix(n, prefix);
		}
	};

	private static final PrefixMatcher STATIC_ATTRIBUTE_MATCHER = new CamelCase() {
		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			String n = name.substring(name.indexOf('.') + 1);
			String p = prefix.startsWith("\"") ? prefix.substring(1) : prefix; //$NON-NLS-1$
			return super.isCandidateMatchingPrefix(n, p);
		}
	};
	
	static final PrefixMatcher CLASS_ATTRIBUTE_MATCHER = new PrefixMatcher() {
		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			String n = name.startsWith("\"") ? name.substring(1) : name; //$NON-NLS-1$
			String p = prefix.startsWith("\"") ? prefix.substring(1) : prefix; //$NON-NLS-1$
			return FQN_MATCHER.isCandidateMatchingPrefix(n, p);
		}
	};

	private static final PrefixMatcher EVENT_ATTRIBUTE_MATCHER = new CamelCase() {
		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			return super.isCandidateMatchingPrefix(normalize(name), normalize(prefix));
		}

		private String normalize(String value) {
			String v = value.startsWith("\"") ? value.substring(1) : value; //$NON-NLS-1$
			v = v.startsWith("#") ? v.substring(1) : v; //$NON-NLS-1$

			return v;
		}
	};

	static final FQNPrefixMatcher FQN_MATCHER = new FQNPrefixMatcher();

	{
		FQN_MATCHER.setLastSegmentFinder(new FQNPrefixMatcher.DefaultLastSegmentFinder());
		FQN_MATCHER.setDelegate(MATCHER);
	}

	private static final int DEFAULT_PRIORITY = 200;
	private static final int PRIORITY_LOWER_1 = 100;

	private ValueOfContributionCollector valueOfCollector;
	
	/**
	 * Create a new instance
	 */
	public FXMLCompletionProposalComputer() {
		ServiceReference<ValueOfContributionCollector> ref = Activator.getContext().getServiceReference(ValueOfContributionCollector.class);
		this.valueOfCollector = Activator.getContext().getService(ref);
	}
	
	@Override
	public void sessionStarted() {
		//nothing
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	@Override
	public void sessionEnded() {
		//nothing
	}

	@Override
	protected void addAttributeNameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		String typeName = null;
		Node parent = contentAssistRequest.getParent();
		Set<String> existingAttributes = new HashSet<>();
		if (parent.getNodeType() == Node.ELEMENT_NODE) {
			typeName = parent.getNodeName();
			Element e = (Element) parent;
			for( int i = 0; i < e.getAttributes().getLength(); i++ ) {
				existingAttributes.add(e.getAttributes().item(i).getNodeName());
			}
		}
		
		if( "fx:root".equals(typeName) ) { //$NON-NLS-1$
			typeName = parent.getAttributes().getNamedItem("type").getNodeValue(); //$NON-NLS-1$
		}
		
		if (typeName != null) {
			
			if (Character.isLowerCase(typeName.charAt(0)) || typeName.contains(".")) { //$NON-NLS-1$
				// no proposal for static elements and attribute definitions
				return;
			}

			IType type = findType(typeName, contentAssistRequest, context);
			if (type != null) {
				IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
				
				if( fxClass.getValueOf() != null ) {
					FXMLCompletionProposal cp = createAttributeProposal(contentAssistRequest, context, "fx:value=\"\"", new StyledString("fx:valueOf").append(" - " + fxClass.getSimpleName(), StyledString.QUALIFIER_STYLER), IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY+10, MATCHER); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					if (cp != null) {
						cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
						cp.setHover(new HoverImpl(fxClass.getValueOf()));

						contentAssistRequest.addProposal(cp);
					}
				}
				
				for (IFXProperty property : fxClass.getAllProperties().values()) {
					if( ! existingAttributes.contains(property.getName()) ) {
						createAttributeNameProposal(contentAssistRequest, context, property);	
					}
				}

				if (parent.getParentNode() != null) {
					Node n = null;
					
					if (Character.isUpperCase(parent.getParentNode().getNodeName().charAt(0)) || "fx:root".equals(parent.getParentNode().getNodeName())) { //$NON-NLS-1$
						n = parent.getParentNode();
					} else if (parent.getParentNode().getParentNode() != null) {
						if (Character.isUpperCase(parent.getParentNode().getParentNode().getNodeName().charAt(0)) || "fx:root".equals(parent.getParentNode().getParentNode().getNodeName())) { //$NON-NLS-1$
							n = parent.getParentNode().getParentNode();
						}
					}
					
					if (n != null) {
						IType containerType;
						if( "fx:root".equals(n.getNodeName()) ) { //$NON-NLS-1$
							containerType = Util.findType(n.getAttributes().getNamedItem("type").getNodeValue(), parent.getOwnerDocument()); //$NON-NLS-1$
						} else {
							containerType = Util.findType(n.getNodeName(), parent.getOwnerDocument());	
						}
						
						if (containerType != null) {
							IFXClass fxclass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), containerType);
							if (fxclass != null) {
								for (IFXProperty property : fxclass.getAllStaticProperties().values()) {
									if( ! existingAttributes.contains(property.getFXClass().getSimpleName() + "." +property.getName()) ) { //$NON-NLS-1$
										createAttributeNameProposal(contentAssistRequest, context, property);	
									}
								}
							}
						}
					} else {
						FXMLCompletionProposal cp = createAttributeProposal(contentAssistRequest, context, "fx:controller=\"\"", new StyledString("fx:controller").append(" - FXML built-in", StyledString.QUALIFIER_STYLER), IconKeys.getIcon(IconKeys.CLASS_KEY), DEFAULT_PRIORITY+10, MATCHER); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						if( cp != null ) {
							contentAssistRequest.addProposal(cp);	
						}
					}
				}
			}
		}
	}

	private static void createAttributeNameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXProperty fxProperty) {
		if (fxProperty.isSetable()) {
			if (fxProperty instanceof IFXPrimitiveProperty) {
				createPrimitivePropnameProposal(contentAssistRequest, context, (IFXPrimitiveProperty) fxProperty);
			} else if (fxProperty instanceof IFXEnumProperty) {
				createEnumPropnameProposals(contentAssistRequest, context, (IFXEnumProperty) fxProperty);
			} else if (fxProperty instanceof IFXEventHandlerProperty) {
				createEventHandlerPropnameProposals(contentAssistRequest, context, (IFXEventHandlerProperty) fxProperty);
			} else if (fxProperty instanceof IFXObjectProperty) {
				createObjectPropnameProposals(contentAssistRequest, context, (IFXObjectProperty) fxProperty);
			}
		}
	}

	private static void createEnumPropnameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXEnumProperty prop) {
		FXMLCompletionProposal cp;

		if (prop.isStatic()) {
			StyledString s = new StyledString();
			s.append("(static) ", StyledString.COUNTER_STYLER); //$NON-NLS-1$
			s.append(prop.getFXClass().getSimpleName() + "." + prop.getName() + " : " + prop.getEnumTypeAsString(false)); //$NON-NLS-1$ //$NON-NLS-2$
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

			String proposalValue = prop.getFXClass().getSimpleName() + "." + prop.getName() + "=\"\""; //$NON-NLS-1$ //$NON-NLS-2$

			cp = createAttributeProposal(contentAssistRequest, context, proposalValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY - 10, STATIC_ATTRIBUTE_MATCHER);
		} else {
			StyledString s = new StyledString(prop.getName() + " : " + prop.getEnumTypeAsString(false)); //$NON-NLS-1$
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

			String propValue = prop.getName() + "=\"\""; //$NON-NLS-1$

			cp = createAttributeProposal(contentAssistRequest, context, propValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY, MATCHER);
		}

		if (cp != null) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			contentAssistRequest.addProposal(cp);
		}
	}

	private static void createEventHandlerPropnameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXEventHandlerProperty prop) {
		if (!prop.isStatic()) {
			StyledString s = new StyledString(prop.getName() + " : " + prop.getEventTypeAsString(false)); //$NON-NLS-1$
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

			String propValue = prop.getName() + "=\"#\""; //$NON-NLS-1$

			FXMLCompletionProposal cp = createAttributeProposal(contentAssistRequest, context, propValue, s, IconKeys.getIcon(IconKeys.EVENT_KEY), DEFAULT_PRIORITY, MATCHER);
			if (cp != null) {
				cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
				cp.setHover(new HoverImpl(prop.getJavaElement()));

				contentAssistRequest.addProposal(cp);
			}
		}
	}

	private static void createObjectPropnameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXObjectProperty prop) {
		String type = prop.getElementTypeAsString(true);

		// TODO Should we allow other elements because one can use $... to
		// reference elements
		if ("java.lang.Boolean".equals(type) || isIntegerType(type) || isDoubleType(type) || prop.hasValueOf()) { //$NON-NLS-1$
			FXMLCompletionProposal cp;

			if (prop.isStatic()) {
				StyledString s = new StyledString();
				s.append("(static) ", StyledString.COUNTER_STYLER); //$NON-NLS-1$
				s.append(prop.getFXClass().getSimpleName() + "." + prop.getName() + " : " + prop.getElementTypeAsString(false)); //$NON-NLS-1$ //$NON-NLS-2$
				s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

				String proposalValue = prop.getFXClass().getSimpleName() + "." + prop.getName() + "=\"\""; //$NON-NLS-1$ //$NON-NLS-2$

				cp = createAttributeProposal(contentAssistRequest, context, proposalValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY - 10, STATIC_ATTRIBUTE_MATCHER);
			} else {
				StyledString s = new StyledString(prop.getName() + " : " + prop.getElementTypeAsString(false)); //$NON-NLS-1$
				s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

				String propValue = prop.getName() + "=\"\""; //$NON-NLS-1$
				cp = createAttributeProposal(contentAssistRequest, context, propValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY, MATCHER);
			}

			if (cp != null) {
				cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
				cp.setHover(new HoverImpl(prop.getJavaElement()));

				contentAssistRequest.addProposal(cp);
			}
		}
	}

	private static void createPrimitivePropnameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXPrimitiveProperty fxProperty) {
		String typeName;
		switch (fxProperty.getType()) {
		case BOOLEAN:
			typeName = "boolean"; //$NON-NLS-1$
			break;
		case BYTE:
			typeName = "byte"; //$NON-NLS-1$
			break;
		case CHAR:
			typeName = "char"; //$NON-NLS-1$
			break;
		case DOUBLE:
			typeName = "double"; //$NON-NLS-1$
			break;
		case FLOAT:
			typeName = "float"; //$NON-NLS-1$
			break;
		case INTEGER:
			typeName = "integer"; //$NON-NLS-1$
			break;
		case LONG:
			typeName = "long"; //$NON-NLS-1$
			break;
		case SHORT:
			typeName = "short"; //$NON-NLS-1$
			break;
		default:
			typeName = "String"; //$NON-NLS-1$
			break;
		}

		FXMLCompletionProposal cp;
		if (fxProperty.isStatic()) {
			StyledString s = new StyledString();
			s.append("(static) ", StyledString.COUNTER_STYLER); //$NON-NLS-1$
			s.append(fxProperty.getFXClass().getSimpleName() + "." + fxProperty.getName() + " : " + typeName); //$NON-NLS-1$ //$NON-NLS-2$
			s.append(" - " + fxProperty.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

			String proposalValue = fxProperty.getFXClass().getSimpleName() + "." + fxProperty.getName() + "=\"\""; //$NON-NLS-1$ //$NON-NLS-2$

			cp = createAttributeProposal(contentAssistRequest, context, proposalValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY - 10, STATIC_ATTRIBUTE_MATCHER);
		} else {
			StyledString s = new StyledString(fxProperty.getName() + " : " + typeName); //$NON-NLS-1$
			s.append(" - " + fxProperty.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

			String proposalValue = fxProperty.getName() + "=\"\""; //$NON-NLS-1$

			cp = createAttributeProposal(contentAssistRequest, context, proposalValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY, MATCHER);
		}

		if (cp != null) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(fxProperty.getJavaElement()));

			contentAssistRequest.addProposal(cp);
		}
	}

	private static FXMLCompletionProposal createAttributeProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, String proposalValue, StyledString s, Image image, int priority, PrefixMatcher matcher) {
		if (matcher.isCandidateMatchingPrefix(proposalValue, contentAssistRequest.getMatchString())) {
			FXMLCompletionProposal cp = new FXMLCompletionProposal(proposalValue, context.getInvocationOffset() - contentAssistRequest.getMatchString().length(), proposalValue.length(), proposalValue.length() - 1, image, s, null);
			cp.setMatcher(matcher);
			cp.setPriority(priority);
			return cp;
		}
		return null;
	}

	static FXMLCompletionProposal createProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, String proposalValue, StyledString s, Image img, PrefixMatcher matcher) {
		if (matcher.isCandidateMatchingPrefix(proposalValue, contentAssistRequest.getMatchString())) {
			FXMLCompletionProposal cp = new FXMLCompletionProposal(proposalValue, context.getInvocationOffset() - contentAssistRequest.getMatchString().length(), proposalValue.length(), proposalValue.length(), img, s, null);
			cp.setMatcher(matcher);
			return cp;
		}
		return null;
	}

	static FXMLCompletionProposal createElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, String proposalValue, StyledString s, boolean withEnd, int priority, Image img, PrefixMatcher m) {
		if (m.isCandidateMatchingPrefix(proposalValue, contentAssistRequest.getMatchString())) {
			FXMLCompletionProposal cp = new FXMLCompletionProposal(proposalValue, context.getInvocationOffset() - contentAssistRequest.getMatchString().length(), proposalValue.length(), withEnd ? proposalValue.length() / 2 - 1 : proposalValue.length(), img, s, null);
			cp.setPriority(priority);
			cp.setMatcher(m);
			return cp;
		}
		return null;
	}

	@Override
	protected void addTagNameProposals(ContentAssistRequest contentAssistRequest, int childPosition, CompletionProposalInvocationContext context) {
		Node parent = contentAssistRequest.getParent();

		if (parent.getNodeType() == Node.ELEMENT_NODE) {
			if (parent.getNodeName().contains(".")) { //$NON-NLS-1$
				String[] parts = parent.getNodeName().split("\\."); //$NON-NLS-1$
				IType ownerType = Util.findType(parts[0], parent.getOwnerDocument());
				if (ownerType != null) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if (fxClass != null) {
						IFXProperty p = fxClass.getStaticProperty(parts[1]);
						if (p != null) {
							if (p instanceof IFXObjectProperty) {
								IFXObjectProperty op = (IFXObjectProperty) p;
								createSubtypeProposals(contentAssistRequest, context, op.getElementType());
							} else if (p instanceof IFXCollectionProperty) {
								IFXCollectionProperty cp = (IFXCollectionProperty) p;
								createSubtypeProposals(contentAssistRequest, context, cp.getElementType());
							}
						}
					}
				}
			} else if (Character.isUpperCase(parent.getNodeName().charAt(0)) || "fx:root".equals(parent.getNodeName())) { //$NON-NLS-1$
				if (!contentAssistRequest.getMatchString().isEmpty() && Character.isUpperCase(contentAssistRequest.getMatchString().charAt(0))) {
					// TODO This means we are static?
					// IJavaProject jproject =
					// findProject(contentAssistRequest);
					// try {
					// IType superType =
					// jproject.findType("javafx.scene.Parent");
					// if( superType != null ) {
					// createSubtypeProposals(contentAssistRequest, context,
					// superType);
					// }
					// } catch (JavaModelException e) {
					// // TODO Auto-generated catch block
					// e.printStackTrace();
					// }
				} else {
					
					if (parent.getParentNode() != null) {
						Node n = null;
						
						if( "fx:root".equals(parent.getNodeName()) ) { //$NON-NLS-1$
							n = parent;
						} else if (Character.isUpperCase(parent.getParentNode().getNodeName().charAt(0)) || "fx:root".equals(parent.getParentNode().getNodeName())) { //$NON-NLS-1$
							n = parent.getParentNode();
						} else if (parent.getParentNode().getParentNode() != null) {
							if (Character.isUpperCase(parent.getParentNode().getParentNode().getNodeName().charAt(0)) || "fx:root".equals(parent.getParentNode().getParentNode().getNodeName())) { //$NON-NLS-1$
								n = parent.getParentNode().getParentNode();
							}
						}

						if (n != null) {
							IType type;
							if( "fx:root".equals(n.getNodeName()) ) { //$NON-NLS-1$
								type = Util.findType(n.getAttributes().getNamedItem("type").getNodeValue(), parent.getOwnerDocument()); //$NON-NLS-1$
							} else {
								type = Util.findType(n.getNodeName(), parent.getOwnerDocument());	
							}
							
							if (type != null) {
								IFXClass fxclass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
								if (fxclass != null) {
									for (IFXProperty p : fxclass.getAllStaticProperties().values()) {
										String proposalValue = fxclass.getSimpleName() + "." + p.getName() + ">" + "</" + fxclass.getSimpleName() + "." + p.getName() + ">"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
										String sType;

										if (p instanceof IFXPrimitiveProperty) {
											IFXPrimitiveProperty pp = (IFXPrimitiveProperty) p;
											sType = pp.getType() == Type.STRING ? "String" : pp.getType().jvmType(); //$NON-NLS-1$
										} else if (p instanceof IFXObjectProperty) {
											IFXObjectProperty op = (IFXObjectProperty) p;
											sType = op.getElementTypeAsString(false);
										} else if (p instanceof IFXEnumProperty) {
											IFXEnumProperty ep = (IFXEnumProperty) p;
											sType = ep.getEnumTypeAsString(false);
										} else {
											sType = "<unknown>"; //$NON-NLS-1$
										}

										FXMLCompletionProposal cp = createElementProposal(contentAssistRequest, context, proposalValue,
												new StyledString().append("(static) ", StyledString.COUNTER_STYLER).append(p.getFXClass().getSimpleName() + "." + p.getName()).append(" - " + sType, StyledString.QUALIFIER_STYLER), true, PRIORITY_LOWER_1, null, STATIC_ELEMENT_MATCHER); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
										if (cp != null) {
											cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
											cp.setHover(new HoverImpl(p.getJavaElement()));
											contentAssistRequest.addProposal(cp);
										}
									}
								}
							}
						}
					}
					IType type;
					
					if( "fx:root".equals(parent.getNodeName()) ) { //$NON-NLS-1$
						type = Util.findType(parent.getAttributes().getNamedItem("type").getNodeValue(), parent.getOwnerDocument()); //$NON-NLS-1$
					} else {
						type = Util.findType(parent.getNodeName(), parent.getOwnerDocument());	
					}

					if (type != null) {
						IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
						if (fxClass != null) {
							for (IFXProperty property : fxClass.getAllProperties().values()) {
								createPropertyElementNameProposal(contentAssistRequest, context, property);
							}
						}
					}
				}

				IType type;
				
				if( "fx:root".equals(parent.getNodeName()) ) { //$NON-NLS-1$
					type = Util.findType(parent.getAttributes().getNamedItem("type").getNodeValue(), parent.getOwnerDocument()); //$NON-NLS-1$
				} else {
					type = Util.findType(parent.getNodeName(), parent.getOwnerDocument());	
				}
				
				if (type != null) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
					if (fxClass != null) {
						IFXProperty p = fxClass.getDefaultProperty();
						if (p instanceof IFXObjectProperty) {
							createSubtypeProposals(contentAssistRequest, context, ((IFXObjectProperty) p).getElementType());
						} else if (p instanceof IFXCollectionProperty) {
							createSubtypeProposals(contentAssistRequest, context, ((IFXCollectionProperty) p).getElementType());
						}
					}
				}
			} else {
				createClassElementNameProposal(contentAssistRequest, context);
			}
		}
	}

	private static void createClassElementNameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		Node propertyType = contentAssistRequest.getParent();
		Node elementType = propertyType.getParentNode();

		IType type;
		if( "fx:root".equals(elementType.getNodeName()) ) { //$NON-NLS-1$
			type = Util.findType(elementType.getAttributes().getNamedItem("type").getNodeValue(), elementType.getOwnerDocument()); //$NON-NLS-1$
		} else {
			type = findType(elementType.getNodeName(), contentAssistRequest, context);
		}
		
		if (type != null) {
			IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
			if (fxClass != null) {
				IFXProperty p = fxClass.getProperty(propertyType.getNodeName());
				if (p instanceof IFXObjectProperty) {
					IFXObjectProperty op = (IFXObjectProperty) p;
					createSubtypeProposals(contentAssistRequest, context, op.getElementType());
				} else if (p instanceof IFXCollectionProperty) {
					IFXCollectionProperty cp = (IFXCollectionProperty) p;
					createSubtypeProposals(contentAssistRequest, context, cp.getElementType());
				}
			}
		}
	}

	private static void createPropertyElementNameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXProperty fxProperty) {
		if (fxProperty instanceof IFXCollectionProperty) {
			createListPropertyElementProposal(contentAssistRequest, context, (IFXCollectionProperty) fxProperty);
		} else if (fxProperty instanceof IFXObjectProperty) {
			createObjectPropertyElementProposal(contentAssistRequest, context, (IFXObjectProperty) fxProperty);
		}
	}

	private static void createListPropertyElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXCollectionProperty prop) {
		StyledString s = new StyledString(prop.getName() + " : " + prop.getCollectionAsString()); //$NON-NLS-1$
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

		String propValue = prop.getName() + "></" + prop.getName() + ">"; //$NON-NLS-1$ //$NON-NLS-2$

		FXMLCompletionProposal cp = createElementProposal(contentAssistRequest, context, propValue, s, true, DEFAULT_PRIORITY, IconKeys.getIcon(IconKeys.FIELD_KEY), MATCHER);
		if (cp != null) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			contentAssistRequest.addProposal(cp);
		}
	}

	private static void createObjectPropertyElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXObjectProperty prop) {
		StyledString s = new StyledString(prop.getName() + " : " + prop.getElementTypeAsString(false)); //$NON-NLS-1$
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$

		String propValue = prop.getName() + "></" + prop.getName() + ">"; //$NON-NLS-1$ //$NON-NLS-2$

		FXMLCompletionProposal cp = createElementProposal(contentAssistRequest, context, propValue, s, true, DEFAULT_PRIORITY, IconKeys.getIcon(IconKeys.FIELD_KEY), MATCHER);
		if (cp != null) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			contentAssistRequest.addProposal(cp);
		}
	}

	private static void createSubtypeProposals(final ContentAssistRequest contentAssistRequest, final CompletionProposalInvocationContext context, IType superType) {
		IJavaProject jproject = findProject(contentAssistRequest);

		try {
			IJavaSearchScope hierarchyScope = SearchEngine.createHierarchyScope(superType);
			IJavaSearchScope projectScope = SearchEngine.createJavaSearchScope(new IJavaElement[] { jproject });
			IJavaSearchScope scope = new IntersectingJavaSearchScope(projectScope, hierarchyScope);
			SearchEngine searchEngine = new SearchEngine();

			char[] typeName = null;
			char[] packageName = null;
			if (!contentAssistRequest.getMatchString().isEmpty()) {
				typeName = contentAssistRequest.getMatchString().toCharArray();
			}

			searchEngine.searchAllTypeNames(packageName, SearchPattern.R_PATTERN_MATCH, typeName, SearchPattern.R_PREFIX_MATCH | SearchPattern.R_CAMELCASE_MATCH, IJavaSearchConstants.CLASS, scope, new TypeNameRequestor() {
				@Override
				public void acceptType(int modifiers, char[] packageName, char[] simpleTypeName, char[][] enclosingTypeNames, String path) {
					String sPackageName = new String(packageName);
					int priority = PRIORITY_LOWER_1;
					if (sPackageName.startsWith("com.sun.javafx")) { //$NON-NLS-1$
						priority -= 10;
					}
					StyledString s = new StyledString(new String(simpleTypeName));
					s.append(" - " + sPackageName, StyledString.QUALIFIER_STYLER); //$NON-NLS-1$
					FXMLCompletionProposal prop = createElementProposal(contentAssistRequest, context, sPackageName + "." + new String(simpleTypeName) + " ", s, false, priority, IconKeys.getIcon(IconKeys.CLASS_KEY), FQN_MATCHER); //$NON-NLS-1$ //$NON-NLS-2$

					if (prop != null) {
						prop.setMatcher(FQN_MATCHER);
						prop.setTextApplier(new IReplacementTextApplier() {

							@Override
							public void apply(IDocument document, ConfigurableCompletionProposal proposal) throws BadLocationException {
								String proposalReplacementString = proposal.getReplacementString();
								List<String> s = getImportedTypes(contentAssistRequest);
								String shortened = proposalReplacementString.substring(proposalReplacementString.lastIndexOf('.') + 1);

								if (s.contains(proposalReplacementString.trim())) {
									proposal.setCursorPosition(shortened.length());
									document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), shortened);
								} else {
									DocumentRewriteSession rewriteSession = null;
									try {
										if (document instanceof IDocumentExtension4) {
											rewriteSession = ((IDocumentExtension4) document).startRewriteSession(DocumentRewriteSessionType.UNRESTRICTED_SMALL);
										}

									} finally {
										if (rewriteSession != null) {
											((IDocumentExtension4) document).stopRewriteSession(rewriteSession);
										}
										// if (viewerExtension != null)
										// viewerExtension.setRedraw(true);
									}

									boolean startWithLineBreak = true;
									boolean endWithLineBreak = false;
									Document xmlDoc = contentAssistRequest.getNode().getOwnerDocument();
									NodeList list = xmlDoc.getChildNodes();
									int offset = 0;
									List<Node> prs = new ArrayList<Node>();
									for (int i = 0; i < list.getLength(); i++) {
										Node n = list.item(i);
										if (n.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE) {
											prs.add(n);
										}
									}

									if (!prs.isEmpty()) {
										offset = ((IDOMNode) prs.get(prs.size() - 1)).getEndOffset();
									}

									offset = Math.min(proposal.getReplacementOffset(), offset);
									proposal.setCursorPosition(shortened.length());
									document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), shortened);

									String importStatement = (startWithLineBreak ? "\n<?import " : "import ") + proposalReplacementString.trim(); //$NON-NLS-1$ //$NON-NLS-2$
									importStatement += "?>"; //$NON-NLS-1$

									if (endWithLineBreak)
										importStatement += "\n\n"; //$NON-NLS-1$
									document.replace(offset, 0, importStatement.toString());
									proposal.setCursorPosition(proposal.getCursorPosition() + importStatement.length());
								}
							}
						});
						contentAssistRequest.addProposal(prop);
					}
				}
			}, IJavaSearchConstants.WAIT_UNTIL_READY_TO_SEARCH, new NullProgressMonitor());
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void addStartDocumentProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		FXMLCompletionProposal proposal = new FXMLCompletionProposal("<?scenebuilder-stylesheet ?>", context.getInvocationOffset() - contentAssistRequest.getMatchString().length(), "<?scenebuilder-stylesheet ?>".length(), "<?scenebuilder-stylesheet ?>".length()-2); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		proposal.setMatcher(MATCHER);
		contentAssistRequest.addProposal(proposal);

		proposal = new FXMLCompletionProposal("<?scenebuilder-preview-i18n-resource ?>", context.getInvocationOffset() - contentAssistRequest.getMatchString().length(), "<?scenebuilder-preview-i18n-resource ?>".length(), "<?scenebuilder-preview-i18n-resource ?>".length()-2); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		proposal.setMatcher(MATCHER);
		contentAssistRequest.addProposal(proposal);

		
		IJavaProject jproject = findProject(contentAssistRequest);
		try {
			IType superType = jproject.findType("javafx.scene.Parent"); //$NON-NLS-1$
			if (superType != null) {
				createSubtypeProposals(contentAssistRequest, context, superType);
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void addAttributeValueProposals(final ContentAssistRequest contentAssistRequest, final CompletionProposalInvocationContext context) {
		IDOMNode n = (IDOMNode) contentAssistRequest.getNode();

		if (Character.isUpperCase(n.getNodeName().charAt(0))) {
			NamedNodeMap m = n.getAttributes();
			IDOMNode attribute = null;
			for (int i = 0; i < m.getLength(); i++) {
				IDOMNode a = (IDOMNode) m.item(i);
				if (a.contains(contentAssistRequest.getStartOffset())) {
					attribute = a;
				}
			}

			if (attribute != null) {
				if ("http://javafx.com/fxml".equals(attribute.getNamespaceURI())) { //$NON-NLS-1$
					if("constant".equals(attribute.getLocalName())) { //$NON-NLS-1$
						IType type = findType(n.getNodeName(), contentAssistRequest, context);
						if (type != null) {
							try {
								List<IField> fields = new ArrayList<IField>();
								collectStaticFields(fields, type);
								
								for( IField f : fields ) {
									StyledString s = new StyledString(f.getElementName() + " : " + Signature.getSimpleName(Signature.toString(f.getTypeSignature()))); //$NON-NLS-1$
									String owner = ((IType)f.getAncestor(IJavaElement.TYPE)).getElementName();
									s.append(" - " + Signature.getSimpleName(owner), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$
									
									FXMLCompletionProposal cp = createProposal(
											contentAssistRequest, 
											context, "\"" + f.getElementName(),  //$NON-NLS-1$
											s, 
											IconKeys.getIcon(IconKeys.CLASS_KEY), CLASS_ATTRIBUTE_MATCHER);
									
									if( cp != null ) {
										contentAssistRequest.addProposal(cp);
									}									
								}
								
							} catch (JavaModelException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					} else if ("controller".equals(attribute.getLocalName())) { //$NON-NLS-1$
						IJavaProject jproject = findProject(contentAssistRequest);

						char[] typeName = null;
						char[] packageName = null;
						if (!contentAssistRequest.getMatchString().isEmpty()) {
							if( contentAssistRequest.getMatchString().startsWith("\"") ) { //$NON-NLS-1$
								typeName = contentAssistRequest.getMatchString().substring(1).toCharArray();
							} else {
								typeName = contentAssistRequest.getMatchString().toCharArray();
							}
						}
						
						IJavaSearchScope searchScope = SearchEngine.createJavaSearchScope(new IJavaElement[] { jproject });
						SearchEngine searchEngine = new SearchEngine();
						try {
							searchEngine.searchAllTypeNames(packageName, SearchPattern.R_PATTERN_MATCH, typeName, SearchPattern.R_PREFIX_MATCH | SearchPattern.R_CAMELCASE_MATCH, IJavaSearchConstants.TYPE, searchScope, new TypeNameRequestor() {
								@Override
								public void acceptType(int modifiers, char[] packageName, char[] simpleTypeName, char[][] enclosingTypeNames, String path) {
									String sPackageName = new String(packageName);
									StyledString s = new StyledString(new String(simpleTypeName));
									s.append(" - " + sPackageName, StyledString.QUALIFIER_STYLER); //$NON-NLS-1$
									
									FXMLCompletionProposal cp = createProposal(
											contentAssistRequest, 
											context, "\"" + sPackageName + "." + new String(simpleTypeName),  //$NON-NLS-1$ //$NON-NLS-2$
											s, 
											IconKeys.getIcon(IconKeys.CLASS_KEY), CLASS_ATTRIBUTE_MATCHER);
									
									if( cp != null ) {
										contentAssistRequest.addProposal(cp);
									}
								}
							}, IJavaSearchConstants.WAIT_UNTIL_READY_TO_SEARCH, new NullProgressMonitor());
						} catch (JavaModelException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					} else if("id".equals(attribute.getLocalName())) { //$NON-NLS-1$
						Document d = contentAssistRequest.getNode().getOwnerDocument();
						Element e = d.getDocumentElement();
						Attr a = e.getAttributeNodeNS("http://javafx.com/fxml", "controller"); //$NON-NLS-1$ //$NON-NLS-2$
						if (a != null) {
							IType t = Util.findType(a.getValue(), d);
							if (t != null) {
								IFXCtrlClass ctrlClass = FXPlugin.getClassmodel().findCtrlClass(t.getJavaProject(), t);
								if (ctrlClass != null) {
									IType fromType = findType(n.getNodeName(), contentAssistRequest, context);
									if( fromType != null ) {
										for( Entry<String,IFXCtrlField> ef : ctrlClass.getAllFields().entrySet() ) {
											IFXCtrlField f = ef.getValue();
											if( org.eclipse.fx.ide.model.Util.assignable(fromType, f.getType()) ) {
												StyledString s = new StyledString(f.getName());
												s.append(" - " + ctrlClass.getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$
												Image img;
												switch (f.getVisibility()) {
												case PUBLIC:
													img = IconKeys.getIcon(IconKeys.METHOD_PUBLIC_KEY);
													break;
												case PACKAGE:
													img = IconKeys.getIcon(IconKeys.METHOD_DEFAULT_KEY);
													break;
												case PROTECTED:
													img = IconKeys.getIcon(IconKeys.METHOD_PROTECTED_KEY);
													break;
												default:
													img = IconKeys.getIcon(IconKeys.METHOD_PRIVATE_KEY);
													break;
												}
												
												FXMLCompletionProposal cp = createProposal(
														contentAssistRequest, 
														context, 
														"\""+f.getName(),  //$NON-NLS-1$
														s, img, CLASS_ATTRIBUTE_MATCHER);
												
												if( cp != null ) {
													contentAssistRequest.addProposal(cp);
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (attribute.getNodeName().contains(".")) { //$NON-NLS-1$
					String[] parts = attribute.getNodeName().split("\\."); //$NON-NLS-1$

					IType type = findType(parts[0], contentAssistRequest, context);
					if (type != null) {
						IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
						if (fxClass != null) {
							IFXProperty p = fxClass.getStaticProperty(parts[1]);
							if (p instanceof IFXPrimitiveProperty) {
								createAttributeValuePrimitiveProposals(contentAssistRequest, context, (IFXPrimitiveProperty) p);
							} else if (p instanceof IFXEnumProperty) {
								createAttributeValueEnumProposals(contentAssistRequest, context, (IFXEnumProperty) p);
							} else if (p instanceof IFXObjectProperty) {
								createAttributeValueObjectProposals(contentAssistRequest, context, (IFXObjectProperty) p);
							}
						}
					}
				} else {
					IType type = findType(n.getNodeName(), contentAssistRequest, context);
					if (type != null) {
						IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
						if (fxClass != null) {
							IFXProperty p = fxClass.getProperty(attribute.getNodeName());
							if (p instanceof IFXPrimitiveProperty) {
								createAttributeValuePrimitiveProposals(contentAssistRequest, context, (IFXPrimitiveProperty) p);
							} else if (p instanceof IFXEnumProperty) {
								createAttributeValueEnumProposals(contentAssistRequest, context, (IFXEnumProperty) p);
							} else if (p instanceof IFXObjectProperty) {
								createAttributeValueObjectProposals(contentAssistRequest, context, (IFXObjectProperty) p);
							} else if (p instanceof IFXEventHandlerProperty) {
								createAttributeValueEventHandlerProposals(contentAssistRequest, context, (IFXEventHandlerProperty) p);
							}
						}
					}
				}
			}
		}
	}
	
	private void collectStaticFields(List<IField> fields, IType type) throws JavaModelException {
		//FIXME Don't we have to check if the field is assignable???
		for( IField f : type.getFields() ) {
			if( Flags.isStatic(f.getFlags()) ) {
				fields.add(f);
			}
		}
		
		String s = type.getSuperclassName();
		
		if( s != null) {
			String fqn = org.eclipse.fx.ide.model.internal.utils.Util.getFQNType(type, Signature.getTypeErasure(s));
			collectStaticFields(fields, type.getJavaProject().findType(fqn));		
		}
	}

	private static void createAttributeValueEventHandlerProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXEventHandlerProperty p) {
		Document d = contentAssistRequest.getNode().getOwnerDocument();
		Element e = d.getDocumentElement();
		Attr a = e.getAttributeNodeNS("http://javafx.com/fxml", "controller");  //$NON-NLS-1$//$NON-NLS-2$
		if (a != null) {
			IType t = Util.findType(a.getValue(), d);
			if (t != null) {
				IFXCtrlClass ctrlClass = FXPlugin.getClassmodel().findCtrlClass(t.getJavaProject(), t);
				if (ctrlClass != null) {

					for (IFXCtrlEventMethod ctrlMethod : ctrlClass.getAllEventMethods().values()) {
						StyledString s = null;
						if (!ctrlMethod.hasArgument()) {
							s = new StyledString(ctrlMethod.getName() + "()"); //$NON-NLS-1$
						} else {
							if (org.eclipse.fx.ide.model.Util.assignable(p.getEventType(), ctrlMethod.getArgumentType())) {
								s = new StyledString(ctrlMethod.getName() + "(" + p.getEventTypeAsString(false) + ")"); //$NON-NLS-1$ //$NON-NLS-2$
							}
						}

						if (s != null) {
							s.append(" - " + ctrlClass.getSimpleName(), StyledString.QUALIFIER_STYLER); //$NON-NLS-1$
							Image img = null;

							switch (ctrlMethod.getVisibility()) {
							case PUBLIC:
								img = IconKeys.getIcon(IconKeys.METHOD_PUBLIC_KEY);
								break;
							case PACKAGE:
								img = IconKeys.getIcon(IconKeys.METHOD_DEFAULT_KEY);
								break;
							case PROTECTED:
								img = IconKeys.getIcon(IconKeys.METHOD_PROTECTED_KEY);
								break;
							default:
								img = IconKeys.getIcon(IconKeys.METHOD_PRIVATE_KEY);
								break;
							}

							FXMLCompletionProposal cp = createProposal(contentAssistRequest, context, "\"#" + ctrlMethod.getName(), s, img, EVENT_ATTRIBUTE_MATCHER); //$NON-NLS-1$

							if (cp != null) {
								contentAssistRequest.addProposal(cp);
							}
						}
					}

				}
			}
		}
	}

	private static void createAttributeValuePrimitiveProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXPrimitiveProperty p) {
		switch (p.getType()) {
		case BOOLEAN: {
			FXMLCompletionProposal cp = createProposal(contentAssistRequest, context, "\"true", new StyledString("true"), null, ATTRIBUTE_MATCHER); //$NON-NLS-1$ //$NON-NLS-2$

			if (cp != null) {
				cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
				cp.setHover(new HoverImpl(p.getJavaElement()));
				contentAssistRequest.addProposal(cp);
			}

			cp = createProposal(contentAssistRequest, context, "\"false", new StyledString("false"), null, ATTRIBUTE_MATCHER); //$NON-NLS-1$ //$NON-NLS-2$

			if (cp != null) {
				cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
				cp.setHover(new HoverImpl(p.getJavaElement()));
				contentAssistRequest.addProposal(cp);
			}

			break;
		}
		default:
			break;
		}
	}

	private static void createAttributeValueEnumProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXEnumProperty p) {
		IType t = p.getEnumType();
		if (t != null) {
			try {
				for (IField f : t.getFields()) {
					if (Flags.isEnum(f.getFlags())) {
						FXMLCompletionProposal cp = createProposal(contentAssistRequest, context, "\"" + f.getElementName(), new StyledString(f.getElementName()).append(" - " + p.getEnumTypeAsString(false), StyledString.QUALIFIER_STYLER), IconKeys.getIcon(IconKeys.ENUM_KEY), ATTRIBUTE_MATCHER);  //$NON-NLS-1$//$NON-NLS-2$
						if (cp != null) {
							cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
							cp.setHover(new HoverImpl(f));
							contentAssistRequest.addProposal(cp);
						}
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void createAttributeValueObjectProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXObjectProperty p) {
		if( p.hasValueOf() ) {
			for( IValueOfContributor c : this.valueOfCollector.getContributors(p.getElementTypeAsString(true)) ) {
				for( Proposal vProp : c.getProposals() ) {
					FXMLCompletionProposal cp = createProposal(contentAssistRequest, context, "\"" +vProp.getValue(), new StyledString(vProp.getValue()), IconKeys.getIcon(IconKeys.VALUE_OF_KEY), ATTRIBUTE_MATCHER); //$NON-NLS-1$
					if (cp != null) {
						cp.setPriority(cp.getPriority() + vProp.getPriority() + 1);
						if( vProp instanceof DialogProposal ) {
							final DialogProposal dProp = (DialogProposal) vProp;
							cp.setTextApplier(new ReplacementTextApplier() {
								@Override
								public String getActualReplacementString(
										ConfigurableCompletionProposal proposal) {
									return "\"" + dProp.openDialogValue(); //$NON-NLS-1$
								}
							});
						}
						contentAssistRequest.addProposal(cp);
					}
					
				}
			}
			
		}
	}

	private static boolean isIntegerType(String fqnType) {
		if ("java.lang.Integer".equals(fqnType)) { //$NON-NLS-1$
			return true;
		} else if ("java.lang.Long".equals(fqnType)) { //$NON-NLS-1$
			return true;
		} else if ("java.lang.Short".equals(fqnType)) { //$NON-NLS-1$
			return true;
		} else if ("java.lang.Byte".equals(fqnType)) { //$NON-NLS-1$
			return true;
		}
		return false;
	}

	private static boolean isDoubleType(String fqnType) {
		if ("java.lang.Float".equals(fqnType)) { //$NON-NLS-1$
			return true;
		} else if ("java.lang.Double".equals(fqnType)) { //$NON-NLS-1$
			return true;
		}
		return false;
	}

	private static IJavaProject findProject(ContentAssistRequest contentAssistRequest) {
		Document xmlDoc = contentAssistRequest.getNode().getOwnerDocument();
		return Util.findProject(xmlDoc);
	}

	private static IType findType(String name, ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		return Util.findType(name, contentAssistRequest.getNode().getOwnerDocument());
	}

	static List<String> getImportedTypes(ContentAssistRequest contentAssistRequest) {
		Document xmlDoc = contentAssistRequest.getNode().getOwnerDocument();
		return Util.getImportedTypes(xmlDoc);
	}

	@Override
	protected void addCommentProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		//nothing
	}

	@Override
	protected void addEmptyDocumentProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		//nothing
	}

	@Override
	protected void addEndTagNameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		//nothing
	}

	@Override
	protected void addEndTagProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		//nothing
	}

	@Override
	protected void addPCDATAProposal(String nodeName, ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		//nothing
	}

	@Override
	protected void addTagCloseProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		//nothing
	}

	@Override
	protected void addTagInsertionProposals(ContentAssistRequest contentAssistRequest, int childPosition, CompletionProposalInvocationContext context) {
		//nothing
	}

	@Override
	protected void addEntityProposals(ContentAssistRequest contentAssistRequest, ITextRegion completionRegion, IDOMNode treeNode, CompletionProposalInvocationContext context) {
		//nothing
	}

	@Override
	protected void addEntityProposals(@SuppressWarnings("rawtypes") Vector proposals, Properties map, String key, int nodeOffset, IStructuredDocumentRegion sdRegion, ITextRegion completionRegion, CompletionProposalInvocationContext context) {
		//nothing
	}

	static abstract class Filter {
		public abstract boolean select(String fqnName);
	}

	static class HoverImpl implements IEObjectHover, ITextHoverExtension {
		private JavadocHoverWrapper javadocWrapper = new JavadocHoverWrapper();
		private IJavaElement currentElement;

		public HoverImpl(IJavaElement currentElement) {
			this.currentElement = currentElement;
		}

		@Override
		public IInformationControlCreator getHoverControlCreator() {
			this.javadocWrapper.setJavaElement(this.currentElement);
			return this.javadocWrapper.getHoverControlCreator();
		}

		@Override
		public Object getHoverInfo(EObject eObject, ITextViewer textViewer, IRegion hoverRegion) {
			this.javadocWrapper.setJavaElement(this.currentElement);
			return this.javadocWrapper.getHoverInfo2(textViewer, hoverRegion);
		}

	}

	static class JavadocHoverWrapper extends JavadocHover {
		private IJavaElement currentElement;

		public void setJavaElement(IJavaElement element) {
			this.currentElement = element;
		}

		@Override
		protected IJavaElement[] getJavaElementsAt(ITextViewer textViewer, IRegion hoverRegion) {
			// hack: return previously registered element
			// required as JavadocHover.getHoverInfo(IJavaElement[]
			// elements,...) is private
			return new IJavaElement[] { this.currentElement };
		}
	}
}
