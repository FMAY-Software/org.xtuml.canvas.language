package org.xtuml.canvas.language.io;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.xtuml.bp.core.common.ModelChangeAdapter;
import org.xtuml.bp.core.common.ModelChangedEvent;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.ui.canvas.Ooaofgraphics;

public class ModelElementLoadedListener extends ModelChangeAdapter {

	CanvasGenerator generator = new CanvasGenerator();
	
	@Override
	public boolean isBatchedNotificationEnabled() {
		return false;
	}
	
	@Override
	public boolean isSynchronous() {
		return true;
	}
	
	@Override
	public void modelElementLoaded(ModelChangedEvent event) {
		NonRootModelElement modelElement = (NonRootModelElement) event.getModelElement();
		IFile parentFile = modelElement.getFile();
		IFile xtGraphFile = parentFile.getParent()
				.getFile(new Path(parentFile.getName().replaceAll(".xtuml", ".xtg")));
		try {
			generator.generate(modelElement, Ooaofgraphics.getInstance(modelElement.getModelRoot().getId()), xtGraphFile);
		} catch (IOException | CoreException e) {
		}
	}

}
