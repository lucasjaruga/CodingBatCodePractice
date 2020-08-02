package string_3;

/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 */

public class NotReplace {
	public static String notReplace(String str) {

		String lowerIsNot = "is not";
		StringBuilder result = new StringBuilder(str);
		
		// start searching "is"
		for (int i = 0; i < result.length() - 1; i++) {
			// if found verify other conditions
			if (result.substring(i, i + 2).equals("is")) {
				if (result.length() == 2) {
					result.replace(i, i + 2, lowerIsNot);
				} else if (i == 0 && !Character.isLetter(result.charAt(i + 2))) {
					result.replace(i, i + 2, lowerIsNot);
				} else if (i > 0 && i == result.length() - 2 && !Character.isLetter(result.charAt(i - 1))) {
					result.replace(i, i + 2, lowerIsNot);
				} else if (i > 0 && !Character.isLetter(result.charAt(i - 1)) && !Character.isLetter(result.charAt(i + 2))) {
					result.replace(i, i + 2, lowerIsNot);
				}
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {

		String str = "is";

		System.out.println(notReplace(str));
	}
}