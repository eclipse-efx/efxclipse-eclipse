/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.common.util.EList;
import org.eclipse.fx.ide.rrobot.model.task.File;
import org.eclipse.fx.ide.rrobot.model.task.TemplatedFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin XML File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.PluginXMLFile#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getPluginXMLFile()
 * @model
 * @generated
 */
public interface PluginXMLFile extends TemplatedFile {

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.bundle.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getPluginXMLFile_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extension> getExtensions();
} // PluginXMLFile
