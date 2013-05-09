/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.fx.ide.rrobot.model.task.JDTProject;
import org.eclipse.fx.ide.rrobot.model.task.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.BundleProject#getManifest <em>Manifest</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.BundleProject#getBuildProperties <em>Build Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.BundleProject#getPluginxml <em>Pluginxml</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getBundleProject()
 * @model
 * @generated
 */
public interface BundleProject extends JDTProject {
	/**
	 * Returns the value of the '<em><b>Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest</em>' containment reference.
	 * @see #setManifest(ManifestFile)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getBundleProject_Manifest()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ManifestFile getManifest();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.BundleProject#getManifest <em>Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest</em>' containment reference.
	 * @see #getManifest()
	 * @generated
	 */
	void setManifest(ManifestFile value);

	/**
	 * Returns the value of the '<em><b>Build Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Properties</em>' containment reference.
	 * @see #setBuildProperties(BuildProperties)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getBundleProject_BuildProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BuildProperties getBuildProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.BundleProject#getBuildProperties <em>Build Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Properties</em>' containment reference.
	 * @see #getBuildProperties()
	 * @generated
	 */
	void setBuildProperties(BuildProperties value);

	/**
	 * Returns the value of the '<em><b>Pluginxml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pluginxml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pluginxml</em>' containment reference.
	 * @see #setPluginxml(PluginXMLFile)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getBundleProject_Pluginxml()
	 * @model containment="true"
	 * @generated
	 */
	PluginXMLFile getPluginxml();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.BundleProject#getPluginxml <em>Pluginxml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pluginxml</em>' containment reference.
	 * @see #getPluginxml()
	 * @generated
	 */
	void setPluginxml(PluginXMLFile value);

} // BundleProject
