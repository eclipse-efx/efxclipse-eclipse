/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.rrobot.model.task.BooleanExpression;
import org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin;
import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature#getMatch <em>Match</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getRequiredFeature()
 * @model
 * @generated
 */
public interface RequiredFeature extends ExcludeableElementMixin {
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
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getRequiredFeature_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.tooling.rrobot.model.bundle.MatchRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' attribute.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.MatchRule
	 * @see #setMatch(MatchRule)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getRequiredFeature_Match()
	 * @model
	 * @generated
	 */
	MatchRule getMatch();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature#getMatch <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' attribute.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.bundle.MatchRule
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(MatchRule value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Version)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getRequiredFeature_Version()
	 * @model dataType="at.bestsolution.efxclipse.tooling.rrobot.model.bundle.Version"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.RequiredFeature#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

} // RequiredFeature
