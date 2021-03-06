package array_2;

/*
Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
 */

public class MatchUp {
	public int matchUp(int[] nums1, int[] nums2) {
		
		int counter = 0;
		for(int position = 0; position < nums1.length; position++) {
			int number1 = nums1[position];
			int number2 = nums2[position];
			
			if(number1 != number2 && Math.abs(number1 - number2) <= 2) {
				counter++;
			}
		}
		
		return counter;
	}
}