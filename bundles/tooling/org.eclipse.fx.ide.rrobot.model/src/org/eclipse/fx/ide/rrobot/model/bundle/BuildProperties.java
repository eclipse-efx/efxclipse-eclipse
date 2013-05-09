/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.fx.ide.rrobot.model.task.Resource;
import org.eclipse.fx.ide.rrobot.model.task.TemplatedFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.BuildProperties#getBinIncludes <em>Bin Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getBuildProperties()
 * @model
 * @generated
 */
public interface BuildProperties extends TemplatedFile {

	/**
	 * Returns the value of the '<em><b>Bin Includes</b></em>' reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin Includes</em>' reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getBuildProperties_BinIncludes()
	 * @model
	 * @generated
	 */
	EList<Resource> getBinIncludes();
} // BuildProperties
