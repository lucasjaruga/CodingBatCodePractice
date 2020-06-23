package warmup_2;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */

class DoubleX {
	boolean doubleX(String str) {
		boolean result;
		int firstX = str.indexOf("x");
		boolean secondX;
		boolean isEnoughChars = false;

		if (!str.isEmpty()) {
			isEnoughChars = firstX + 1 < str.length();
		} else {
			result = false;
		}

		if (isEnoughChars) {
			secondX = str.charAt(firstX + 1) == 'x';
		} else {
			secondX = false;
		}

		if (secondX) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
