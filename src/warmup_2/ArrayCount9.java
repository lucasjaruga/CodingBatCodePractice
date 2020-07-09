package warmup_2;

/*
Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */

public class ArrayCount9 {
	public int arrayCount9(int[] nums) {
		int counter = 0;
		for (int x : nums) {
			if (x == 9) {
				counter++;
			}
		}
		return counter;
	}
}