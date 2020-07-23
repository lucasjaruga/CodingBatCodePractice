package array_2;

/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */

public class HaveThree {
	public static boolean haveThree(int[] nums) {
		int counterOf3 = 0;

		for (int i = 0; i < nums.length; i++) {

			int tmp1;
			if (i > 0) {
				tmp1 = nums[i - 1];
			} else {
				tmp1 = 0;
			}

			int tmp2 = nums[i];

			int tmp3;
			if (i < nums.length - 1) {
				tmp3 = nums[i + 1];
			} else {
				tmp3 = 0;
			}

			if (tmp1 != 3 && tmp2 == 3 && tmp3 != 3) {
				counterOf3++;
			}
		}

		if (counterOf3 == 3) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int [] nums = {3, 1, 3, 1, 3};
		System.out.println(haveThree(nums));
	}

}