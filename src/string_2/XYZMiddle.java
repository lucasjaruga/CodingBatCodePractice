package string_2;

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false

xyzAxyzBBB

 */

public class XYZMiddle {
	public static boolean xyzMiddle(String str) {
		if(str.length() < 3)
			return false;
		
		if ((str.length() == 3 || str.length() == 4) && str.indexOf("xyz") == 0)
			return true;
		
		int start = (str.length() / 2) - 2;
		int whereIsXYZ = str.indexOf("xyz", start);
		int strLng = str.length();
		
		int noCharsLeft = Math.abs(0 - whereIsXYZ);
		int noCharsRight = strLng - whereIsXYZ - 3;
		
		if(Math.abs(noCharsLeft - noCharsRight) == 0 || Math.abs(noCharsLeft - noCharsRight) == 1) {
			return true;
		} else {
			return false;
		}
	}
}