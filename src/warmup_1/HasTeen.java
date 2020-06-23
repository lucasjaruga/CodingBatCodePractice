package warmup_1;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */

class HasTeen {
	public boolean hasTeen(int a, int b, int c) {
		boolean testA = a >= 13 & a <= 19;
		boolean testB = b >= 13 & b <= 19;
		boolean testC = c >= 13 & c <= 19;

		boolean result;

		if (testA | testB | testC) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
