package org.xtuml.canvas.language.io.utils;

import java.lang.reflect.Field;

import org.xtuml.bp.core.End_c;
import org.xtuml.bp.ui.canvas.Ooatype_c;

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

	public static String typeFor(int type) {
		for(Field field : Ooatype_c.class.getFields()) {
			try {
				int value = field.getInt(Ooatype_c.class);
				if(type == value) {
					return field.getName().replaceAll("((?!^)([A-Z]))", "_$1").toLowerCase();
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO: introduce logging
			}
		}
		return "none";
	}

	public static int typeFor(String type) {
		for(Field field : Ooatype_c.class.getFields()) {
			try {
				if(type.equals(field.getName())) {
					return field.getInt(Ooatype_c.class);
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO: introduce logging
			}
		}
		return Ooatype_c.None;
	}
}
