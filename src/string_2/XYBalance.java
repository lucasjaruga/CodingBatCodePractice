package string_2;

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */

public class XYBalance {
	public static boolean xyBalance(String str) {
		int lastX = str.lastIndexOf("x");
		int isAnyY = str.indexOf("y", lastX);

		if (lastX == -1 && isAnyY == -1) {
			return true;
		} else if ((isAnyY != -1 && lastX != -1) && (isAnyY > lastX)) {
			return true;
		} else if (isAnyY != -1 && lastX == -1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(xyBalance("y"));
	}
}