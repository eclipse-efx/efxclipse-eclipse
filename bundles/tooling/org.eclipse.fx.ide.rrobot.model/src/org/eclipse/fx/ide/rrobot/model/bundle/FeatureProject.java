/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.fx.ide.rrobot.model.task.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureProject#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureProject()
 * @model
 * @generated
 */
public interface FeatureProject extends Project {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(FeatureFile)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeatureProject_Feature()
	 * @model containment="true"
	 * @generated
	 */
	FeatureFile getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeatureProject#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(FeatureFile value);

} // FeatureProject
