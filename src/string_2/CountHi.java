package string_2;

/*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */

class CountHi {
	public int countHi(String str) {
		int counter = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String tmp = str.substring(i, i+2);
			if (tmp.equals("hi")) {
				counter++;
			}
		}
		
		return counter;
	}
}