/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.rrobot.model.task.BooleanExpression;
import org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeaturePlugin#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeaturePlugin#isUnpack <em>Unpack</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.FeaturePlugin#isFragment <em>Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeaturePlugin()
 * @model
 * @generated
 */
public interface FeaturePlugin extends ExcludeableElementMixin {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeaturePlugin_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeaturePlugin#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Unpack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unpack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unpack</em>' attribute.
	 * @see #setUnpack(boolean)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeaturePlugin_Unpack()
	 * @model
	 * @generated
	 */
	boolean isUnpack();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeaturePlugin#isUnpack <em>Unpack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unpack</em>' attribute.
	 * @see #isUnpack()
	 * @generated
	 */
	void setUnpack(boolean value);

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragment</em>' attribute.
	 * @see #setFragment(boolean)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getFeaturePlugin_Fragment()
	 * @model
	 * @generated
	 */
	boolean isFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.FeaturePlugin#isFragment <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment</em>' attribute.
	 * @see #isFragment()
	 * @generated
	 */
	void setFragment(boolean value);

} // FeaturePlugin
