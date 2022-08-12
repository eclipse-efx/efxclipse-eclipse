/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
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
package org.eclipse.fx.ide.ui.editor;

import java.util.List;

public interface IValueOfContributor {
	public interface Proposal {
		public String getValue();
		public int getPriority();
	}
	
	public interface DialogProposal extends Proposal {
		public String openDialogValue();
	}

	public static class SimpleValueProposal implements Proposal {
		private final String value;
		private final int priority;

		public SimpleValueProposal(String value) {
			this.value = value;
			this.priority = 0;
		}
		
		public SimpleValueProposal(String value, int priority) {
			this.value = value;
			this.priority = priority;
		}
		
		@Override
		public String getValue() {
			return value;
		}
		
		@Override
		public int getPriority() {
			return priority;
		}
	}

	public List<Proposal> getProposals();

	public String getType();
}
