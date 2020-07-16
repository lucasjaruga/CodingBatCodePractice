package array_2;

/*
Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array.

fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

public class FizzArray {
	public int[] fizzArray(int n) {
		int[] result = new int[n];

		for (int i = 0; i < result.length; i++) {
			result[i] = i;
		}

		return result;
	}
}
