package logic_1;

/*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
 */

class LessBy10 {
	public boolean lessBy10(int a, int b, int c) {
		boolean aToB = Math.abs(a - b) >= 10;
		boolean bToC = Math.abs(b - c) >= 10;
		boolean cToA = Math.abs(c - a) >= 10;
		
		boolean areAny10OrMore = aToB | bToC | cToA;

		if (areAny10OrMore) {
			return true;
		} else {
			return false;
		}
	}
}