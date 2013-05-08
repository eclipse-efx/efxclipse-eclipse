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
package org.eclipse.fx.ide.fxgraph.ui.contentassist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Define;
import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage;
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.eclipse.fx.ide.fxgraph.fXGraph.Property;
import org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty;
import org.eclipse.fx.ide.model.FXPlugin;
import org.eclipse.fx.ide.model.IFXClass;
import org.eclipse.fx.ide.model.IFXCollectionProperty;
import org.eclipse.fx.ide.model.IFXCtrlClass;
import org.eclipse.fx.ide.model.IFXCtrlEventMethod;
import org.eclipse.fx.ide.model.IFXEnumProperty;
import org.eclipse.fx.ide.model.IFXEventHandlerProperty;
import org.eclipse.fx.ide.model.IFXMapProperty;
import org.eclipse.fx.ide.model.IFXObjectProperty;
import org.eclipse.fx.ide.model.IFXPrimitiveProperty;
import org.eclipse.fx.ide.model.IFXProperty;
import org.eclipse.fx.ide.model.Util;
import org.eclipse.fx.ide.model.IFXPrimitiveProperty.Type;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider.Filter;
import org.eclipse.xtext.common.types.xtext.ui.JdtHoverProvider.JavadocHoverWrapper;
import org.eclipse.xtext.common.types.xtext.ui.TypeMatchFilters;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;

import org.eclipse.fx.ide.ui.editor.IValueOfContributor;
import org.eclipse.fx.ide.ui.editor.IValueOfContributor.DialogProposal;
import org.eclipse.fx.ide.ui.editor.IValueOfContributor.Proposal;
import org.eclipse.fx.ide.ui.editor.ValueOfContributionCollector;
import org.eclipse.fx.ide.ui.util.IconKeys;
import org.eclipse.fx.ide.ui.util.RelativeFileLocator;

import com.google.inject.Inject;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
@SuppressWarnings("restriction")
public class FXGraphProposalProvider extends AbstractFXGraphProposalProvider {
	private static final Logger LOGGER = Logger.getLogger(FXGraphProposalProvider.class);

	@Inject
	private IJavaElementFinder javaElementFinder;

	@Inject
	private ITypesProposalProvider typeProposalProviders;

	@Inject
	private IJvmTypeProvider.Factory jdtTypeProvider;

	@Inject
	private IJavaProjectProvider projectProvider;
	
	@Inject
	private ValueOfContributionCollector valueOfCollector;
	
	static class StaticPrefixMatcher extends PrefixMatcher {
		private final PrefixMatcher original;
		
