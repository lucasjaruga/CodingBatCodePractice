package string_2;

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */

public class XYZThere {
	public static boolean xyzThere(String str) {
		boolean result = false;
		int positionInStr = 0;

		for (; positionInStr < str.length() - 2;) {
			int isXYZ = str.indexOf("xyz", positionInStr);

			if (isXYZ == -1) {
				break;
			} else if (isXYZ == 0) {
				result = true;
				positionInStr += 3;
			} else if (isXYZ != -1 && str.charAt(isXYZ - 1) != '.') {
				result = true;
				positionInStr += 3;
			} else {
				positionInStr += 3;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(xyzThere("xyz.abc"));

	}
}
