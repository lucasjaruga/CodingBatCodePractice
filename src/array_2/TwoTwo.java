package array_2;

/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */

public class TwoTwo {
	public static boolean twoTwo(int[] nums) {

		boolean result = true;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 2) {
				continue;
			} else if (nums[i] == 2 && i == nums.length - 1) {
				result = false;
				break;
			} else if (nums[i] == 2 && nums[i + 1] == 2) {
				i++;
			} else {
				result = false;
				break;
			}
		}
	}

	public static void main(String[] args) {

		int[] nums = { 4, 2, 2, 3 };
		System.out.println(twoTwo(nums));
	}
}