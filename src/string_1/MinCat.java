package string_1;

/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
 */

public class MinCat {
	public String minCat(String a, String b) {
		int aLenght = a.length();
		int bLenght = b.length();
		int diff = Math.abs(aLenght - bLenght);

		if (aLenght > bLenght) {
			return a.substring(diff, a.length()) + b;
		} else if (aLenght < bLenght) {
			return a + b.substring(diff, b.length());
		} else {
			return a + b;
		}
	}
}
