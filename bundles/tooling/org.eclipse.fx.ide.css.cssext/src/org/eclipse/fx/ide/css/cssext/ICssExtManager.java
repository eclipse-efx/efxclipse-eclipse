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
package org.eclipse.fx.ide.css.cssext;

import java.util.List;

import org.eclipse.fx.ide.css.cssDsl.selector;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;
import org.eclipse.fx.ide.css.cssext.proposal.CssExtProposalContributor;
import org.eclipse.fx.ide.css.extapi.Proposal;

public interface ICssExtManager {

	public abstract List<PropertyDefinition> findPropertiesBySelector(selector cssSelector);
	
	public abstract PropertyDefinition findPropertyByName(String propertyName);
	public abstract ElementDefinition findElementByName(String elName);
	public abstract List<PropertyDefinition> findAllProperties();
	public abstract CSSRule resolveReference(final CSSRuleRef ref);
	public abstract ElementDefinition findElementByStyleClass(String styleClass);
	
	
	public abstract void addCssExtProposalContributer(CssExtProposalContributor c);
	public abstract void removeCssExtProposalContributer(CssExtProposalContributor c);
	
	public List<Proposal> getContributedProposalsForRule(String fqRuleName);
}