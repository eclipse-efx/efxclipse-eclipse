package org.eclipse.fx.ide.ui.mobile.sim.launch;

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.core.log.LoggerCreator;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;

public class MobileAppPropertyTester extends PropertyTester {
	private static Logger LOGGER = LoggerCreator.createLogger(MobileAppPropertyTester.class);
	
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		try {
			if( receiver instanceof IStructuredSelection ) {
				receiver = ((IStructuredSelection)receiver).toList();
			}
			if( receiver instanceof List<?> ) {
				for( Object o : (List<?>)receiver ) {
					if( o instanceof ICompilationUnit ) {
						ICompilationUnit u = (ICompilationUnit) o;
						try {
							for( IType t : u.getTypes() ) {
								String name = t.getSuperclassName();
								StringBuilder b = new StringBuilder();
								if( name != null ) {
									String[][] resolveType = t.resolveType(name);
									
									if( resolveType.length > 0 ) {
										for( String s : resolveType[0] ) {
											if( b.length() > 0 ) {
												b.append(".");
											}
											b.append(s);
										}	
									}	
								}
								
								if( "org.eclipse.fx.ui.mobile.MobileApp".equals(b.toString()) ) {
									return true;
								}
							}
						} catch (JavaModelException e) {
							LOGGER.error("Failed to analyze class", e);
						}
					}
				}
			}
		} catch(Throwable e) {
			LOGGER.error("Unexpected error", e);
		}
		
		return false;
	}

}
