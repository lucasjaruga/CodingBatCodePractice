package array_1;

/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true 
 */

class SameFirstLast {
	public boolean sameFirstLast(int[] nums) {
		boolean result;
		int arrLength = nums.length;
		boolean compareEle;

		if (arrLength != 0) {
			compareEle = nums[0] == nums[nums.length - 1];
		} else {
			compareEle = false;
		}

		if (arrLength > 0 & compareEle) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
