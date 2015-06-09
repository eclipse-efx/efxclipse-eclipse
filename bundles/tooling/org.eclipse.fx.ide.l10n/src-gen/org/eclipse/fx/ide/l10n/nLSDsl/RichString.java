/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.RichString#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getRichString()
 * @model
 * @generated
 */
public interface RichString extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getRichString_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getExpressions();

} // RichString