		public StaticPrefixMatcher(PrefixMatcher original) {
			this.original = original;
		}
		
		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			name = name.substring(name.indexOf("static")+"static".length()+1);
			name = name.trim();
			return original.isCandidateMatchingPrefix(name, prefix);
		}
	}
	
	static class EscapePrefixMatcher extends PrefixMatcher {
		private final PrefixMatcher original;
		
		public EscapePrefixMatcher(PrefixMatcher original) {
			this.original = original;
		}
		
		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			if( name.startsWith("^") ) {
				name = name.substring(1);
			}
			return original.isCandidateMatchingPrefix(name, prefix);
		}
	}
	
	class FXClassFilter implements Filter {
		private final IJavaProject jp;
		
		public FXClassFilter(IJavaProject jp) {
			this.jp = jp;
		}
		
		@Override
		public int getSearchFor() {
			return IJavaSearchConstants.TYPE;
		}

		@Override
		public boolean accept(int modifiers, char[] packageName, char[] simpleTypeName, char[][] enclosingTypeNames, String path) {

			if (TypeMatchFilters.isInternalClass(simpleTypeName, enclosingTypeNames) || enclosingTypeNames.length > 0) {
				return false;
			}
			
			String sPackname = new String(packageName);
			if( sPackname.startsWith("com.sun") ) {
				return false;
			}
			
			//TODO Should we resolve FX-Types through our model???
			try {
				IType t = jp.findType(new String(packageName)+"."+new String(simpleTypeName));
				if( Flags.isAbstract(t.getFlags()) ) {
					return false;
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
	}
	
	private int getPropertiesProposalsProposals() {
		return getPriorityHelper().getDefaultPriority() + 1;
	}

	@Override
	public void completeElement_DefaultChildren(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		try {
			Element el = (Element) model;

			// Happens when we are in the default section and user typed
			// something
			if ("void".equals(el.getType().getQualifiedName())) {
				if (!(model.eContainer() instanceof Element)) {
					return;
				}

				el = (Element) model.eContainer();
			}

			IJavaProject javaProject = projectProvider.getJavaProject(el.eResource().getResourceSet());
			IType type = javaProject.findType(el.getType().getQualifiedName());

			if (type != null) {
				IFXClass fxClazz = FXPlugin.getClassmodel().findClass(javaProject, type);
				if (fxClazz != null) {
					IFXProperty prop = fxClazz.getDefaultProperty();
					if (prop != null) {
						completeElement_DefaultChildrenProposals(prop, el, context, FXGraphPackage.Literals.ELEMENT__DEFAULT_CHILDREN, acceptor);
					}
				}
			}
		} catch (JavaModelException e) {
			LOGGER.error("Failed to complete default children", e);
		}
	}

	private void completeElement_DefaultChildrenProposals(IFXProperty prop, EObject model, ContentAssistContext context, EReference typeReference, ICompletionProposalAcceptor acceptor) {
		if (prop instanceof IFXCollectionProperty) {
			createCollectionClassProposals((IFXCollectionProperty) prop, model, context, typeReference, acceptor);
		}
	}

	private void createCollectionClassProposals(IFXCollectionProperty prop, final EObject model, ContentAssistContext context, EReference typeReference, ICompletionProposalAcceptor acceptor) {
		IType jdtSuperType = prop.getElementType();
		if (jdtSuperType != null) {
			JvmType superType = jdtTypeProvider.findOrCreateTypeProvider(model.eResource().getResourceSet()).findTypeByName(jdtSuperType.getFullyQualifiedName());
			Filter f = new FXClassFilter(projectProvider.getJavaProject(model.eResource().getResourceSet()));
			typeProposalProviders.createSubTypeProposals(superType, this, context, typeReference, f, acceptor);
		}
	}

	@Override
	public void completeElement_Properties(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		try {
			Element el = (Element) model;
			// Happens when we are in the default section and user typed
			// something
			if ("void".equals(el.getType().getQualifiedName())) {
				if (!(model.eContainer() instanceof Element)) {
					return;
				}

				el = (Element) model.eContainer();
			}

			Element propertyTarget = el;
			{
				IJavaProject javaProject = projectProvider.getJavaProject(el.eResource().getResourceSet());
				IType type = javaProject.findType(el.getType().getQualifiedName());
				if (type != null) {
					IFXClass fxClazz = FXPlugin.getClassmodel().findClass(javaProject, type);

					if (fxClazz != null) {
						Map<String, IFXProperty> map = fxClazz.getAllProperties();
						for (IFXProperty p : map.values()) {
//							// The id-attribute is defined through the id keyword
//							if (!"id".equals(p.getName())) {
								completeElement_PropertiesProposals(p, el, context, FXGraphPackage.Literals.ELEMENT__PROPERTIES, acceptor, propertyTarget, FXGraphPackage.Literals.ELEMENT__PROPERTIES);
//							}
						}
					}
				}				
			}
			
			
			EObject o = el;
			el = null;
			
			while( o.eContainer() != null ) {
				if( o.eContainer() instanceof Element ) {
					el = (Element) o.eContainer();
					break;
				}
				if( o.eContainer() instanceof MapValueProperty ) {
					el = null;
					break;
				}
				o = o.eContainer();
			}
			
			if( el instanceof Element) {
				el = (Element) el;
				IJavaProject javaProject = projectProvider.getJavaProject(el.eResource().getResourceSet());
				IType type = javaProject.findType(el.getType().getQualifiedName());
				if (type != null) {
					IFXClass fxClazz = FXPlugin.getClassmodel().findClass(javaProject, type);

					if (fxClazz != null) {
						Map<String, IFXProperty> map = fxClazz.getAllStaticProperties();
						for (IFXProperty p : map.values()) {
							completeElement_PropertiesProposals(p, el, context, FXGraphPackage.Literals.ELEMENT__STATIC_PROPERTIES, acceptor, propertyTarget, FXGraphPackage.Literals.ELEMENT__STATIC_PROPERTIES);
						}
					}
				}
			}

		} catch (JavaModelException e) {
			LOGGER.error("Failed to complete properties", e);
		}

	}

	private void completeElement_PropertiesProposals(IFXProperty prop, final EObject model, ContentAssistContext context, EStructuralFeature typeReference, final ICompletionProposalAcceptor acceptor, Element propertyTarget, EStructuralFeature propertyListFeature) {
		if( propertyTarget instanceof Element ) {
			System.err.println(propertyTarget.getType());
			List<EObject> items = (List<EObject>) propertyTarget.eGet(propertyListFeature);
			System.err.println("ITEMS: " + items);
			for( EObject i : items ) {
				System.err.println(i);
				if( i instanceof Property ) {
					if( ((Property) i).getName().equals(prop.getName()) ) {
						return;
					}
				} else if( i instanceof StaticValueProperty ) {
					System.err.println("CHECKING STATIC");
					if( ((StaticValueProperty) i).getName().equals(prop.getName()) ) {
						return;
					}
				} else if( i instanceof StaticCallValueProperty ) {
					if( ((StaticCallValueProperty) i).getName().equals(prop.getName()) ) {
						return;
					}
				}
			}
		}
		
		if (prop instanceof IFXCollectionProperty) {
			createCollectionPropnameProposals((IFXCollectionProperty) prop, model, context, typeReference, acceptor);
		} else if (prop instanceof IFXMapProperty) {
			createMapPropnameProposals((IFXMapProperty) prop, model, context, typeReference, acceptor);
		} else if (prop.isSetable()) {
			if (prop instanceof IFXEnumProperty) {
				createEnumPropnameProposals((IFXEnumProperty) prop, model, context, typeReference, acceptor);
			} else if (prop instanceof IFXEventHandlerProperty) {
				createEventHandlerPropnameProposals((IFXEventHandlerProperty) prop, model, context, typeReference, acceptor);
			} else if (prop instanceof IFXObjectProperty) {
				createObjectPropnameProposals((IFXObjectProperty) prop, model, context, typeReference, acceptor);
			} else if (prop instanceof IFXPrimitiveProperty) {
				createPrimitivePropnameProposals((IFXPrimitiveProperty) prop, model, context, typeReference, acceptor);
			}
		}
	}

	private void createCollectionPropnameProposals(IFXCollectionProperty prop, EObject model, ContentAssistContext context, EStructuralFeature typeReference, ICompletionProposalAcceptor acceptor) {
		ICompletionProposal p;
		if (prop.isSetable()) {
			StyledString s = new StyledString(prop.getName() + " : " + prop.getCollectionAsString());
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
			p = createCompletionProposal(prop.getName() + " : ", s, IconKeys.getIcon(IconKeys.LIST_KEY), getPropertiesProposalsProposals(), context.getPrefix(), context);
		} else {
			StyledString s = new StyledString(prop.getName() + " : [" + (prop.getElementType() != null ? prop.getElementType().getElementName() : "?") + "]");
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
			p = createCompletionProposal(prop.getName() + " : []", s, IconKeys.getIcon(IconKeys.LIST_KEY), getPropertiesProposalsProposals(), context.getPrefix(), context);
		}

		if (p instanceof ConfigurableCompletionProposal) {
			ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
			cp.setAdditionalProposalInfo(model);
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			if (!prop.isSetable()) {
				cp.setCursorPosition(cp.getCursorPosition() - 1);
			}
		}

		acceptor.accept(p);
	}

	private void createMapPropnameProposals(IFXMapProperty prop, EObject model, ContentAssistContext context, EStructuralFeature typeReference, ICompletionProposalAcceptor acceptor) {
		StyledString s = new StyledString(prop.getName() + " : {}");
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
		ICompletionProposal p = createCompletionProposal(prop.getName() + " : ", s, IconKeys.getIcon(IconKeys.MAP_KEY), getPropertiesProposalsProposals(), context.getPrefix(), context);

		if (p instanceof ConfigurableCompletionProposal) {
			ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
			cp.setAdditionalProposalInfo(model);
			cp.setHover(new HoverImpl(prop.getJavaElement()));
		}

		acceptor.accept(p);
	}

	private void createEnumPropnameProposals(IFXEnumProperty prop, EObject model, ContentAssistContext context, EStructuralFeature typeReference, ICompletionProposalAcceptor acceptor) {
		if( prop.isStatic() && typeReference.equals(FXGraphPackage.Literals.ELEMENT__STATIC_PROPERTIES) ) {
			StyledString s = new StyledString();
			s.append("(static) ", StyledString.COUNTER_STYLER);
			s.append(prop.getFXClass().getSimpleName() + "." + prop.getName() + " : " + prop.getEnumTypeAsString(false));
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
			
			context = context.copy().setMatcher(new StaticPrefixMatcher(context.getMatcher())).toContext();
			
			ICompletionProposal p = createCompletionProposal("static " + prop.getName() + " : ", s, IconKeys.getIcon(IconKeys.FIELD_KEY), getPropertiesProposalsProposals()-10, context.getPrefix(), context);
			
			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}
			
			acceptor.accept(p);
		} else {
			StyledString s = new StyledString(prop.getName() + " : " + prop.getEnumTypeAsString(false));
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
			ICompletionProposal p = createCompletionProposal(prop.getName() + " : ", s, IconKeys.getIcon(IconKeys.FIELD_KEY), getPropertiesProposalsProposals(), context.getPrefix(), context);

			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}

			acceptor.accept(p);			
		}
	}

	private void createEventHandlerPropnameProposals(IFXEventHandlerProperty prop, EObject model, ContentAssistContext context, EStructuralFeature typeReference, ICompletionProposalAcceptor acceptor) {
		StyledString s = new StyledString(prop.getName() + " : " + prop.getEventTypeAsString(false));
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
		ICompletionProposal p = createCompletionProposal(prop.getName() + " : ", s, IconKeys.getIcon(IconKeys.EVENT_KEY), getPropertiesProposalsProposals(), context.getPrefix(), context);

		if (p instanceof ConfigurableCompletionProposal) {
			ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
			cp.setAdditionalProposalInfo(model);
			cp.setHover(new HoverImpl(prop.getJavaElement()));
		}

		acceptor.accept(p);
	}

	private void createObjectPropnameProposals(IFXObjectProperty prop, EObject model, ContentAssistContext context, EStructuralFeature typeReference, ICompletionProposalAcceptor acceptor) {
		if( prop.isStatic() && typeReference.equals(FXGraphPackage.Literals.ELEMENT__STATIC_PROPERTIES) ) {
			StyledString s = new StyledString();
			s.append("(static) ", StyledString.COUNTER_STYLER);
			s.append(prop.getFXClass().getSimpleName() + "." + prop.getName() + " : " + prop.getElementTypeAsString(false));
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
			
			context = context.copy().setMatcher(new StaticPrefixMatcher(context.getMatcher())).toContext();
			
			ICompletionProposal p = createCompletionProposal("static " + prop.getName() + " : ", s, IconKeys.getIcon(IconKeys.FIELD_KEY), getPropertiesProposalsProposals()-10, context.getPrefix(), context);
			
			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}

			acceptor.accept(p);
		} else {
			StyledString s = new StyledString(prop.getName() + " : " + prop.getElementTypeAsString(false));
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
			ICompletionProposal p = createCompletionProposal(prop.getName() + " : ", s, IconKeys.getIcon(IconKeys.FIELD_KEY), getPropertiesProposalsProposals(), context.getPrefix(), context);

			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}

			acceptor.accept(p);	
		}
	}

	private void createPrimitivePropnameProposals(IFXPrimitiveProperty prop, EObject model, ContentAssistContext context, EStructuralFeature typeReference, ICompletionProposalAcceptor acceptor) {
		String typeName;
		String proposalValue = prop.getName() + " : ";
		switch (prop.getType()) {
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
			proposalValue += "\"\"";
			break;
		}

		if( prop.isStatic() && typeReference.equals(FXGraphPackage.Literals.ELEMENT__STATIC_PROPERTIES) ) {
			StyledString s = new StyledString();
			s.append("(static) ", StyledString.COUNTER_STYLER);
			s.append(prop.getFXClass().getSimpleName() + "." + prop.getName() + " : " + typeName);
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
			
			proposalValue = "static " + proposalValue;
			
			context = context.copy().setMatcher(new StaticPrefixMatcher(context.getMatcher())).toContext();
			
			ICompletionProposal p = createCompletionProposal(proposalValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), getPropertiesProposalsProposals()-10, context.getPrefix(), context);
			
			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}

			acceptor.accept(p);
		} else {
			StyledString s = new StyledString(prop.getName() + " : " + typeName);
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
			
			if( proposalValue.equals("id : \"\"") ) {
				proposalValue = "^" + proposalValue;
			}
			
			context = context.copy().setMatcher(new EscapePrefixMatcher(context.getMatcher())).toContext();
			ICompletionProposal p = createCompletionProposal(proposalValue, s, IconKeys.getIcon(IconKeys.FIELD_KEY), getPropertiesProposalsProposals(), context.getPrefix(), context);
			
			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
				if (prop.getType() == Type.STRING) {
					cp.setCursorPosition(cp.getCursorPosition() - 1);
				}
			}

			acceptor.accept(p);
		}
	}

	@Override
	public void completeProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Property prop;
		
		if( model instanceof Property ) {
			prop = (Property) model;
		} else if( model instanceof Element ) {
			prop = (Property) model.eContainer();
		} else {
			return;
		}
		
		if (prop.eContainer() instanceof Element) {
			Element el = (Element) prop.eContainer();

			try {
				IJavaProject javaProject = projectProvider.getJavaProject(el.eResource().getResourceSet());
				IType type = javaProject.findType(el.getType().getQualifiedName());

				if (type != null) {
					IFXClass fxClazz = FXPlugin.getClassmodel().findClass(javaProject, type);
					IFXProperty fxProp = fxClazz.getProperty(prop.getName());
					if (fxProp != null) {
						completeProperty_ValueProposals(fxProp, model, context, FXGraphPackage.Literals.PROPERTY__VALUE, acceptor);
					}
				}

			} catch (JavaModelException e) {
				LOGGER.error("Failed to retrieve property value proposals", e);
			}
		} else if (prop.eContainer() instanceof MapValueProperty) {
			// TODO Can we provide a proposal here?
		}
	}

	private void completeProperty_ValueProposals(IFXProperty prop, EObject model, ContentAssistContext context, EReference typeReference, ICompletionProposalAcceptor acceptor) {
		if (prop instanceof IFXPrimitiveProperty) {
			createPrimitivePropvalueProposals((IFXPrimitiveProperty) prop, model, context, typeReference, acceptor);
		} else if (prop instanceof IFXEnumProperty) {
			createEnumPropvalueProposals((IFXEnumProperty) prop, model, context, typeReference, acceptor);
		} else if (prop instanceof IFXCollectionProperty) {

		} else if (prop instanceof IFXEventHandlerProperty) {

		} else if (prop instanceof IFXMapProperty) {

		} else if (prop instanceof IFXObjectProperty) {
			createObjectPropvalueProposals((IFXObjectProperty) prop, model, context, typeReference, acceptor);
		}
	}

	private void createPrimitivePropvalueProposals(IFXPrimitiveProperty prop, EObject model, ContentAssistContext context, EReference typeReference, ICompletionProposalAcceptor acceptor) {
		switch (prop.getType()) {
		case BOOLEAN: {
			ICompletionProposal p = createCompletionProposal("true", context);

			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}

			acceptor.accept(p);

			p = createCompletionProposal("false", context);

			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}

			acceptor.accept(p);
			break;
		}
		case BYTE:
		case CHAR:
		case INTEGER:
		case LONG:
		case SHORT: {
			ICompletionProposal p = createCompletionProposal("1", context);

			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}
			acceptor.accept(p);
			break;
		}
		case DOUBLE:
		case FLOAT: {
			ICompletionProposal p = createCompletionProposal("1.0", context);

			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}
			acceptor.accept(p);
			break;
		}
		case STRING: {
			ICompletionProposal p = createCompletionProposal("\"<String>\"", context);

			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}
			acceptor.accept(p);
			break;
		}
		default:
			break;
		}
	}

	private void createEnumPropvalueProposals(IFXEnumProperty prop, EObject model, ContentAssistContext context, EReference typeReference, ICompletionProposalAcceptor acceptor) {
		IType t = prop.getEnumType();
		if (t != null) {
			try {
				for (IField f : t.getFields()) {
					if (Flags.isEnum(f.getFlags())) {
						ICompletionProposal p = createCompletionProposal("\"" + f.getElementName() + "\"", new StyledString(f.getElementName()).append(" - " + prop.getEnumTypeAsString(false), StyledString.QUALIFIER_STYLER), IconKeys.getIcon(IconKeys.ENUM_KEY), getPriorityHelper()
								.getDefaultPriority(), "\"" + context.getPrefix(), context);
						if (p instanceof ConfigurableCompletionProposal) {
							ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
							cp.setAdditionalProposalInfo(model);
							cp.setHover(new HoverImpl(f));
						}

						acceptor.accept(p);
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static boolean isIntegerType(String fqnType) {
		if( "java.lang.Integer".equals(fqnType) ) {
			return true;
		} else if( "java.lang.Long".equals(fqnType) ) {
			return true;
		} else if( "java.lang.Short".equals(fqnType) ) {
			return true;
		} else if( "java.lang.Byte".equals(fqnType) ) {
			return true;
		}
		return false;
	}
	
	private static boolean isDoubleType(String fqnType) {
		if( "java.lang.Float".equals(fqnType) ) {
			return true;
		} else if( "java.lang.Double".equals(fqnType) ) {
			return true;
		}
		return false;
	}
	
	private void createObjectPropvalueProposals(IFXObjectProperty prop, final EObject model, ContentAssistContext context, EReference typeReference, ICompletionProposalAcceptor acceptor) {
		String type = prop.getElementTypeAsString(true);
		
		if( "java.lang.Boolean".equals(type) ) {
			ICompletionProposal p = createCompletionProposal("true", context);
			if( p instanceof ConfigurableCompletionProposal ) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getValueOfMethod()));
			}
			acceptor.accept(p);
			
			p = createCompletionProposal("false", context);
			if( p instanceof ConfigurableCompletionProposal ) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getValueOfMethod()));
			}
			acceptor.accept(p);
		} else if(isIntegerType(type)) {
			ICompletionProposal p = createCompletionProposal("1", context);

			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}
			acceptor.accept(p);
		} else if(isDoubleType(type)) {
			ICompletionProposal p = createCompletionProposal("1.0", context);

			if (p instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
				cp.setAdditionalProposalInfo(model);
				cp.setHover(new HoverImpl(prop.getJavaElement()));
			}
			acceptor.accept(p);
		} else {
			if (prop.hasValueOf()) {
				ICompletionProposal p = createCompletionProposal("\"\"", new StyledString("\"<String>\""), null, getPriorityHelper().getDefaultPriority() + 1, context.getPrefix(), context);
				
				if( p instanceof ConfigurableCompletionProposal ) {
					ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
					cp.setAdditionalProposalInfo(model);
					cp.setHover(new HoverImpl(prop.getValueOfMethod()));
				}
				
				acceptor.accept(p);
				
				for( IValueOfContributor contrib : valueOfCollector.getContributors(prop.getElementTypeAsString(true)) ) {
					for( Proposal vProp : contrib.getProposals() ) {
						int prio = getPriorityHelper().getDefaultPriority()  + vProp.getPriority() + 2;
						p = createCompletionProposal("\""+vProp.getValue()+"\"", new StyledString(vProp.getValue()), IconKeys.getIcon(IconKeys.VALUE_OF_KEY),prio , "\""+context.getPrefix(), context);
						
						if( p instanceof ConfigurableCompletionProposal ) {
							if( vProp instanceof DialogProposal ) {
								ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) p;
								final DialogProposal dProp = (DialogProposal) vProp;
								cp.setTextApplier(new ReplacementTextApplier() {
									@Override
									public String getActualReplacementString(
											ConfigurableCompletionProposal proposal) {
										return "\"" + dProp.openDialogValue() + "\"";
									}
								});
							}
						}
						acceptor.accept(p);
					}
				}
				
			}

			IType jdtSuperType = prop.getElementType();
			if (jdtSuperType != null) {
				final IJvmTypeProvider tProvider = jdtTypeProvider.findOrCreateTypeProvider(model.eResource().getResourceSet());
				JvmType superType = tProvider.findTypeByName(jdtSuperType.getFullyQualifiedName());
				Filter f = new FXClassFilter(projectProvider.getJavaProject(model.eResource().getResourceSet()));
				typeProposalProviders.createSubTypeProposals(superType, this, context, typeReference, f, acceptor);
			}
		}
	}

	public void completeJvmParameterizedTypeReference_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// Do not generate type proposals which are in correct, we handle the
		// types our own
	}

	@Override
	public void completeResourceValueProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if( ! model.eResource().getContents().isEmpty() ) {
			Model m = (Model) model.eResource().getContents().get(0);
			if( m.getComponentDef() != null ) {
				if( m.getComponentDef().getPreviewResourceBundle() != null ) {
					File f = RelativeFileLocator.locateFile(model.eResource().getURI(),  m.getComponentDef().getPreviewResourceBundle());
					Properties p = null;
					if (f != null) {
						FileInputStream fi = null;
						try {
							fi = new FileInputStream(f);
							p = new Properties();
							p.load(fi);
						} catch (FileNotFoundException e) {
							LOGGER.warn("Unable to load resource bundle", e);
						} catch (IOException e) {
							LOGGER.warn("Unable to load resource bundle", e);
						} finally {
							if (fi != null) {
								try {
									fi.close();
								} catch (IOException e) {
									LOGGER.error("Unable to close resource filehandle", e);
								}
							}
						}
					}
					if( p != null ) {
						for (String k : p.stringPropertyNames()) {
							StyledString s = new StyledString(k);
							s.append(" - " + p.getProperty(k), StyledString.DECORATIONS_STYLER);
							acceptor.accept(createCompletionProposal("\"" + k + "\"", s, IconKeys.getIcon(IconKeys.EXTERNALIZED_STRING_KEY), context));
						}
					}
				}
			}
		}
	}
	
	@Override
	public void completeBindValueProperty_ElementReference(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		TreeIterator<EObject> it = model.eResource().getAllContents();
		while (it.hasNext()) {
			EObject o = it.next();
			if (o instanceof Element) {
				Element e = (Element) o;
				if (e.getName() != null && e.getName().trim().length() > 0) {
					StyledString s = new StyledString(e.getName());
					s.append(" - " + e.getType().getQualifiedName(), StyledString.DECORATIONS_STYLER);
					acceptor.accept(createCompletionProposal(e.getName(), s, IconKeys.getIcon(IconKeys.CLASS_KEY), context));
				}
			}
		}
	}
	
	@Override
	public void completeBindValueProperty_Attribute(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		BindValueProperty b = (BindValueProperty) model;
		if (b.getElementReference() != null && b.getElementReference().getType() != null) {
			Property property = (Property) b.eContainer();
			Element targetClass = (Element) property.eContainer();
			Element element = b.getElementReference();
			
			try {
				IJavaProject javaProject = projectProvider.getJavaProject(element.eResource().getResourceSet());
				IType sourceType = javaProject.findType(element.getType().getQualifiedName());
				IType targetType = javaProject.findType(targetClass.getType().getQualifiedName());
				
				IFXClass fxSourceClazz = FXPlugin.getClassmodel().findClass(javaProject, sourceType);
				IFXClass fxTargetClass = FXPlugin.getClassmodel().findClass(javaProject, targetType);
				IFXProperty targetProperty = fxTargetClass.getProperty(property.getName());
				
				if( targetProperty instanceof IFXPrimitiveProperty ) {
					IFXPrimitiveProperty pp = (IFXPrimitiveProperty) targetProperty;
					for( IFXProperty sourceProp: fxSourceClazz.getAllProperties().values() ) {
						if( sourceProp instanceof IFXEventHandlerProperty ) {
							continue;
						}
						
						boolean select = false;
						if( pp.getType() == Type.STRING ) {
							select = true;
						} else {
							if( sourceProp instanceof IFXPrimitiveProperty ) {
								IFXPrimitiveProperty sp = (IFXPrimitiveProperty) sourceProp;
								if( pp.getType() == Type.BOOLEAN ) {
									select = sp.getType() == Type.BOOLEAN;
								} else if( sp.getType() != Type.STRING && sp.getType() != Type.BOOLEAN ) {
									select = true;
								}
							}
						}
						
						if( select ) {
							String typeName = "";
							if( sourceProp instanceof IFXPrimitiveProperty ) {
								IFXPrimitiveProperty sp = (IFXPrimitiveProperty) sourceProp;
								if( sp.getType() == Type.STRING ) {
									typeName = "String";
								} else {
									typeName = sp.getType().jvmType();
								}
							} else if (sourceProp instanceof IFXCollectionProperty ) {
								typeName = ((IFXCollectionProperty)sourceProp).getCollectionAsString();
							} else if( sourceProp instanceof IFXEnumProperty ) {
								typeName = ((IFXEnumProperty)sourceProp).getEnumTypeAsString(false);
							} else if( sourceProp instanceof IFXMapProperty ) {
								typeName = "{}";
							} else if( sourceProp instanceof IFXObjectProperty ) {
								typeName = ((IFXObjectProperty)sourceProp).getElementTypeAsString(false);
							}
							
							StyledString s = new StyledString(sourceProp.getName() + " : " + typeName);
							s.append(" - " + sourceProp.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
							ICompletionProposal cp = createCompletionProposal(sourceProp.getName(), s, IconKeys.getIcon(IconKeys.FIELD_KEY), getPropertiesProposalsProposals(), context.getPrefix(), context);
							acceptor.accept(cp);
						}
					}
				}
			} catch (JavaModelException e1) {
				LOGGER.error("Unable to extract java informations", e1);
			}
		}
	}
	
	@Override
	public void completeElement_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
	}
	
	@Override
	public void completeListValueProperty_Value(EObject m, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		ListValueProperty listProp = null;
		
		if( m instanceof ListValueProperty ) {
			listProp = (ListValueProperty) m;
		} else if( m instanceof Element && m.eContainer() instanceof ListValueProperty ) {
			// If at least one char is already typed
			listProp = (ListValueProperty) m.eContainer();
		}
		
		if( listProp != null ) {
			if( listProp.eContainer() instanceof Property ) {
				Property property = (Property) listProp.eContainer();
				if( property.eContainer() instanceof Element ) {
					try {
						Element element = (Element) property.eContainer();
						IJavaProject javaProject = projectProvider.getJavaProject(element.eResource().getResourceSet());
						IType ownerType = javaProject.findType(element.getType().getQualifiedName());
						IFXClass fxOwnerClazz = FXPlugin.getClassmodel().findClass(javaProject, ownerType);
						IFXProperty ownerProperty = fxOwnerClazz.getProperty(property.getName());
						
						if (ownerProperty instanceof IFXCollectionProperty) {
							IFXCollectionProperty cp = (IFXCollectionProperty) ownerProperty;
							String type = cp.getElementType().getElementName();
							if( "String".equals(type) ) {
								ICompletionProposal p = createCompletionProposal("\"\"", new StyledString("\"<String>\""), IconKeys.getIcon(IconKeys.CLASS_KEY), context);
							
								if (p instanceof ConfigurableCompletionProposal) {
									ConfigurableCompletionProposal ccp = (ConfigurableCompletionProposal) p;
									ccp.setAdditionalProposalInfo(listProp);
									ccp.setHover(new HoverImpl(ownerProperty.getJavaElement()));
									ccp.setCursorPosition(ccp.getCursorPosition() - 1);
								}
								acceptor.accept(p);
							} else if( "Double".equals(type) ) {
								ICompletionProposal p = createCompletionProposal("1.0", context);

								if (p instanceof ConfigurableCompletionProposal) {
									ConfigurableCompletionProposal ccp = (ConfigurableCompletionProposal) p;
									ccp.setAdditionalProposalInfo(listProp);
									ccp.setHover(new HoverImpl(ownerProperty.getJavaElement()));
								}
								acceptor.accept(p);
							} else if( "Integer".equals(type) ) {
								ICompletionProposal p = createCompletionProposal("1", context);

								if (p instanceof ConfigurableCompletionProposal) {
									ConfigurableCompletionProposal ccp = (ConfigurableCompletionProposal) p;
									ccp.setAdditionalProposalInfo(listProp);
									ccp.setHover(new HoverImpl(ownerProperty.getJavaElement()));
								}
								acceptor.accept(p);
							} else if( "Boolean".equals(type) ) {
								ICompletionProposal p = createCompletionProposal("true", context);

								if (p instanceof ConfigurableCompletionProposal) {
									ConfigurableCompletionProposal ccp = (ConfigurableCompletionProposal) p;
									ccp.setAdditionalProposalInfo(listProp);
									ccp.setHover(new HoverImpl(ownerProperty.getJavaElement()));
								}
								acceptor.accept(p);
								
								p = createCompletionProposal("false", context);

								if (p instanceof ConfigurableCompletionProposal) {
									ConfigurableCompletionProposal ccp = (ConfigurableCompletionProposal) p;
									ccp.setAdditionalProposalInfo(listProp);
									ccp.setHover(new HoverImpl(ownerProperty.getJavaElement()));
								}
								acceptor.accept(p);
							} else {
								createCollectionClassProposals(cp, listProp, context, FXGraphPackage.Literals.LIST_VALUE_PROPERTY__VALUE, acceptor);
							}
						}
						
					} catch (JavaModelException e) {
						LOGGER.error("Unable to autocomplete list value", e);
					}
				}
			}
		}	
	}
	
	@Override
	public void completeControllerHandledValueProperty_Methodname(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if( ! model.eResource().getContents().isEmpty() ) {
			Model m = (Model) model.eResource().getContents().get(0);
			if( m.getComponentDef() != null ) {
				if( m.getComponentDef().getController() != null ) {
					if( model.eContainer() instanceof Property ) {
						Property property = (Property) model.eContainer();
						if( property.eContainer() instanceof Element ) {
							try {
								Element element = (Element) property.eContainer();
								IJavaProject javaProject = projectProvider.getJavaProject(element.eResource().getResourceSet());
								IType ownerType = javaProject.findType(element.getType().getQualifiedName());
								IFXClass fxOwnerClazz = FXPlugin.getClassmodel().findClass(javaProject, ownerType);
								IFXProperty ownerProperty = fxOwnerClazz.getProperty(property.getName());
								
								if( ownerProperty instanceof IFXEventHandlerProperty ) {
									IFXEventHandlerProperty p = (IFXEventHandlerProperty) ownerProperty;
									IType ctrlType = javaProject.findType(m.getComponentDef().getController().getQualifiedName());
									IFXCtrlClass ctrlClass = FXPlugin.getClassmodel().findCtrlClass(javaProject, ctrlType);
									for( IFXCtrlEventMethod ctrlMethod : ctrlClass.getAllEventMethods().values() ) {
										StyledString s = null;
										if( ! ctrlMethod.hasArgument() ) {
											s = new StyledString(ctrlMethod.getName()+"()");
										} else {
											if( Util.assignable(p.getEventType(), ctrlMethod.getArgumentType()) ) {
												s = new StyledString(ctrlMethod.getName() + "("+p.getEventTypeAsString(false)+")");
											}
										}
										
										if( s != null ) {
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
											
											ICompletionProposal cp = createCompletionProposal(ctrlMethod.getName(), s, img, context);
											acceptor.accept(cp);
										}
										
									}
								}
								
							} catch(JavaModelException e) {
								LOGGER.error("Unable to autocomplete list value", e);
							}	
						}
					}
				}
			}
		}
	}
	
	@Override
	public void completeDefine_Element(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		typeProposalProviders.createTypeProposals(this, context, FXGraphPackage.Literals.DEFINE__ELEMENT, acceptor);
	}
	
	@Override
	public void completeReferenceValueProperty_Reference(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if( ! model.eResource().getContents().isEmpty() ) {
			Model m = (Model) model.eResource().getContents().get(0);
			if( m.getComponentDef() != null) {
				for( Define d : m.getComponentDef().getDefines() ) {
					Element element = d.getElement();
					boolean includeType = false;
					if( element == null ) {
						element = d.getIncludeElement().getSource().getRootNode();
						includeType = true;
					}
						IJavaProject javaProject = projectProvider.getJavaProject(element.eResource().getResourceSet());
						try {
							IType defType = javaProject.findType(element.getType().getQualifiedName());
							ReferenceValueProperty rp = (ReferenceValueProperty) model;
							
							IType targetType = null;
							if( rp.eContainer() instanceof Property ) {
								Property p = (Property) rp.eContainer();
								if( p.eContainer() instanceof Element ) {
									Element e = (Element) p.eContainer();
									IType ownerType = javaProject.findType(e.getType().getQualifiedName());
									IFXClass ownerClass = FXPlugin.getClassmodel().findClass(javaProject, ownerType);
									IFXProperty ownerProp = ownerClass.getProperty(p.getName());
									if( ownerProp instanceof IFXObjectProperty ) {
										targetType = ((IFXObjectProperty) ownerProp).getElementType();
									}
								}
							} else if( rp.eContainer() instanceof StaticCallValueProperty ) {
								LOGGER.warn("Unable to extract type for " + rp.eContainer());
							} else if( rp.eContainer() instanceof ListValueProperty ) {
								ListValueProperty lvp = (ListValueProperty) rp.eContainer();
								if( lvp.eContainer() instanceof Property ) {
									Property p = (Property) lvp.eContainer();
									if( p.eContainer() instanceof Element ) {
										Element e = (Element) p.eContainer();
										IType ownerType = javaProject.findType(e.getType().getQualifiedName());
										IFXClass ownerClass = FXPlugin.getClassmodel().findClass(javaProject, ownerType);
										IFXProperty ownerProp = ownerClass.getProperty(p.getName());
										if( ownerProp instanceof IFXCollectionProperty ) {
											targetType = ((IFXCollectionProperty) ownerProp).getElementType();
										}
									}
								} else {
									LOGGER.warn("Unable to extract type for " + rp.eContainer());
								}
							}
							
							if( targetType != null ) {
								if( Util.assignable(defType, targetType) ) {
									StyledString s = new StyledString(includeType ? d.getIncludeElement().getName() : element.getName());
									s.append(" - " + defType.getElementName(), StyledString.QUALIFIER_STYLER);
									acceptor.accept(createCompletionProposal(includeType ? d.getIncludeElement().getName() : element.getName(), s, IconKeys.getIcon(IconKeys.CLASS_KEY), context));
								}	
							}
						} catch (JavaModelException e) {
							LOGGER.error("Unable to extract define type", e);
						}
				}
			}
		}
	}

	@Override
	public void completeLocationValueProperty_Value(EObject model, Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
		IJavaProject javaProject = projectProvider.getJavaProject(model.eResource().getResourceSet());
		
		try {
			for( IPackageFragmentRoot r : javaProject.getPackageFragmentRoots() ) {
				if( r.getCorrespondingResource() != null ) {
					final int count = r.getCorrespondingResource().getProjectRelativePath().segmentCount();
					r.getCorrespondingResource().accept(new IResourceVisitor() {
						
						@Override
						public boolean visit(IResource resource) throws CoreException {
							if (resource.getType() == IResource.FOLDER || resource.getType() == IResource.PROJECT) {
								return true;
							} else if (resource.getType() == IResource.FILE && !resource.isLinked()) {
								String extension = resource.getProjectRelativePath().getFileExtension();
								if( extension.equals("png") || extension.equals("jpg") || extension.equals("gif") ) {
									IPath p = resource.getProjectRelativePath().removeFirstSegments(count);
									String prefix = "\"/" + (p.segmentCount() > 1 ?  p.removeLastSegments(1).toString() : p.toString()) + "/" + context.getPrefix();
									ICompletionProposal proposal = createCompletionProposal("\"/" + p.toString() +"\"", new StyledString("/" + p.toString()), null, getPriorityHelper().getDefaultPriority(), prefix, context);
									acceptor.accept(proposal);
								}
							}
							
							return false;
						}
					});	
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void completeStaticCallValueProperty_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		//TODO Should we should all classes?
		JvmType superType = jdtTypeProvider.findOrCreateTypeProvider(model.eResource().getResourceSet()).findTypeByName("javafx.scene.Parent");
		Filter f = new FXClassFilter(projectProvider.getJavaProject(model.eResource().getResourceSet()));
		typeProposalProviders.createSubTypeProposals(superType, this, context, FXGraphPackage.Literals.STATIC_CALL_VALUE_PROPERTY__TYPE, f, acceptor);
	}
	
	@Override
	public void completeStaticCallValueProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		StaticCallValueProperty staticProperty = (StaticCallValueProperty) model;
		
		try {
			IJavaProject javaProject = projectProvider.getJavaProject(staticProperty.eResource().getResourceSet());
			IType type = javaProject.findType(staticProperty.getType().getQualifiedName());
			
			if (type != null) {
				IFXClass fxClazz = FXPlugin.getClassmodel().findClass(javaProject, type);
				if (fxClazz != null) {
					Map<String, IFXProperty> map = fxClazz.getAllStaticProperties();
					for (IFXProperty p : map.values()) {
						completeElement_PropertiesProposals(p, model, context, FXGraphPackage.Literals.STATIC_CALL_VALUE_PROPERTY__NAME, acceptor, null, null);
					}
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void completeStaticCallValueProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		StaticCallValueProperty staticProperty = null;
		if( model instanceof Element ) {
			staticProperty = (StaticCallValueProperty) model.eContainer();
		} else {
			staticProperty = (StaticCallValueProperty) model;	
		}
		
		try {
			IJavaProject javaProject = projectProvider.getJavaProject(staticProperty.eResource().getResourceSet());
			IType type = javaProject.findType(staticProperty.getType().getQualifiedName());
			
			if (type != null) {
				IFXClass fxClazz = FXPlugin.getClassmodel().findClass(javaProject, type);
				if (fxClazz != null) {
					IFXProperty fxProp = fxClazz.getStaticProperty(staticProperty.getName());
					if (fxProp != null) {
						completeProperty_ValueProposals(fxProp, model, context, FXGraphPackage.Literals.STATIC_CALL_VALUE_PROPERTY__VALUE, acceptor);
					}
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void completeStaticValueProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		EObject eo;
		
		if( model instanceof StaticValueProperty ) {
			eo = model.eContainer();	
		} else {
			eo = model;
		}
		
		Element target = null;
		Element propertyTarget = (Element) (eo instanceof Element ? eo : null);
		
		while( eo.eContainer() != null ) {
			if( eo.eContainer() instanceof Element ) {
				target = (Element) eo.eContainer();
				break;
			}
			eo = eo.eContainer();
		}
		
		if( target == null ) {
			return;
		}
		
		try {
			IJavaProject javaProject = projectProvider.getJavaProject(model.eResource().getResourceSet());
			IType type = javaProject.findType(target.getType().getQualifiedName());
			
			if (type != null) {
				IFXClass fxClazz = FXPlugin.getClassmodel().findClass(javaProject, type);
				if (fxClazz != null) {
					Map<String, IFXProperty> map = fxClazz.getAllStaticProperties();
					for (IFXProperty p : map.values()) {
						completeElement_PropertiesProposals(p, model, context, FXGraphPackage.Literals.STATIC_VALUE_PROPERTY__NAME, acceptor, propertyTarget, FXGraphPackage.Literals.ELEMENT__STATIC_PROPERTIES);
					}
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void completeStaticValueProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		StaticValueProperty staticProperty = null;
		if( model instanceof Element ) {
			staticProperty = (StaticValueProperty) model.eContainer();
		} else {
			staticProperty = (StaticValueProperty) model;
		}
		
		EObject eo = staticProperty.eContainer();
		Element target = null;
		
		while( eo.eContainer() != null ) {
			if( eo.eContainer() instanceof Element ) {
				target = (Element) eo.eContainer();
				break;
			}
			eo = eo.eContainer();
		}
				
		if( target == null ) {
			return;
		}
		
		try {
			IJavaProject javaProject = projectProvider.getJavaProject(staticProperty.eResource().getResourceSet());
			IType type = javaProject.findType(target.getType().getQualifiedName());
			
			if (type != null) {
				IFXClass fxClazz = FXPlugin.getClassmodel().findClass(javaProject, type);
				if (fxClazz != null) {
					IFXProperty fxProp = fxClazz.getStaticProperty(staticProperty.getName());
					if (fxProp != null) {
						completeProperty_ValueProposals(fxProp, model, context, FXGraphPackage.Literals.STATIC_VALUE_PROPERTY__VALUE, acceptor);
					}
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void completeComponentDefinition_RootNode(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		JvmType superType = jdtTypeProvider.findOrCreateTypeProvider(model.eResource().getResourceSet()).findTypeByName("javafx.scene.Parent");
		typeProposalProviders.createSubTypeProposals(superType, this, context, FXGraphPackage.Literals.COMPONENT_DEFINITION__ROOT_NODE, acceptor);
	}
	
	@Override
	public void completeComponentDefinition_Controller(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		typeProposalProviders.createTypeProposals(this, context, FXGraphPackage.Literals.COMPONENT_DEFINITION__CONTROLLER, acceptor);
	
	}
	
	@Override
	public void completeConstValueProperty_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		typeProposalProviders.createTypeProposals(this, context, FXGraphPackage.Literals.CONST_VALUE_PROPERTY__TYPE, acceptor);
	}
	
	@Override
	public void completeConstValueProperty_Field(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if( model instanceof ConstValueProperty ) {
			ConstValueProperty constProp = (ConstValueProperty) model;
			IJavaProject javaProject = projectProvider.getJavaProject(constProp.eResource().getResourceSet());
			try {
				IType type = javaProject.findType(constProp.getType().getQualifiedName());
				List<IField> fields = new ArrayList<IField>();
				collectStaticFields(fields, type);
				
				for( IField f : fields ) {
					StyledString s = new StyledString(f.getElementName() + " : " + Signature.getSimpleName(Signature.toString(f.getTypeSignature())));
					String owner = ((IType)f.getAncestor(IJavaElement.TYPE)).getElementName();
					s.append(" - " + Signature.getSimpleName(owner), StyledString.QUALIFIER_STYLER);
					ICompletionProposal prop = createCompletionProposal(f.getElementName(), s, IconKeys.getIcon(IconKeys.FIELD_KEY), context);
					acceptor.accept(prop);
				}
				
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
	
//	@Override
//	public void completeIncludeValueProperty_Source(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		// TODO Auto-generated method stub
//		super.completeIncludeValueProperty_Source(model, assignment, context, acceptor);
//	}
	
	public static class HoverImpl implements IEObjectHover, ITextHoverExtension {
		private JavadocHoverWrapper javadocHover = new JavadocHoverWrapper();
		private IJavaElement javaElement;

		public HoverImpl(IJavaElement javaElement) {
			this.javaElement = javaElement;
		}

		@Override
		public Object getHoverInfo(EObject eObject, ITextViewer textViewer, IRegion hoverRegion) {
			javadocHover.setJavaElement(javaElement);
			return javadocHover.getHoverInfo2(textViewer, hoverRegion);
		}

		@Override
		public IInformationControlCreator getHoverControlCreator() {
			return javadocHover.getHoverControlCreator();
		}
	}
}
