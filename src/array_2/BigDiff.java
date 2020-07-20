package array_2;

/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
 */

public class BigDiff {
	public static int bigDiff(int[] nums) {

		int theLargest = nums[0];
		int theSmallest = nums[0];
		

		for (int i = 0; i < nums.length - 1;) {
			int min = Math.min(nums[i], nums[i + 1]);
			int max = Math.max(nums[i], nums[i + 1]);

			if (min < theSmallest)
				theSmallest = min;

			if (max > theLargest)
				theLargest = max;

			i++;
		}

		return Math.abs(theLargest - theSmallest);
	}

	public static void main(String[] args) {

		int[] arr = { 10, 3, 5, 6 };

		System.out.println(bigDiff(arr));
	}
}