package warmup_1;

/*
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */

public class NotString {
	public String notString(String str) {
		boolean isNot;

		if (str.length() >= 3) {
			isNot = str.substring(0, 3).equals("not");
		} else {
			isNot = false;
		}

		if (isNot) {
			return str;
		} else {
			StringBuilder result = new StringBuilder(str);
			return result.insert(0, "not ").toString();
		}
	}
}
