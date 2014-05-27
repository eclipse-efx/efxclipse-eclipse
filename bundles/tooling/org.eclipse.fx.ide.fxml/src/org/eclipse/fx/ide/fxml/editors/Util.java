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
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;

/**
 * Utility methods
 */
@SuppressWarnings("restriction")
public class Util {
	private static final String FXML_NAMESPACE = "http://javafx.com/fxml";
	private static final String FXML_NAMESPACE_1 = "http://javafx.com/fxml/1";
	
	/**
	 * Check if the namespace in FXML
	 * @param value the namespace value
	 * @return <code>true</code> if a valid FXML namespace
	 */
	public static final boolean isFXMLNamespace(String value) {
		return FXML_NAMESPACE.equals(value) || FXML_NAMESPACE_1.equals(value);
	}
	
	public static Attr getFXMLAttribute(Element e, String localName) {
		Attr attribute = e.getAttributeNodeNS(FXML_NAMESPACE, localName);
		if( attribute == null ) {
			attribute = e.getAttributeNodeNS(FXML_NAMESPACE_1, localName);
		}
		return attribute;
	}
	
	static IJavaProject findProject(Document xmlDoc) {
		String baseLocation = ((IDOMNode) xmlDoc).getModel().getBaseLocation();
		IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(baseLocation));
		return JavaCore.create(f.getProject());
	}

	/**
	 * Get all imported types
	 * 
	 * @param xmlDoc
	 *            the document
	 * @return list of imports
	 */
	public static List<String> getImportedTypes(Document xmlDoc) {
		NodeList list = xmlDoc.getChildNodes();

		List<String> imports = new ArrayList<String>();
		for (int i = 0; i < list.getLength(); i++) {
			Node n = list.item(i);
			if (n.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE) {
				String data = ((ProcessingInstruction) n).getData();
				if (data.endsWith("?")) { //$NON-NLS-1$
					data = data.substring(0, data.length() - 1);
				}
				imports.add(data);
			}
		}
		return imports;
	}

	static IType findType(String name, Document xmlDoc) {
		IJavaProject jpProject = findProject(xmlDoc);

		if (name.contains(".")) { //$NON-NLS-1$
			try {
				IType t = jpProject.findType(name);
				if (t != null) {
					return t;
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		List<String> imports = getImportedTypes(xmlDoc);
		for (String i : imports) {
			if (i.endsWith("." + name)) { //$NON-NLS-1$
				try {
					IType t = jpProject.findType(i);
					if (t != null) {
						return t;
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		for (String i : imports) {
			if (i.endsWith("*")) { //$NON-NLS-1$
				try {
					IType t = jpProject.findType(i.substring(0, i.length() - 1) + name);
					if (t != null) {
						return t;
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		return null;
	}
}
