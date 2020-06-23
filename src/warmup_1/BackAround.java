package warmup_1;

/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */

class BackAround {
	public String backAround(String str) {
		String result;
		StringBuilder originalStr = new StringBuilder(str);
		char charToAdd = originalStr.charAt(str.length() - 1);
		StringBuilder newString = new StringBuilder(str.length() + 2);
		result = newString.append(charToAdd).append(str).append(charToAdd).toString();

		return result;
	}
}
