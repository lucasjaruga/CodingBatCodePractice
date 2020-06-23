package string_3;

/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter
immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
 */

import java.util.*;

class CountYZ {
	public static int countYZ(String str) {
		if(str.isEmpty()) {
			return 0;
		}
		
		ArrayList<String> wordsFromStr = new ArrayList<>();
		int strLength = str.length();

		// filtering out all words from >str<
		StringBuilder wordToAddToArrayList = new StringBuilder();
		for (int i = 0; i < strLength; i++) {
			boolean isChar = Character.isLetter(str.charAt(i));
			if (isChar) {
				wordToAddToArrayList.append(str.charAt(i));
			} else {
				wordsFromStr.add(wordToAddToArrayList.toString());
				int stringBuilderLength = wordToAddToArrayList.length();
				wordToAddToArrayList.delete(0, stringBuilderLength);
			}
		}
		wordsFromStr.add(wordToAddToArrayList.toString());

		// counting how many words ends with 'y' or 'z'
		int wordCounter = 0;
		for (String word : wordsFromStr) {
			if(word.endsWith("Y") || word.endsWith("y")) {
				wordCounter++;
			} else if(word.endsWith("z") || word.endsWith("Z")) {
				wordCounter++;
			}
		}

		return wordCounter;
	}
	
	public static void main(String[] args) {
		System.out.println(countYZ("fez day"));
		System.out.println(countYZ("!!day--yaz!!"));
		System.out.println(countYZ("y2bz"));
	}
}
