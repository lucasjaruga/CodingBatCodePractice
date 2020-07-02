package string_2;

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */

public class ZipZap {
	public static String zipZap(String str) {
		if (str.length() == 0) {
			return "";
		} else if (str.length() < 3 && str.charAt(0) == 'z') {
			return str;
		}

		StringBuilder result = new StringBuilder(str);

		for (int positionInStr = 0; positionInStr < result.length() - 2; positionInStr++) {
			String tmp = result.substring(positionInStr, positionInStr + 3);
			if (tmp.charAt(0) == 'z' & tmp.charAt(2) == 'p') {
				result.deleteCharAt(positionInStr + 1);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(zipZap("zipXzap"));
	}
}
