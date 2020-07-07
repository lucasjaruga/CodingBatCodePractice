package warmup_1;

/*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */

public class Front22 {
	public String front22(String str) {
		StringBuilder result = new StringBuilder();

		if (str.length() < 3) {
			for (int i = 0; i < 3; i++) {
				result.append(str);
			}
		} else {
			result.append(str.substring(0, 2)).append(str).append(str.substring(0, 2));
		}

		return result.toString();
	}
}