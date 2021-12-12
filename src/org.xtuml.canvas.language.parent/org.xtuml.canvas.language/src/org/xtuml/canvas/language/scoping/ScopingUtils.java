package org.xtuml.canvas.language.scoping;

import java.util.StringJoiner;
import java.util.stream.Stream;

public class ScopingUtils {

	public static String getModelPath(String importPath) {
		String[] parts = importPath.split("::");
		String systemPath = "/" + parts[0] + "/models/" + parts[0];
		StringJoiner joiner = new StringJoiner("/");
		String[] subparts = new String[parts.length - 1];
		System.arraycopy(parts, 1, subparts, 0, parts.length - 1);
		joiner.add(systemPath);
		Stream.of(subparts).forEach(s -> {
			joiner.add(s);			
		});
		// append xtuml file
		joiner.add(subparts[subparts.length - 1] + ".xtuml");
		return joiner.toString();
	}

}
