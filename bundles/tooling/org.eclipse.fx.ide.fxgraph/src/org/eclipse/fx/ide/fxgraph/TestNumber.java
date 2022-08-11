/*******************************************************************************
 * Copyright (c) 2013 __COMPANY/CONTRIBUTOR__ and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     tomschindl<__EMAIL__> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxgraph;

/**
 * @author tomschindl
 *
 */
public class TestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String number = "1_000";
		System.err.println(number.matches("\\d[\\d|_]*"));
	}

}
