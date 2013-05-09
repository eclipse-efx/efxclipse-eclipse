/**
 */
package org.eclipse.fx.ide.rrobot.model.bundle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.rrobot.model.task.BooleanExpression;
import org.eclipse.fx.ide.rrobot.model.task.ExcludeableElementMixin;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage#getMinVersion <em>Min Version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage#getMaxVersion <em>Max Version</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage#isMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage#isMaxExclusive <em>Max Exclusive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getImportedPackage()
 * @model
 * @generated
 */
public interface ImportedPackage extends ExcludeableElementMixin {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getImportedPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Min Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Version</em>' attribute.
	 * @see #setMinVersion(Version)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getImportedPackage_MinVersion()
	 * @model dataType="org.eclipse.fx.ide.rrobot.model.bundle.Version"
	 * @generated
	 */
	Version getMinVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage#getMinVersion <em>Min Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Version</em>' attribute.
	 * @see #getMinVersion()
	 * @generated
	 */
	void setMinVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Max Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Version</em>' attribute.
	 * @see #setMaxVersion(Version)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getImportedPackage_MaxVersion()
	 * @model dataType="org.eclipse.fx.ide.rrobot.model.bundle.Version"
	 * @generated
	 */
	Version getMaxVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage#getMaxVersion <em>Max Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Version</em>' attribute.
	 * @see #getMaxVersion()
	 * @generated
	 */
	void setMaxVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Exclusive</em>' attribute.
	 * @see #setMinExclusive(boolean)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getImportedPackage_MinExclusive()
	 * @model
	 * @generated
	 */
	boolean isMinExclusive();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage#isMinExclusive <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Exclusive</em>' attribute.
	 * @see #isMinExclusive()
	 * @generated
	 */
	void setMinExclusive(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Exclusive</em>' attribute.
	 * @see #setMaxExclusive(boolean)
	 * @see org.eclipse.fx.ide.rrobot.model.bundle.BundlePackage#getImportedPackage_MaxExclusive()
	 * @model
	 * @generated
	 */
	boolean isMaxExclusive();

	/**
	 * Sets the value of the '{@link org.eclipse.fx.ide.rrobot.model.bundle.ImportedPackage#isMaxExclusive <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Exclusive</em>' attribute.
	 * @see #isMaxExclusive()
	 * @generated
	 */
	void setMaxExclusive(boolean value);

} // ImportedPackage
