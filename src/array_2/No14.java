package array_2;

/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */

public class No14 {
	public boolean no14(int[] nums) {
		boolean is1 = false;
		boolean is4 = false;

		for (int number : nums) {
			if (number == 1) {
				is1 = true;
			} else if (number == 4) {
				is4 = true;
			}
		}

		boolean result = true;

		if (is1 && is4) {
			result = false;
		}

		return result;
	}
}