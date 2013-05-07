package org.eclipse.fx.ide.css.cssext.ui.ext;

import org.eclipse.fx.ide.css.cssext.proposal.CssExtProposalContributor;
import org.eclipse.fx.ide.css.extapi.Proposal;


public class ColorProposalContributer implements CssExtProposalContributor {

	@Override
	public String getRule() {
		return "javafx.color";
	}

	@Override
	public Proposal getProposal() {
		return new ColorProposal();
	}

}
