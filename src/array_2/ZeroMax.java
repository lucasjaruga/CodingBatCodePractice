package array_2;

/*
Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
 */

public class ZeroMax {
	public int[] zeroMax(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == 0) {
				int biggestOdd = 0;
				for (int j = i; j < nums.length; j++) {
					if (nums[j] % 2 != 0 && nums[j] > biggestOdd) {
						biggestOdd = nums[j];
					}
				}
				nums[i] = biggestOdd;
			}
		}
		return nums;
	}
}