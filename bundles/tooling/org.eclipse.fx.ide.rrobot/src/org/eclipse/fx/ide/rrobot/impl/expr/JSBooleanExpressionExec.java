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
package org.eclipse.fx.ide.rrobot.impl.expr;

import java.util.Map;
import java.util.Map.Entry;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.fx.ide.rrobot.model.task.BooleanExpressionExecutor;


public class JSBooleanExpressionExec implements BooleanExpressionExecutor {

	@Override
	public boolean execute(String content, Map<String, Object> data) {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		
		for( Entry<String, Object> e : data.entrySet() ) {
			engine.put(e.getKey(), e.getValue());
		}
		
		try {
			return ((Boolean)engine.eval(content)).booleanValue();
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
