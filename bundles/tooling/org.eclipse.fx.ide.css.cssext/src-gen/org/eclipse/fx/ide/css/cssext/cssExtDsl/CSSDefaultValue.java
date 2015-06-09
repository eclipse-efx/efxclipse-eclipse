/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue#getVal <em>Val</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue#getIval <em>Ival</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue#getDval <em>Dval</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue#getSval <em>Sval</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSDefaultValue()
 * @model
 * @generated
 */
public interface CSSDefaultValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(CSSRule)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSDefaultValue_Val()
   * @model containment="true"
   * @generated
   */
  CSSRule getVal();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(CSSRule value);

  /**
   * Returns the value of the '<em><b>Ival</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ival</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ival</em>' attribute.
   * @see #setIval(int)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSDefaultValue_Ival()
   * @model
   * @generated
   */
  int getIval();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue#getIval <em>Ival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ival</em>' attribute.
   * @see #getIval()
   * @generated
   */
  void setIval(int value);

  /**
   * Returns the value of the '<em><b>Dval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dval</em>' attribute.
   * @see #setDval(double)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSDefaultValue_Dval()
   * @model
   * @generated
   */
  double getDval();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue#getDval <em>Dval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dval</em>' attribute.
   * @see #getDval()
   * @generated
   */
  void setDval(double value);

  /**
   * Returns the value of the '<em><b>Sval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sval</em>' attribute.
   * @see #setSval(String)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSDefaultValue_Sval()
   * @model
   * @generated
   */
  String getSval();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSDefaultValue#getSval <em>Sval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sval</em>' attribute.
   * @see #getSval()
   * @generated
   */
  void setSval(String value);

} // CSSDefaultValue
