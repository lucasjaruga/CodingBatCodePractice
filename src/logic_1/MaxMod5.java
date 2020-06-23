package logic_1;

/*
Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0.

maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3
 */

class MaxMod5 {
	public int maxMod5(int a, int b) {
		int remainderOfA = a % 5;
		int remainderOfB = b % 5;
		boolean areReminderTheSame = remainderOfA == remainderOfB;
		boolean aSameAsB = a == b;

		if (aSameAsB) {
			return 0;
		} else if (areReminderTheSame) {
			if (a < b) {
				return a;
			} else {
				return b;
			}
		} else if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}