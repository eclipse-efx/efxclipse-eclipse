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

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.PackageFragment;

/**
 * @author martin
 */
public class RefactoringUtil {
	/**
	 * hidden constructor.
	 */
	private RefactoringUtil() {
		// nothing here, this is a utility class.
	}

	/**
	 * Build thh fully qualified name of a resource.
	 * 
	 * @param resource
	 *            resource
	 * @return fully qualified name
	 */
	public static String buildFullyQualifiedName( IResource resource ) {
		IJavaElement je = JavaCore.create( resource );
		if ( je != null ) {
			try {
				IJavaProject p = je.getJavaProject();
				IType t = p.findType( je.getParent().getElementName(), je.getElementName().replace( "." + resource.getFileExtension(), "" ) );
				if( t == null ) {
					System.err.println("Unable to construct FQN from '"+je.getParent().getElementName()+"."+je.getElementName().replace( "." + resource.getFileExtension(), "" )+"'");
					return "";
				}
				return t.getFullyQualifiedName(); 
			}
			catch ( Exception e ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "";
			}
		}
		else {
			return getNonJavaElementName( resource, resource.getName() );
		}
	}

	/**
	 * @param resource
	 *            resource
	 * @param name
	 *            name
	 * @return element name
	 */
	private static String getNonJavaElementName( final IResource resource, final String name ) {
		IJavaElement j = JavaCore.create( resource.getParent() );
		if ( j instanceof IPackageFragment ) {
			IPackageFragment p = (IPackageFragment) j;
			return p.getElementName().replace( '.', '/' ) + "/" + name;
		}
		else if ( j instanceof IPackageFragmentRoot ) {
			return resource.getName();
		}
		else {
			return "";
		}
	}

	public static String getNewFullyQualifiedName( final IResource resource, final String newName ) {
		IJavaElement e = JavaCore.create( resource );
		if ( e != null ) {
			return e.getParent().getElementName() + "." + newName.replaceAll( ".java", "" );
		}
		else {
			return getNonJavaElementName( resource, newName );
		}
	}

	/**
	 * @param resource
	 *            resource
	 * @param newDestination
	 *            the new destination
	 * @return
	 */
	public static String getNewDestinationFullyQualifiedName( final IResource resource, final String newDestination ) {
		// TODO Auto-generated method stub
		String projectRelativeDestination = "F/" + resource.getProject().getName();
		IJavaElement e = JavaCore.create( resource.getProject().getFolder( newDestination.replaceFirst( projectRelativeDestination, "" ) ) );
		if ( e != null && e instanceof PackageFragment ) {
			PackageFragment p = (PackageFragment) e;
			return p.getElementName() + "." + resource.getName().replaceAll( ".java", "" );
		}
		else if ( e != null && e instanceof IPackageFragmentRoot ) {
			return resource.getName();
		}
		else {
			return "bla";
		}
	}
}
