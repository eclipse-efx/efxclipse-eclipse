package org.eclipse.fx.ide.css.cssext.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.IdentifierTok;
import org.eclipse.fx.ide.css.cssDsl.WSTok;


public class ParserInput {
		
	/*package*/ final List<CssTok> input;
	
	public ParserInput(List<CssTok> tokens) {
		input = Collections.unmodifiableList(new ArrayList<CssTok>(tokens));
	}
	
	public ParserInputCursor createCursor() {
		return new ParserInputCursor(this);
	}
	
	public int getSize() {
		return input.size();
	}
	
		
		

		public ParserInput copy() {
			ParserInput clonedData = new ParserInput(input);
			return clonedData;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((input == null) ? 0 : input.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ParserInput other = (ParserInput) obj;
			if (input == null) {
				if (other.input != null)
					return false;
			} else if (!input.equals(other.input))
				return false;
			return true;
		}

		@Override
		public String toString() {
			if (input.isEmpty()) {
				return "EMPTY";
			}
			StringBuffer out = new StringBuffer();
			Iterator<CssTok> it = input.iterator();
			while (it.hasNext()) {
				CssTok tok = it.next();
				if (tok instanceof WSTok) {
					out.append("WS");
				}
				else if (tok instanceof IdentifierTok) {
					out.append("'");
					out.append(((IdentifierTok) tok).getName());
					out.append("'");
				}
				else {
					out.append(tok.getClass().getSimpleName());
				}
				
				if (it.hasNext()) {
					out.append(" / ");
				}
			}
			return out.toString();
		}

	}