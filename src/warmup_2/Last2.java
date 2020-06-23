package warmup_2;

/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */

class Last2 {
	public static int last2(String str) {
		if(str.length() < 3) {
			return 0;
		}
		
		// getting last2 chars
		String subStr = str.substring(str.length() - 2, str.length());
		int counter = 0;
		int strPointer = 0;

		// for loop for looking for subStr matches
		for (; strPointer < str.length() - 2;) {
			// if subStr equals substring then counter + 1
			if (subStr.equals(str.substring(strPointer, strPointer + 2))) {
				counter++;
			}
			// moving one char forward in str
			strPointer += 1;
		}

		return counter;
	}

	public static void main(String[] args) {
		System.out.println(last2("1717171"));
	}

}
