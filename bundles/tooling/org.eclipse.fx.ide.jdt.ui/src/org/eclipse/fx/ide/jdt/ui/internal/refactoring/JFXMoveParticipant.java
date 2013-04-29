/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.jdt.ui.internal.refactoring;

import java.util.HashMap;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextChange;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;
import org.eclipse.search.core.text.TextSearchEngine;
import org.eclipse.search.core.text.TextSearchMatchAccess;
import org.eclipse.search.core.text.TextSearchRequestor;
import org.eclipse.search.ui.text.FileTextSearchScope;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEditGroup;

/**
 * @author martin
 * 
 */
public class JFXMoveParticipant extends MoveParticipant {
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
			return true;
		}
		else {
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant#getName()
	 */
	@Override
	public String getName() {
		return "e(fx)clipse JFXMoveParticipant";
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
		final HashMap<Object, Change> changes = new HashMap<Object, Change>();
		final String newName = getArguments().getDestination().toString();

		if ( renamedElement != null ) {
			IResource[] roots = renamedElement.getWorkspace().getRoot().getProjects();
			String[] fileNamePatterns = { "*.fxbuild" }; //$NON-NLS-1$
			FileTextSearchScope scope = FileTextSearchScope.newSearchScope( roots, fileNamePatterns, false );

			String oldType = RefactoringUtil.buildFullyQualifiedName( renamedElement );

			Pattern pattern = Pattern.compile( oldType );

			TextSearchRequestor collector = new TextSearchRequestor() {
				@Override
				public boolean acceptPatternMatch( final TextSearchMatchAccess matchAccess ) throws CoreException {
					IFile file = matchAccess.getFile();
					TextFileChange change = (TextFileChange) changes.get( file );
					if ( change == null ) {
						TextChange textChange = getTextChange( file ); // an other participant already modified that file?
						if ( textChange != null ) {
							return false; // don't try to merge changes
						}
						change = new TextFileChange( file.getName(), file );
						change.setEdit( new MultiTextEdit() );
						changes.put( file, change );
					}
					// TODO destination
					ReplaceEdit edit = new ReplaceEdit( matchAccess.getMatchOffset(), matchAccess.getMatchLength(), RefactoringUtil.getNewDestinationFullyQualifiedName(
							renamedElement, getArguments().getDestination().toString() ) );
					change.addEdit( edit );
					change.addTextEditGroup( new TextEditGroup( "Update type reference", edit ) ); //$NON-NLS-1$
					return true;
				}
			};
			TextSearchEngine.create().search( scope, collector, pattern, pm );
		}
		if ( changes.isEmpty() ) {
			return null;
		}
		CompositeChange result = new CompositeChange( "FX build configuration updates" ); //$NON-NLS-1$
		for ( Change change : changes.values() ) {
			result.add( change );
		}
		return result;
	}
}
