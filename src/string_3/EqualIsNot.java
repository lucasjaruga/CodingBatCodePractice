package string_3;

/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */

class EqualIsNot {
	public static boolean equalIsNot(String str) {

		int isCounter = 0;
		int notCounter = 0;

		// counting "is"
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("is")) {
				isCounter++;
			}
		}

		// counting "not"
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("not")) {
				notCounter++;
			}
		}

		// return result
		if (isCounter == notCounter) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(equalIsNot("This is not"));
	}
}
