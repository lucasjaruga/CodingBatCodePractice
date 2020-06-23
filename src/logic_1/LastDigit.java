package logic_1;

/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */

class LastDigit {
	public boolean lastDigit(int a, int b, int c) {
		int lastDigitOfA = a % 10;
		int lastDigitOfB = b % 10;
		int lastDigitOfC = c % 10;

		boolean areTwoDigitsSame = lastDigitOfA == lastDigitOfB | lastDigitOfC == lastDigitOfB
				| lastDigitOfA == lastDigitOfC;

		if (areTwoDigitsSame) {
			return true;
		} else {
			return false;
		}
	}
}