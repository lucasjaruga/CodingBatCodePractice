package array_3;

/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2

12389321
12398321

1214	1214
0123	3210

7129721  1279217
0123456  6543210

 */

public class MaxMirror {
	public static int maxMirror(int[] nums) {
		int sizeOfTheLargestMirror = 0;
		int arrLength = nums.length - 1;
		
		for(int i = 0; i < nums.length; i++) {
			int counter = 0;
			if(nums[i] == nums[arrLength]) {
				counter++;
				
				for(int j = arrLength; j > 0; j--) {
					if(nums[i+counter] == nums[j]) {
						counter++;
					} else {
						
					}
				}
			}
		}
		
		
		
		return sizeOfTheLargestMirror;
	}

	public static void main(String[] args) {

		int[] nums = { 7, 1, 2, 9, 7, 2, 1 };

		System.out.println(maxMirror(nums));

	}
}