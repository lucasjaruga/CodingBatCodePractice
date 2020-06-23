package logic_1;

/*
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.

teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
 */

class TeenSum {
	public int teenSum(int a, int b) {
		int sum = a + b;
		boolean isTeen = (a > 12 & a < 20) | (b > 12 & b < 20);

		if (isTeen) {
			return 19;
		} else {
			return sum;
		}
	}
}