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

@SuppressWarnings("restriction")
public class FXMLCompletionProposalComputer extends AbstractXMLCompletionProposalComputer implements ICompletionProposalComputer {
	private static final CamelCase MATCHER = new CamelCase();
	private static final PrefixMatcher ATTRIBUTE_MATCHER = new CamelCase() {
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			return super.isCandidateMatchingPrefix(name.startsWith("\"") ? name.substring(1) : name, prefix.startsWith("\"") ? prefix.substring(1) : prefix);
		}
	};

	private static final PrefixMatcher STATIC_ELEMENT_MATCHER = new CamelCase() {
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			name = name.substring(name.indexOf('.') + 1, name.indexOf('>')).trim();
			return super.isCandidateMatchingPrefix(name, prefix);
		}
	};

	private static final PrefixMatcher STATIC_ATTRIBUTE_MATCHER = new CamelCase() {
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			name = name.substring(name.indexOf('.') + 1);
			prefix = prefix.startsWith("\"") ? prefix.substring(1) : prefix;
			return super.isCandidateMatchingPrefix(name, prefix);
		}
	};
	
	private static final PrefixMatcher CLASS_ATTRIBUTE_MATCHER = new PrefixMatcher() {
		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			name = name.startsWith("\"") ? name.substring(1) : name;
			prefix = prefix.startsWith("\"") ? prefix.substring(1) : prefix;
			return FQN_MATCHER.isCandidateMatchingPrefix(name, prefix);
		}
	};

	private static final PrefixMatcher EVENT_ATTRIBUTE_MATCHER = new CamelCase() {
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			return super.isCandidateMatchingPrefix(normalize(name), normalize(prefix));
		}

		private String normalize(String value) {
			value = value.startsWith("\"") ? value.substring(1) : value;
			value = value.startsWith("#") ? value.substring(1) : value;

			return value;
		}
	};

	private static final FQNPrefixMatcher FQN_MATCHER = new FQNPrefixMatcher();

	{
		FQN_MATCHER.setLastSegmentFinder(new FQNPrefixMatcher.DefaultLastSegmentFinder());
		FQN_MATCHER.setDelegate(MATCHER);
	}

	private static final int DEFAULT_PRIORITY = 200;
	private static final int PRIORITY_LOWER_1 = 100;
	private static final int PRIORITY_HIGHER_1 = 300;

	private ValueOfContributionCollector valueOfCollector;
	
	public FXMLCompletionProposalComputer() {
		ServiceReference<ValueOfContributionCollector> ref = Activator.getContext().getServiceReference(ValueOfContributionCollector.class);
		valueOfCollector = Activator.getContext().getService(ref);
	}
	
	@Override
	public void sessionStarted() {
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	@Override
	public void sessionEnded() {
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
		
		System.err.println(existingAttributes);

		if( "fx:root".equals(typeName) ) {
			typeName = parent.getAttributes().getNamedItem("type").getNodeValue();
		}
		
		if (typeName != null) {
			
			if (Character.isLowerCase(typeName.charAt(0)) || typeName.contains(".")) {
				// no proposal for static elements and attribute definitions
				return;
			}

			IType type = findType(typeName, contentAssistRequest, context);
			if (type != null) {
				IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
				
				if( fxClass.getValueOf() != null ) {
					FXMLCompletionProposal cp = createAttributeProposal(contentAssistRequest, context, "fx:value=\"\"", new StyledString("fx:valueOf").append(" - " + fxClass.getSimpleName(), StyledString.QUALIFIER_STYLER), IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY+10, MATCHER);
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
					
					if (Character.isUpperCase(parent.getParentNode().getNodeName().charAt(0)) || "fx:root".equals(parent.getParentNode().getNodeName())) {
						n = parent.getParentNode();
					} else if (parent.getParentNode().getParentNode() != null) {
						if (Character.isUpperCase(parent.getParentNode().getParentNode().getNodeName().charAt(0)) || "fx:root".equals(parent.getParentNode().getParentNode().getNodeName())) {
							n = parent.getParentNode().getParentNode();
						}
					}
					
					if (n != null) {
						IType containerType;
						if( "fx:root".equals(n.getNodeName()) ) {
							containerType = Util.findType(n.getAttributes().getNamedItem("type").getNodeValue(), parent.getOwnerDocument());
						} else {
							containerType = Util.findType(n.getNodeName(), parent.getOwnerDocument());	
						}
						
						if (containerType != null) {
							IFXClass fxclass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), containerType);
							if (fxclass != null) {
								for (IFXProperty property : fxclass.getAllStaticProperties().values()) {
									if( ! existingAttributes.contains(property.getFXClass().getSimpleName() + "." +property.getName()) ) {
										createAttributeNameProposal(contentAssistRequest, context, property);	
									}
								}
							}
						}
					} else {
						FXMLCompletionProposal cp = createAttributeProposal(contentAssistRequest, context, "fx:controller=\"\"", new StyledString("fx:controller").append(" - FXML built-in", StyledString.QUALIFIER_STYLER), IconKeys.getIcon(IconKeys.CLASS_KEY), DEFAULT_PRIORITY+10, MATCHER);
						if( cp != null ) {
							contentAssistRequest.addProposal(cp);	
						}
					}
				}
			}
		}
	}

	private void createAttributeNameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXProperty fxProperty) {
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

	private void createEnumPropnameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXEnumProperty prop) {
		FXMLCompletionProposal cp;

		if (prop.isStatic()) {
			StyledString s = new StyledString();
			s.append("(static) ", StyledString.COUNTER_STYLER);
			s.append(prop.getFXClass().getSimpleName() + "." + prop.getName() + " : " + prop.getEnumTypeAsString(false));
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);

			String proposalValue = prop.getFXClass().getSimpleName() + "." + prop.getName() + "=\"\"";

			cp = createAttributeProposal(contentAssistRequest, context, proposalValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY - 10, STATIC_ATTRIBUTE_MATCHER);
		} else {
			StyledString s = new StyledString(prop.getName() + " : " + prop.getEnumTypeAsString(false));
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);

			String propValue = prop.getName() + "=\"\"";

			cp = createAttributeProposal(contentAssistRequest, context, propValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY, MATCHER);
		}

		if (cp != null) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			contentAssistRequest.addProposal(cp);
		}
	}

	private void createEventHandlerPropnameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXEventHandlerProperty prop) {
		if (!prop.isStatic()) {
			StyledString s = new StyledString(prop.getName() + " : " + prop.getEventTypeAsString(false));
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);

			String propValue = prop.getName() + "=\"#\"";

			FXMLCompletionProposal cp = createAttributeProposal(contentAssistRequest, context, propValue, s, IconKeys.getIcon(IconKeys.EVENT_KEY), DEFAULT_PRIORITY, MATCHER);
			if (cp != null) {
				cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
				cp.setHover(new HoverImpl(prop.getJavaElement()));

				contentAssistRequest.addProposal(cp);
			}
		}
	}

	private void createObjectPropnameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXObjectProperty prop) {
		String type = prop.getElementTypeAsString(true);

		// TODO Should we allow other elements because one can use $... to
		// reference elements
		if ("java.lang.Boolean".equals(type) || isIntegerType(type) || isDoubleType(type) || prop.hasValueOf()) {
			FXMLCompletionProposal cp;

			if (prop.isStatic()) {
				StyledString s = new StyledString();
				s.append("(static) ", StyledString.COUNTER_STYLER);
				s.append(prop.getFXClass().getSimpleName() + "." + prop.getName() + " : " + prop.getElementTypeAsString(false));
				s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);

				String proposalValue = prop.getFXClass().getSimpleName() + "." + prop.getName() + "=\"\"";

				cp = createAttributeProposal(contentAssistRequest, context, proposalValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY - 10, STATIC_ATTRIBUTE_MATCHER);
			} else {
				StyledString s = new StyledString(prop.getName() + " : " + prop.getElementTypeAsString(false));
				s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);

				String propValue = prop.getName() + "=\"\"";
				cp = createAttributeProposal(contentAssistRequest, context, propValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY, MATCHER);
			}

			if (cp != null) {
				cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
				cp.setHover(new HoverImpl(prop.getJavaElement()));

				contentAssistRequest.addProposal(cp);
			}
		}
	}

	private void createPrimitivePropnameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXPrimitiveProperty fxProperty) {
		String typeName;
		switch (fxProperty.getType()) {
		case BOOLEAN:
			typeName = "boolean";
			break;
		case BYTE:
			typeName = "byte";
			break;
		case CHAR:
			typeName = "char";
			break;
		case DOUBLE:
			typeName = "double";
			break;
		case FLOAT:
			typeName = "float";
			break;
		case INTEGER:
			typeName = "integer";
			break;
		case LONG:
			typeName = "long";
			break;
		case SHORT:
			typeName = "short";
			break;
		default:
			typeName = "String";
			break;
		}

		FXMLCompletionProposal cp;
		if (fxProperty.isStatic()) {
			StyledString s = new StyledString();
			s.append("(static) ", StyledString.COUNTER_STYLER);
			s.append(fxProperty.getFXClass().getSimpleName() + "." + fxProperty.getName() + " : " + typeName);
			s.append(" - " + fxProperty.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);

			String proposalValue = fxProperty.getFXClass().getSimpleName() + "." + fxProperty.getName() + "=\"\"";

			cp = createAttributeProposal(contentAssistRequest, context, proposalValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY - 10, STATIC_ATTRIBUTE_MATCHER);
		} else {
			StyledString s = new StyledString(fxProperty.getName() + " : " + typeName);
			s.append(" - " + fxProperty.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);

			String proposalValue = fxProperty.getName() + "=\"\"";

			cp = createAttributeProposal(contentAssistRequest, context, proposalValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), DEFAULT_PRIORITY, MATCHER);
		}

		if (cp != null) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(fxProperty.getJavaElement()));

			contentAssistRequest.addProposal(cp);
		}
	}

	private FXMLCompletionProposal createAttributeProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, String proposalValue, StyledString s, Image image, int priority, PrefixMatcher matcher) {
		if (matcher.isCandidateMatchingPrefix(proposalValue, contentAssistRequest.getMatchString())) {
			FXMLCompletionProposal cp = new FXMLCompletionProposal(proposalValue, context.getInvocationOffset() - contentAssistRequest.getMatchString().length(), proposalValue.length(), proposalValue.length() - 1, image, s, null);
			cp.setMatcher(matcher);
			cp.setPriority(priority);
			return cp;
		}
		return null;
	}

	private FXMLCompletionProposal createProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, String proposalValue, StyledString s, Image img, PrefixMatcher matcher) {
		if (matcher.isCandidateMatchingPrefix(proposalValue, contentAssistRequest.getMatchString())) {
			FXMLCompletionProposal cp = new FXMLCompletionProposal(proposalValue, context.getInvocationOffset() - contentAssistRequest.getMatchString().length(), proposalValue.length(), proposalValue.length(), img, s, null);
			cp.setMatcher(matcher);
			return cp;
		}
		return null;
	}

	private FXMLCompletionProposal createElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, String proposalValue, StyledString s, boolean withEnd, int priority, Image img, PrefixMatcher m) {
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
			if (parent.getNodeName().contains(".")) {
				String[] parts = parent.getNodeName().split("\\.");
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
			} else if (Character.isUpperCase(parent.getNodeName().charAt(0)) || "fx:root".equals(parent.getNodeName())) {
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
						
						if( "fx:root".equals(parent.getNodeName()) ) {
							n = parent;
						} else if (Character.isUpperCase(parent.getParentNode().getNodeName().charAt(0)) || "fx:root".equals(parent.getParentNode().getNodeName())) {
							n = parent.getParentNode();
						} else if (parent.getParentNode().getParentNode() != null) {
							if (Character.isUpperCase(parent.getParentNode().getParentNode().getNodeName().charAt(0)) || "fx:root".equals(parent.getParentNode().getParentNode().getNodeName())) {
								n = parent.getParentNode().getParentNode();
							}
						}

						if (n != null) {
							IType type;
							if( "fx:root".equals(n.getNodeName()) ) {
								type = Util.findType(n.getAttributes().getNamedItem("type").getNodeValue(), parent.getOwnerDocument());
							} else {
								type = Util.findType(n.getNodeName(), parent.getOwnerDocument());	
							}
							
							if (type != null) {
								IFXClass fxclass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
								if (fxclass != null) {
									for (IFXProperty p : fxclass.getAllStaticProperties().values()) {
										String proposalValue = fxclass.getSimpleName() + "." + p.getName() + ">" + "</" + fxclass.getSimpleName() + "." + p.getName() + ">";
										String sType;

										if (p instanceof IFXPrimitiveProperty) {
											IFXPrimitiveProperty pp = (IFXPrimitiveProperty) p;
											sType = pp.getType() == Type.STRING ? "String" : pp.getType().jvmType();
										} else if (p instanceof IFXObjectProperty) {
											IFXObjectProperty op = (IFXObjectProperty) p;
											sType = op.getElementTypeAsString(false);
										} else if (p instanceof IFXEnumProperty) {
											IFXEnumProperty ep = (IFXEnumProperty) p;
											sType = ep.getEnumTypeAsString(false);
										} else {
											sType = "<unknown>";
										}

										FXMLCompletionProposal cp = createElementProposal(contentAssistRequest, context, proposalValue,
												new StyledString().append("(static) ", StyledString.COUNTER_STYLER).append(p.getFXClass().getSimpleName() + "." + p.getName()).append(" - " + sType, StyledString.QUALIFIER_STYLER), true, PRIORITY_LOWER_1, null, STATIC_ELEMENT_MATCHER);
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
					
					if( "fx:root".equals(parent.getNodeName()) ) {
						type = Util.findType(parent.getAttributes().getNamedItem("type").getNodeValue(), parent.getOwnerDocument());
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
				
				if( "fx:root".equals(parent.getNodeName()) ) {
					type = Util.findType(parent.getAttributes().getNamedItem("type").getNodeValue(), parent.getOwnerDocument());
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

	private void createClassElementNameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		Node propertyType = contentAssistRequest.getParent();
		Node elementType = propertyType.getParentNode();

		IType type;
		if( "fx:root".equals(elementType.getNodeName()) ) {
			type = Util.findType(elementType.getAttributes().getNamedItem("type").getNodeValue(), elementType.getOwnerDocument());
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

	private void createPropertyElementNameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXProperty fxProperty) {
		if (fxProperty instanceof IFXCollectionProperty) {
			createListPropertyElementProposal(contentAssistRequest, context, (IFXCollectionProperty) fxProperty);
		} else if (fxProperty instanceof IFXObjectProperty) {
			createObjectPropertyElementProposal(contentAssistRequest, context, (IFXObjectProperty) fxProperty);
		}
	}

	private void createListPropertyElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXCollectionProperty prop) {
		StyledString s = new StyledString(prop.getName() + " : " + prop.getCollectionAsString());
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);

		String propValue = prop.getName() + "></" + prop.getName() + ">";

		FXMLCompletionProposal cp = createElementProposal(contentAssistRequest, context, propValue, s, true, DEFAULT_PRIORITY, IconKeys.getIcon(IconKeys.FIELD_KEY), MATCHER);
		if (cp != null) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			contentAssistRequest.addProposal(cp);
		}
	}

	private void createObjectPropertyElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXObjectProperty prop) {
		StyledString s = new StyledString(prop.getName() + " : " + prop.getElementTypeAsString(false));
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);

		String propValue = prop.getName() + "></" + prop.getName() + ">";

		FXMLCompletionProposal cp = createElementProposal(contentAssistRequest, context, propValue, s, true, DEFAULT_PRIORITY, IconKeys.getIcon(IconKeys.FIELD_KEY), MATCHER);
		if (cp != null) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			contentAssistRequest.addProposal(cp);
		}
	}

	private void createSubtypeProposals(final ContentAssistRequest contentAssistRequest, final CompletionProposalInvocationContext context, IType superType) {
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
					if (sPackageName.startsWith("com.sun.javafx")) {
						priority -= 10;
					}
					StyledString s = new StyledString(new String(simpleTypeName));
					s.append(" - " + sPackageName, StyledString.QUALIFIER_STYLER);
					FXMLCompletionProposal prop = createElementProposal(contentAssistRequest, context, sPackageName + "." + new String(simpleTypeName) + " ", s, false, priority, IconKeys.getIcon(IconKeys.CLASS_KEY), FQN_MATCHER);

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

									String importStatement = (startWithLineBreak ? "\n<?import " : "import ") + proposalReplacementString.trim();
									importStatement += "?>";

									if (endWithLineBreak)
										importStatement += "\n\n";
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
		FXMLCompletionProposal proposal = new FXMLCompletionProposal("<?scenebuilder-stylesheet ?>", context.getInvocationOffset() - contentAssistRequest.getMatchString().length(), "<?scenebuilder-stylesheet ?>".length(), "<?scenebuilder-stylesheet ?>".length()-2);
		proposal.setMatcher(MATCHER);
		contentAssistRequest.addProposal(proposal);

		proposal = new FXMLCompletionProposal("<?scenebuilder-preview-i18n-resource ?>", context.getInvocationOffset() - contentAssistRequest.getMatchString().length(), "<?scenebuilder-preview-i18n-resource ?>".length(), "<?scenebuilder-preview-i18n-resource ?>".length()-2);
		proposal.setMatcher(MATCHER);
		contentAssistRequest.addProposal(proposal);

		
		IJavaProject jproject = findProject(contentAssistRequest);
		try {
			IType superType = jproject.findType("javafx.scene.Parent");
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
				if ("http://javafx.com/fxml".equals(attribute.getNamespaceURI())) {
					if("constant".equals(attribute.getLocalName())) {
						IType type = findType(n.getNodeName(), contentAssistRequest, context);
						if (type != null) {
							try {
								List<IField> fields = new ArrayList<IField>();
								collectStaticFields(fields, type);
								
								for( IField f : fields ) {
									StyledString s = new StyledString(f.getElementName() + " : " + Signature.getSimpleName(Signature.toString(f.getTypeSignature())));
									String owner = ((IType)f.getAncestor(IJavaElement.TYPE)).getElementName();
									s.append(" - " + Signature.getSimpleName(owner), StyledString.QUALIFIER_STYLER);
									
									FXMLCompletionProposal cp = createProposal(
											contentAssistRequest, 
											context, "\"" + f.getElementName(), 
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
					} else if ("controller".equals(attribute.getLocalName())) {
						IJavaProject jproject = findProject(contentAssistRequest);

						char[] typeName = null;
						char[] packageName = null;
						if (!contentAssistRequest.getMatchString().isEmpty()) {
							if( contentAssistRequest.getMatchString().startsWith("\"") ) {
								typeName = contentAssistRequest.getMatchString().substring(1).toCharArray();
							} else {
								typeName = contentAssistRequest.getMatchString().toCharArray();
							}
						}
						
						IJavaSearchScope searchScope = SearchEngine.createJavaSearchScope(new IJavaElement[] { jproject });
						SearchEngine searchEngine = new SearchEngine();
						try {
							searchEngine.searchAllTypeNames(packageName, SearchPattern.R_PATTERN_MATCH, typeName, SearchPattern.R_PREFIX_MATCH | SearchPattern.R_CAMELCASE_MATCH, IJavaSearchConstants.TYPE, searchScope, new TypeNameRequestor() {
								public void acceptType(int modifiers, char[] packageName, char[] simpleTypeName, char[][] enclosingTypeNames, String path) {
									String sPackageName = new String(packageName);
									int priority = PRIORITY_LOWER_1;
									if (sPackageName.startsWith("com.sun")) {
										priority -= 10;
									}
									StyledString s = new StyledString(new String(simpleTypeName));
									s.append(" - " + sPackageName, StyledString.QUALIFIER_STYLER);
									
									FXMLCompletionProposal cp = createProposal(
											contentAssistRequest, 
											context, "\"" + sPackageName + "." + new String(simpleTypeName), 
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

					}
				} else if (attribute.getNodeName().contains(".")) {
					String[] parts = attribute.getNodeName().split("\\.");

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

	private void createAttributeValueEventHandlerProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXEventHandlerProperty p) {
		Document d = contentAssistRequest.getNode().getOwnerDocument();
		Element e = d.getDocumentElement();
		Attr a = e.getAttributeNodeNS("http://javafx.com/fxml", "controller");
		if (a != null) {
			IType t = Util.findType(a.getValue(), d);
			if (t != null) {
				IFXCtrlClass ctrlClass = FXPlugin.getClassmodel().findCtrlClass(t.getJavaProject(), t);
				if (ctrlClass != null) {

					for (IFXCtrlEventMethod ctrlMethod : ctrlClass.getAllEventMethods().values()) {
						StyledString s = null;
						if (!ctrlMethod.hasArgument()) {
							s = new StyledString(ctrlMethod.getName() + "()");
						} else {
							if (org.eclipse.fx.ide.model.Util.assignable(p.getEventType(), ctrlMethod.getArgumentType())) {
								s = new StyledString(ctrlMethod.getName() + "(" + p.getEventTypeAsString(false) + ")");
							}
						}

						if (s != null) {
							s.append(" - " + ctrlClass.getSimpleName(), StyledString.QUALIFIER_STYLER);
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

							FXMLCompletionProposal cp = createProposal(contentAssistRequest, context, "\"#" + ctrlMethod.getName(), s, img, EVENT_ATTRIBUTE_MATCHER);

							if (cp != null) {
								contentAssistRequest.addProposal(cp);
							}
						}
					}

				}
			}
		}
	}

	private void createAttributeValuePrimitiveProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXPrimitiveProperty p) {
		switch (p.getType()) {
		case BOOLEAN: {
			FXMLCompletionProposal cp = createProposal(contentAssistRequest, context, "\"true", new StyledString("true"), null, ATTRIBUTE_MATCHER);

			if (cp != null) {
				cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
				cp.setHover(new HoverImpl(p.getJavaElement()));
				contentAssistRequest.addProposal(cp);
			}

			cp = createProposal(contentAssistRequest, context, "\"false", new StyledString("false"), null, ATTRIBUTE_MATCHER);

			if (cp != null) {
				cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
				cp.setHover(new HoverImpl(p.getJavaElement()));
				contentAssistRequest.addProposal(cp);
			}

			break;
		}
		// case BYTE:
		// case CHAR:
		// case INTEGER:
		// case LONG:
		// case SHORT: {
		// FXMLCompletionProposal cp =
		// createProposal(contentAssistRequest,context, "1", new
		// StyledString("1"), null, ATTRIBUTE_MATCHER);
		//
		// if (cp != null) {
		// cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
		// cp.setHover(new HoverImpl(p.getJavaElement()));
		// contentAssistRequest.addProposal(cp);
		// }
		// break;
		// }
		// case DOUBLE:
		// case FLOAT: {
		// FXMLCompletionProposal cp =
		// createProposal(contentAssistRequest,context, "1.0", new
		// StyledString("1.0"), null, ATTRIBUTE_MATCHER);
		//
		// if (cp != null) {
		// cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
		// cp.setHover(new HoverImpl(p.getJavaElement()));
		// contentAssistRequest.addProposal(cp);
		// }
		// break;
		// }
		// case STRING: {
		// FXMLCompletionProposal cp =
		// createProposal(contentAssistRequest,context, "<String>", new
		// StyledString("<String>"), null, ATTRIBUTE_MATCHER);
		//
		// if (cp != null) {
		// cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
		// cp.setHover(new HoverImpl(p.getJavaElement()));
		// contentAssistRequest.addProposal(cp);
		// }
		// break;
		// }
		default:
			break;
		}
	}

	private void createAttributeValueEnumProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXEnumProperty p) {
		IType t = p.getEnumType();
		if (t != null) {
			try {
				for (IField f : t.getFields()) {
					if (Flags.isEnum(f.getFlags())) {
						FXMLCompletionProposal cp = createProposal(contentAssistRequest, context, "\"" + f.getElementName(), new StyledString(f.getElementName()).append(" - " + p.getEnumTypeAsString(false), StyledString.QUALIFIER_STYLER), IconKeys.getIcon(IconKeys.ENUM_KEY), ATTRIBUTE_MATCHER);
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
			for( IValueOfContributor c : valueOfCollector.getContributors(p.getElementTypeAsString(true)) ) {
				for( Proposal vProp : c.getProposals() ) {
					FXMLCompletionProposal cp = createProposal(contentAssistRequest, context, "\"" +vProp.getValue(), new StyledString(vProp.getValue()), IconKeys.getIcon(IconKeys.VALUE_OF_KEY), ATTRIBUTE_MATCHER);
					if (cp != null) {
						cp.setPriority(cp.getPriority() + vProp.getPriority() + 1);
						if( vProp instanceof DialogProposal ) {
							final DialogProposal dProp = (DialogProposal) vProp;
							cp.setTextApplier(new ReplacementTextApplier() {
								@Override
								public String getActualReplacementString(
										ConfigurableCompletionProposal proposal) {
									return "\"" + dProp.openDialogValue();
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
		if ("java.lang.Integer".equals(fqnType)) {
			return true;
		} else if ("java.lang.Long".equals(fqnType)) {
			return true;
		} else if ("java.lang.Short".equals(fqnType)) {
			return true;
		} else if ("java.lang.Byte".equals(fqnType)) {
			return true;
		}
		return false;
	}

	private static boolean isDoubleType(String fqnType) {
		if ("java.lang.Float".equals(fqnType)) {
			return true;
		} else if ("java.lang.Double".equals(fqnType)) {
			return true;
		}
		return false;
	}

	private IJavaProject findProject(ContentAssistRequest contentAssistRequest) {
		Document xmlDoc = contentAssistRequest.getNode().getOwnerDocument();
		return Util.findProject(xmlDoc);
	}

	private IType findType(String name, ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		return Util.findType(name, contentAssistRequest.getNode().getOwnerDocument());
	}

	private List<String> getImportedTypes(ContentAssistRequest contentAssistRequest) {
		Document xmlDoc = contentAssistRequest.getNode().getOwnerDocument();
		return Util.getImportedTypes(xmlDoc);
	}

	@Override
	protected void addCommentProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addEmptyDocumentProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addEndTagNameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addEndTagProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addPCDATAProposal(String nodeName, ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {

	}

	@Override
	protected void addTagCloseProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addTagInsertionProposals(ContentAssistRequest contentAssistRequest, int childPosition, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addEntityProposals(ContentAssistRequest contentAssistRequest, ITextRegion completionRegion, IDOMNode treeNode, CompletionProposalInvocationContext context) {

	}

	@Override
	protected void addEntityProposals(Vector proposals, Properties map, String key, int nodeOffset, IStructuredDocumentRegion sdRegion, ITextRegion completionRegion, CompletionProposalInvocationContext context) {

	}

	static abstract class Filter {
		public abstract boolean select(String fqnName);
	}

	public static class HoverImpl implements IEObjectHover, ITextHoverExtension {
		private JavadocHoverWrapper javadocWrapper = new JavadocHoverWrapper();
		private IJavaElement currentElement;

		public HoverImpl(IJavaElement currentElement) {
			this.currentElement = currentElement;
		}

		@Override
		public IInformationControlCreator getHoverControlCreator() {
			javadocWrapper.setJavaElement(currentElement);
			return javadocWrapper.getHoverControlCreator();
		}

		@Override
		public Object getHoverInfo(EObject eObject, ITextViewer textViewer, IRegion hoverRegion) {
			javadocWrapper.setJavaElement(currentElement);
			return javadocWrapper.getHoverInfo2(textViewer, hoverRegion);
		}

	}

	public static class JavadocHoverWrapper extends JavadocHover {
		private IJavaElement currentElement;

		public void setJavaElement(IJavaElement element) {
			currentElement = element;
		}

		@Override
		protected IJavaElement[] getJavaElementsAt(ITextViewer textViewer, IRegion hoverRegion) {
			// hack: return previously registered element
			// required as JavadocHover.getHoverInfo(IJavaElement[]
			// elements,...) is private
			return new IJavaElement[] { currentElement };
		}
	}
}
