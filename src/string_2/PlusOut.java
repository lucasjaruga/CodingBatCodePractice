package string_2;

import java.util.*;
import java.util.stream.Stream;

/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */

public class PlusOut {
	public static String plusOut(String str, String word) {
		StringBuilder result = new StringBuilder(str);
		int position = 0;
		ArrayList<Integer> whereIsWord = new ArrayList<>();
		ArrayList<Integer> whereShouldBeWord = new ArrayList<>();

		while (position < result.length()) {
			int tmp = result.indexOf(word, position);

			if (tmp == -1)
				break;

			if (tmp == 0) {
				whereShouldBeWord.add(0);
			} else {
				whereShouldBeWord.add(str.indexOf(word, position + 1));
			}

			whereIsWord.add(Integer.valueOf(tmp));
			result.delete(tmp, tmp + word.length());

			position += tmp;
		}

		for (int i = 0; i < result.length(); i++) {
			result.setCharAt(i, '+');
		}

		Iterator<Integer> itr = whereShouldBeWord.iterator();
		int i = itr.next();

		for (int x = i; x <= whereShouldBeWord.get(whereShouldBeWord.size() - 1);) {

			result.insert(x, word);

			if (itr.hasNext()) {
				x = itr.next();
			} else {
				break;
			}

		}

		return result.toString();
	}

	public static void main(String[] args) {

		System.out.println(plusOut("12xy34", "1"));

		// abXYabcXYZ
		// 12xy34xyabcxy
		// abXYabcXYZ
	}
}