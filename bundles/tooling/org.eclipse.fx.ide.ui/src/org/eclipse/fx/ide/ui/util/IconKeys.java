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
package org.eclipse.fx.ide.ui.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.fx.ide.ui.Activator;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Image;



public class IconKeys {
	public static final String FIELD_KEY = IconKeys.class.getName() + ".FIELD";
	public static final String EVENT_KEY = IconKeys.class.getName() + ".EVENT";
	public static final String LIST_KEY = IconKeys.class.getName() + ".LIST";
	public static final String MAP_KEY = IconKeys.class.getName() + ".MAP";
	public static final String ENUM_KEY = IconKeys.class.getName() + ".ENUM_KEY";

	public static final String METHOD_PRIVATE_KEY = IconKeys.class.getName() + ".METHOD_PRIVATE";
	public static final String METHOD_DEFAULT_KEY = IconKeys.class.getName() + ".METHOD_DEFAULT";
	public static final String METHOD_PROTECTED_KEY = IconKeys.class.getName() + ".METHOD_PROTECTED";
	public static final String METHOD_PUBLIC_KEY = IconKeys.class.getName() + ".METHOD_PUBLIC";
	public static final String STAT_METHOD_PUBLIC_KEY = IconKeys.class.getName() + ".STAT_METHOD_PUBLIC_KEY";

	public static final String EXTERNALIZED_STRING_KEY = IconKeys.class.getName() + ".EXTERNALIZED_STRING_KEY";
	public static final String CLASS_KEY = IconKeys.class.getName() + ".CLASS_KEY";

	public static final String PACKAGE_KEY = IconKeys.class.getName() + ".PACKAGE_KEY";
	public static final String COMPONENT_KEY = IconKeys.class.getName() + ".COMPONENT_KEY";
	public static final String IMPORT_LIST_KEY = IconKeys.class.getName() + ".IMPORT_LIST_KEY";
	public static final String IMPORT_KEY = IconKeys.class.getName() + ".IMPORT_KEY";
	public static final String BINDING_KEY = IconKeys.class.getName() + ".BINDING_KEY";
	public static final String REFERENCE_KEY = IconKeys.class.getName() + ".REFERENCE_KEY";
	public static final String INCLUDE_KEY = IconKeys.class.getName() + ".INCLUDE_KEY";
	public static final String COPY_KEY = IconKeys.class.getName() + ".COPY_KEY";
	public static final String LOCATION_KEY = IconKeys.class.getName() + ".LOCATION_KEY";
	public static final String DEFINES_KEY = IconKeys.class.getName() + ".DEFINES_KEY";
	public static final String SCRIPTS_KEY = IconKeys.class.getName() + ".SCRIPTS_KEY";
	
	public static final String VALUE_OF_KEY = IconKeys.class.getName()+".VALUE_OF_KEY"; 
	

	static {
		JFaceResources.getImageRegistry().put(FIELD_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/field_public_obj.gif"));
		JFaceResources.getImageRegistry().put(EVENT_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/correction_change.gif"));
		JFaceResources.getImageRegistry().put(LIST_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/class_hi.gif"));
		JFaceResources.getImageRegistry().put(MAP_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/types.gif"));

		JFaceResources.getImageRegistry().put(METHOD_PRIVATE_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/methpri_obj.gif"));
		JFaceResources.getImageRegistry().put(METHOD_DEFAULT_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/methdef_obj.gif"));
		JFaceResources.getImageRegistry().put(METHOD_PROTECTED_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/methpro_obj.gif"));
		JFaceResources.getImageRegistry().put(METHOD_PUBLIC_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/methpub_obj.gif"));

		JFaceResources.getImageRegistry().put(STAT_METHOD_PUBLIC_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/statmethpub_obj.gif"));

		JFaceResources.getImageRegistry().put(EXTERNALIZED_STRING_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/internalize.gif"));
		
		JFaceResources.getImageRegistry().put(CLASS_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/class_obj.gif"));
		JFaceResources.getImageRegistry().put(PACKAGE_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/packd_obj.gif"));
		JFaceResources.getImageRegistry().put(COMPONENT_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/cu_obj.gif"));
		JFaceResources.getImageRegistry().put(IMPORT_LIST_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/impc_obj.gif"));
		JFaceResources.getImageRegistry().put(IMPORT_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/imp_obj.gif"));
		JFaceResources.getImageRegistry().put(BINDING_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/occ_write.gif"));
		JFaceResources.getImageRegistry().put(REFERENCE_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/no_breakpoint.gif"));
		JFaceResources.getImageRegistry().put(INCLUDE_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/inclusion_filter_attrib.gif"));
		JFaceResources.getImageRegistry().put(COPY_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/template_obj.gif"));
		JFaceResources.getImageRegistry().put(LOCATION_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/jar_desc_obj.gif"));
		JFaceResources.getImageRegistry().put(DEFINES_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/correction_cast.gif"));
		JFaceResources.getImageRegistry().put(SCRIPTS_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/classf_generate.gif"));
		JFaceResources.getImageRegistry().put(ENUM_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/enum_obj.gif"));
		
		JFaceResources.getImageRegistry().put(VALUE_OF_KEY, Activator.imageDescriptorFromPlugin(Activator.ID, "/icons/jtypeassist_co.gif"));
		
	}
	
	public static Image getIcon(String id) {
		return JFaceResources.getImage(id);
	}
}
