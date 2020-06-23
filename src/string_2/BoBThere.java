package string_2;

/*
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
 */

class BoBThere {
	public boolean bobThere(String str) {
		boolean isBob = false;

		for (int beginning = 0; beginning + 2 < str.length(); beginning++) {
			String testStr = str.substring(beginning, beginning + 1) + str.charAt(beginning + 2);
			if (testStr.equals("bb"))
				isBob = true;
		}
		return isBob;
	}
}
