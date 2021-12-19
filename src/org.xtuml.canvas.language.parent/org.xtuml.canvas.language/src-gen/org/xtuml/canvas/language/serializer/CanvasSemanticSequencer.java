/*
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtuml.canvas.language.canvas.Anchors;
import org.xtuml.canvas.language.canvas.CanvasPackage;
import org.xtuml.canvas.language.canvas.Connector;
import org.xtuml.canvas.language.canvas.ConnectorAnchorElement;
import org.xtuml.canvas.language.canvas.Connectors;
import org.xtuml.canvas.language.canvas.EndAnchor;
import org.xtuml.canvas.language.canvas.EnumEnd;
import org.xtuml.canvas.language.canvas.FloatingText;
import org.xtuml.canvas.language.canvas.FloatingTexts;
import org.xtuml.canvas.language.canvas.Model;
import org.xtuml.canvas.language.canvas.ModelProperties;
import org.xtuml.canvas.language.canvas.ModelRender;
import org.xtuml.canvas.language.canvas.Point;
import org.xtuml.canvas.language.canvas.PointDefinition;
import org.xtuml.canvas.language.canvas.Polyline;
import org.xtuml.canvas.language.canvas.Rectangle;
import org.xtuml.canvas.language.canvas.Segment;
import org.xtuml.canvas.language.canvas.Shape;
import org.xtuml.canvas.language.canvas.ShapeAnchorElement;
import org.xtuml.canvas.language.canvas.Shapes;
import org.xtuml.canvas.language.canvas.StartAnchor;
import org.xtuml.canvas.language.services.CanvasGrammarAccess;

@SuppressWarnings("all")
public class CanvasSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CanvasGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CanvasPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CanvasPackage.ANCHORS:
				sequence_Anchors(context, (Anchors) semanticObject); 
				return; 
			case CanvasPackage.CONNECTOR:
				sequence_Connector(context, (Connector) semanticObject); 
				return; 
			case CanvasPackage.CONNECTOR_ANCHOR_ELEMENT:
				sequence_ConnectorAnchorElement(context, (ConnectorAnchorElement) semanticObject); 
				return; 
			case CanvasPackage.CONNECTORS:
				sequence_Connectors(context, (Connectors) semanticObject); 
				return; 
			case CanvasPackage.END_ANCHOR:
				sequence_EndAnchor(context, (EndAnchor) semanticObject); 
				return; 
			case CanvasPackage.ENUM_END:
				sequence_EnumEnd(context, (EnumEnd) semanticObject); 
				return; 
			case CanvasPackage.FLOATING_TEXT:
				sequence_FloatingText(context, (FloatingText) semanticObject); 
				return; 
			case CanvasPackage.FLOATING_TEXTS:
				sequence_FloatingTexts(context, (FloatingTexts) semanticObject); 
				return; 
			case CanvasPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case CanvasPackage.MODEL_PROPERTIES:
				sequence_ModelProperties(context, (ModelProperties) semanticObject); 
				return; 
			case CanvasPackage.MODEL_RENDER:
				sequence_ModelRender(context, (ModelRender) semanticObject); 
				return; 
			case CanvasPackage.POINT:
				sequence_Point(context, (Point) semanticObject); 
				return; 
			case CanvasPackage.POINT_DEFINITION:
				sequence_PointDefinition(context, (PointDefinition) semanticObject); 
				return; 
			case CanvasPackage.POLYLINE:
				sequence_Polyline(context, (Polyline) semanticObject); 
				return; 
			case CanvasPackage.RECTANGLE:
				sequence_Rectangle(context, (Rectangle) semanticObject); 
				return; 
			case CanvasPackage.SEGMENT:
				sequence_Segment(context, (Segment) semanticObject); 
				return; 
			case CanvasPackage.SHAPE:
				sequence_Shape(context, (Shape) semanticObject); 
				return; 
			case CanvasPackage.SHAPE_ANCHOR_ELEMENT:
				sequence_ShapeAnchorElement(context, (ShapeAnchorElement) semanticObject); 
				return; 
			case CanvasPackage.SHAPES:
				sequence_Shapes(context, (Shapes) semanticObject); 
				return; 
			case CanvasPackage.START_ANCHOR:
				sequence_StartAnchor(context, (StartAnchor) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Anchors returns Anchors
	 *
	 * Constraint:
	 *     (startAnchor=StartAnchor endAnchor=EndAnchor)
	 */
	protected void sequence_Anchors(ISerializationContext context, Anchors semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.ANCHORS__START_ANCHOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.ANCHORS__START_ANCHOR));
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.ANCHORS__END_ANCHOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.ANCHORS__END_ANCHOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnchorsAccess().getStartAnchorStartAnchorParserRuleCall_1_0(), semanticObject.getStartAnchor());
		feeder.accept(grammarAccess.getAnchorsAccess().getEndAnchorEndAnchorParserRuleCall_2_0(), semanticObject.getEndAnchor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Anchor returns ConnectorAnchorElement
	 *     ConnectorAnchorElement returns ConnectorAnchorElement
	 *
	 * Constraint:
	 *     element=[Connector|ID]
	 */
	protected void sequence_ConnectorAnchorElement(ISerializationContext context, ConnectorAnchorElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.CONNECTOR_ANCHOR_ELEMENT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.CONNECTOR_ANCHOR_ELEMENT__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConnectorAnchorElementAccess().getElementConnectorIDTerminalRuleCall_1_0_1(), semanticObject.eGet(CanvasPackage.Literals.CONNECTOR_ANCHOR_ELEMENT__ELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Connector
	 *
	 * Constraint:
	 *     (name=ID represents=STRING polyline=Polyline anchors=Anchors? texts=FloatingTexts)
	 */
	protected void sequence_Connector(ISerializationContext context, Connector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GraphicalElement returns Connectors
	 *     Connectors returns Connectors
	 *
	 * Constraint:
	 *     connectors+=Connector*
	 */
	protected void sequence_Connectors(ISerializationContext context, Connectors semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EndAnchor returns EndAnchor
	 *
	 * Constraint:
	 *     (point=PointDefinition anchor=Anchor?)
	 */
	protected void sequence_EndAnchor(ISerializationContext context, EndAnchor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumEnd returns EnumEnd
	 *
	 * Constraint:
	 *     (
	 *         where='start' | 
	 *         where='end' | 
	 *         where='middle' | 
	 *         where='end_fixed' | 
	 *         where='start_fixed' | 
	 *         where='none' | 
	 *         where='floating' | 
	 *         where='additional'
	 *     )
	 */
	protected void sequence_EnumEnd(ISerializationContext context, EnumEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FloatingText returns FloatingText
	 *
	 * Constraint:
	 *     (rect=Rectangle end=EnumEnd)
	 */
	protected void sequence_FloatingText(ISerializationContext context, FloatingText semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.FLOATING_TEXT__RECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.FLOATING_TEXT__RECT));
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.FLOATING_TEXT__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.FLOATING_TEXT__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatingTextAccess().getRectRectangleParserRuleCall_2_0(), semanticObject.getRect());
		feeder.accept(grammarAccess.getFloatingTextAccess().getEndEnumEndParserRuleCall_3_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FloatingTexts returns FloatingTexts
	 *
	 * Constraint:
	 *     texts+=FloatingText*
	 */
	protected void sequence_FloatingTexts(ISerializationContext context, FloatingTexts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelProperties returns ModelProperties
	 *
	 * Constraint:
	 *     (point=Point zoom=INT)
	 */
	protected void sequence_ModelProperties(ISerializationContext context, ModelProperties semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.MODEL_PROPERTIES__POINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.MODEL_PROPERTIES__POINT));
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.MODEL_PROPERTIES__ZOOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.MODEL_PROPERTIES__ZOOM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelPropertiesAccess().getPointPointParserRuleCall_2_0(), semanticObject.getPoint());
		feeder.accept(grammarAccess.getModelPropertiesAccess().getZoomINTTerminalRuleCall_4_0(), semanticObject.getZoom());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelRender returns ModelRender
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_ModelRender(ISerializationContext context, ModelRender semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.MODEL_RENDER__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.MODEL_RENDER__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelRenderAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (render=ModelRender properties=ModelProperties? elements+=GraphicalElement*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PointDefinition returns PointDefinition
	 *
	 * Constraint:
	 *     (x=INT y=INT)
	 */
	protected void sequence_PointDefinition(ISerializationContext context, PointDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.POINT_DEFINITION__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.POINT_DEFINITION__X));
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.POINT_DEFINITION__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.POINT_DEFINITION__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPointDefinitionAccess().getXINTTerminalRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPointDefinitionAccess().getYINTTerminalRuleCall_4_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Point returns Point
	 *
	 * Constraint:
	 *     (x=INT y=INT)
	 */
	protected void sequence_Point(ISerializationContext context, Point semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.POINT__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.POINT__X));
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.POINT__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.POINT__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPointAccess().getXINTTerminalRuleCall_1_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getPointAccess().getYINTTerminalRuleCall_3_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Polyline returns Polyline
	 *
	 * Constraint:
	 *     segments+=Segment*
	 */
	protected void sequence_Polyline(ISerializationContext context, Polyline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rectangle returns Rectangle
	 *
	 * Constraint:
	 *     (x=INT y=INT w=INT h=INT)
	 */
	protected void sequence_Rectangle(ISerializationContext context, Rectangle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.RECTANGLE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.RECTANGLE__X));
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.RECTANGLE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.RECTANGLE__Y));
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.RECTANGLE__W) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.RECTANGLE__W));
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.RECTANGLE__H) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.RECTANGLE__H));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRectangleAccess().getXINTTerminalRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getRectangleAccess().getYINTTerminalRuleCall_4_0(), semanticObject.getY());
		feeder.accept(grammarAccess.getRectangleAccess().getWINTTerminalRuleCall_6_0(), semanticObject.getW());
		feeder.accept(grammarAccess.getRectangleAccess().getHINTTerminalRuleCall_8_0(), semanticObject.getH());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Segment returns Segment
	 *
	 * Constraint:
	 *     (startPoint=Point endPoint=Point)
	 */
	protected void sequence_Segment(ISerializationContext context, Segment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.SEGMENT__START_POINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.SEGMENT__START_POINT));
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.SEGMENT__END_POINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.SEGMENT__END_POINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSegmentAccess().getStartPointPointParserRuleCall_2_0(), semanticObject.getStartPoint());
		feeder.accept(grammarAccess.getSegmentAccess().getEndPointPointParserRuleCall_4_0(), semanticObject.getEndPoint());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Anchor returns ShapeAnchorElement
	 *     ShapeAnchorElement returns ShapeAnchorElement
	 *
	 * Constraint:
	 *     element=[Shape|ID]
	 */
	protected void sequence_ShapeAnchorElement(ISerializationContext context, ShapeAnchorElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CanvasPackage.Literals.SHAPE_ANCHOR_ELEMENT__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CanvasPackage.Literals.SHAPE_ANCHOR_ELEMENT__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShapeAnchorElementAccess().getElementShapeIDTerminalRuleCall_1_0_1(), semanticObject.eGet(CanvasPackage.Literals.SHAPE_ANCHOR_ELEMENT__ELEMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Shape returns Shape
	 *
	 * Constraint:
	 *     (name=ID container=Container? represents=STRING rect=Rectangle text=FloatingText?)
	 */
	protected void sequence_Shape(ISerializationContext context, Shape semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GraphicalElement returns Shapes
	 *     Shapes returns Shapes
	 *
	 * Constraint:
	 *     shapes+=Shape*
	 */
	protected void sequence_Shapes(ISerializationContext context, Shapes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StartAnchor returns StartAnchor
	 *
	 * Constraint:
	 *     (point=PointDefinition anchor=Anchor?)
	 */
	protected void sequence_StartAnchor(ISerializationContext context, StartAnchor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
