package array_2;

/*
Return the number of even ints in the given array.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */

public class CountEvens {
	public int countEvens(int[] nums) {
		
		int evenCounter = 0;
		for(int number : nums) {
			if(number%2 == 0)
				evenCounter++;
		}
		
		return evenCounter;
	}
}