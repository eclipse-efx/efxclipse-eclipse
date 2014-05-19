package org.eclipse.fx.ide.css.cssext.ui;

import org.eclipse.core.runtime.IAdapterFactory;

public class CssAdapterFactory implements IAdapterFactory {

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		System.err.println("getAdapter("+adaptableObject+")");
		if (adapterType == CssFile.class) {
			return new CssFile(adaptableObject);
		}
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[] { CssFile.class };
	}

}
