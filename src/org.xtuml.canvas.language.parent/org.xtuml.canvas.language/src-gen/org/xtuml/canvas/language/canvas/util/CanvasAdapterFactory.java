/**
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.canvas.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtuml.canvas.language.canvas.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtuml.canvas.language.canvas.CanvasPackage
 * @generated
 */
public class CanvasAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CanvasPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CanvasAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CanvasPackage.eINSTANCE;
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
  protected CanvasSwitch<Adapter> modelSwitch =
    new CanvasSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseSemanticModel(SemanticModel object)
      {
        return createSemanticModelAdapter();
      }
      @Override
      public Adapter caseModelProperties(ModelProperties object)
      {
        return createModelPropertiesAdapter();
      }
      @Override
      public Adapter caseGraphicalElement(GraphicalElement object)
      {
        return createGraphicalElementAdapter();
      }
      @Override
      public Adapter caseShapes(Shapes object)
      {
        return createShapesAdapter();
      }
      @Override
      public Adapter caseShape(Shape object)
      {
        return createShapeAdapter();
      }
      @Override
      public Adapter caseFloatingTexts(FloatingTexts object)
      {
        return createFloatingTextsAdapter();
      }
      @Override
      public Adapter caseFloatingText(FloatingText object)
      {
        return createFloatingTextAdapter();
      }
      @Override
      public Adapter caseShapeProps(ShapeProps object)
      {
        return createShapePropsAdapter();
      }
      @Override
      public Adapter caseContainer(Container object)
      {
        return createContainerAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseConnectors(Connectors object)
      {
        return createConnectorsAdapter();
      }
      @Override
      public Adapter caseConnector(Connector object)
      {
        return createConnectorAdapter();
      }
      @Override
      public Adapter caseAnchors(Anchors object)
      {
        return createAnchorsAdapter();
      }
      @Override
      public Adapter caseStartAnchor(StartAnchor object)
      {
        return createStartAnchorAdapter();
      }
      @Override
      public Adapter caseEndAnchor(EndAnchor object)
      {
        return createEndAnchorAdapter();
      }
      @Override
      public Adapter caseAnchor(Anchor object)
      {
        return createAnchorAdapter();
      }
      @Override
      public Adapter caseShapeAnchorElement(ShapeAnchorElement object)
      {
        return createShapeAnchorElementAdapter();
      }
      @Override
      public Adapter caseConnectorAnchorElement(ConnectorAnchorElement object)
      {
        return createConnectorAnchorElementAdapter();
      }
      @Override
      public Adapter caseConnectorProps(ConnectorProps object)
      {
        return createConnectorPropsAdapter();
      }
      @Override
      public Adapter casePolyline(Polyline object)
      {
        return createPolylineAdapter();
      }
      @Override
      public Adapter caseSegment(Segment object)
      {
        return createSegmentAdapter();
      }
      @Override
      public Adapter casePoint(Point object)
      {
        return createPointAdapter();
      }
      @Override
      public Adapter caseRectangle(Rectangle object)
      {
        return createRectangleAdapter();
      }
      @Override
      public Adapter caseShapeContainer(ShapeContainer object)
      {
        return createShapeContainerAdapter();
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
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.SemanticModel <em>Semantic Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.SemanticModel
   * @generated
   */
  public Adapter createSemanticModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.ModelProperties <em>Model Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.ModelProperties
   * @generated
   */
  public Adapter createModelPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.GraphicalElement <em>Graphical Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.GraphicalElement
   * @generated
   */
  public Adapter createGraphicalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Shapes <em>Shapes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Shapes
   * @generated
   */
  public Adapter createShapesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Shape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Shape
   * @generated
   */
  public Adapter createShapeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.FloatingTexts <em>Floating Texts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.FloatingTexts
   * @generated
   */
  public Adapter createFloatingTextsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.FloatingText <em>Floating Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.FloatingText
   * @generated
   */
  public Adapter createFloatingTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.ShapeProps <em>Shape Props</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.ShapeProps
   * @generated
   */
  public Adapter createShapePropsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Container
   * @generated
   */
  public Adapter createContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Connectors <em>Connectors</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Connectors
   * @generated
   */
  public Adapter createConnectorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Connector
   * @generated
   */
  public Adapter createConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Anchors <em>Anchors</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Anchors
   * @generated
   */
  public Adapter createAnchorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.StartAnchor <em>Start Anchor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.StartAnchor
   * @generated
   */
  public Adapter createStartAnchorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.EndAnchor <em>End Anchor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.EndAnchor
   * @generated
   */
  public Adapter createEndAnchorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Anchor <em>Anchor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Anchor
   * @generated
   */
  public Adapter createAnchorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.ShapeAnchorElement <em>Shape Anchor Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.ShapeAnchorElement
   * @generated
   */
  public Adapter createShapeAnchorElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.ConnectorAnchorElement <em>Connector Anchor Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.ConnectorAnchorElement
   * @generated
   */
  public Adapter createConnectorAnchorElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.ConnectorProps <em>Connector Props</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.ConnectorProps
   * @generated
   */
  public Adapter createConnectorPropsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Polyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Polyline
   * @generated
   */
  public Adapter createPolylineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Segment <em>Segment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Segment
   * @generated
   */
  public Adapter createSegmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Point
   * @generated
   */
  public Adapter createPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.Rectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.Rectangle
   * @generated
   */
  public Adapter createRectangleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtuml.canvas.language.canvas.ShapeContainer <em>Shape Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtuml.canvas.language.canvas.ShapeContainer
   * @generated
   */
  public Adapter createShapeContainerAdapter()
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

} //CanvasAdapterFactory
