package string_1;

/*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */

class NonStart {
	public String nonStart(String a, String b) {
		String result;
		StringBuilder strA = new StringBuilder(a);
		StringBuilder strB = new StringBuilder(b);
		strA.deleteCharAt(0);
		strB.deleteCharAt(0);
		result = strA.append(strB).toString();

		return result;
	}

}
