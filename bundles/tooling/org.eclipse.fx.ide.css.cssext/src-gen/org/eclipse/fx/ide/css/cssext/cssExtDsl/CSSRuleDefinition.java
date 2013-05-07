/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Rule Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleDefinition()
 * @model
 * @generated
 */
public interface CSSRuleDefinition extends Definition
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(CSSRule)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleDefinition_Func()
   * @model containment="true"
   * @generated
   */
  CSSRule getFunc();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(CSSRule value);

} // CSSRuleDefinition
