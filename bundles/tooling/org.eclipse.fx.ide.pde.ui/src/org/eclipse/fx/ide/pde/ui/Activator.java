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

import java.net.URL;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator extends AbstractUIPlugin {
	public static final String PLUGIN_ID = "org.eclipse.fx.ide.pde.ui";

	// Shared instance
	private static Activator fInstance;

	public URL getInstallURL() {
		return getDefault().getBundle().getEntry("/"); //$NON-NLS-1$
	}

	public static Activator getDefault() {
		return fInstance;
	}

	public static String getPluginId() {
		return getDefault().getBundle().getSymbolicName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		fInstance = this;
	}

	public void stop(BundleContext context) throws Exception {
		fInstance = null;
		super.stop(context);
	}
	
	public <S> S acquireService(Class<S> serviceClass) {
		ServiceReference<S> reference = getBundle().getBundleContext().getServiceReference(serviceClass);
		if (reference == null)
			return null;
		S service = getBundle().getBundleContext().getService(reference);
		if (service != null) {
			getBundle().getBundleContext().ungetService(reference);
		}
		return service;
	}
	
	public static String[] getJavaFXImports() {
		return new String[] {
				"javafx.animation;version=\"2.0.0\"",
				"javafx.application;version=\"2.0.0\"",
				"javafx.beans;version=\"2.0.0\"",
				"javafx.beans.binding;version=\"2.0.0\"",
				"javafx.beans.property;version=\"2.0.0\"",
				"javafx.beans.value;version=\"2.0.0\"",
				"javafx.collections;version=\"2.0.0\"",
				"javafx.concurrent;version=\"2.0.0\"",
				"javafx.embed.swing;version=\"2.0.0\"",
				"javafx.event;version=\"2.0.0\"",
				"javafx.fxml;version=\"2.0.0\"",
				"javafx.geometry;version=\"2.0.0\"",
				"javafx.scene;version=\"2.0.0\"",
				"javafx.scene.chart;version=\"2.0.0\"",
				"javafx.scene.control;version=\"2.0.0\"",
				"javafx.scene.control.cell;version=\"2.0.0\"",
				"javafx.scene.effect;version=\"2.0.0\"",
				"javafx.scene.image;version=\"2.0.0\"",
				"javafx.scene.input;version=\"2.0.0\"",
				"javafx.scene.layout;version=\"2.0.0\"",
				"javafx.scene.media;version=\"2.0.0\"",
				"javafx.scene.paint;version=\"2.0.0\"",
				"javafx.scene.shape;version=\"2.0.0\"",
				"javafx.scene.text;version=\"2.0.0\"",
				"javafx.scene.transform;version=\"2.0.0\"",
				"javafx.scene.web;version=\"2.0.0\"",
				"javafx.stage;version=\"2.0.0\"",
				"javafx.util;version=\"2.0.0\""
			};
	}
	
	public static String[] getJemmyImports() {
		return new String[] {
				"org.jemmy;version=\"3.0.0\"",
				"org.jemmy.action;version=\"3.0.0\"",
				"org.jemmy.browser;version=\"3.0.0\"",
				"org.jemmy.control;version=\"3.0.0\"",
				"org.jemmy.dock;version=\"3.0.0\"",
				"org.jemmy.env;version=\"3.0.0\"",
				"org.jemmy.fx;version=\"3.0.0\"",
				"org.jemmy.fx.control;version=\"3.0.0\"",
				"org.jemmy.fx.control.caspian;version=\"3.0.0\"",
				"org.jemmy.image;version=\"3.0.0\"",
				"org.jemmy.image.pixel;version=\"3.0.0\"",
				"org.jemmy.input;version=\"3.0.0\"",
				"org.jemmy.input.glass;version=\"3.0.0\"",
				"org.jemmy.interfaces;version=\"3.0.0\"",
				"org.jemmy.lookup;version=\"3.0.0\"",
				"org.jemmy.operators;version=\"3.0.0\"",
				"org.jemmy.resources;version=\"3.0.0\"",
				"org.jemmy.support;version=\"3.0.0\"",
				"org.jemmy.timing;version=\"3.0.0\""

		};
	}
	
	public static String getCommaValuesFromPackagesArray(String[] values, String version) {
		StringBuffer buffer = new StringBuffer();
		for (String value : values) {
			if (buffer.length() > 0) {
				buffer.append(",\n "); //$NON-NLS-1$ // space required for multiline headers
			}
			buffer.append(value);

			if (value.indexOf(";version=") == -1 && (version != null) && (values.length == 1)) { //$NON-NLS-1$
				buffer.append(";version=\"").append(version).append("\""); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}
		return buffer.toString();
	}
}