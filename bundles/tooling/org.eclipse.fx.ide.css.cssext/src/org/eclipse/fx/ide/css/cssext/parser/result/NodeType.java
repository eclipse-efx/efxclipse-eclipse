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
package org.eclipse.fx.ide.css.cssext.parser.result;

public enum NodeType {
	OR,
	CONCAT,
	CONCAT_WITHOUT_SPACE,
	CONCAT_OR,
	SYMBOL,
	LITERAL,
	TYPE_NUM,
	TYPE_INT,
	OPTIONAL,
	STAR,
	REF,
	FUNCTION,
	PLUS,
	REGEX, TYPE_URL;
	
	private NodeType() {
		
	}
	
	
}
