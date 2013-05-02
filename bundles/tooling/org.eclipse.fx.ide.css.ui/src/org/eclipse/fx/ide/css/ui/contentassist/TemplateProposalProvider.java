/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.ui.contentassist;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

import org.eclipse.fx.ide.css.services.CssDslGrammarAccess;

import com.google.inject.Inject;

/**
 * @author ccaks
 *
 */
public class TemplateProposalProvider extends DefaultTemplateProposalProvider {

	 @Inject private CssDslGrammarAccess ga;
	
	 private ContextTypeIdHelper helper;
	 
	 @Inject
	  public TemplateProposalProvider(TemplateStore templateStore,
	      ContextTypeRegistry registry,
	      ContextTypeIdHelper helper) {
	    super(templateStore, registry, helper);
	    this.helper = helper;
	  }
	  
	 
	  @Override
	  protected void createTemplates(TemplateContext templateContext, 
	      ContentAssistContext context,
	      ITemplateAcceptor acceptor) {
	    //"regular templates"
	    super.createTemplates(templateContext, context, acceptor);

	  //calculate the context type id of the Feature rule
	    //in the Domainmodel grammar
	    String id=helper.getId(ga.getSubSelectorRule());
//	    System.err.println(templateContext.getContextType().getId());
	    //create the template only if that id fits the id of
	    //the current template context type
	    if(templateContext.getContextType().getId().equals(id)){
	    	//do the dynamic template construction here
	    	
	    	 //add your own
		    Template classSelectorTemplate = new Template("Class Selector",
		    	"Class Selector Template",
		    	"classSelectorTemplate",
		    	".${classname} ",
		    	false);
		    Template idSelectorTemplate = new Template("Id Selector",
			    	"Id Selector Template",
			    	"classSelectorTemplate",
			    	"#${id} ",
			    	false);
		    
		    Template elementSelectorTemplate = new Template("Element Selector",
			    	"Element Selector Template",
			    	"classSelectorTemplate",
			    	"${element} ",
			    	false);
			    
		    //create a proposal
		    TemplateProposal tp = createProposal(classSelectorTemplate, 
		        templateContext, 
		        context, 
		        getImage(classSelectorTemplate), 
		        1000);
		  
		    //make it available
		    acceptor.accept(tp);
		    
		    tp = createProposal(elementSelectorTemplate, 
			        templateContext, 
			        context, 
			        getImage(elementSelectorTemplate), 
			        1000);
		    acceptor.accept(tp);
		    
		    tp = createProposal(idSelectorTemplate, 
			        templateContext, 
			        context, 
			        getImage(idSelectorTemplate), 
			        1000);
		    acceptor.accept(tp);
	    }
	    
	   
	  }
	

}
