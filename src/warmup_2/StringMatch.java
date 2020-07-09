package warmup_2;

/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */

public class StringMatch {
	public int stringMatch(String a, String b) {
		int counter = 0;
		int shorterStrLength;

		if (a.length() > b.length()) {
			shorterStrLength = b.length();
		} else {
			shorterStrLength = a.length();
		}

		for (int i = 0; i < shorterStrLength - 1; i++) {
			String tmp1 = a.substring(i, i + 2);
			String tmp2 = b.substring(i, i + 2);

			if (tmp1.equals(tmp2)) {
				counter++;
			}
		}
		return counter;
	}
}