package logic_2;

import java.util.Arrays;

/*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */

class EvenlySpaced {
	public boolean evenlySpaced(int a, int b, int c) {
		int [] abc = {a, b, c};
		Arrays.sort(abc);
		
		if (Math.abs(abc[1] - abc[0]) == Math.abs(abc[2] - abc[1])) {
			return true;
		} else {
			return false;
		}
	}
}