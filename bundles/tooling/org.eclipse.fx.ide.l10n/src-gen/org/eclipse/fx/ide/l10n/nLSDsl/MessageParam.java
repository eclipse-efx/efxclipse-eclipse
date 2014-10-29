/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageParam#getPredefined <em>Predefined</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageParam#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getMessageParam()
 * @model
 * @generated
 */
public interface MessageParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Predefined</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predefined</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predefined</em>' attribute.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes
   * @see #setPredefined(PredefinedTypes)
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getMessageParam_Predefined()
   * @model
   * @generated
   */
  PredefinedTypes getPredefined();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageParam#getPredefined <em>Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predefined</em>' attribute.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.PredefinedTypes
   * @see #getPredefined()
   * @generated
   */
  void setPredefined(PredefinedTypes value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage#getMessageParam_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageParam#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

} // MessageParam
