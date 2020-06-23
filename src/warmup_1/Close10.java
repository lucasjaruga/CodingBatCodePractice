package warmup_1;

/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */

class Close10 {
	public int close10(int a, int b) {
		int result;

		int testA = Math.abs(10 - a);
		int testB = Math.abs(10 - b);

		if (testA < testB) {
			result = a;
		} else if (testA > testB) {
			result = b;
		} else {
			result = 0;
		}

		return result;
	}

}
