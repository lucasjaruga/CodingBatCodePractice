package warmup_1;

/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 */

class In1020 {
	public boolean in1020(int a, int b) {
		boolean noA = (a >= 10) & (a <= 20);
		boolean noB = (b >= 10) & (b <= 20);
		boolean result;

		if (noA || noB) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
