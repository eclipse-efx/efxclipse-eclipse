/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxgraph.converter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition;
import org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Define;
import org.eclipse.fx.ide.fxgraph.fXGraph.Element;
import org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphFactory;
import org.eclipse.fx.ide.fxgraph.fXGraph.Import;
import org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.LocationValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Model;
import org.eclipse.fx.ide.fxgraph.fXGraph.PackageDeclaration;
import org.eclipse.fx.ide.fxgraph.fXGraph.Property;
import org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.Script;
import org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueReference;
import org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty;
import org.eclipse.fx.ide.fxgraph.fXGraph.StringValue;
import org.eclipse.fx.ide.fxgraph.fXGraph.ValueProperty;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class FXMLLoader {

	public Model loadModel(IFXMLFile file) {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setNamespaceAware(true);
			SAXParser parser = factory.newSAXParser();
			FXMLHandler handler = new FXMLHandler(file);
			parser.parse(file.getContent(), handler);
			return handler.model;
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	static class FXMLHandler extends DefaultHandler {
		private final IFXMLFile fxmlFile;
		private Model model;

		private Map<String, Element> elements = new HashMap<String, Element>();

		private Stack<String> structureStack = new Stack<String>();

		private Stack<Element> elementStack = new Stack<Element>();
		private StringBuilder richtTextContent = new StringBuilder();
		private String scriptLanguage = null;

		private String thePropertyIDontWantToForget = null;
		private boolean constant = false;

		public FXMLHandler(IFXMLFile fxmlFile) {
			this.fxmlFile = fxmlFile;
		}

		@Override
		public void startDocument() {
			model = FXGraphFactory.eINSTANCE.createModel();

			String packName = fxmlFile.getPackagename();

			if (packName != null) {
				PackageDeclaration pack = FXGraphFactory.eINSTANCE
						.createPackageDeclaration();
				pack.setName(fxmlFile.getPackagename());
				model.setPackage(pack);
			}

			ComponentDefinition compDef = FXGraphFactory.eINSTANCE
					.createComponentDefinition();

			String name = fxmlFile.getName();
			if (name.toLowerCase().endsWith(".fxml")) {
				name = name.substring(0, name.length() - 5);
			}
			compDef.setName(name);

			model.setComponentDef(compDef);
		}

		@Override
		public void processingInstruction(String target, String data)
				throws SAXException {
			if ("import".equals(target)) {
				Import i = FXGraphFactory.eINSTANCE.createImport();
				i.setImportedNamespace(data);
				model.getImports().add(i);
			} else if ("scenebuilder-stylesheet".equals(target)) {
				model.getComponentDef().getPreviewCssFiles().add(data);
			} else if ("scenebuilder-preview-i18n-resource".equals(target)) {
				model.getComponentDef().setPreviewResourceBundle(data);
			} else if ("language".equals(target)) {
				scriptLanguage = data;
			}
		}

		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			structureStack.push(qName);
			if ("fx:define".equals(qName)) {
				// nothing here
			} else if ("fx:include".equals(qName)) {
				IncludeValueProperty p = FXGraphFactory.eINSTANCE
						.createIncludeValueProperty();
				for (int i = 0; i < attributes.getLength(); i++) {
					String propertyQName = attributes.getQName(i);
					String value = attributes.getValue(i);
					if ("fx:id".equals(propertyQName)) {
						p.setName(value);
					} else if ("source".equals(propertyQName)) {
						ComponentDefinition cd = FXGraphFactory.eINSTANCE
								.createComponentDefinition();
						cd.setName(value);
						p.setSource(cd);
					}
				}
			} else if ("fx:script".equals(qName)) {
				for (int i = 0; i < attributes.getLength(); i++) {
					String propertyQName = attributes.getQName(i);
					String value = attributes.getValue(i);
					if ("source".equals(propertyQName)) {
						Script s = createScript(value, null);
						model.getComponentDef().getScripts().add(s);
					}
				}
			} else if ("fx:reference".equals(qName)) {
				for (int i = 0; i < attributes.getLength(); i++) {
					String propertyQName = attributes.getQName(i);
					String value = attributes.getValue(i);
					if ("source".equals(propertyQName)) {
						Element e = createElementWithJVMType("idref " + value); // TODO
																				// this
																				// is
																				// really
																				// dirty
						elementStack.peek().getDefaultChildren().add(e);
					}
				}
			} else if (!"children".equals(localName)) {
				if (Character.isLowerCase(localName.charAt(0))) {
					if (isSpecial(localName)) {
						boolean alreadyCreated = false;
						for (Property p : elementStack.peek().getProperties()) {
							if (localName.equals(p.getName())) {
								alreadyCreated = true;
								break;
							}
						}
						if (!alreadyCreated) {
							Property p = createProperty(localName,
									FXGraphFactory.eINSTANCE
											.createMapValueProperty());
							elementStack.peek().getProperties().add(p);
						}
					} else {
						if (!isContainer(localName)) {
							thePropertyIDontWantToForget = localName;
						}
					}
				} else {
					if (!localName.contains(".")) {
						if (checkConstant(localName, attributes)) {
							ConstValueProperty c = createConstValueProperty(
									localName, attributes);
							boolean found = false;
							for (Property p : elementStack.peek()
									.getProperties()) {
								if (p.getName().equals(getStructuralParent())) {
									found = true;
									p.setValue(c);
								}
							}
							if (!found) {
								Property p = createProperty(
										getStructuralParent(), c);
								elementStack.peek().getProperties().add(p);
								if (getStructuralParent().equals(
										thePropertyIDontWantToForget)) {
									thePropertyIDontWantToForget = null;
								}
							}
						} else {
							Element e = createElement(localName, attributes);
							// root element
							if (model.getComponentDef().getRootNode() == null) {
								model.getComponentDef().setRootNode(e);
							} else {
								// Factory values
								if (elementStack.peek().getFactory() != null) {
									// is it a constant or an element
									if (attributes.getLength() == 1
											&& "fx:value".equals(attributes
													.getQName(0))) {
										SimpleValueProperty sp = FXGraphFactory.eINSTANCE
												.createSimpleValueProperty();
										sp.setStringValue(attributes
												.getValue(0));
										elementStack.peek().getValues().add(sp);
									} else {
										elementStack.peek().getValues().add(e);
									}
								}
								// child elements
								else if ("children"
										.equals(getStructuralParent())) {
									elementStack.peek().getDefaultChildren()
											.add(e);
								} else if (isContainer(getStructuralParent())) {
									Element parent = elementStack.peek();
									Property p = null;
									for (Property existingP : parent
											.getProperties()) {
										if (getStructuralParent().equals(
												existingP.getName())) {
											p = existingP;
											break;
										}
									}
									if (p == null) {
										p = createProperty(
												getStructuralParent(),
												FXGraphFactory.eINSTANCE
														.createListValueProperty());
									}
									if (p.getValue() instanceof ListValueProperty) {
										ListValueProperty list = (ListValueProperty) p
												.getValue();
										list.getValue().add(e);
									} else if ((p.getValue() instanceof ListValueProperty)) {
										System.err.println("TODO");
									}
									parent.getProperties().add(p);
								} else if ("fx:define"
										.equals(getStructuralParent())) {
									Define d = FXGraphFactory.eINSTANCE
											.createDefine();
									d.setElement(e);
									model.getComponentDef().getDefines().add(d);
								} else {
									if (!isSpecial(getStructuralParent())) {
										Property p = createProperty(
												getStructuralParent(), e);
										elementStack.peek().getProperties()
												.add(p);
										if (getStructuralParent().equals(
												thePropertyIDontWantToForget)) {
											thePropertyIDontWantToForget = null;
										}
									}
								}
							}
							elementStack.push(e);
						}
					}
				}
			}
		}

		/**
		 * @param localName
		 * @param attributes
		 * @return
		 */
		private ConstValueProperty createConstValueProperty(String localName,
				Attributes attributes) {
			ConstValueProperty c = FXGraphFactory.eINSTANCE
					.createConstValueProperty();
			c.setField(attributes.getValue("fx:constant"));
			JvmParameterizedTypeReference constType = createJvmParameterizedTypeReference(localName);
			c.setType(constType);
			return c;
		}

		/**
		 * @return
		 */
		private boolean isContainer(String name) {
			return "items".equals(name) || "menus".equals(name)
					|| "tabs".equals(name) || "transforms".equals(name)
					|| "points".equals(name);
		}

		private String getStructuralParent() {
			if (structureStack.size() < 2) {
				return null;
			} else {
				String tmp = structureStack.pop();
				try {
					return structureStack.peek();
				} finally {
					structureStack.push(tmp);
				}
			}
		}

		private boolean checkConstant(String localName, Attributes attributes) {
			for (int i = 0; i < attributes.getLength(); i++) {
				String qName = attributes.getQName(i);
				if ("fx:constant".equals(qName)) {
					constant = true;
					return true;
				}
			}
			return false;
		}

		/**
		 * @param localName
		 * @param attributes
		 * @return
		 */
		private Element createElement(String localName, Attributes attributes) {
			Element element = createElementWithJVMType(localName);
			// attributes
			for (int i = 0; i < attributes.getLength(); i++) {
				String qName = attributes.getQName(i);
				String name = attributes.getLocalName(i);
				String value = attributes.getValue(i);
				if ("fx:value".equals(qName)) {
					if (isSpecial(getStructuralParent())) {
						boolean attached = false;
						for (Property p : elementStack.peek().getProperties()) {
							if (getStructuralParent().equals(p.getName())) {
								MapValueProperty prop = (MapValueProperty) p
										.getValue();
								SimpleValueProperty e = FXGraphFactory.eINSTANCE
										.createSimpleValueProperty();
								e.setStringValue(value);
								Property mapval = createProperty(localName, e);
								prop.getProperties().add(mapval);
								attached = true;
								break;
							}
						}
						if (!attached) {
							System.err.println("TODO could not attach value");
						}
					} else {
						if (elementStack.peek().getFactory() == null) {
							System.err
									.println("TODO value found, structural parent is "
											+ getStructuralParent());
						}
					}
				} else if ("fx:factory".equals(qName)) {
					element.setFactory(value);
				} else if ("fx:controller".equals(qName)) {
					JvmParameterizedTypeReference c = createJvmParameterizedTypeReference(value);
					model.getComponentDef().setController(c);
				} else if ("fx:id".equals(qName)) {
					element.setName(value);
					elements.put(value, element);
				} else {
					Property p = createProperty(name);
					p.setValue(createValueProperty(p, qName, value));
					element.getProperties().add(p);
				}
			}
			return element;
		}

		/**
		 * @return
		 */
		private boolean isSpecial(String s) {
			return "styleClass".equals(s) || "points".equals(s);
		}

		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			// if (isProperty) {
			richtTextContent = new StringBuilder().append(new String(ch, start,
					length));
			richtTextContent.trimToSize();
			// }
		}

		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			boolean doPop = false;
			try {
				if ("fx:script".equals(qName)) {
					String code = richtTextContent.toString()
							.replaceAll("\n", "").replaceAll("\t", "").trim();
					if (code.length() > 0) {
						Script s = createScript(null, code);
						model.getComponentDef().getScripts().add(s);
					}
				} else if (!"children".equals(localName)) {
					if (Character.isUpperCase(localName.charAt(0))) {
						if (localName.contains(".")) {
							Property p = FXGraphFactory.eINSTANCE
									.createProperty();
							p.setValue(createStaticCallProperty(p, localName,
									richtTextContent.toString()));
							elementStack.peek().getProperties().add(p);
						} else if (constant) {
							// nothing here
						} else {
							doPop = true;
						}
					} else {
						if (richtTextContent != null
								&& richtTextContent.toString().trim().length() > 0) {
							SimpleValueProperty sp = FXGraphFactory.eINSTANCE
									.createSimpleValueProperty();
							sp.setStringValue(richtTextContent.toString());
							elementStack.peek().getProperties()
									.add(createProperty(localName, sp));
							if (localName.equals(thePropertyIDontWantToForget)) {
								thePropertyIDontWantToForget = null;
							}
						}
					}
				}
			} finally {
				if (doPop) {
					elementStack.pop();
				}
				structureStack.pop();
				if (thePropertyIDontWantToForget != null) {
					System.err.println("forgotten property: "
							+ thePropertyIDontWantToForget);
					thePropertyIDontWantToForget = null;
				}
				constant = false;
			}
		}

		@Override
		public void endDocument() throws SAXException {
			elements.clear();
			// just for testing
			if (elementStack.size() > 0) {
				throw new SAXException("elementStack.size() =  "
						+ elementStack.size());
			}
		}

		/**
		 * @param value
		 * @return
		 */
		private Script createScript(String source, String sourceCode) {
			if (scriptLanguage == null) {
				throw new IllegalArgumentException(
						"scriptLanguage was not defined");
			}
			Script s = FXGraphFactory.eINSTANCE.createScript();
			s.setLanguage(scriptLanguage);
			s.setSource(source);
			s.setSourcecode(sourceCode);
			return s;
		}

		private ValueProperty createValueProperty(Property p, String qName,
				String value) {
			// actions
			if (qName.startsWith("on")) {
				ControllerHandledValueProperty cp = FXGraphFactory.eINSTANCE
						.createControllerHandledValueProperty();
				String methodName = null;
				if (value != null && value.startsWith("#")) {
					methodName = value.replaceFirst("#", "");
				}
				cp.setMethodname(methodName);
				return cp;
			}
			// static call
			else if (value != null && value.startsWith("${")
					&& value.endsWith("}")) {
				BindValueProperty s = FXGraphFactory.eINSTANCE
						.createBindValueProperty();
				// format is ${field.text}
				String[] split = value.replaceFirst("[$]", "")
						.replaceFirst("[{]", "").split("[.]");
				if (split.length != 2) {
					throw new IllegalArgumentException(
							"could not resolve binding \"" + value + "\"");
				}
				s.setElementReference(elements.get(split[0]));
				s.setAttribute(split[1].replaceFirst("[}]", ""));
				return s;
			} else if (value != null && value.startsWith("$")) {
				String valueName = value.replaceFirst("[$]", "");
				if (elements.containsKey(valueName)) {
					return createReferenceValueProperty(valueName);
				} else {
					ScriptValueReference s = FXGraphFactory.eINSTANCE
							.createScriptValueReference();
					s.setReference(valueName);
					return s;
				}
			} else if (value != null && value.startsWith("@")) {
				LocationValueProperty l = FXGraphFactory.eINSTANCE
						.createLocationValueProperty();
				l.setValue(value.replaceFirst("@", ""));
				return l;
			} else if (value != null && value.startsWith("%")) {
				ResourceValueProperty l = FXGraphFactory.eINSTANCE
						.createResourceValueProperty();
				StringValue sv = FXGraphFactory.eINSTANCE.createStringValue();
				sv.setValue(value.replaceFirst("%", ""));
				l.setValue(sv);
				return l;
			} else {
				// static call
				SimpleValueProperty vp = createStaticCallProperty(p, qName,
						value);
				return vp;
			}
		}

		/**
		 * @param refName
		 * @return
		 */
		private ReferenceValueProperty createReferenceValueProperty(
				String refName) {
			ReferenceValueProperty r = FXGraphFactory.eINSTANCE
					.createReferenceValueProperty();
			Element refElement = createElementWithJVMType(refName);
			r.setReference(refElement);
			return r;
		}

		/**
		 * @param simpleName
		 * @return
		 */
		private Element createElementWithJVMType(String simpleName) {
			Element refElement = FXGraphFactory.eINSTANCE.createElement();
			JvmParameterizedTypeReference type = createJvmParameterizedTypeReference(simpleName);
			refElement.setType(type);
			return refElement;
		}

		/**
		 * @param simpleName
		 * @return
		 */
		private JvmParameterizedTypeReference createJvmParameterizedTypeReference(
				String simpleName) {
			JvmParameterizedTypeReference type = TypesFactory.eINSTANCE
					.createJvmParameterizedTypeReference();
			JvmPrimitiveType jvmType = TypesFactory.eINSTANCE
					.createJvmPrimitiveType();
			jvmType.setSimpleName(simpleName);
			type.setType(jvmType);
			return type;
		}

		/**
		 * @param p
		 * @param qName
		 * @param value
		 * @return
		 */
		private SimpleValueProperty createStaticCallProperty(Property p,
				String qName, String value) {
			if (qName.contains(".")) {
				p.setName("call " + qName.replace(".", "#"));
			}
			// ordinary property
			SimpleValueProperty vp = FXGraphFactory.eINSTANCE
					.createSimpleValueProperty();
			if ("true".equals(value) || "false".equals(value)) {
				vp.setBooleanValue(value);
			} else {
				try {
					Integer i = Integer.parseInt(value);
					vp.setNumber(value);
					vp.setNegative(i < 0);
				} catch (NumberFormatException e) {
					try {
						Double i = Double.parseDouble(value);
						vp.setNumber(value);
						vp.setNegative(i < 0);
					} catch (NumberFormatException ex) {
						vp.setStringValue(value);
					}
				}
			}
			return vp;
		}

		private Property createProperty(String name) {
			Property p = FXGraphFactory.eINSTANCE.createProperty();
			p.setName(name);
			return p;
		}

		private Property createProperty(String name, ValueProperty value) {
			Property p = createProperty(name);
			p.setValue(value);
			return p;
		}
	}
}
