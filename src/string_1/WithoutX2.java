package string_1;

/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */

public class WithoutX2 {
	public String withoutX2(String str) {

		if (str.length() == 1 && str.charAt(0) == 'x') {
			return "";
		} else if (str.length() == 0) {
			return "";
		}

		boolean isFirstX = str.charAt(0) == 'x';
		boolean isSecondX = str.charAt(1) == 'x';

		if (isFirstX && isSecondX) {
			return str.substring(2);
		} else if (isFirstX && !isSecondX) {
			return str.substring(1);
		} else if (!isFirstX && isSecondX) {
			return str.substring(0, 1) + str.substring(2);
		} else {
			return str;
		}
	}
}