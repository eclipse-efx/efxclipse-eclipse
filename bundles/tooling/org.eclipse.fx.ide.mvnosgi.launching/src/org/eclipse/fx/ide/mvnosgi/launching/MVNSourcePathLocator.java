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
package org.eclipse.fx.ide.mvnosgi.launching;

import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector;
import org.eclipse.debug.core.sourcelookup.ISourceContainerType;
import org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant;
import org.eclipse.jdt.launching.sourcelookup.containers.JavaSourceLookupParticipant;

public class MVNSourcePathLocator extends AbstractSourceLookupDirector {
	public MVNSourcePathLocator() {
		System.err.println("LOCATOR");
	}
	@Override
	public void initializeParticipants() {
		addParticipants(new ISourceLookupParticipant[] {new JavaSourceLookupParticipant()});
	}

	@Override
	public boolean supportsSourceContainerType(ISourceContainerType type) {
		// TODO Auto-generated method stub
		return super.supportsSourceContainerType(type);
	}
	
	public Object getSourceElement(Object element) {
		System.err.println("LOOK UP SOURCE FOR: " + element);
		return super.getSourceElement(element);
	}
}
