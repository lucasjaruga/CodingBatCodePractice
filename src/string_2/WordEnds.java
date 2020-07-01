package string_2;

/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */

public class WordEnds {
	public String wordEnds(String str, String word) {
		if(str.length() <= 2) {
			return "";
		}
		
		int positionInStr = 0;
		int wordPosition = str.indexOf(word, positionInStr);
		if(wordPosition == - 1) {
			return "";
		}
		
		int wordLenght = word.length();
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < str.length() - wordLenght; ) {
			
		}
		
	}
}
