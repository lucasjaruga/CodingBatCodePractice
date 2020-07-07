package string_2;

/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */

public class StarOut {
	public static String starOut(String str) {
		int isStar = str.indexOf('*');

		// no star at all
		if (isStar == -1)
			return str;

		// str shorter then 4 chars and no star
		if (str.length() <= 3 && isStar != -1) {
			return "";
		}

		StringBuilder result = new StringBuilder(str);
		if (result.charAt(0) == '*') {
			result.delete(0, 2);
		} else if (result.charAt(result.length() - 1) == '*') {
			result.delete(result.length() - 2, result.length());
		}

		for (int i = 0; i < result.length(); i++) {
			int starPosition = result.indexOf("*");
			if (starPosition != -1) {
				int deleteTo = starPosition;
				for (int j = starPosition + 1; i < result.length(); j++) {
					if (result.charAt(j) == '*') {
						deleteTo++;
					} else {
						break;
					}
				}
				result.delete(starPosition - 1, deleteTo + 2);
			} else {
				break;
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(starOut("sm***eil*ly"));
	}
	
}