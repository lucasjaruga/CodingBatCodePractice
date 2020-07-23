package array_2;

/*
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
 */

public class TripleUp {
	public boolean tripleUp(int[] nums) {

		boolean result = false;

		for (int i = 0; i < nums.length - 2; i++) {
			int first = nums[i];
			int second = nums[i + 1];
			int third = nums[i + 2];

			if (first + 1 == second && second + 1 == third) {
				result = true;
			}
		}

		return result;
	}
}