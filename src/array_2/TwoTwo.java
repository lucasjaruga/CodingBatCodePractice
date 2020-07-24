package array_2;

/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */

public class TwoTwo {
	public static boolean twoTwo(int[] nums) {

		// setting result as true because if array does not contain any 2 then it's fine 
		boolean result = true;

		for (int i = 0; i < nums.length; i++) {
			
			// at first check if it's possible that another 2 will appear
			if (nums[i] == 2 && nums.length > 1) {
				// check if 2 appeared as a first element of array
				if (i == 0) {
					if (nums[i + 1] != 2) {
						result = false;
						break;
					}
					continue;
				}
				// check if 2 appeared somewhere between first element and before last element of array
				if (i > 0 && i < nums.length - 1) {
					if (nums[i - 1] != 2 && nums[i + 1] != 2) {
						result = false;
						break;
					}
					continue;
				}
				// check if 2 appeared as a last element of array
				if (i == nums.length - 1) {
					if (nums[i - 1] != 2) {
						result = false;
						break;
					}
				}
			// check if it's only 2 in array
			} else if (nums[i] == 2 && nums.length == 1) {
				result = false;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 2, 4 };
		System.out.println(twoTwo(nums));
	}
}