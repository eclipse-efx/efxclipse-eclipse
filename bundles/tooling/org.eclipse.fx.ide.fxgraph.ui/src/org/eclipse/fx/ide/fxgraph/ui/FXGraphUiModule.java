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
package org.eclipse.fx.ide.fxgraph.ui;

import org.eclipse.fx.ide.fxgraph.ui.contentassist.ImportingTypesProposalProvider;
import org.eclipse.fx.ide.fxgraph.ui.formatting.FXGraphWhitespaceInformationProvider;
import org.eclipse.fx.ide.fxgraph.ui.hover.FXHoverProvider;
import org.eclipse.fx.ide.fxgraph.ui.hyperlinking.FXGraphHyperlinkHelper;
import org.eclipse.fx.ide.fxgraph.ui.internal.FXGraphActivator;
import org.eclipse.fx.ide.ui.editor.ValueOfContributionCollector;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.formatting.IWhitespaceInformationProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the IDE.
 */
public class FXGraphUiModule extends org.eclipse.fx.ide.fxgraph.ui.AbstractFXGraphUiModule {
	public FXGraphUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		BundleContext ctx = FXGraphActivator.getInstance().getBundle().getBundleContext();
		ServiceReference<ValueOfContributionCollector> ref = ctx.getServiceReference(ValueOfContributionCollector.class);
		binder.bind(ValueOfContributionCollector.class).toInstance(ctx.getService(ref));
	}
	
	@Override
	public Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return FXHoverProvider.class;
	}
	
	@Override
	public Class<? extends ITypesProposalProvider> bindITypesProposalProvider() {
		return ImportingTypesProposalProvider.class;
	}
	
	@Override
	public Class<? extends IWhitespaceInformationProvider> bindIWhitespaceInformationProvider() {
		return FXGraphWhitespaceInformationProvider.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper> bindIHyperlinkHelper() {
		return FXGraphHyperlinkHelper.class;
	}
}
