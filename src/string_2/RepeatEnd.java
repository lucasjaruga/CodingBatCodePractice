package string_2;

/*
Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
 */

class RepeatEnd {
	public String repeatEnd(String str, int n) {
		StringBuilder result = new StringBuilder();

		if (n == 1) {
			result.append(str.charAt(str.length() - 1));
		} else {
			String ending = str.substring(str.length() - n, str.length());
			for (int x = 1; x <= n; x++) {
				result.append(ending);
			}
		}

		return result.toString();
	}
}
