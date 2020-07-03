package string_2;

/*
 Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */

public class MixString {
	public static String mixString(String a, String b) {
		StringBuilder result = new StringBuilder();
		int longestStr = 0;
		if (a.length() > b.length()) {
			longestStr = a.length();
		} else {
			longestStr = b.length();
		}

		for (int i = 0; i < longestStr; i++) {
			if (i < a.length()) {
				result.append(a.charAt(i));
			}

			if (i < b.length()) {
				result.append(b.charAt(i));
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(mixString("abc", "xyz"));
	}
}
