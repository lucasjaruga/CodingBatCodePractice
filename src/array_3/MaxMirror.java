package array_3;

/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2

*/

public class MaxMirror {
	public static int maxMirror(int[] nums) {

		int result = 0;
		int counter = 0;
		int numsLength = nums.length;

		for (int i = 0; i < numsLength; i++) {
			counter = 0;
			for (int j = numsLength - 1; i + counter < numsLength && j > -1; j--) {
				if (nums[i + counter] == nums[j]) {
					counter++;
				} else {
					if (counter > 0) {
						result = Math.max(counter, result);
						counter = 0;
					}
				}
			}
			result = Math.max(counter, result);
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9 };
		System.out.println(maxMirror(nums));
	}
}