package string_1;

/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */

class MakeOutWord {
	public String makeOutWord(String out, String word) {
		String result;

		StringBuilder newStr = new StringBuilder();
		result = newStr.append(out.substring(0, 2)).append(word).append(out.substring(2)).toString();

		return result;
	}
}
