/**
 */
package org.eclipse.fx.ide.css.cssDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>css declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.css_declaration#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.css_declaration#getValueTokens <em>Value Tokens</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.css_declaration#isImportant <em>Important</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getcss_declaration()
 * @model
 * @generated
 */
public interface css_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(css_property)
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getcss_declaration_Property()
   * @model containment="true"
   * @generated
   */
  css_property getProperty();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.css_declaration#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(css_property value);

  /**
   * Returns the value of the '<em><b>Value Tokens</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssDsl.CssTok}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Tokens</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Tokens</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getcss_declaration_ValueTokens()
   * @model containment="true"
   * @generated
   */
  EList<CssTok> getValueTokens();

  /**
   * Returns the value of the '<em><b>Important</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Important</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Important</em>' attribute.
   * @see #setImportant(boolean)
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getcss_declaration_Important()
   * @model
   * @generated
   */
  boolean isImportant();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.css_declaration#isImportant <em>Important</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Important</em>' attribute.
   * @see #isImportant()
   * @generated
   */
  void setImportant(boolean value);

} // css_declaration
