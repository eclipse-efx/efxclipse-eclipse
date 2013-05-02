package org.eclipse.fx.ide.css.extapi;


public interface Proposal {

	public static enum Type {
		Value,
		Property,
		Selector;
	}
	
	public Type getType();
	
	public Object getAdditionalInfo();
	
	public String getProposal();

	public String getImageUrl();

	public String getLabel();

	public int getPriority();

}