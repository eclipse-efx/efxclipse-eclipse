/*
 * generated by Xtext
 */
package org.eclipse.fx.ide.css.ui;

import org.eclipse.fx.ide.css.ui.internal.CssDslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;


/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CssDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CssDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CssDslActivator.getInstance().getInjector(CssDslActivator.AT_BESTSOLUTION_EFXCLIPSE_TOOLING_CSS_CSSDSL);
	}
	
}
