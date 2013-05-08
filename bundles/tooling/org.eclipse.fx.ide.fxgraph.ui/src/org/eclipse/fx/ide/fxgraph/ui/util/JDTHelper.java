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
package org.eclipse.fx.ide.fxgraph.ui.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.fxgraph.ui.contentassist.FXGraphProposalProvider;
import org.eclipse.fx.ide.fxgraph.ui.internal.FXGraphActivator;
import org.eclipse.fx.ide.fxgraph.ui.util.prop.IProposalProvider;
import org.eclipse.fx.ide.fxgraph.ui.util.prop.KeyCombinationProvider;
import org.eclipse.fx.ide.fxgraph.ui.util.prop.PaintProposalProvider;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.internal.core.SourceType;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.common.types.xtext.ui.JdtHoverProvider.JavadocHoverWrapper;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;


public class JDTHelper {
	public static final String FIELD_KEY = FXGraphProposalProvider.class.getName() + ".FIELD";
	public static final String EVENT_KEY = FXGraphProposalProvider.class.getName() + ".EVENT";
	public static final String LIST_KEY = FXGraphProposalProvider.class.getName() + ".LIST";
	public static final String MAP_KEY = FXGraphProposalProvider.class.getName() + ".MAP";
	public static final String ENUM_KEY = FXGraphProposalProvider.class.getName() + ".ENUM_KEY";

	public static final String METHOD_PRIVATE_KEY = FXGraphProposalProvider.class.getName() + ".METHOD_PRIVATE";
	public static final String METHOD_DEFAULT_KEY = FXGraphProposalProvider.class.getName() + ".METHOD_DEFAULT";
	public static final String METHOD_PROTECTED_KEY = FXGraphProposalProvider.class.getName() + ".METHOD_PROTECTED";
	public static final String METHOD_PUBLIC_KEY = FXGraphProposalProvider.class.getName() + ".METHOD_PUBLIC";
	public static final String STAT_METHOD_PUBLIC_KEY = FXGraphProposalProvider.class.getName() + ".STAT_METHOD_PUBLIC_KEY";

	public static final String EXTERNALIZED_STRING_KEY = FXGraphProposalProvider.class.getName() + ".EXTERNALIZED_STRING_KEY";
	public static final String CLASS_KEY = FXGraphProposalProvider.class.getName() + ".CLASS_KEY";

	public static final String PACKAGE_KEY = FXGraphProposalProvider.class.getName() + ".PACKAGE_KEY";
	public static final String COMPONENT_KEY = FXGraphProposalProvider.class.getName() + ".COMPONENT_KEY";
	public static final String IMPORT_LIST_KEY = FXGraphProposalProvider.class.getName() + ".IMPORT_LIST_KEY";
	public static final String IMPORT_KEY = FXGraphProposalProvider.class.getName() + ".IMPORT_KEY";
	public static final String BINDING_KEY = FXGraphProposalProvider.class.getName() + ".BINDING_KEY";
	public static final String REFERENCE_KEY = FXGraphProposalProvider.class.getName() + ".REFERENCE_KEY";
	public static final String INCLUDE_KEY = FXGraphProposalProvider.class.getName() + ".INCLUDE_KEY";
	public static final String COPY_KEY = FXGraphProposalProvider.class.getName() + ".COPY_KEY";
	public static final String LOCATION_KEY = FXGraphProposalProvider.class.getName() + ".LOCATION_KEY";
	public static final String DEFINES_KEY = FXGraphProposalProvider.class.getName() + ".DEFINES_KEY";
	public static final String SCRIPTS_KEY = FXGraphProposalProvider.class.getName() + ".SCRIPTS_KEY";
	
	private static final Map<String, IProposalProvider> PROVIDERS = new HashMap<String, IProposalProvider>();
	
	private Map<String, TypeData> typeCache = new HashMap<String, TypeData>();

