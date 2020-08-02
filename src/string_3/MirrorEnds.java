package string_3;

/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very beginning of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */

public class MirrorEnds {
	public static String mirrorEnds(String string) {

		// if no mirror then return empty String
		String result = "";

		
		for (int i = 0; i < string.length(); i++) {
			// create a tmp1 which is the first char from the string and create a tmp2 which is the last char from string
			String tmp1 = string.substring(0, i + 1);
			StringBuilder tmp2 = new StringBuilder(string.substring(string.length() - 1 - i, string.length()));

			// let's reverse order of tmp2 before comparing equality
			int positionInTmp2 = tmp2.length() - 1;
			for (int j = 0; j < tmp1.length() / 2; j++) {
				char temp = tmp2.charAt(j);
				tmp2.setCharAt(j, tmp2.charAt(positionInTmp2));
				tmp2.setCharAt(positionInTmp2, temp);
				positionInTmp2--;
			}

			// comparing equality
			if (tmp1.equals(tmp2.toString())) {
				result = tmp1;
			} else {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String string = "123and then 321";
		System.out.println(mirrorEnds(string));
	}
}
