package array_1;

/*
Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
 */

public class Has23 {
	public boolean has23(int[] nums) {

		boolean contains2 = nums[0] == 2 || nums[1] == 2;
		boolean contains3 = nums[0] == 3 || nums[1] == 3;

		if (contains2 || contains3) {
			return true;
		} else {
			return false;
		}
	}
}
