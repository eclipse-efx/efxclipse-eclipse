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
package org.eclipse.fx.ide.pde.ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.pde.ui.templates.OptionTemplateSection;
import org.osgi.framework.Bundle;

public abstract class FXPDETemplateSection extends OptionTemplateSection {

	public static final String KEY_PRODUCT_BRANDING = "productBranding"; //$NON-NLS-1$
	public static final String KEY_PRODUCT_NAME = "productName"; //$NON-NLS-1$

	public static final String VALUE_PRODUCT_ID = "product"; //$NON-NLS-1$
	public static final String VALUE_PRODUCT_NAME = "RCP Product"; //$NON-NLS-1$
	public static final String VALUE_PERSPECTIVE_NAME = "RCP Perspective"; //$NON-NLS-1$
	public static final String VALUE_APPLICATION_ID = "application"; //$NON-NLS-1$

	protected ResourceBundle getPluginResourceBundle() {
		Bundle bundle = Platform.getBundle(Activator.getPluginId());
		return Platform.getResourceBundle(bundle);
	}

	protected URL getInstallURL() {
		return Activator.getDefault().getInstallURL();
	}

	public URL getTemplateLocation() {
		try {
			String[] candidates = getDirectoryCandidates();
			for (int i = 0; i < candidates.length; i++) {
				if (Activator.getDefault().getBundle().getEntry(candidates[i]) != null) {
					URL candidate = new URL(getInstallURL(), candidates[i]);
					return candidate;
				}
			}
		} catch (MalformedURLException e) { // do nothing
		}
		return null;
	}

	private String[] getDirectoryCandidates() {
		double version = getTargetVersion();
		ArrayList<String> result = new ArrayList<String>();
		if (version >= 3.6)
			result.add("templates_3.6" + "/" + getSectionId() + "/"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		if (version >= 3.5)
			result.add("templates_3.5" + "/" + getSectionId() + "/"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		if (version >= 3.4)
			result.add("templates_3.4" + "/" + getSectionId() + "/"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		if (version >= 3.3)
			result.add("templates_3.3" + "/" + getSectionId() + "/"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		if (version >= 3.2)
			result.add("templates_3.2" + "/" + getSectionId() + "/"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		if (version >= 3.1)
			result.add("templates_3.1" + "/" + getSectionId() + "/"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		if (version >= 3.0)
			result.add("templates_3.0" + "/" + getSectionId() + "/"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return (String[]) result.toArray(new String[result.size()]);
	}

	public String[] getNewFiles() {
		return new String[0];
	}

	protected String getFormattedPackageName(String id) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < id.length(); i++) {
			char ch = id.charAt(i);
			if (buffer.length() == 0) {
				if (Character.isJavaIdentifierStart(ch))
					buffer.append(Character.toLowerCase(ch));
			} else {
				if (Character.isJavaIdentifierPart(ch) || ch == '.')
					buffer.append(ch);
			}
		}
		return buffer.toString().toLowerCase(Locale.ENGLISH);
	}

	protected void generateFiles(IProgressMonitor monitor) throws CoreException {
		super.generateFiles(monitor);
		// Copy the default splash screen if the branding option is selected
		if (copyBrandingDirectory()) {
			super.generateFiles(monitor, Activator.getDefault().getBundle().getEntry("branding/")); //$NON-NLS-1$
		}
	}

	protected boolean copyBrandingDirectory() {
		return getBooleanOption(KEY_PRODUCT_BRANDING);
	}

	protected void createBrandingOptions() {
		addOption(KEY_PRODUCT_BRANDING, "Product Branding", true, 0);
	}
	
	protected void updateBuildModel() throws CoreException {
//		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
//		String dir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
//		dir = dir.replaceAll("\\\\", "/") + "/rt/lib/jfxrt.jar";
//		
//		IBuildModel build = PluginRegistry.createBuildModel(model);
//		IBuildEntry entry = build.getFactory().createEntry("jars.extra.classpath");
//		entry.addToken(dir);
//		build.getBuild().add(entry);
//		((IEditableModel)build).save();
	}
}