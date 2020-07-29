package array_3;

/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
 */

public class MaxMirror {
	public static int maxMirror(int[] nums) {

		int sizeOfTheLargestMirror = 0;

		int[] reversed = new int[nums.length];
		int positionInNums = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			reversed[i] = nums[positionInNums];
			positionInNums++;
		}

		for (int i = 0; i < nums.length; i++) {

			boolean startCounting = false;

			if (nums[i] == reversed[i]) {
				startCounting = true;
			} else {
				startCounting = false;
			}

			int counterOfSize = 0;
			if (startCounting) {
				counterOfSize++;
			}

			if (sizeOfTheLargestMirror < counterOfSize) {
				sizeOfTheLargestMirror = counterOfSize;
			}
		}

		return sizeOfTheLargestMirror;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1, 4 };

		System.out.println(maxMirror(nums));

	}
}