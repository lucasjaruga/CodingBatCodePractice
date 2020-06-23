package logic_1;

/*
Return true if the given non-negative number is a multiple of 3 or 5, but not both.

old35(3) → true
old35(10) → true
old35(15) → false
 */

class Old35 {
	public boolean old35(int n) {
		boolean multipleOfBoth = n % 15 == 0;
		if (n < 0 | multipleOfBoth) {
			return false;
		}

		if (n % 3 == 0) {
			return true;
		} else if (n % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
