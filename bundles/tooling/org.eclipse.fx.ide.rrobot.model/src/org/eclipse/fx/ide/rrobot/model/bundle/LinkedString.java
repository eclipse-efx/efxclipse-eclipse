/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.LinkedString#getWeburl <em>Weburl</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.LinkedString#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getLinkedString()
 * @model
 * @generated
 */
public interface LinkedString extends EObject {
	/**
	 * Returns the value of the '<em><b>Weburl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weburl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weburl</em>' attribute.
	 * @see #setWeburl(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getLinkedString_Weburl()
	 * @model
	 * @generated
	 */
	String getWeburl();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.LinkedString#getWeburl <em>Weburl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weburl</em>' attribute.
	 * @see #getWeburl()
	 * @generated
	 */
	void setWeburl(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getLinkedString_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.LinkedString#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // LinkedString
