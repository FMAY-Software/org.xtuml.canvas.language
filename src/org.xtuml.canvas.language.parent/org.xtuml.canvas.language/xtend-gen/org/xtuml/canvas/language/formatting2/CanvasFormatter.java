/**
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtuml.canvas.language.canvas.GraphicalElement;
import org.xtuml.canvas.language.canvas.Model;
import org.xtuml.canvas.language.canvas.ModelProperties;
import org.xtuml.canvas.language.canvas.SemanticModel;
import org.xtuml.canvas.language.canvas.Shape;
import org.xtuml.canvas.language.canvas.Shapes;
import org.xtuml.canvas.language.services.CanvasGrammarAccess;

@SuppressWarnings("all")
public class CanvasFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private CanvasGrammarAccess _canvasGrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<SemanticModel> _semantics = model.getSemantics();
    for (final SemanticModel semanticModel : _semantics) {
      {
        this.format(semanticModel);
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.setNewLines(2);
        };
        document.<SemanticModel>append(semanticModel, _function);
      }
    }
    this.format(model.getProperties());
    EList<GraphicalElement> _elements = model.getElements();
    for (final GraphicalElement graphicalElement : _elements) {
      {
        this.format(graphicalElement);
        final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
          it.setNewLines(1);
        };
        document.<GraphicalElement>append(graphicalElement, _function);
      }
    }
    final Consumer<ISemanticRegion> _function = (ISemanticRegion it) -> {
      final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it_1) -> {
        it_1.setNewLines(2);
      };
      document.append(it, _function_1);
    };
    this.textRegionExtensions.allSemanticRegions(model).forEach(_function);
  }
  
  protected void _format(final ModelProperties modelProperties, @Extension final IFormattableDocument document) {
    this.format(modelProperties.getPoint());
  }
  
  protected void _format(final GraphicalElement element) {
  }
  
  protected void _format(final SemanticModel sm) {
  }
  
  protected void _format(final Shapes shapes) {
    EList<Shape> _shapes = shapes.getShapes();
    for (final Shape shape : _shapes) {
      this.format(shape);
    }
  }
  
  protected void _format(final Shape shape) {
  }
  
  public void format(final Object model, final IFormattableDocument document) {
    if (model instanceof XtextResource) {
      _format((XtextResource)model, document);
      return;
    } else if (model instanceof Model) {
      _format((Model)model, document);
      return;
    } else if (model instanceof ModelProperties) {
      _format((ModelProperties)model, document);
      return;
    } else if (model instanceof EObject) {
      _format((EObject)model, document);
      return;
    } else if (model == null) {
      _format((Void)null, document);
      return;
    } else if (model != null) {
      _format(model, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, document).toString());
    }
  }
  
  public void format(final EObject shapes) {
    if (shapes instanceof Shapes) {
      _format((Shapes)shapes);
      return;
    } else if (shapes instanceof GraphicalElement) {
      _format((GraphicalElement)shapes);
      return;
    } else if (shapes instanceof SemanticModel) {
      _format((SemanticModel)shapes);
      return;
    } else if (shapes instanceof Shape) {
      _format((Shape)shapes);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shapes).toString());
    }
  }
}
