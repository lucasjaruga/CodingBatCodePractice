package string_3;

/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 */

public class NotReplace {
	public String notReplace(String str) {

		StringBuilder result = new StringBuilder(str);

		for (int i = 0; i < result.length() - 2; i++) {
			if (i == 0 && result.charAt(i) == 'i' && result.charAt(i + 1) == 's'
					&& !Character.isLetter(result.charAt(i + 2))) {
				result.replace(i, i + 2, "is not");
			} else if (i != 0 && !Character.isLetter(result.charAt(i - 1)) && result.charAt(i) == 'i' && result.charAt(i + 1) == 's'
					&& !Character.isLetter(result.charAt(i + 2))) {
				result.replace(i, i + 2, "is not");
			}

		}

		return result.toString();
	}
}