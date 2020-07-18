package array_2;

/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */

public class Post4 {
	public int[] post4(int[] nums) {
		int[] result = new int[0];

		for (int position = nums.length - 1; position >= 0; position--) {
			if (nums[position] == 4) {

				int startFrom = position + 1;
				int howLongNewArr = nums.length - startFrom;

				if (howLongNewArr == 0)
					break;

				result = new int[howLongNewArr];

				for (int i = 0; i < howLongNewArr; i++) {
					result[i] = nums[startFrom + i];
				}
				break;
			}
		}
		return result;
	}
}
