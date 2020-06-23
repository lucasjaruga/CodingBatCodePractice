package logic_1;

/*
Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.

inOrderEqual(2, 5, 11, false) → true
inOrderEqual(5, 7, 6, false) → false
inOrderEqual(5, 5, 7, true) → true
 */

class InOrderEqual {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		boolean isBGreaterThenA = b > a;
		boolean isCGreaterThenB = c > b;
		boolean areNotDecreasing = b >= a & c >= b;
		
		if(equalOk & areNotDecreasing) {
			return true;
		} else if(isBGreaterThenA & isCGreaterThenB) {
			return true;
		} else {
			return false;
		}
	}
}