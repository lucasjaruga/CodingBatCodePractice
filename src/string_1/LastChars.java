package string_1;

/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
 */

public class LastChars {
	public String lastChars(String a, String b) {
		if (a.length() == 0 && b.length() == 0) {
			return "@@";
		} else if (a.length() == 0) {
			return "@" + b.charAt(b.length() - 1);
		} else if (b.length() == 0) {
			return a.charAt(0) + "@";
		} else {
			return a.substring(0, 1) + b.substring(b.length() - 1);
		}
	}
}