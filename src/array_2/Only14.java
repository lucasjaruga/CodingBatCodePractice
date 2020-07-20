package array_2;

/*
Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */

public class Only14 {
	public boolean only14(int[] nums) {
		
		boolean result = true;
		
		for (int number : nums) {
			if(number == 1 || number == 4) {
				continue;
			} else {
				result = false;
			}
		}
		
		return result;
	}
}