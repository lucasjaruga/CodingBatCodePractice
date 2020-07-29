package array_3;

/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
 */

public class Fix34 {
	public static int[] fix34(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {

			// if 3 founded then start searching a 4
			if (nums[i] == 3) {
				int positionOfLast4 = 0;

				// start searching 4 from last known position of 4 to avoid situations when 4 is
				// before 3. It would provide a wrong end result
				for (int j = positionOfLast4 + 1; j < nums.length; j++) {
					if (nums[j] == 4) {
						positionOfLast4 = j;
						break;
					}
				}

				// move numbers to their correct place
				int tmp = nums[i + 1];
				nums[i + 1] = nums[positionOfLast4];
				nums[positionOfLast4] = tmp;
			}
		}
		return nums;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, 1, 4, 4, 3, 1 };
		fix34(nums);
		for (int x : nums)
			System.out.print(x + " ");
	}
}