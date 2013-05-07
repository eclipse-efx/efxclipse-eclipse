/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Rule Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef#getDoku <em>Doku</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleRef()
 * @model
 * @generated
 */
public interface CSSRuleRef extends CSSRule
{
  /**
   * Returns the value of the '<em><b>Doku</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doku</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doku</em>' containment reference.
   * @see #setDoku(Doku)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleRef_Doku()
   * @model containment="true"
   * @generated
   */
  Doku getDoku();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef#getDoku <em>Doku</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doku</em>' containment reference.
   * @see #getDoku()
   * @generated
   */
  void setDoku(Doku value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Definition)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleRef_Ref()
   * @model
   * @generated
   */
  Definition getRef();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Definition value);

} // CSSRuleRef
