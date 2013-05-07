/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substructure Styleclass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass#getDoku <em>Doku</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass#getChilds <em>Childs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getSubstructureStyleclass()
 * @model
 * @generated
 */
public interface SubstructureStyleclass extends EObject
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
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getSubstructureStyleclass_Doku()
   * @model containment="true"
   * @generated
   */
  Doku getDoku();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass#getDoku <em>Doku</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doku</em>' containment reference.
   * @see #getDoku()
   * @generated
   */
  void setDoku(Doku value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(ElementDefinition)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getSubstructureStyleclass_Element()
   * @model
   * @generated
   */
  ElementDefinition getElement();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(ElementDefinition value);

  /**
   * Returns the value of the '<em><b>Selectors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureSelector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectors</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getSubstructureStyleclass_Selectors()
   * @model containment="true"
   * @generated
   */
  EList<SubstructureSelector> getSelectors();

  /**
   * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.SubstructureStyleclass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Childs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Childs</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getSubstructureStyleclass_Childs()
   * @model containment="true"
   * @generated
   */
  EList<SubstructureStyleclass> getChilds();

} // SubstructureStyleclass
