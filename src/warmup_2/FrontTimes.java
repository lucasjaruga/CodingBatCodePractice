package warmup_2;

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

class FrontTimes {
	public String frontTimes(String str, int n) {
		String result;
		int strLenght = str.length();
		StringBuilder frontTimes = new StringBuilder();

		if (strLenght >= 3) {
			for (int i = 1; i <= n; i++) {
				frontTimes.append(str.substring(0, 3));
			}
		} else {
			for (int i = 1; i <= n; i++) {
				frontTimes.append(str.substring(0, strLenght));
			}
		}

		result = frontTimes.toString();

		return result;
	}

}
