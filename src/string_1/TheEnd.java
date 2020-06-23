package string_1;

/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */

class TheEnd {
	public String theEnd(String str, boolean front) {
		String result;
		int strLength = str.length();

		if (front) {
			result = str.substring(0, 1);
		} else {
			result = str.substring(strLength - 1, strLength);
		}

		return result;
	}

}
