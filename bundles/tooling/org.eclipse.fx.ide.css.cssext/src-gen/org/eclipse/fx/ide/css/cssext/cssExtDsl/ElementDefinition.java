/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition#getDoku <em>Doku</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition#getSuper <em>Super</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition#getStyleclass <em>Styleclass</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition#getPseudoClasses <em>Pseudo Classes</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition#getSubstructures <em>Substructures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getElementDefinition()
 * @model
 * @generated
 */
public interface ElementDefinition extends EObject
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
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getElementDefinition_Doku()
   * @model containment="true"
   * @generated
   */
  Doku getDoku();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition#getDoku <em>Doku</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doku</em>' containment reference.
   * @see #getDoku()
   * @generated
   */
  void setDoku(Doku value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getElementDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super</em>' reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getElementDefinition_Super()
   * @model
   * @generated
   */
  EList<ElementDefinition> getSuper();

  /**
   * Returns the value of the '<em><b>Styleclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Styleclass</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Styleclass</em>' attribute.
   * @see #setStyleclass(String)
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getElementDefinition_Styleclass()
   * @model
   * @generated
   */
  String getStyleclass();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition#getStyleclass <em>Styleclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Styleclass</em>' attribute.
   * @see #getStyleclass()
   * @generated
   */
  void setStyleclass(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getElementDefinition_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getProperties();

  /**
   * Returns the value of the '<em><b>Pseudo Classes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PseudoClassDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseudo Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudo Classes</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getElementDefinition_PseudoClasses()
   * @model containment="true"
   * @generated
   */
  EList<PseudoClassDefinition> getPseudoClasses();

  /**
   * Returns the value of the '<em><b>Substructures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.Substructure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Substructures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Substructures</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getElementDefinition_Substructures()
   * @model containment="true"
   * @generated
   */
  EList<Substructure> getSubstructures();

} // ElementDefinition
