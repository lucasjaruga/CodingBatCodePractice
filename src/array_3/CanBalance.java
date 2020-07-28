package array_3;

/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 */

public class CanBalance {
	public boolean canBalance(int[] nums) {
		
		int target = 0;
		
		for(int number : nums)
			target += number;
		
		target = target / 2;
		
		int tmpSum1 = 0;
		int tmpSum2 = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(tmpSum1 != target) {
				tmpSum1 += nums[i];
			} else {
				tmpSum2 += nums[i];
			}
		}
		
		if(tmpSum1 == tmpSum2) {
			return true;
		} else {
			return false;
		}
	}
}