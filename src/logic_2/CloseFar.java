package logic_2;

/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
 */

class CloseFar {
	public boolean closeFar(int a, int b, int c) {
		boolean isBclose = Math.abs(a - b) <= 1;
		boolean isCclose = Math.abs(a - c) <= 1;
		boolean aToCdiff = Math.abs(c - a) >= 2;
		boolean aToBdiff = Math.abs(b - a) >= 2;
		boolean bToCdiff = Math.abs(c - b) >= 2;
		
		if(isBclose & aToCdiff & bToCdiff) {
			return true;
		} else if(isCclose & aToBdiff & bToCdiff) {
			return true;
		} else {
			return false;
		}
	}
}