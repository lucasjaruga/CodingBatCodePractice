package warmup_2;

/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true

([2, 7, 4]) → false
 */

public class Has271 {
	public static boolean has271(int[] nums) {

		boolean result = false;

		for (int i = 0; i <= nums.length - 3; i++) {
			int val1 = nums[i];
			int val2 = nums[i + 1];
			int val3 = nums[i + 2];
			
			boolean is3valCorrect = val1 - 1 == val3 || Math.abs(val1 - 1) - val3 <= 2 && Math.abs(val1 - 1) - val3 >= -2;

			if (val1 + 5 == val2 && is3valCorrect) {
				return result = true;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int [] nums = {2, 7, 4};
		System.out.println(has271(nums));
	}
}
