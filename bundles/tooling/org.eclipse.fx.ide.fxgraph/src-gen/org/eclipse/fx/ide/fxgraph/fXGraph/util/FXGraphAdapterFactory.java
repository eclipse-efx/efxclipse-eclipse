/**
 */
package org.eclipse.fx.ide.fxgraph.fXGraph.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fx.ide.fxgraph.fXGraph.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fx.ide.fxgraph.fXGraph.FXGraphPackage
 * @generated
 */
public class FXGraphAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FXGraphPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXGraphAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FXGraphPackage.eINSTANCE;
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
  protected FXGraphSwitch<Adapter> modelSwitch =
    new FXGraphSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseComponentDefinition(ComponentDefinition object)
      {
        return createComponentDefinitionAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseDefine(Define object)
      {
        return createDefineAdapter();
      }
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseStaticCallValueProperty(StaticCallValueProperty object)
      {
        return createStaticCallValuePropertyAdapter();
      }
      @Override
      public Adapter caseStaticValueProperty(StaticValueProperty object)
      {
        return createStaticValuePropertyAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseValueProperty(ValueProperty object)
      {
        return createValuePropertyAdapter();
      }
      @Override
      public Adapter caseSingleValueProperty(SingleValueProperty object)
      {
        return createSingleValuePropertyAdapter();
      }
      @Override
      public Adapter caseMultiValueProperty(MultiValueProperty object)
      {
        return createMultiValuePropertyAdapter();
      }
      @Override
      public Adapter caseFactoryValueElement(FactoryValueElement object)
      {
        return createFactoryValueElementAdapter();
      }
      @Override
      public Adapter caseListValueElement(ListValueElement object)
      {
        return createListValueElementAdapter();
      }
      @Override
      public Adapter caseListValueProperty(ListValueProperty object)
      {
        return createListValuePropertyAdapter();
      }
      @Override
      public Adapter caseMapValueProperty(MapValueProperty object)
      {
        return createMapValuePropertyAdapter();
      }
      @Override
      public Adapter caseSimpleValueProperty(SimpleValueProperty object)
      {
        return createSimpleValuePropertyAdapter();
      }
      @Override
      public Adapter caseConstValueProperty(ConstValueProperty object)
      {
        return createConstValuePropertyAdapter();
      }
      @Override
      public Adapter caseReferenceType(ReferenceType object)
      {
        return createReferenceTypeAdapter();
      }
      @Override
      public Adapter caseReferenceValueProperty(ReferenceValueProperty object)
      {
        return createReferenceValuePropertyAdapter();
      }
      @Override
      public Adapter caseIncludeValueProperty(IncludeValueProperty object)
      {
        return createIncludeValuePropertyAdapter();
      }
      @Override
      public Adapter caseCopyValueProperty(CopyValueProperty object)
      {
        return createCopyValuePropertyAdapter();
      }
      @Override
      public Adapter caseControllerHandledValueProperty(ControllerHandledValueProperty object)
      {
        return createControllerHandledValuePropertyAdapter();
      }
      @Override
      public Adapter caseScriptHandlerHandledValueProperty(ScriptHandlerHandledValueProperty object)
      {
        return createScriptHandlerHandledValuePropertyAdapter();
      }
      @Override
      public Adapter caseScriptValueExpression(ScriptValueExpression object)
      {
        return createScriptValueExpressionAdapter();
      }
      @Override
      public Adapter caseScriptValueReference(ScriptValueReference object)
      {
        return createScriptValueReferenceAdapter();
      }
      @Override
      public Adapter caseLocationValueProperty(LocationValueProperty object)
      {
        return createLocationValuePropertyAdapter();
      }
      @Override
      public Adapter caseResourceValueProperty(ResourceValueProperty object)
      {
        return createResourceValuePropertyAdapter();
      }
      @Override
      public Adapter caseBindValueProperty(BindValueProperty object)
      {
        return createBindValuePropertyAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
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
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition <em>Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ComponentDefinition
   * @generated
   */
  public Adapter createComponentDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Define
   * @generated
   */
  public Adapter createDefineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty <em>Static Call Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticCallValueProperty
   * @generated
   */
  public Adapter createStaticCallValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty <em>Static Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StaticValueProperty
   * @generated
   */
  public Adapter createStaticValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ValueProperty <em>Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ValueProperty
   * @generated
   */
  public Adapter createValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SingleValueProperty <em>Single Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.SingleValueProperty
   * @generated
   */
  public Adapter createSingleValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.MultiValueProperty <em>Multi Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.MultiValueProperty
   * @generated
   */
  public Adapter createMultiValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.FactoryValueElement <em>Factory Value Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.FactoryValueElement
   * @generated
   */
  public Adapter createFactoryValueElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ListValueElement <em>List Value Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ListValueElement
   * @generated
   */
  public Adapter createListValueElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty <em>List Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ListValueProperty
   * @generated
   */
  public Adapter createListValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty <em>Map Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.MapValueProperty
   * @generated
   */
  public Adapter createMapValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty <em>Simple Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.SimpleValueProperty
   * @generated
   */
  public Adapter createSimpleValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty <em>Const Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ConstValueProperty
   * @generated
   */
  public Adapter createConstValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceType
   * @generated
   */
  public Adapter createReferenceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty <em>Reference Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ReferenceValueProperty
   * @generated
   */
  public Adapter createReferenceValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty <em>Include Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.IncludeValueProperty
   * @generated
   */
  public Adapter createIncludeValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.CopyValueProperty <em>Copy Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.CopyValueProperty
   * @generated
   */
  public Adapter createCopyValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty <em>Controller Handled Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ControllerHandledValueProperty
   * @generated
   */
  public Adapter createControllerHandledValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptHandlerHandledValueProperty <em>Script Handler Handled Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ScriptHandlerHandledValueProperty
   * @generated
   */
  public Adapter createScriptHandlerHandledValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueExpression <em>Script Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueExpression
   * @generated
   */
  public Adapter createScriptValueExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueReference <em>Script Value Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ScriptValueReference
   * @generated
   */
  public Adapter createScriptValueReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.LocationValueProperty <em>Location Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.LocationValueProperty
   * @generated
   */
  public Adapter createLocationValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty <em>Resource Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.ResourceValueProperty
   * @generated
   */
  public Adapter createResourceValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty <em>Bind Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.BindValueProperty
   * @generated
   */
  public Adapter createBindValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.fx.ide.fxgraph.fXGraph.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.fx.ide.fxgraph.fXGraph.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
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

} //FXGraphAdapterFactory
