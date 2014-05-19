/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks<ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.fx.core.log.Log;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.ide.css.cssext.ICSSExtModelProvider;
import org.eclipse.fx.ide.css.cssext.ICssExtManager;
import org.eclipse.fx.ide.css.cssext.proposal.CssExtProposalContributor;
import org.eclipse.fx.ide.css.cssext.ui.SearchHelper.ElementDefinitionFilter;
import org.eclipse.fx.ide.css.cssext.ui.SearchHelper.PropertyDefinitionFilter;
import org.eclipse.fx.ide.css.cssext.ui.SearchHelper.SearchFilter;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.fx.ide.css.cssDsl.ClassSelector;
import org.eclipse.fx.ide.css.cssDsl.CssSelector;
import org.eclipse.fx.ide.css.cssDsl.selector;
import org.eclipse.fx.ide.css.cssDsl.simple_selector;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;
import org.eclipse.fx.ide.css.extapi.Proposal;

public class CssExtManager implements ICssExtManager {

	private @Log("cssext.manager") Logger logger;
	
	private List<CssExtProposalContributor> proposalContributors = new ArrayList<>();
	private List<ICSSExtModelProvider> extensionModelProvider = new ArrayList<ICSSExtModelProvider>();
	
//	private static void log(String string) {
//		System.err.println("MANAGER: " + string);
//	}
//	private static void logf(String format, Object...args) {
//		System.err.printf("MANAGER: " + format , args);
//		System.err.println();
//	}
//	
//	private enum FixedExtensions {
//		JavaFX2(URI.createPlatformPluginURI("/org.eclipse.fx.ide.css.jfx/OSGI-INF/jfx2.cssext", true));
//		public final URI uri;
//		private FixedExtensions(URI uri) {
//			this.uri = uri;
//		}
//	}
	
//	private Set<CssExtension> model = new HashSet<CssExtension>();
	
	private boolean loaded = false;
	
	static int count = 0;
	public CssExtManager() {
//		logger.debugf("Ext Manager #%d" ,++count);
	}
	
//	public void registerExtenstion(URI uri) {
//		logf("loading %s", uri);
//		ResourceSet rs = new ResourceSetImpl();
//		Resource resource = rs.getResource(FixedExtensions.JavaFX2.uri, true);
//		CssExtension model = (CssExtension) resource.getContents().get(0);
//		
//		this.model.add(model);
//	}
//	
//	public void load() {
//		if (loaded) return;
//		registerExtenstion(FixedExtensions.JavaFX2.uri);
//		loaded = true;
//	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.fx.ide.css.cssext.ui.ICssExtManager#findPropertyByName(java.lang.String)
	 */
	@Override
	public PropertyDefinition findPropertyByName(IFile f, final String propertyName) {
		List<PropertyDefinition> search = new SearchHelper(collectModels(f)).findPropertiesByFilter(new PropertyDefinitionFilter() {
			
			@Override
			public boolean returnOnFirstHit() {
				return true;
			}
			
			@Override
			public boolean filter(PropertyDefinition def) {
				return propertyName.equals(def.getName());
			}
		});
		if (search.isEmpty()) return null;
		else return search.get(0);
	}
	
	@Override
	public List<PropertyDefinition> findPropertiesBySelector(IFile f, selector cssSelector) {
		List<PropertyDefinition> result = new ArrayList<>();
			// first we need to find the last selector
			logger.debug("searching for last selector");
			selector lastSelector = cssSelector;
			while (lastSelector.getSelector() != null) {
				lastSelector = lastSelector.getSelector();
			}
			logger.debug("lastSelector = " + lastSelector);	
			
			
			for (simple_selector ss : lastSelector.getSimpleselectors()) {
				
				String elementName = null;
				List<String> elements = new ArrayList<>();
				if (ss.getElement() != null) {
					logger.debug(" - found element selector: " + ss.getElement().getName());
					
					elementName = ss.getElement().getName();
				}
				Set<String> styleClasses = new HashSet<>();
				for (CssSelector subs : ss.getSubSelectors()) {
					if (subs instanceof ClassSelector) {
						logger.debug(" - found class selector: ." + ((ClassSelector)subs).getName());
						
						styleClasses.add(((ClassSelector)subs).getName());
					}
				}
				
				final String finalElementName = elementName;
				final Set<String> finalStyleClasses = styleClasses;
				
				Queue<ElementDefinition> superElements = new LinkedList<>();
				
				superElements.addAll(new SearchHelper(collectModels(f)).findObjects(new SearchFilter<ElementDefinition>() {
					@Override
					public Class<ElementDefinition> getSearchClass() {
						return ElementDefinition.class;
					}
					@Override
					public boolean filter(ElementDefinition obj) {
						//System.err.println("check " + obj);
						if (obj.getName().equals(finalElementName)) {
							logger.debug("found by name -> " + obj);
							return true;
						}
						if (finalStyleClasses.contains(obj.getStyleclass())) {
							logger.debug("found by styleclass -> " + obj);
							return true;
						}
						return false;
					}
					@Override
					public boolean returnOnFirstHit() {
						return false;
					}
				}));
				final Set<ElementDefinition> allElements = new HashSet<>();
				while (!superElements.isEmpty()) {
					ElementDefinition cur = superElements.poll();
					if (cur.getSuper() != null && !cur.getSuper().isEmpty()) {
						superElements.addAll(cur.getSuper());
					}
					
					allElements.add(cur);
				}
				
				for (ElementDefinition d : allElements) {
					for (Definition def : d.getProperties()) {
						result.add((PropertyDefinition) def);
					}
				}
				
			}
			logger.debug("findPropertiesBySelector found " + result.size() + " properties");
		return result;
	}
	
	
	@Override
	public List<PropertyDefinition> findAllProperties(IFile f) {
		List<PropertyDefinition> defs = new SearchHelper(collectModels(f)).findPropertiesByFilter(new PropertyDefinitionFilter() {
			
			@Override
			public boolean returnOnFirstHit() {
				return false;
			}
			
			@Override
			public boolean filter(PropertyDefinition def) {
				return true;
			}
		});
		return defs;
	}
	
