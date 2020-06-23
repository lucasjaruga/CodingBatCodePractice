package warmup_1;

/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.

or35(3) → true
or35(10) → true
or35(8) → false
 */

class Or35 {
	public boolean or35(int n) {
		if(n%3 == 0 | n%5 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
