package string_2;

/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */

public class StarOut {
	public String starOut(String str) {
		int firstStar = str.indexOf('*');

		if (firstStar == -1)
			return str;
		
		if(str.length() <= 3 && firstStar != -1) {
			return "";
		}

		StringBuilder result = new StringBuilder(str);
		int lastStar = 0;
		boolean isMoreStar = true;

		while (isMoreStar) {
			for (int positionInResult = firstStar; positionInResult < result.length(); positionInResult++) {
				if(str.indexOf('*', positionInResult + 1) != -1) {
					lastStar = str.indexOf('*', positionInResult + 1);
				} else {
					isMoreStar = false;
				}
			}
		}
		return result.toString();
	}
}