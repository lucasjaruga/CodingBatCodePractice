package warmup_2;

/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */

class StringTimes {
	public String stringTimes(String str, int n) {
		String result;

		StringBuilder stringTimes = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			stringTimes.append(str);
		}
		result = stringTimes.toString();

		return result;
	}

}
