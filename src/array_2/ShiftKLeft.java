package array_2;

/*
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 */

public class ShiftKLeft {
	public int[] shiftLeft(int[] nums) {

		for (int position = 0; position < nums.length - 1; position++) {
			int tmp = nums[position];
			nums[position] = nums[position + 1];
			nums[position + 1] = tmp;
		}

		return nums;
	}
}