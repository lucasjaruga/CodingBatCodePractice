package string_1;

/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */

public class DeFront {
	public String deFront(String str) {
		boolean isFirstNotA = str.charAt(0) != 'a';
		boolean isSecondNotB = str.charAt(1) != 'b';

		if (isFirstNotA && isSecondNotB) {
			return str.substring(2);
		} else if (!isFirstNotA && isSecondNotB) {
			return str.substring(0, 1) + str.substring(2);
		} else if (isFirstNotA && !isSecondNotB) {
			return str.substring(1);
		} else {
			return str;
		}
	}
}