package org.xtuml.canvas.language.io.utils;

import org.xtuml.bp.core.End_c;

public class EnumUtils {

	public static String endFor(int end) {
		switch (end) {
		case End_c.Start:
			return "start";
		case End_c.End:
			return "end";
		case End_c.Additional:
			return "additional";
		case End_c.End_Fixed:
			return "end_fixed";
		case End_c.Start_Fixed:
			return "start_fixed";
		case End_c.None:
			return "none";
		case End_c.Middle:
			return "middle";
		case End_c.Floating:
			return "floating";
		default:
			return "none";
		}
	}

}
