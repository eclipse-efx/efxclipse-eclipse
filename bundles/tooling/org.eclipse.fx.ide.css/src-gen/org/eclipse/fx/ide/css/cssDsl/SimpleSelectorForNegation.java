/**
 */
package org.eclipse.fx.ide.css.cssDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Selector For Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getUniversal <em>Universal</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getSubSelectors <em>Sub Selectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getSimpleSelectorForNegation()
 * @model
 * @generated
 */
public interface SimpleSelectorForNegation extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(ElementSelector)
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getSimpleSelectorForNegation_Element()
   * @model containment="true"
   * @generated
   */
  ElementSelector getElement();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(ElementSelector value);

  /**
   * Returns the value of the '<em><b>Universal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Universal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Universal</em>' containment reference.
   * @see #setUniversal(UniversalSelector)
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getSimpleSelectorForNegation_Universal()
   * @model containment="true"
   * @generated
   */
  UniversalSelector getUniversal();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssDsl.SimpleSelectorForNegation#getUniversal <em>Universal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Universal</em>' containment reference.
   * @see #getUniversal()
   * @generated
   */
  void setUniversal(UniversalSelector value);

  /**
   * Returns the value of the '<em><b>Sub Selectors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssDsl.CssSelector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Selectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Selectors</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssDsl.CssDslPackage#getSimpleSelectorForNegation_SubSelectors()
   * @model containment="true"
   * @generated
   */
  EList<CssSelector> getSubSelectors();

} // SimpleSelectorForNegation
