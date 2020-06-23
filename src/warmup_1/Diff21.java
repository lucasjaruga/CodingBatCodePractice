package warmup_1;

/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
  */

class Diff21 {
	public int diff21(int n) {
		int result;
		if (n > 21) {
			result = Math.abs((21 - n) * 2);
		} else {
			result = Math.abs(21 - n);
		}
		return result;
	}
}
