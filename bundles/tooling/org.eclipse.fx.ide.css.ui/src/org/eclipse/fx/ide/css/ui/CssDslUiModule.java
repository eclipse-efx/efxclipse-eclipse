/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.ui;

import org.eclipse.fx.ide.css.ui.contentassist.TemplateProposalProvider;
import org.eclipse.fx.ide.css.ui.doubleclicking.CssGrammarAwareStrategy;
import org.eclipse.fx.ide.css.ui.highlighting.CssDslHighlightingCalculator;
import org.eclipse.fx.ide.css.ui.highlighting.CssDslHighlightingConfiguration;
import org.eclipse.fx.ide.css.ui.highlighting.TokenMapper;
import org.eclipse.fx.ide.css.ui.hover.CssHoverProvider;
import org.eclipse.fx.ide.css.ui.hover.ExtApiDelegatingDocumentationProvider;
import org.eclipse.fx.ide.css.ui.occurrences.CssDslOccurenceComputer;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;
import org.eclipse.xtext.ui.editor.doubleClicking.LexerTokenAndCharacterPairAwareStrategy;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.occurrences.IOccurrenceComputer;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import org.eclipse.fx.core.log.LoggerFactory;
import org.eclipse.fx.core.guice.FXLoggerListener;
import org.eclipse.fx.core.guice.OSGiLoggerFactoryProvider;
import org.eclipse.fx.ide.css.extapi.CssExt;

import com.google.inject.Binder;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class CssDslUiModule extends org.eclipse.fx.ide.css.ui.AbstractCssDslUiModule {
	
	public CssDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		
		binder.bind(ISemanticHighlightingCalculator.class).to(CssDslHighlightingCalculator.class);
		binder.bind(IHighlightingConfiguration.class).to(CssDslHighlightingConfiguration.class);
		
		// hovering
		binder.bind(IEObjectHoverProvider.class).to(CssHoverProvider.class);
		binder.bind(IEObjectDocumentationProvider.class).to(ExtApiDelegatingDocumentationProvider.class);
		
		
//		binder.bind(IFormatter.class).to(DefaultFormatter.class);
		
//		binder.bind(IHiddenTokenHelper.class).to(HiddenTokenHelper.class);
		
		binder.bind(String.class).annotatedWith(Names.named(XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS)).toInstance(": ");
		
		binder.bind(LexerTokenAndCharacterPairAwareStrategy.class).to(CssGrammarAwareStrategy.class);
		
		binder.bind(AbstractAntlrTokenToAttributeIdMapper.class).to(TokenMapper.class);
		
		binder.bind(IOccurrenceComputer.class).to(CssDslOccurenceComputer.class);
		
		// setup efxclipse logger
		binder.bind(LoggerFactory.class).toProvider(OSGiLoggerFactoryProvider.class);
		binder.bindListener(Matchers.any(), new FXLoggerListener()); 
		
		//binder.bind(CssDialectExtensionRegistry.class).toProvider(OsgiCssDialectExtensionRegistryProvider.class);
		binder.bind(CssExt.class).toProvider(CssExt.OsgiCssExtServiceProvider.class);
	}
	
	@Override
	  public Class<? extends ITemplateProposalProvider>
	      bindITemplateProposalProvider() {
	    return TemplateProposalProvider.class;
	  }
	
}
