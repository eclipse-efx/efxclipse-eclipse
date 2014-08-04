package org.eclipse.fx.ide.css.cssext.ui;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;

public class CssExtensionNfo {
	public final URI uri;
	
	public CssExtension model;
	
	/*package*/ CssExtensionNfo(URI uri) {
		this.uri = uri;
	}
	
	public CssExtension getModel() {
		if (model == null) {
			model = loadModel();
		}
		return model;
	}
	
	private CssExtension loadModel() {
		try {
			final ResourceSet rs = new ResourceSetImpl();
			Resource resource = rs.createResource(uri);
			resource.setURI(uri);
			resource.load(Collections.emptyMap());
			
			return (CssExtension) resource.getContents().get(0);
		}
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String getRootPackageName() {
		CssExtension model = getModel();
		if (model != null) {
			return getModel().getPackageDef().getName();
		}
		return "error";
	}

}