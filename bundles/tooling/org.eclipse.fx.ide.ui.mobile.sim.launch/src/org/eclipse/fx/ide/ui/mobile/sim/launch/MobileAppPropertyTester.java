package org.eclipse.fx.ide.ui.mobile.sim.launch;

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class MobileAppPropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if( receiver instanceof List<?> ) {
			for( Object o : (List<?>)receiver ) {
				if( o instanceof ICompilationUnit ) {
					ICompilationUnit u = (ICompilationUnit) o;
					try {
						for( IType t : u.getTypes() ) {
							String name = t.getSuperclassName();
							String[][] resolveType = t.resolveType(name);
							StringBuilder b = new StringBuilder();
							if( resolveType.length > 0 ) {
								for( String s : resolveType[0] ) {
									if( b.length() > 0 ) {
										b.append(".");
									}
									b.append(s);
								}	
							}
							
							if( "org.eclipse.fx.ui.mobile.MobileApp".equals(b.toString()) ) {
								return true;
							}
						}
					} catch (JavaModelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return false;
	}

}
