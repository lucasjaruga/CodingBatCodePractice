package warmup_2;

/*
Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
 */

public class Array667 {
	public int array667(int[] nums) {
		int no6nextTo = 0;
		int previousElement = 0;

		for (int element : nums) {
			int currentElement = element;
			if (currentElement == previousElement || (previousElement == 6 && currentElement == 7)) {
				no6nextTo++;
			}
			previousElement = element;
		}
		
		return no6nextTo;
	}
}