package string_3;

/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */

public class SameEnds {
	public String sameEnds(String string) {

		String result = "";
		int lengthOfResult = 0;

		// start comparing; divide string length by 2 to avoid overlapping
		for (int i = 0; i < string.length() / 2; i++) {

			// create beginning and the end to compare
			String subString = string.substring(0, i + 1);
			String end = string.substring(string.length() - 1 - i, string.length());

			// let's say they are same
			boolean areSame = true;

			for (int j = 0; j < subString.length(); j++) {
				// if any char is not same in both then change areSame variable to false and
				// stop comparing
				if (subString.charAt(j) != end.charAt(j)) {
					areSame = false;
					break;
				}
			}

			// if they're the same and this substring is longer then result then assign
			// substring to result and set value of lengthOfResult to subString length
			if (areSame && subString.length() > lengthOfResult) {
				result = subString;
				lengthOfResult = subString.length();
			}
		}
		return result;
	}
}