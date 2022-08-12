/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.css.cssext.parser;

import java.util.Collections;
import java.util.List;

import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.WSTok;
import org.eclipse.fx.ide.css.util.TokUtil;

public class ParserInputCursor {

	private final ParserInput input;
	
	private int position;
	
	/*package*/ ParserInputCursor(ParserInput input) {
		this(input, 0);
	}
	
	/*package*/ ParserInputCursor(ParserInput input, int position) {
		this.input = input;
		this.position = position;
	}
	
	public boolean isConsumed() {
		return position > input.input.size()-1;
	}
	
	public boolean isConsumedOrOnlyWSLeft() {
		if (isConsumed()) {
			return true;
		}
		if (input.input.size() == 0) {
			return true;
		}
		boolean isWS = true;
		for (int i = position; i < input.input.size(); i++) {
			if (!(input.input.get(i) instanceof WSTok)) {
				isWS = false;
				break;
			}
		}
		return isWS;
	}
	
	public CssTok pollNextToken() {
		if (position >= input.input.size()) {
			return null;
		}
		return input.input.get(position++);
	}
	
	public CssTok peekNextToken() {
		if (position >= input.input.size()) {
			return null;
		}
		return input.input.get(position);
	}
	
	public ParserInputCursor copy() {
		return new ParserInputCursor(input, position);
	}
	
	@Override
	public String toString() {
		if (isConsumed()) {
			return "{}";
		}
		
		StringBuffer out = new StringBuffer();
		out.append("{");
		for (int x = position; x < input.input.size(); x++) {
			CssTok tok = input.input.get(x);
			
			out.append(TokUtil.toString(tok));
			
//			if (tok instanceof WSTok) {
//				out.append("WS");
//			}
//			else if (tok instanceof IdentifierTok) {
//				out.append("'");
//				out.append(((IdentifierTok) tok).getName());
//				out.append("'");
//			}
//			else {
//				out.append(tok.getClass().getSimpleName());
//			}
			
			if (x < input.input.size()-1) {
				out.append(", ");
			}
			
		}
		out.append("}");
		return out.toString();
	}

	public int getPosition() {
		return position;
	}
	
	public static ParserInputCursor emptyParserInputCursor() {
		final List<CssTok> input = Collections.emptyList();
		return new ParserInputCursor(new ParserInput(input), 0);
	}
}
