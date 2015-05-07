package org.eclipse.fx.ide.css.cssext.ui.adapter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class ExtensionHolder {

	private ResourceSet cachedResourceSet;
	 private IProject project;
	    private EObject context;
//	    private List<URI> extensionURIs;
	
    private ResourceSet createResourceSet() {
    	if (cachedResourceSet == null) {
    		final IResourceServiceProvider rsp = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(URI.createURI("dummy:/dummy/file.cssext"));
    		final IResourceSetProvider rp = rsp.get(IResourceSetProvider.class);
    		cachedResourceSet = rp.get(this.project);
    	}
		return cachedResourceSet;
    }
    
    private ResourceSet getResourceSet(EObject context) {
//    	System.err.println("getResourceSet()");
    	ResourceSet resourceSet;
    	if (context.eResource() == null || context.eResource().getResourceSet() == null) {
//    		System.err.println(" -> creating new");
    		resourceSet = createResourceSet();
    	}
    	else {
    		resourceSet = context.eResource().getResourceSet();
    	}
//    	System.err.println(" -> " + System.identityHashCode(resourceSet));
    	return resourceSet;
    }
    
    private ACssResource resource;
    
    public ExtensionHolder(IProject project, EObject context, ACssResource resource) {
        this.resource = resource;
        this.project = project;
        this.context = context;
    }
    
    public List<CssExtension> getModels() {
//    	System.err.println("GET MODELS");
//    	System.err.println(" context = " + context);
//    	if (context == null) {
//    		new NullPointerException().printStackTrace();
//    	}
//    	if (context.eResource() == null) {
//    		new NullPointerException().printStackTrace();
//    	}
    	
    	List<CssExtension> result = new ArrayList<>();
    	
    	final ResourceSet resourceSet = getResourceSet(this.context);
    	
    	URI processedURI = null;
    	try {
        	for (final URI uri : this.resource.getAllEnabledExtensions()) {
        		processedURI = uri;
        		final Resource resource = resourceSet.getResource(uri, true);
        		if( ! resource.getContents().isEmpty() ) {
        			result.add((CssExtension) resource.getContents().get(0));	
        		} else {
        			System.err.println("The resource '"+uri+"' does not contain any elements");
        		}
        	}    		
    	} catch( Throwable t ) {
    		throw new IllegalStateException("Unable to find CSSExtension in " + processedURI, t);
    	}
    	return result;
    }
    
    
    
} 