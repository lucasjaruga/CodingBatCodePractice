package string_2;

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */

public class RepeatSeparator {
	public String repeatSeparator(String word, String sep, int count) {
		StringBuilder result = new StringBuilder();

		if (count == 1) {
			return result.append(word).toString();
		}

		for (int i = 1; i <= count; i++) {
			result.append(word);
			if (i < count) {
				result.append(sep);
			}
		}
		return result.toString();
	}
}
