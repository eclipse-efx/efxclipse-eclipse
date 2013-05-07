/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Rule Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleOr#getOrs <em>Ors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleOr()
 * @model
 * @generated
 */
public interface CSSRuleOr extends CSSRule
{
  /**
   * Returns the value of the '<em><b>Ors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ors</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleOr_Ors()
   * @model containment="true"
   * @generated
   */
  EList<CSSRule> getOrs();

} // CSSRuleOr
