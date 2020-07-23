package array_2;

/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */

public class Has12 {
	public boolean has12(int[] nums) {
		boolean is1 = false;
		boolean is2 = false;

		start: for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				is1 = true;
				for (int j = i; j < nums.length; j++) {
					if (nums[j] == 2) {
						is2 = true;
						break start;
					}
				}
			}
		}

		if (is1 && is2) {
			return true;
		} else {
			return false;
		}
	}
}