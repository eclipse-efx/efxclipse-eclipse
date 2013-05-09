/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product File Featurebase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFileFeaturebase#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFileFeaturebase()
 * @model
 * @generated
 */
public interface ProductFileFeaturebase extends ProductFile {

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fx.ide.rrobot.model.bundle.ProductFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getProductFileFeaturebase_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductFeature> getFeatures();
} // ProductFileFeaturebase
