/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxgraph.ui.util.prop;

import java.util.List;

import org.eclipse.fx.ide.fxgraph.ui.util.JDTHelper.Proposal;
import org.eclipse.jdt.core.IJavaProject;


public interface IProposalProvider {
	public List<Proposal> getProposals(IJavaProject jp);
}
