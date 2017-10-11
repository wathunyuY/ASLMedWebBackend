package com.med.common.utils;

public class StringUtils {
	public static boolean isEmpty(Object str) {
		return (str == null || "".equals(str));
	}

	public static boolean isNotEmpty(Object str) {
		return !isEmpty(str);
	}

	public static boolean isNumeric(String str) {
		if (isNotEmpty(str)) {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isLetter(str.charAt(i))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
}
