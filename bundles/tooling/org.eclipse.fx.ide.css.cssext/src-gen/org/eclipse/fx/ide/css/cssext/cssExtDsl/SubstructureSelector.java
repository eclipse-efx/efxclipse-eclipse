/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substructure Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureSelector#getSelectorName <em>Selector Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureSelector#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getSubstructureSelector()
 * @model
 * @generated
 */
public interface SubstructureSelector extends EObject
{
  /**
   * Returns the value of the '<em><b>Selector Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector Name</em>' attribute.
   * @see #setSelectorName(String)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getSubstructureSelector_SelectorName()
   * @model
   * @generated
   */
  String getSelectorName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureSelector#getSelectorName <em>Selector Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector Name</em>' attribute.
   * @see #getSelectorName()
   * @generated
   */
  void setSelectorName(String value);

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
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getSubstructureSelector_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureSelector#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

} // SubstructureSelector
