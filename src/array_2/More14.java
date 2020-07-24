package array_2;

/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */

public class More14 {
	public boolean more14(int[] nums) {
		int noOf1 = 0;
		int noOf4 = 0;

		for (int number : nums) {
			if (number == 1)
				noOf1++;

			if (number == 4)
				noOf4++;
		}

		if (noOf1 > noOf4) {
			return true;
		} else {
			return false;
		}
	}
}