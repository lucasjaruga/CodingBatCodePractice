package string_2;

/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */

public class WordEnds {
	public static String wordEnds(String str, String word) {
		if (str.length() <= 2) {
			return "";
		}

		int wordLenght = word.length();
		StringBuilder result = new StringBuilder("");
		int positionInStr = 0;
		int wordPosition;
		
		for (; positionInStr < str.length() - wordLenght;) {
			
			if(wordLenght == 1) {
				wordPosition = str.indexOf(word, positionInStr + 1);
			} else {
				wordPosition = str.indexOf(word, positionInStr);
			}
			
			if (wordPosition == -1) {
				return result.toString();
			}			
			
			if (wordPosition == 0) {
				result.append(str.charAt(wordPosition + wordLenght));
				positionInStr = (wordPosition + (wordLenght - 1));
			} else if (wordPosition == str.length() - wordLenght) {
				result.append(str.charAt(str.length() - (wordLenght + 1)));
				positionInStr = (wordPosition + (wordLenght - 1));
			} else {
				result.append(str.charAt(wordPosition - 1));
				result.append(str.charAt(wordPosition + wordLenght));
				positionInStr = (wordPosition + (wordLenght - 1));
			}
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(wordEnds("XYXY", "XY"));
	}
}
