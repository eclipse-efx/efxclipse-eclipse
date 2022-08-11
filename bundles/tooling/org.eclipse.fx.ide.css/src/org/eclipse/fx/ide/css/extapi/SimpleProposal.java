/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.extapi;

/**
 * @author Caksi
 *
 */
public class SimpleProposal implements Proposal {

	private String proposal;
	
	public SimpleProposal(String proposal) {
		this.proposal = proposal;
	}
	
	@Override
	public Type getType() {
		return Type.Value;
	}

	@Override
	public Object getAdditionalInfo() {
		return null;
	}

	@Override
	public String getProposal() {
		return proposal;
	}

	@Override
	public String getImageUrl() {
		return null;
	}

	@Override
	public String getLabel() {
		return proposal;
	}

	@Override
	public int getPriority() {
		return 0;
	}

}
