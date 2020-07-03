package string_2;

/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */

public class OneTwo {
	public String oneTwo(String str) {
		if (str.length() < 3) {
			return "";
		}

		StringBuilder result = new StringBuilder(str);
		int positionInResult = 0;

		// deleting group of fewer then 3 chars
		int areOnlyGroupOf3 = result.length() % 3;
		boolean anyToIgnore = areOnlyGroupOf3 != 0;
		if (anyToIgnore) {
			result.delete(result.length() - areOnlyGroupOf3, result.length());
		}

		// computing new string
		for (; positionInResult < str.length() - 2;) {
			char tmp1 = result.charAt(positionInResult);
			char tmp2 = result.charAt(positionInResult + 2);

			result.deleteCharAt(positionInResult);
			result.deleteCharAt(positionInResult + 1);
			result.insert(positionInResult + 1, tmp2);
			result.insert(positionInResult + 2, tmp1);
			positionInResult += 3;
		}
		return result.toString();
	}
}