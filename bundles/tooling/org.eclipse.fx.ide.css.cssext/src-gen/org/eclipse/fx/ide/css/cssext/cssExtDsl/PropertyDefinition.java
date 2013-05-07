/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getPropertyDefinition()
 * @model
 * @generated
 */
public interface PropertyDefinition extends Definition
{
  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(CSSDefaultValue)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getPropertyDefinition_Default()
   * @model containment="true"
   * @generated
   */
  CSSDefaultValue getDefault();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(CSSDefaultValue value);

} // PropertyDefinition
