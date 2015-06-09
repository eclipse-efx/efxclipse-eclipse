/**
 */
package org.eclipse.fx.ide.css.cssDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.page#getPseudoPage <em>Pseudo Page</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.page#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getpage()
 * @model
 * @generated
 */
public interface page extends EObject
{
  /**
   * Returns the value of the '<em><b>Pseudo Page</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseudo Page</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudo Page</em>' attribute.
   * @see #setPseudoPage(String)
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getpage_PseudoPage()
   * @model
   * @generated
   */
  String getPseudoPage();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.page#getPseudoPage <em>Pseudo Page</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pseudo Page</em>' attribute.
   * @see #getPseudoPage()
   * @generated
   */
  void setPseudoPage(String value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssDsl.css_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getpage_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<css_declaration> getDeclarations();

} // page
