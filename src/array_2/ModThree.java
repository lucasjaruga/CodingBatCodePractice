package array_2;

/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
 */

public class ModThree {
	public boolean modThree(int[] nums) {

		boolean result = false;

		for (int position = 0; position <= nums.length - 3; position++) {
			boolean areEven = nums[position] % 2 == 0 && nums[position + 1] % 2 == 0 && nums[position + 2] % 2 == 0;
			boolean areOdd = nums[position] % 2 != 0 && nums[position + 1] % 2 != 0 && nums[position + 2] % 2 != 0;

			if (areEven || areOdd)
				result = true;
		}
		return result;
	}
}
