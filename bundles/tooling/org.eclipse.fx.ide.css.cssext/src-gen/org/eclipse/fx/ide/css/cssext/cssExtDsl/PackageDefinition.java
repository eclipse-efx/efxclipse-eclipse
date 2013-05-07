/**
 */
package org.eclipse.fx.ide.css.cssext.cssExtDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition#getDoku <em>Doku</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition#getRules <em>Rules</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getPackageDefinition()
 * @model
 * @generated
 */
public interface PackageDefinition extends EObject
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
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getPackageDefinition_Doku()
   * @model containment="true"
   * @generated
   */
  Doku getDoku();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition#getDoku <em>Doku</em>}' containment reference.
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
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getPackageDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getPackageDefinition_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getRules();

  /**
   * Returns the value of the '<em><b>Subpackages</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.PackageDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subpackages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subpackages</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getPackageDefinition_Subpackages()
   * @model containment="true"
   * @generated
   */
  EList<PackageDefinition> getSubpackages();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtDslPackage#getPackageDefinition_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ElementDefinition> getElements();

} // PackageDefinition
