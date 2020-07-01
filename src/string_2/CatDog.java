package string_2;

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */

public class CatDog {
	public boolean catDog(String str) {
		int catCounter = 0;
		int dogCounter = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equalsIgnoreCase("cat")) {
				catCounter++;
			} else if (str.substring(i, i + 3).equalsIgnoreCase("dog")) {
				dogCounter++;
			}
		}

		if (catCounter == dogCounter) {
			return true;
		} else {
			return false;
		}
	}
}