package logic_1;

/*
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
 */

class ShareDigit {
	public boolean shareDigit(int a, int b) {
		int firstDigitOfA = a / 10;
		int secondDigitOfA = a % 10;

		int firstDigitOfB = b / 10;
		int secondDigitOfB = b % 10;

		boolean isThereSameDigit = (firstDigitOfA == firstDigitOfB | firstDigitOfA == secondDigitOfB)
				| (secondDigitOfA == firstDigitOfB | secondDigitOfA == secondDigitOfB);

		if (isThereSameDigit) {
			return true;
		} else {
			return false;
		}
	}
}
