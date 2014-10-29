/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NLS Formatter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter#getClassRef <em>Class Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLSFormatter()
 * @model
 * @generated
 */
public interface NLSFormatter extends EObject
{
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
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLSFormatter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Class Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Ref</em>' attribute.
   * @see #setClassRef(String)
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getNLSFormatter_ClassRef()
   * @model
   * @generated
   */
  String getClassRef();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter#getClassRef <em>Class Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Ref</em>' attribute.
   * @see #getClassRef()
   * @generated
   */
  void setClassRef(String value);

} // NLSFormatter