	@Override
	public ElementDefinition findElementByName(IFile f, final String elName) {
		List<ElementDefinition> search = new SearchHelper(collectModels(f)).findObjects(new SearchFilter<ElementDefinition>() {
			
			@Override
			public Class<ElementDefinition> getSearchClass() {
				return ElementDefinition.class;
			}
			
			@Override
			public boolean returnOnFirstHit() {
				return true;
			}
			
			@Override
			public boolean filter(ElementDefinition def) {
				return elName.equals(def.getName());
			}
		});
		if (search.isEmpty()) return null;
		else return search.get(0);
	}
	
	@Override
	public ElementDefinition findElementByStyleClass(IFile f, final String styleClass) {
		List<ElementDefinition> r = new SearchHelper(collectModels(f)).findObjects(new SearchFilter<ElementDefinition>() {
			@Override
			public Class<ElementDefinition> getSearchClass() {
				return ElementDefinition.class;
			}

			@Override
			public boolean filter(ElementDefinition obj) {
				return obj.getStyleclass() != null && obj.getStyleclass().equals(styleClass);
			}

			@Override
			public boolean returnOnFirstHit() {
				return true;
			}
		});
		if (!r.isEmpty()) {
			return r.get(0);
		}
		else {
			return null;
		}
	}
	
	
	public IJavaProject getJavaprojectFromPlatformURI(URI uri) {
		String projectName = null;
		if (uri.isPlatform()) {
			projectName = uri.segment(1);
		}
		IProject p =  ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		return JavaCore.create(p);
	}
	
	// TODO implement me
	public void searchClasspath(URI uri) {
		IJavaProject project = getJavaprojectFromPlatformURI(uri);
		
		try {
			for (IClasspathEntry entry : project.getRawClasspath()) {
				switch (entry.getEntryKind()) {
				case IClasspathEntry.CPE_LIBRARY:
					
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public CSSRule resolveReference(IFile f, final CSSRuleRef ref) {
		final Definition definition = ref.getRef();
		CSSRule result =  definition.getRule();
		if (result == null) {
			if (definition instanceof CSSRuleDefinition) {
				result = ((CSSRuleDefinition) definition).getFunc();
			}
		}
		return result;
	}
	@Override
	public void addCssExtProposalContributer(CssExtProposalContributor c) {
		proposalContributors.add(c);
	}
	@Override
	public void removeCssExtProposalContributer(CssExtProposalContributor c) {
		proposalContributors.remove(c);
	}
	
	@Override
	public List<Proposal> getContributedProposalsForRule(IFile f, String fqRuleName) {
		List<Proposal> result = new ArrayList<>();
		for (CssExtProposalContributor c : proposalContributors) {
			if (fqRuleName.equals(c.getRule())) {
				result.add(c.getProposal());
				System.err.println("found " + c.getProposal() + " for " + fqRuleName);
			}
		}
		
		return result;
	}
	
	@Override
	public void addCssExtensionModelProvider(ICSSExtModelProvider p) {
		extensionModelProvider.add(p);
	}
	
	@Override
	public void removeCssExtensionModelProvider(ICSSExtModelProvider p) {
		extensionModelProvider.remove(p);
	}
	
	private Set<CssExtension> collectModels(IFile file) {
		CssFile cssFile = (CssFile) Platform.getAdapterManager().getAdapter(file, CssFile.class);
		
		if (cssFile != null) {
			System.err.println("USING extensions from cssFile");
			return cssFile.getEnabledCssExtensions();
		}
		else {
			System.err.println("defaulting to old provider");
			Set<CssExtension> rv = new HashSet<>();
			for( ICSSExtModelProvider p : extensionModelProvider ) {
				rv.addAll(p.getModels(file));
			}
			return rv;
		}
	}
}
