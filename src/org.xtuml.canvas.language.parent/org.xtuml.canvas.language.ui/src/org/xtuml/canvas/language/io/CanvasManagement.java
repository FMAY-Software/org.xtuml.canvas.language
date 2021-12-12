package org.xtuml.canvas.language.io;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.xtuml.bp.core.common.ModelRoot;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.core.common.TransactionManager;
import org.xtuml.bp.ui.canvas.Ooaofgraphics;

public class CanvasManagement {

	private PersistableModelComponentListener transactionListener;
	private CanvasGenerator generator;

	public CanvasManagement() {
		generator = new CanvasGenerator();
		transactionListener = new PersistableModelComponentListener();
		TransactionManager.getSingleton().addTransactionListener(transactionListener);
	}

	public void shutdown() {
		TransactionManager.getSingleton().removeTransactionListener(transactionListener);
	}

	public void ensureAvailable(Object xtElement) {
		if (xtElement instanceof NonRootModelElement) {
			NonRootModelElement nrme = (NonRootModelElement) xtElement;
			try {
				ModelRoot destinationRoot = Ooaofgraphics.getInstance(nrme.getModelRoot().getId());
				generator.generate(nrme, destinationRoot, getGraphicsFile(nrme.getFile()));
			} catch (IOException | CoreException e) {
			}
		}
	}

	public IFile getGraphicsFile(IFile xtElementFile) {
		return xtElementFile.getParent().getFile(new Path(xtElementFile.getName().replaceAll(".xtuml", ".xtg")));
	}

}
