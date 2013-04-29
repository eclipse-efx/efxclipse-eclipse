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
