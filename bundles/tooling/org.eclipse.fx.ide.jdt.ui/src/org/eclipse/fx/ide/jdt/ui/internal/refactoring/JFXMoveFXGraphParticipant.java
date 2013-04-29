/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.refactoring;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;
import org.eclipse.ltk.core.refactoring.resource.MoveResourceChange;

/**
 * @author martin
 * 
 */
public class JFXMoveFXGraphParticipant extends MoveParticipant {
	private IResource renamedElement;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant#initialize(java.lang.Object)
	 */
	@Override
	protected boolean initialize( Object element ) {
		if ( element instanceof IResource ) {
			renamedElement = (IResource) element;
			if ( "fxgraph".equals( renamedElement.getFileExtension() ) ) {
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant#getName()
	 */
	@Override
	public String getName() {
		return "e(fx)clipse JFXMoveFXGraphParticipant";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant#checkConditions(org.eclipse.core.runtime.IProgressMonitor,
	 * org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext)
	 */
	@Override
	public RefactoringStatus checkConditions( IProgressMonitor pm, CheckConditionsContext context ) throws OperationCanceledException {
		return new RefactoringStatus();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant#createChange(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public Change createChange( IProgressMonitor pm ) throws CoreException, OperationCanceledException {
		if ( renamedElement != null ) {
			String path = renamedElement.getProjectRelativePath().toString();
			String correspondingOldFXMLPath = path.substring( 0, path.length() - "fxgraph".length() ) + "fxml";
			IResource correspondingOldFXML = renamedElement.getProject().findMember( correspondingOldFXMLPath );
			if ( correspondingOldFXML.exists() ) {
				return new MoveResourceChange( correspondingOldFXML, ( (IContainer) getArguments().getDestination() ) );
			}
		}
		return null;
	}
}
