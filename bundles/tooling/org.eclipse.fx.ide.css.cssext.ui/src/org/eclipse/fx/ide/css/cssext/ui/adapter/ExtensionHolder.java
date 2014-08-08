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
	    private List<URI> extensionURIs;
	
    private ResourceSet createResourceSet() {
    	if (cachedResourceSet == null) {
    		final IResourceServiceProvider rsp = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(URI.createURI("dummy:/dummy/file.cssext"));
    		final IResourceSetProvider rp = rsp.get(IResourceSetProvider.class);
    		cachedResourceSet = rp.get(this.project);
    	}
		return cachedResourceSet;
    }
    
    private ResourceSet getResourceSet(EObject context) {
    	System.err.println("getResourceSet()");
    	ResourceSet resourceSet;
    	if (context.eResource() == null || context.eResource().getResourceSet() == null) {
    		System.err.println(" -> creating new");
    		resourceSet = createResourceSet();
    	}
    	else {
    		resourceSet = context.eResource().getResourceSet();
    	}
    	System.err.println(" -> " + System.identityHashCode(resourceSet));
    	return resourceSet;
    }
    
   
    
    public ExtensionHolder(IProject project, EObject context, List<URI> extensionURIs) {
        this.extensionURIs = new ArrayList<>(extensionURIs);
        
        URI replace = URI.createURI("archive:file:/opt/projects/efxclipse/runtime-EclipseApplication/javap/lib/p2.jar!/p2.cssext");
        if (this.extensionURIs.contains(replace)) {
        	this.extensionURIs.remove(replace);
        	this.extensionURIs.add(URI.createURI("archive:platform:/resource/javap/lib/p2.jar!/p2.cssext"));
        }
//        
        this.project = project;
        this.context = context;
    }
    
    public List<CssExtension> getModels() {
    	System.err.println("GET MODELS");
    	System.err.println(" context = " + context);
    	if (context == null) {
    		new NullPointerException().printStackTrace();
    	}
    	if (context.eResource() == null) {
    		new NullPointerException().printStackTrace();
    	}
    	
    	List<CssExtension> result = new ArrayList<>();
    	
    	final ResourceSet resourceSet = getResourceSet(context);
    	
    	for (final URI uri : extensionURIs) {
    		final Resource resource = resourceSet.getResource(uri, true);
    		result.add((CssExtension) resource.getContents().get(0));
    	}
    	return result;
    }
    
    
    
} 