/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GDomain Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainMap#getBuiltIn <em>Built In</em>}</li>
 *   <li>{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainMap#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainMap()
 * @model
 * @generated
 */
public interface GDomainMap extends EObject
{
  /**
   * Returns the value of the '<em><b>Built In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Built In</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Built In</em>' attribute.
   * @see #setBuiltIn(String)
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainMap_BuiltIn()
   * @model
   * @generated
   */
  String getBuiltIn();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainMap#getBuiltIn <em>Built In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Built In</em>' attribute.
   * @see #getBuiltIn()
   * @generated
   */
  void setBuiltIn(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(GDomainElement)
   * @see org.eclipse.fx.ide.gmodel.gModelDSL.GModelDSLPackage#getGDomainMap_Ref()
   * @model
   * @generated
   */
  GDomainElement getRef();

  /**
   * Sets the value of the '{@link org.eclipse.fx.ide.gmodel.gModelDSL.GDomainMap#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(GDomainElement value);

} // GDomainMap
