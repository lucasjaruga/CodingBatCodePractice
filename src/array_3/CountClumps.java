package array_3;

/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */

public class CountClumps {
	public static int countClumps(int[] nums) {

		int noClumps = 0;
		int positionInArray = 0;

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == nums[i + 1]) {
				positionInArray = i;
				for (int j = positionInArray; j < nums.length; j++) {
					if (j < nums.length - 1 && nums[j] == nums[j + 1]) {
						continue;
					} else {
						noClumps++;
						i = j;
						break;
					}
				}
			}
		}
		return noClumps;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 1, 1 };
		System.out.println(countClumps(nums));
	}
}