/**
 */
package org.eclipse.fx.ide.l10n.nLSDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fx.ide.l10n.nLSDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSDslPackage
 * @generated
 */
public class NLSDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NLSDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NLSDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = NLSDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NLSDslSwitch<Adapter> modelSwitch =
    new NLSDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseNLS(NLS object)
      {
        return createNLSAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseNLSBundle(NLSBundle object)
      {
        return createNLSBundleAdapter();
      }
      @Override
      public Adapter caseNLSFormatter(NLSFormatter object)
      {
        return createNLSFormatterAdapter();
      }
      @Override
      public Adapter caseMessageEntry(MessageEntry object)
      {
        return createMessageEntryAdapter();
      }
      @Override
      public Adapter caseMessageParam(MessageParam object)
      {
        return createMessageParamAdapter();
      }
      @Override
      public Adapter caseMessage(Message object)
      {
        return createMessageAdapter();
      }
      @Override
      public Adapter caseRichString(RichString object)
      {
        return createRichStringAdapter();
      }
      @Override
      public Adapter caseRichStringLiteral(RichStringLiteral object)
      {
        return createRichStringLiteralAdapter();
      }
      @Override
      public Adapter caseRichStringLiteralStart(RichStringLiteralStart object)
      {
        return createRichStringLiteralStartAdapter();
      }
      @Override
      public Adapter caseRichStringLiteralEnd(RichStringLiteralEnd object)
      {
        return createRichStringLiteralEndAdapter();
      }
      @Override
      public Adapter caseRichStringLiteralInbetween(RichStringLiteralInbetween object)
      {
        return createRichStringLiteralInbetweenAdapter();
      }
      @Override
      public Adapter caseRichVarPart(RichVarPart object)
      {
        return createRichVarPartAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLS <em>NLS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLS
   * @generated
   */
  public Adapter createNLSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle <em>NLS Bundle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSBundle
   * @generated
   */
  public Adapter createNLSBundleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter <em>NLS Formatter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.NLSFormatter
   * @generated
   */
  public Adapter createNLSFormatterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry <em>Message Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.MessageEntry
   * @generated
   */
  public Adapter createMessageEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.MessageParam <em>Message Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.MessageParam
   * @generated
   */
  public Adapter createMessageParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.Message
   * @generated
   */
  public Adapter createMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichString <em>Rich String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichString
   * @generated
   */
  public Adapter createRichStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteral <em>Rich String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteral
   * @generated
   */
  public Adapter createRichStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralStart <em>Rich String Literal Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralStart
   * @generated
   */
  public Adapter createRichStringLiteralStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralEnd <em>Rich String Literal End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralEnd
   * @generated
   */
  public Adapter createRichStringLiteralEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralInbetween <em>Rich String Literal Inbetween</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichStringLiteralInbetween
   * @generated
   */
  public Adapter createRichStringLiteralInbetweenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart <em>Rich Var Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.l10n.nLSDsl.RichVarPart
   * @generated
   */
  public Adapter createRichVarPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //NLSDslAdapterFactory
