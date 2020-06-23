package string_2;

/*
Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */

class PrefixAgain {
	public boolean prefixAgain(String str, int n) {
		String prefix;
		boolean result = false;

		if (str.length() == 1) {
			return result;
		} else if (str.length() == 2) {
			prefix = String.valueOf(str.charAt(1));
			if (prefix.equals(String.valueOf(str.charAt(0)))) {
				return true;
			}
		} else {
			prefix = str.substring(0, n);
		}

		for (int start = n; start + n < str.length(); start++) {
			String testStr = str.substring(start, start + n);
			if (testStr.equals(prefix))
				result = true;
		}

		return result;
	}
}