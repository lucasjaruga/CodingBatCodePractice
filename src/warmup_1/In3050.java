package warmup_1;

/*
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */

public class In3050 {
	public boolean in3050(int a, int b) {
		boolean areInRange_30to40 = (a > 29 && a < 41) && (b > 29 && b < 41);
		boolean areInRange_40to50 = (a > 39 && a < 51) && (b > 39 && b < 51);

		if (areInRange_30to40 || areInRange_40to50) {
			return true;
		} else {
			return false;
		}
	}
}
