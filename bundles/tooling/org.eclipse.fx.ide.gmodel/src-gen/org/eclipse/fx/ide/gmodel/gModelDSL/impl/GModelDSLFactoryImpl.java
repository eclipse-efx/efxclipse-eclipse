/**
 */
package org.eclipse.fx.ide.gmodel.gModelDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fx.ide.gmodel.gModelDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GModelDSLFactoryImpl extends EFactoryImpl implements GModelDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GModelDSLFactory init()
  {
    try
    {
      GModelDSLFactory theGModelDSLFactory = (GModelDSLFactory)EPackage.Registry.INSTANCE.getEFactory(GModelDSLPackage.eNS_URI);
      if (theGModelDSLFactory != null)
      {
        return theGModelDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GModelDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GModelDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GModelDSLPackage.GMODEL: return createGModel();
      case GModelDSLPackage.GDOMAIN_ELEMENT: return createGDomainElement();
      case GModelDSLPackage.GDOMAIN_MAP: return createGDomainMap();
      case GModelDSLPackage.GDOMAIN_PROPERTY: return createGDomainProperty();
      case GModelDSLPackage.GDEFAULT: return createGDefault();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GModel createGModel()
  {
    GModelImpl gModel = new GModelImpl();
    return gModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GDomainElement createGDomainElement()
  {
    GDomainElementImpl gDomainElement = new GDomainElementImpl();
    return gDomainElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GDomainMap createGDomainMap()
  {
    GDomainMapImpl gDomainMap = new GDomainMapImpl();
    return gDomainMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GDomainProperty createGDomainProperty()
  {
    GDomainPropertyImpl gDomainProperty = new GDomainPropertyImpl();
    return gDomainProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GDefault createGDefault()
  {
    GDefaultImpl gDefault = new GDefaultImpl();
    return gDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GModelDSLPackage getGModelDSLPackage()
  {
    return (GModelDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GModelDSLPackage getPackage()
  {
    return GModelDSLPackage.eINSTANCE;
  }

} //GModelDSLFactoryImpl
