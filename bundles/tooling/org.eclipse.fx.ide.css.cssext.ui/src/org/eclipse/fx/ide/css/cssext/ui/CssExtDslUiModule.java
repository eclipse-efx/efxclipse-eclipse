/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui;

import org.eclipse.fx.core.guice.FXLoggerListener;
import org.eclipse.fx.core.guice.OSGiLoggerFactoryProvider;
import org.eclipse.fx.core.log.LoggerFactory;
import org.eclipse.fx.ide.css.cssext.ICssExtManager;
import org.eclipse.fx.ide.css.cssext.parser.CssExtParser;
import org.eclipse.fx.ide.css.cssext.ui.doc.CssExtDocParser;
import org.eclipse.fx.ide.css.cssext.ui.highlighting.CssExtHighlightingConfiguration;
import org.eclipse.fx.ide.css.cssext.ui.highlighting.CssExtSemanticHighlightingCalculator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import org.eclipse.fx.ide.css.extapi.CssExt;
import org.eclipse.fx.ide.css.ui.CssDslUiModule;
import org.eclipse.fx.ide.css.ui.hover.CssHoverProvider;
import org.eclipse.fx.ide.css.ui.hover.ExtApiDelegatingDocumentationProvider;

import com.google.inject.Binder;
import com.google.inject.matcher.Matchers;

/**
 * Use this class to register components to be used within the IDE.
 */
public class CssExtDslUiModule extends org.eclipse.fx.ide.css.cssext.ui.AbstractCssExtDslUiModule {
	public CssExtDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configure(Binder binder) {
		
		binder.bind(ISemanticHighlightingCalculator.class).to(CssExtSemanticHighlightingCalculator.class);
		binder.bind(IHighlightingConfiguration.class).to(CssExtHighlightingConfiguration.class);
		
		binder.bind(CssExtParser.class).toInstance(new CssExtParser());
		
		binder.bind(ICssExtManager.class).toInstance(new CssExtManager());
		binder.bind(CssExtDocParser.class).toInstance(new CssExtDocParser());
		
		binder.bind(LoggerFactory.class).toProvider(OSGiLoggerFactoryProvider.class);
		binder.bindListener(Matchers.any(), new FXLoggerListener());
		
		// bind hovering to css provider
//		binder.bind(CssDialectExtensionRegistry.class).toProvider(OsgiCssDialectExtensionRegistryProvider.class);
		binder.bind(CssExt.class).toProvider(CssExt.OsgiCssExtServiceProvider.class);
		binder.bind(IEObjectHoverProvider.class).to(CssHoverProvider.class);
		binder.bind(IEObjectDocumentationProvider.class).to(ExtApiDelegatingDocumentationProvider.class);
		
		super.configure(binder);
	}
}
