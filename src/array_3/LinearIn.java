package array_3;

/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */

public class LinearIn {
	public boolean linearIn(int[] outer, int[] inner) {

		// assume that outer has all inner values
		boolean result = true;

		// take first value of inner to check
		start: for (int i = 0; i < inner.length; i++) {
			int valueOfInnerToCheck = inner[i];

			// check if value from inner is in outer
			for (int j = 0; j < outer.length; j++) {
				boolean foundNumber = false;
				if (outer[j] == valueOfInnerToCheck) {
					foundNumber = true;
				}

				// if value has been found stop checking rest of outer and start verifying next
				// value from inner
				if (foundNumber == true) {
					break;

					// if value from inner not found in outer then set result to false to stop whole
					// searching
				} else if (j == outer.length - 1 && foundNumber == false) {
					result = false;
					break start;
				}
			}
		}
		return result;
	}
}