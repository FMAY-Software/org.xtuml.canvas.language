/*
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractCanvasValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtuml.canvas.language.canvas.CanvasPackage.eINSTANCE);
		return result;
	}
}