/*
 * generated by Xtext
 */
package org.eclipse.fx.ide.css;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CssDslUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.eclipse.fx.ide.css.ui.internal.CssDslActivator.getInstance().getInjector("org.eclipse.fx.ide.css.CssDsl");
	}
	
}
