/**
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtuml.canvas.language.canvas.Anchors;
import org.xtuml.canvas.language.canvas.Bounds;
import org.xtuml.canvas.language.canvas.Connector;
import org.xtuml.canvas.language.canvas.Connectors;
import org.xtuml.canvas.language.canvas.EndAnchor;
import org.xtuml.canvas.language.canvas.FloatingText;
import org.xtuml.canvas.language.canvas.FloatingTexts;
import org.xtuml.canvas.language.canvas.GraphicalElement;
import org.xtuml.canvas.language.canvas.Model;
import org.xtuml.canvas.language.canvas.ModelProperties;
import org.xtuml.canvas.language.canvas.Point;
import org.xtuml.canvas.language.canvas.Polyline;
import org.xtuml.canvas.language.canvas.Segment;
import org.xtuml.canvas.language.canvas.Shape;
import org.xtuml.canvas.language.canvas.Shapes;
import org.xtuml.canvas.language.canvas.StartAnchor;
import org.xtuml.canvas.language.services.CanvasGrammarAccess;

@SuppressWarnings("all")
public class CanvasFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private CanvasGrammarAccess _canvasGrammarAccess;
  
  private int spacing = 2;
  
  private String whitespace = " ";
  
  protected void _format(final Model it, @Extension final IFormattableDocument document) {
    this.formatModel(it, document);
  }
  
  public void formatModel(final Model it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      it_1.setNewLines(2);
    };
    document.prepend(this.textRegionExtensions.allRegionsFor(it).keyword("properties"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it_1) -> {
      it_1.setNewLines(2);
    };
    document.prepend(this.textRegionExtensions.allRegionsFor(it).keyword("shapes"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it_1) -> {
      it_1.setNewLines(2);
    };
    document.prepend(this.textRegionExtensions.allRegionsFor(it).keyword("connectors"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it_1) -> {
      it_1.setNewLines(2);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("render"), _function_3);
    this.format(it.getProperties(), document);
    final Consumer<GraphicalElement> _function_4 = (GraphicalElement it_1) -> {
      document.<GraphicalElement>format(it_1);
    };
    it.getElements().forEach(_function_4);
  }
  
  private HashMap<Object, Object> calculated = CollectionLiterals.<Object, Object>newHashMap();
  
  public String getSpacing(final int level) {
    Object result = this.calculated.get(Integer.valueOf(level));
    if ((result == null)) {
      result = this.whitespace.repeat((this.spacing * level));
      this.calculated.put(Integer.valueOf(level), result);
    }
    return ((String) result);
  }
  
  public void format(final ModelProperties it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(1);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("viewport"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(1);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("zoom"), _function_1);
  }
  
  public void format(final GraphicalElement element, @Extension final IFormattableDocument document) {
    if ((element instanceof Shapes)) {
      final Consumer<Shape> _function = (Shape it) -> {
        document.<Shape>format(it);
      };
      ((Shapes) element).getShapes().forEach(_function);
    }
    if ((element instanceof Connectors)) {
      final Consumer<Connector> _function_1 = (Connector it) -> {
        document.<Connector>format(it);
      };
      ((Connectors) element).getConnectors().forEach(_function_1);
    }
  }
  
  protected void _format(final Shape it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(1);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("shape"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(2);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("render"), _function_1);
    this.format(it.getBounds(), 2, document);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(2);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it.getText()).keyword("text"), _function_2);
  }
  
  protected void _format(final Connector it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(1);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("connector"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(2);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("render"), _function_1);
    document.<Polyline>format(it.getPolyline());
    document.<Anchors>format(it.getAnchors());
    document.<FloatingTexts>format(it.getTexts());
  }
  
  protected void _format(final Polyline it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(2);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("polyline"), _function);
    final Consumer<Segment> _function_1 = (Segment it_1) -> {
      document.<Segment>format(it_1);
    };
    it.getSegments().forEach(_function_1);
  }
  
  protected void _format(final Segment it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(3);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("segment"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(4);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("start"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(4);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("end"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it_1) -> {
      it_1.setSpace("   ");
    };
    document.<Point>prepend(it.getEndPoint(), _function_3);
  }
  
  protected void _format(final Anchors it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(2);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("anchors"), _function);
    document.<StartAnchor>format(it.getStartAnchor());
    document.<EndAnchor>format(it.getEndAnchor());
  }
  
  protected void _format(final StartAnchor it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(3);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("start"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(4);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it.getPoint()).keyword("point"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(4);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it.getAnchor()).keyword("shape"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(4);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it.getAnchor()).keyword("connector"), _function_3);
  }
  
  protected void _format(final EndAnchor it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(3);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("end"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(4);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it.getPoint()).keyword("point"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(4);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it.getAnchor()).keyword("shape"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(4);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it.getAnchor()).keyword("connector"), _function_3);
  }
  
  protected void _format(final FloatingTexts it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(2);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("texts"), _function);
    final Consumer<FloatingText> _function_1 = (FloatingText it_1) -> {
      document.<FloatingText>format(it_1);
    };
    it.getTexts().forEach(_function_1);
  }
  
  protected void _format(final FloatingText it, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(3);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("text"), _function);
    this.format(it.getBounds(), 4, document);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(4);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("where"), _function_1);
  }
  
  protected void _format(final Bounds it, final int spacing, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it_1) -> {
      String _spacing = this.getSpacing(spacing);
      String _plus = ("\n" + _spacing);
      it_1.setSpace(_plus);
    };
    document.prepend(this.textRegionExtensions.regionFor(it).keyword("bounds"), _function);
  }
  
  public void format(final Object it, final IFormattableDocument document) {
    if (it instanceof XtextResource) {
      _format((XtextResource)it, document);
      return;
    } else if (it instanceof Anchors) {
      _format((Anchors)it, document);
      return;
    } else if (it instanceof Connector) {
      _format((Connector)it, document);
      return;
    } else if (it instanceof EndAnchor) {
      _format((EndAnchor)it, document);
      return;
    } else if (it instanceof FloatingText) {
      _format((FloatingText)it, document);
      return;
    } else if (it instanceof FloatingTexts) {
      _format((FloatingTexts)it, document);
      return;
    } else if (it instanceof Model) {
      _format((Model)it, document);
      return;
    } else if (it instanceof Polyline) {
      _format((Polyline)it, document);
      return;
    } else if (it instanceof Segment) {
      _format((Segment)it, document);
      return;
    } else if (it instanceof Shape) {
      _format((Shape)it, document);
      return;
    } else if (it instanceof StartAnchor) {
      _format((StartAnchor)it, document);
      return;
    } else if (it instanceof EObject) {
      _format((EObject)it, document);
      return;
    } else if (it == null) {
      _format((Void)null, document);
      return;
    } else if (it != null) {
      _format(it, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, document).toString());
    }
  }
  
  public void format(final Bounds it, final int spacing, final IFormattableDocument document) {
    _format(it, spacing, document);
    return;
  }
}
