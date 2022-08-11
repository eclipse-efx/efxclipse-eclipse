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
package org.eclipse.fx.ide.ui.preview;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;

public class SwitchUpdatePreferenceHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Command command = event.getCommand();
		HandlerUtil.toggleCommandState(command);
	     
//		IEclipsePreferences p = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID); 
//		boolean b = p.getBoolean(LivePreviewSynchronizer.PREF_REFRESH_WHILE_TYPE, false);
//		p.putBoolean(LivePreviewSynchronizer.PREF_REFRESH_WHILE_TYPE, !b);
//		try {
//			p.flush();
//		} catch (BackingStoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return null;
	}

}
