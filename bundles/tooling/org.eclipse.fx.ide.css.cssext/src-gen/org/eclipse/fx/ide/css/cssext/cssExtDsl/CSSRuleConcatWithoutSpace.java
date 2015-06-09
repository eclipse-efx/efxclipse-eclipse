/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Rule Concat Without Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleConcatWithoutSpace#getConc <em>Conc</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleConcatWithoutSpace()
 * @model
 * @generated
 */
public interface CSSRuleConcatWithoutSpace extends CSSRule
{
  /**
   * Returns the value of the '<em><b>Conc</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conc</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conc</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getCSSRuleConcatWithoutSpace_Conc()
   * @model containment="true"
   * @generated
   */
  EList<CSSRule> getConc();

} // CSSRuleConcatWithoutSpace
