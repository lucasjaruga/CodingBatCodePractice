package array_2;

/*
Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
 */

public class Sum13 {
	public int sum13(int[] nums) {
		if (nums.length == 0)
			return 0;

		int sum = 0;

		for (int position = 0; position < nums.length; position++) {
			if (nums[position] == 13) {
				position += 1;
			} else {
				sum += nums[position];
			}
		}
		return sum;
	}
}