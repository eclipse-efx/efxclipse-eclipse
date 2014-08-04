package org.eclipse.fx.ide.css.cssext.proposals.internal.paint;

import org.eclipse.fx.ide.css.cssext.proposal.CssExtProposalContributor;
import org.eclipse.fx.ide.css.extapi.Proposal;

// TODO update api
public class PaintProposalContributer implements CssExtProposalContributor {

	@Override
	public String getRule() {
		return "javafx.paint";
	}

	@Override
	public Proposal getProposal() {
		return new PaintProposal();
	}

}
