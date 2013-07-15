package org.eclipse.fx.ide.css.cssext.ui.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssext.ICssExtManager;
import org.eclipse.fx.ide.css.cssext.parser.CssExtParser;
import org.eclipse.fx.ide.css.cssext.proposal.CssExtProposalContributor;
import org.eclipse.fx.ide.css.cssext.ui.doc.CssExtDocParser;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.css_property;
import org.eclipse.fx.ide.css.cssDsl.selector;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;
import org.eclipse.fx.ide.css.extapi.CssExt;
import org.eclipse.fx.ide.css.extapi.Proposal;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class DefaultCssExtProvider implements CssExt {
	
	private @Inject ICssExtManager cssExtManager;
	private @Inject CssExtParser parser;
	private @Inject CssExtDocParser docParser;
	private @Inject IQualifiedNameProvider nameProvider;
	
	public DefaultCssExtProvider() {
		Injector i = CssExtDslActivator.getInstance().getInjector(CssExtDslActivator.ORG_ECLIPSE_FX_IDE_CSS_CSSEXT_CSSEXTDSL);
		i.injectMembers(this);
	}

	@Override
	public String getDocumentationHeader(IFile f, EObject obj) {
		return docParser.getDocHead(f,obj);
	}

	@Override
	public String getDocumentation(IFile f, EObject obj) {
		return docParser.getDocumentation(f,obj);
	}

	@Override
	public List<Proposal> getPropertyProposalsForSelector(IFile f, 
			List<selector> selectors) {

		List<Proposal> result = new ArrayList<>();
		
		List<PropertyDefinition> defs = new ArrayList<>();
		if (selectors == null || selectors.isEmpty()) {
			defs.addAll(cssExtManager.findAllProperties(f));
		}
		else {
			for (selector selector: selectors) {
				defs.addAll(cssExtManager.findPropertiesBySelector(f,selector));
			}
		}
		
		if (defs.isEmpty()) {
			defs.addAll(cssExtManager.findAllProperties(f));
		}
		
		for (PropertyDefinition def : defs) {
			result.add(createProposalForPropertyDefinition(def));
		}
		
		return result;
	}

	private Proposal createProposalForPropertyDefinition(final PropertyDefinition def) {
	
		Proposal p = new Proposal() {
			
			@Override
			public String getProposal() {
				return def.getName();
			}
			
			@Override
			public int getPriority() {
				return 0;
			}
			
			@Override
			public String getLabel() {
				return def.getName();
			}
			
			@Override
			public String getImageUrl() {
				return null;
			}
			
			@Override
			public Object getAdditionalInfo() {
				return def;
			}

			@Override
			public Type getType() {
				return Type.Property;
			}
		};
		
		return p;
	}
	
	@Override
	public List<Proposal> getValueProposalsForProperty(IFile f, List<selector> selector,
			css_property property, List<CssTok> prefixTok, String prefixString) {
		
		// TODO add element
		
		return parser.findProposals(f, null, property.getName(), prefixTok, prefixString);
		
	}
	
	public void bindCssExtProposalContributor(CssExtProposalContributor c) {
		cssExtManager.addCssExtProposalContributer(c);
	}
	
	public void unbindCssExtProposalContributor(CssExtProposalContributor c) {
		cssExtManager.removeCssExtProposalContributer(c);
	}

}
