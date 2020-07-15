package array_1;

/*
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */

public class Start1 {
	public int start1(int[] a, int[] b) {
		boolean is1InA;
		boolean is1InB;
		
		if (a.length > 0) {
			is1InA = a[0] == 1;
		} else {
			is1InA = false;
		}

		if (b.length > 0) {
			is1InB = b[0] == 1;
		} else {
			is1InB = false;
		}
		
		int result = 0;
		
		if(is1InA && is1InB) {
			result = 2;
		} else if(is1InA || is1InB) {
			result = 1;
		}
		
		return result;
	}
}