	static {
		JFaceResources.getImageRegistry().put(FIELD_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/field_public_obj.gif"));
		JFaceResources.getImageRegistry().put(EVENT_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/correction_change.gif"));
		JFaceResources.getImageRegistry().put(LIST_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/class_hi.gif"));
		JFaceResources.getImageRegistry().put(MAP_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/types.gif"));

		JFaceResources.getImageRegistry().put(METHOD_PRIVATE_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/methpri_obj.gif"));
		JFaceResources.getImageRegistry().put(METHOD_DEFAULT_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/methdef_obj.gif"));
		JFaceResources.getImageRegistry().put(METHOD_PROTECTED_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/methpro_obj.gif"));
		JFaceResources.getImageRegistry().put(METHOD_PUBLIC_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/methpub_obj.gif"));

		JFaceResources.getImageRegistry().put(STAT_METHOD_PUBLIC_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/statmethpub_obj.gif"));

		JFaceResources.getImageRegistry().put(EXTERNALIZED_STRING_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/internalize.gif"));
		
		JFaceResources.getImageRegistry().put(CLASS_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/class_obj.gif"));
		JFaceResources.getImageRegistry().put(PACKAGE_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/packd_obj.gif"));
		JFaceResources.getImageRegistry().put(COMPONENT_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/cu_obj.gif"));
		JFaceResources.getImageRegistry().put(IMPORT_LIST_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/impc_obj.gif"));
		JFaceResources.getImageRegistry().put(IMPORT_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/imp_obj.gif"));
		JFaceResources.getImageRegistry().put(BINDING_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/occ_write.gif"));
		JFaceResources.getImageRegistry().put(REFERENCE_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/no_breakpoint.gif"));
		JFaceResources.getImageRegistry().put(INCLUDE_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/inclusion_filter_attrib.gif"));
		JFaceResources.getImageRegistry().put(COPY_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/template_obj.gif"));
		JFaceResources.getImageRegistry().put(LOCATION_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/jar_desc_obj.gif"));
		JFaceResources.getImageRegistry().put(DEFINES_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/correction_cast.gif"));
		JFaceResources.getImageRegistry().put(SCRIPTS_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/classf_generate.gif"));
		JFaceResources.getImageRegistry().put(ENUM_KEY, FXGraphActivator.imageDescriptorFromPlugin("org.eclipse.fx.ide.fxgraph.ui", "/icons/enum_obj.gif"));
	}
	
	static {
		PROVIDERS.put("javafx.scene.paint.Paint", new PaintProposalProvider());
		PROVIDERS.put("javafx.scene.input.KeyCombination", new KeyCombinationProvider());
	}


	public static class TypeData {
		public SortedSet<JDTHelperProperty> properties = new TreeSet<JDTHelperProperty>();
	}

	public static abstract class JDTHelperProperty implements Comparable<JDTHelperProperty> {
		public final String name;
		public final String owner;
		public final IMethod method;

		public JDTHelperProperty(IMethod method, String name, String owner) {
			this.method = method;
			this.name = name;
			this.owner = owner;
		}

		public abstract StyledString getDescription();

		public abstract Image getIcon();

		public abstract List<Proposal> getProposals();

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			JDTHelperProperty other = (JDTHelperProperty) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public int compareTo(JDTHelperProperty arg0) {
			return name.compareTo(arg0.name);
		}
	}

	public static class Proposal {
		public final String value;
		public final StyledString description;
		public final Image icon;
		public final int prio;
		public IEObjectHover hover;

		public Proposal(String value) {
			this(value, null, null);
		}
		
		public Proposal(String value, int prio) {
			this(value, null, null, prio);
		}

		public Proposal(String value, StyledString description, Image icon) {
			this.value = value;
			this.description = description;
			this.icon = icon;
			this.prio = 600;
		}
		
		public Proposal(String value, StyledString description, Image icon, int prio) {
			this.value = value;
			this.description = description;
			this.icon = icon;
			this.prio = prio;
		}
	}
	
	public static abstract class DialogProposal extends Proposal {
		public DialogProposal(int prio, String label) {
			super(label,prio);
		}
				
		public abstract String openProposal();
	}
	
	public static abstract class ProcessedProposal extends Proposal {
		public ProcessedProposal(String label) {
			super(label);
		}
				
		public abstract String getProcessed();
	}

	public static abstract class JDTHelperSingleValueProperty extends JDTHelperProperty {
		private String returnType;

		public JDTHelperSingleValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner);
			this.returnType = returnType;
		}

		public Image getIcon() {
			return JFaceResources.getImage(FIELD_KEY);
		}

		public StyledString getDescription() {
			StyledString description = new StyledString(name + " : " + returnType);
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}
	}

	public static abstract class PrimitivValueProperty extends JDTHelperSingleValueProperty {

		public PrimitivValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner, returnType);
		}

	}

	public static class FloatingValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();

		static {
			PROPOSALS.add(new Proposal("1.0"));
		}

		public FloatingValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner, returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	public static class IntegerValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();

		static {
			PROPOSALS.add(new Proposal("1"));
		}

		public IntegerValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner, returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	public static class BooleanValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();

		static {
			PROPOSALS.add(new Proposal("true"));
			PROPOSALS.add(new Proposal("false"));
		}

		public BooleanValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner, returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}
	
	public static class EnumValueProperty extends JDTHelperSingleValueProperty {
		
		private final List<Proposal> proposals = new ArrayList<Proposal>();

		public EnumValueProperty(IMethod method, String name, String owner, String returnType, IType type) {
			super(method, name, owner, returnType);
			try {
				for (IField c : type.getFields()) {
					if (Flags.isEnum(c.getFlags())) {
						StyledString s = new StyledString(
								c.getElementName());
						s.append(
								" : "
										+ type.getElementName(),
								StyledString.QUALIFIER_STYLER);
						proposals.add(new Proposal("\"" + c.getElementName()
								+ "\"", s, JFaceResources
								.getImage(JDTHelper.ENUM_KEY)));
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Override
		public List<Proposal> getProposals() {
			return proposals;
		}
	}

	public static class StringValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();

		static {
			PROPOSALS.add(new Proposal("\"value\""));
		}

		public StringValueProperty(IMethod method, String name, String owner, String returnType) {
			super(method, name, owner, returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	public static class ElementValueProperty extends JDTHelperSingleValueProperty {
		private List<Proposal> props;
		public ElementValueProperty(IMethod method, String name, String owner, String returnType, List<Proposal> props) {
			super(method, name, owner, returnType);
			this.props = props;
		}

		@Override
		public List<Proposal> getProposals() {
			return props;
		}
	}

	public static class EventValueProperty extends JDTHelperProperty {
		final String eventType;

		public EventValueProperty(IMethod method, String name, String owner, String eventType) {
			super(method, name, owner);
			this.eventType = eventType;
		}

		@Override
		public StyledString getDescription() {
			StyledString description = new StyledString(name + "(" + eventType.substring(eventType.lastIndexOf('.') + 1) + ")");
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}

		@Override
		public Image getIcon() {
			return JFaceResources.getImage(EVENT_KEY);
		}

		@Override
		public List<Proposal> getProposals() {
			return Collections.emptyList();
		}
	}

	public static abstract class MultiValueProperty extends JDTHelperProperty {

		public MultiValueProperty(IMethod method, String name, String owner) {
			super(method, name, owner);
		}
	}

	public static class ListValueProperty extends MultiValueProperty {
		String elementType;
		boolean isReadonly;

		public ListValueProperty(IMethod method, String name, String owner, String elementType, boolean isReadonly) {
			super(method, name, owner);
			this.elementType = elementType;
			this.isReadonly = isReadonly;
		}

		@Override
		public StyledString getDescription() {
			if (isReadonly) {
				StyledString description = new StyledString(name + " : [" + elementType + "]");
				description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
				return description;
			} else {
				try {
					StyledString description = new StyledString(name + " : " + Signature.getSignatureSimpleName(method.getReturnType()));
					description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
					return description;
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return new StyledString(name + " : <UnknownType>");
				}
			}
		}

		@Override
		public Image getIcon() {
			return JFaceResources.getImage(LIST_KEY);
		}

		@Override
		public List<Proposal> getProposals() {
			if (isReadonly) {
				return Collections.singletonList(new Proposal("[]"));
			} else {
				return Collections.emptyList();
			}

		}
	}

	public static class MapValueProperty extends MultiValueProperty {

		public MapValueProperty(IMethod method, String name, String owner) {
			super(method, name, owner);
		}

		@Override
		public StyledString getDescription() {
			StyledString description = new StyledString(name + " : {}");
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}

		@Override
		public Image getIcon() {
			return JFaceResources.getImage(MAP_KEY);
		}

		@Override
		public List<Proposal> getProposals() {
			return Collections.singletonList(new Proposal("{}"));
		}
	}

	public TypeData getTypeData(IJavaProject jproject, IType jdtType) {
		if (jdtType == null) {
			return null;
		}

		TypeData data = typeCache.get(jdtType.getFullyQualifiedName());
		if (data == null) {
			try {
				List<IMethod> allMethods = new ArrayList<IMethod>();
				allMethods.addAll(Arrays.asList(jdtType.getMethods()));

				IType parentType = jdtType;
				
				while (parentType != null && parentType.getSuperclassName() != null) {
					if( parentType instanceof SourceType ) {
						String[][] typeDefs = parentType.resolveType(parentType.getSuperclassName());
						if( typeDefs != null ) {
							for( String[] type : typeDefs ) {
								parentType = jproject.findType(type[0]+"."+type[1]);
							}
						}
					} else {
						parentType = jproject.findType(parentType.getSuperclassName());	
					}
					
					if (parentType != null) {
						allMethods.addAll(Arrays.asList(parentType.getMethods()));
					}
				}
				data = createData(allMethods, jproject);
				if( ! (jdtType instanceof SourceType) ) {
					typeCache.put(jdtType.getFullyQualifiedName(), data);	
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data;
	}

	private TypeData createData(List<IMethod> allMethods, IJavaProject jproject) throws JavaModelException {
		TypeData d = new TypeData();
		for (IMethod m : allMethods) {
			if (!Flags.isPublic(m.getFlags())) {
				continue;
			}

			if (m.getElementName().startsWith("impl_") || m.getElementName().startsWith("getImpl_")) {
				continue;
			}

			if (m.getElementName().startsWith("get") && m.getParameterNames().length == 0) {
				String returnSignature = Signature.toString(m.getReturnType());
				if (returnSignature.startsWith("javafx.event.EventHandler<? super ") || returnSignature.startsWith("javafx.event.EventHandler<")) {
					String eventType;
					if (returnSignature.startsWith("javafx.event.EventHandler<? super ")) {
						eventType = returnSignature.substring("javafx.event.EventHandler<? super ".length(), returnSignature.length() - 1);
					} else {
						eventType = returnSignature.substring("javafx.event.EventHandler<".length(), returnSignature.length() - 1);
					}

					EventValueProperty p = new EventValueProperty(m, extractAttributename(m.getElementName()), m.getParent().getElementName(), eventType);
					d.properties.add(p);

				} else {
					String propName = extractAttributename(m.getElementName());
					String ownerName = m.getParent().getElementName();
					boolean isReadonly = isReadonlySetter(propName, allMethods);

					if ("double".equals(returnSignature) || "float".equals(returnSignature)) {
						if (!isReadonly) {
							FloatingValueProperty p = new FloatingValueProperty(m, propName, ownerName, returnSignature);
							d.properties.add(p);
						}
					} else if ("int".equals(returnSignature) || "long".equals(returnSignature) || "short".equals(returnSignature) || "byte".equals(returnSignature) || "char".equals(returnSignature)) {
						if (!isReadonly) {
							IntegerValueProperty p = new IntegerValueProperty(m, propName, ownerName, returnSignature);
							d.properties.add(p);
						}
					} else {
						IType type;
						if (returnSignature.indexOf('<') == -1) {
							type = jproject.findType(returnSignature);
						} else {
							type = jproject.findType(returnSignature.substring(0, returnSignature.indexOf('<')));
						}

						if (type == null) {
							continue;
						}

						if( type.isEnum() ) {
							if (!isReadonly) {
								EnumValueProperty p = new EnumValueProperty(m, propName, ownerName, returnSignature, type);
								d.properties.add(p);
							}
						} else {
							boolean isLists = false;
							boolean isMap = false;
							if ("java.util.List".equals(type.getFullyQualifiedName())) {
								isLists = true;
							} else {
								for (String i : type.getSuperInterfaceNames()) {
									if (i.equals("java.util.List")) {
										isLists = true;
									}
								}
							}

							if (!isLists) {
								if ("java.util.Map".equals(type.getFullyQualifiedName())) {
									isMap = true;
								} else {
									for (String i : type.getSuperInterfaceNames()) {
										if (i.equals("java.util.Map")) {
											isMap = true;
										}
									}
								}
							}

							if (isLists) {
								String listType;
								if (returnSignature.indexOf('<') != -1) {
									listType = returnSignature.substring(returnSignature.indexOf('<') + 1, returnSignature.lastIndexOf('>'));
								} else {
									listType = "?";
								}

								if (!propName.endsWith("Unmodifiable")) {
									ListValueProperty p = new ListValueProperty(m, propName, ownerName, listType, isReadonly);
									d.properties.add(p);
								}
							} else if (isMap) {
								MapValueProperty p = new MapValueProperty(m, propName, ownerName);
								d.properties.add(p);
							} else if (type.getFullyQualifiedName().equals("java.lang.String")) {
								if (!isReadonly) {
									StringValueProperty p = new StringValueProperty(m, propName, ownerName, returnSignature);
									d.properties.add(p);
								}
							} else {
								if (!isReadonly) {
									List<Proposal> props = getProposals(type, jproject);
									ElementValueProperty p = new ElementValueProperty(m, propName, ownerName, returnSignature, props);
									d.properties.add(p);
								}
							}
						}
					}
				}
			} else if (m.getElementName().startsWith("is") && m.getParameterNames().length == 0 && "Z".equals(m.getReturnType())) {
				String propName = extractAttributename(m.getElementName());
				boolean isReadonly = isReadonlySetter(propName, allMethods);
				
				if( ! isReadonly ) {
					BooleanValueProperty p = new BooleanValueProperty(m, propName, m.getParent().getElementName(), "boolean");
					d.properties.add(p);	
				}
			}
		}
		return d;
	}
	
	private List<Proposal> getProposals(IType type, IJavaProject jp) {
		if( PROVIDERS.containsKey(type.getFullyQualifiedName()) ) {
			return PROVIDERS.get(type.getFullyQualifiedName()).getProposals(jp);
		} else {
			try {
				for( IMethod m : type.getMethods() ) {
					if( Flags.isStatic(m.getFlags()) && "valueOf".equals(m.getElementName()) ) {
						Proposal p = new Proposal("\"<string>\"");
						p.hover = new HoverImpl(m);
						return Collections.singletonList(p);
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Collections.emptyList();
	}

	private boolean isReadonlySetter(String name, List<IMethod> methods) throws JavaModelException {
		for (IMethod m : methods) {
			if (!m.getElementName().startsWith("set") || !Flags.isPublic(m.getFlags())) {
				continue;
			}

			if (name.equals(extractAttributename(m.getElementName()))) {
				return false;
			}
		}
		return true;
	}

	public static String extractAttributename(String name) {
		String rv = null;
		if (name.startsWith("get") || name.startsWith("set")) {
			rv = name.substring(3);
		} else if (name.startsWith("is")) {
			rv = name.substring(2);
		}

		if (rv != null) {
			rv = rv.substring(0, 1).toLowerCase() + rv.substring(1);
		}

		return rv;
	}
	
	public static class HoverImpl implements IEObjectHover, ITextHoverExtension { 
		private JavadocHoverWrapper javadocHover = new JavadocHoverWrapper();
		private IMethod method;

		public HoverImpl(IMethod method) {
			this.method = method;
		}

		@Override
		public Object getHoverInfo(EObject eObject, ITextViewer textViewer, IRegion hoverRegion) {
			javadocHover.setJavaElement(method);
			return javadocHover.getHoverInfo2(textViewer, hoverRegion);
		}

		@Override
		public IInformationControlCreator getHoverControlCreator() {
			return javadocHover.getHoverControlCreator();
		}

	}
}
