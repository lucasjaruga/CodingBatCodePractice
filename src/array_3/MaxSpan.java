package array_3;

/*
Consider the leftmost and rightmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */

public class MaxSpan {
	public static int maxSpan(int[] nums) {

		// initial value of span. If nums length is 0 then method will return a correct value of span
		int span = 0;

		// iterate through array
		for (int positionInArr = 0; positionInArr < nums.length; positionInArr++) {
			
			// save in a tmp variable each value from array for purpose of checking of span if value appears later in array  
			int tmp = nums[positionInArr];

			// basic value for span if array contains one copy of each value or there is just one value
			int tmpSpan = 1;

			// iterate through each value in array which appears after saved tmp value
			for (int j = positionInArr + 1; j < nums.length; j++) {
				if (nums[j] == tmp) {
					
					//calculate span between tmp value and founded value later in array
					tmpSpan = j - positionInArr + 1;
				}
			}

			// if calculated span is greater then current then tmpSpan is a new span
			if (tmpSpan > span) {
				span = tmpSpan;
			}
		}
		return span;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 4, 2, 1, 4, 4, 4 };

		System.out.println(maxSpan(nums));

	}
}