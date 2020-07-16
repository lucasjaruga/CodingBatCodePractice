package array_2;

/*
Given an array of ints, return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */

public class Lucky13 {
	public boolean lucky13(int[] nums) {
		boolean result = true;

		for (int number : nums) {
			if (number == 1 || number == 3) {
				result = false;
				break;
			}
		}

		return result;
	}
}