package warmup_1;

/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
*/

class NearHundred {

	public boolean nearHundred(int n) {
		boolean result;
		int tmp;
		if (n <= 110) {
			tmp = Math.abs(100 - n);
			if (tmp <= 10) {
				result = true;
			} else {
				result = false;
			}
		} else {
			tmp = Math.abs(200 - n);
			if (tmp <= 10) {
				result = true;
			} else {
				result = false;
			}
		}

		return result;
	}
}
