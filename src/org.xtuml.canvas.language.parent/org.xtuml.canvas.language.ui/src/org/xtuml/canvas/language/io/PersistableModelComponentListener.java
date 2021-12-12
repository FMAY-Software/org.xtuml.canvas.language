package org.xtuml.canvas.language.io;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.xtuml.bp.core.Ooaofooa;
import org.xtuml.bp.core.common.IModelDelta;
import org.xtuml.bp.core.common.ITransactionListener;
import org.xtuml.bp.core.common.ModelRoot;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.core.common.PersistableModelComponent;
import org.xtuml.bp.core.common.Transaction;
import org.xtuml.bp.core.util.OoaofgraphicsUtil;

public class PersistableModelComponentListener implements ITransactionListener {

	CanvasWriter writer = new CanvasWriter();
	
	@Override
	public void transactionEnded(Transaction transaction) {
		// we are interested in Ooaofgraphics changes only
		Set<PersistableModelComponent> collectedComponents = new HashSet<>();
		IModelDelta[] deltas = transaction.getDeltas((ModelRoot) OoaofgraphicsUtil
				.getGraphicsRoot(Ooaofooa.getDefaultInstance().getId(), OoaofgraphicsUtil.getGraphicsClass()));
		if(deltas != null) {
		Stream.of(deltas).forEach(delta -> {
			PersistableModelComponent pmc = ((NonRootModelElement) delta.getModelElement()).getPersistableComponent();
			if(pmc != null) {
				collectedComponents.add(pmc);
			}
		});
		collectedComponents.forEach(component -> {
				// for each unique file we are going
				// to create an xtg file, this gives us
				// the parent file which used to contain
				// the graphics
				IFile parentFile = component.getFile();
				IFile xtGraphFile = parentFile.getParent()
						.getFile(new Path(parentFile.getName().replaceAll(".xtuml", ".xtg")));
				try {
					writer.write(component.getRootModelElement(), xtGraphFile);
				} catch (IOException e) {
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		});
		}
	}

}
