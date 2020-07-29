package array_3;

/*
(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
 */

public class Fix45 {
	public static int[] fix45(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {

			int positionOf5 = 0;
			// if 4 founded and next element is not 5 then start searching a 5
			if (nums[i] == 4 && nums[i + 1] != 5) {

				// start searching 5
				for (int j = 0; j < nums.length; j++) {

					// if first element is 5 then assign position of 5
					if (nums[j] == 5 && j == 0) {
						positionOf5 = j;
						break;
					// else check if previous element is not 4 if not then assign position of 5
					} else if (nums[j] == 5 && nums[j - 1] != 4) {
						positionOf5 = j;
						break;
					}
				}

				// move numbers to their correct place
				int tmp = nums[i + 1];
				nums[i + 1] = nums[positionOf5];
				nums[positionOf5] = tmp;
			}
		}
		return nums;
	}

	public static void main(String[] args) {

		int[] nums = { 5, 4, 1 };

		fix45(nums);

		for (int x : nums)
			System.out.print(x + " ");
	}
}