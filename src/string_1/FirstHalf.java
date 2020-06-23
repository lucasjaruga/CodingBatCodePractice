package string_1;

/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */

class FirstHalf {
	public String firstHalf(String str) {
		String result;

		int lengthOfStr = str.length() / 2;
		result = str.substring(0, lengthOfStr);

		return result;
	}

}
