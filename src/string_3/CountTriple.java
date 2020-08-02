package string_3;

/*
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
 */

public class CountTriple {
	public int countTriple(String str) {

		int noTriples = 0;

		for (int i = 0; i < str.length() - 2; i++) {

			// if str length is less then 2 then it's impossible to find any triples. Break
			// for loop and return 0
			if (str.length() > 2) {
				// take 3 elements which appears three times in a row
				char tmp1 = str.charAt(i);
				char tmp2 = str.charAt(i + 1);
				char tmp3 = str.charAt(i + 2);

				// if they are same then increase counter of Triples
				if (tmp1 == tmp2 && tmp2 == tmp3) {
					noTriples++;
				}
			} else {
				break;
			}
		}
		return noTriples;
	}
}