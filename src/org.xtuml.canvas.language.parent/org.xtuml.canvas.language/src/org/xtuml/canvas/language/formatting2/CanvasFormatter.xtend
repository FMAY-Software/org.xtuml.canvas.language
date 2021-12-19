/*
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.formatting2

import com.google.inject.Inject
import org.xtuml.canvas.language.canvas.Model
import org.xtuml.canvas.language.services.CanvasGrammarAccess
import org.xtuml.canvas.language.canvas.Shape
import org.xtuml.canvas.language.canvas.GraphicalElement
import org.xtuml.canvas.language.canvas.Connectors
import org.xtuml.canvas.language.canvas.Connector
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.emf.common.util.EList
import org.xtuml.canvas.language.canvas.Shapes
import org.xtuml.canvas.language.canvas.ModelProperties
import org.xtuml.canvas.language.canvas.Polyline
import org.xtuml.canvas.language.canvas.Segment
import org.xtuml.canvas.language.canvas.Anchors
import org.xtuml.canvas.language.canvas.FloatingTexts
import org.xtuml.canvas.language.canvas.StartAnchor
import org.xtuml.canvas.language.canvas.EndAnchor
import org.xtuml.canvas.language.canvas.FloatingText

class CanvasFormatter extends AbstractFormatter2 {

	@Inject extension CanvasGrammarAccess

	def dispatch void format(Model it, extension IFormattableDocument document) {
		formatShapes(document)
	}

	// TODO: implement for Shapes, Shape, FloatingTexts, FloatingText, ShapeProps, Connectors, Connector, Anchors, StartAnchor, EndAnchor, ConnectorProps, Polyline, Segment
	def void formatShapes(Model it, extension IFormattableDocument document) {
//		allRegionsFor.keywords("import", "properties:", "viewport", "shapes:", "shape:", "connectors:", "connector:",
//			"render:", "rectangle:", "polyline:", "segment:", "point:", "text:", "texts:", "zoom:", "shapeAnchor:",
//			"anchors:", "start:", "end:", "where:").forEach[append[newLine]]
//		allRegionsFor.keywords("import", "properties:", "viewport", "shapes:", "shape:", "connectors:", "connector:",
//			"render:", "rectangle:", "polyline:", "segment:", "point:", "text:", "texts:", "zoom:", "shapeAnchor:",
//			"anchors:", "start:", "end:", "where:").forEach[prepend[newLine]]
		allRegionsFor.keyword("properties:").prepend[newLines = 2]
		allRegionsFor.keyword("shapes:").prepend[newLines = 2]
		allRegionsFor.keyword("connectors:").prepend[newLines = 2]
		regionFor.keyword("render:").prepend[newLines = 2]
		format(it.properties, document)
		it.elements.forEach[format]
	}

	def void format(ModelProperties it, extension IFormattableDocument document) {
		regionFor.keyword("viewport:").prepend[space = '\n    ']
		regionFor.keyword("zoom:").prepend[space = '\n    ']
	}
	
	def void format(GraphicalElement element, extension IFormattableDocument document) {
		if(element instanceof Shapes) {
			(element as Shapes).shapes.forEach[format]
		}
		if(element instanceof Connectors) {
			(element as Connectors).connectors.forEach[format]
		}
	}

	def dispatch void format(Shape it, extension IFormattableDocument document) {
		regionFor.keyword("shape:").prepend[space = '\n    ']
		regionFor.keyword("render:").prepend[space = '\n        ']
		it.rect.regionFor.keyword("rectangle:").prepend[space = '\n        ']
		it.text.regionFor.keyword("text:").prepend[space = '\n        ']
	}

	def dispatch void format(Connector it, extension IFormattableDocument document) {
		regionFor.keyword("connector:").prepend[space = '\n    ']
		regionFor.keyword("render:").prepend[space = '\n        ']
		it.polyline.format
		it.anchors.format
		it.texts.format
	}
	
	def dispatch void format(Polyline it, extension IFormattableDocument document) {
		regionFor.keyword("polyline:").prepend[space = '\n        ']
		it.segments.forEach[format]
	}
	
	def dispatch void format(Segment it, extension IFormattableDocument document) {
		regionFor.keyword("segment:").prepend[space = '\n            ']
	}
	
	def dispatch void format(Anchors it, extension IFormattableDocument document) {
		regionFor.keyword("anchors:").prepend[space = '\n        ']
		it.startAnchor.format
		it.endAnchor.format
	}
	
	def dispatch void format(StartAnchor it, extension IFormattableDocument document) {
		regionFor.keyword("start:").prepend[space = '\n            ']
	}
	
	def dispatch void format(EndAnchor it, extension IFormattableDocument document) {
		regionFor.keyword("end:").prepend[space = '\n            ']
	}
	
	def dispatch void format(FloatingTexts it, extension IFormattableDocument document) {
		regionFor.keyword("texts:").prepend[space = '\n        ']
		it.texts.forEach[format]
	}
	
	def dispatch void format(FloatingText it, extension IFormattableDocument document) {
		regionFor.keyword("text:").prepend[space = '\n            ']
	}
}
