package warmup_1;

/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */

class EveryNth {
	public String everyNth(String str, int n) {
		String result;
		int counter = n;

		StringBuilder newString = new StringBuilder();
		newString.append(str.charAt(0));

		while (counter < str.length()) {
			newString.append(str.charAt(counter));
			counter += n;
		}

		result = newString.toString();

		return result;
	}

}
