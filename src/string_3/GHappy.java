package string_3;

/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false

 */

public class GHappy {
	public boolean gHappy(String str) {
		
		// I'm not really proud of that solution but I couldn't figure out a better one so far

		boolean result = true;

		for (int i = 0; i < str.length(); i++) {
			// if there is only g in String then it's not happy
			if (str.length() == 1 && str.charAt(i) == 'g') {
				result = false;
				// else verify if there is another g next to this one
			} else if (str.charAt(i) == 'g' && str.length() > 1) {
				if (str.length() == 1 && str.charAt(i) == 'g') {
					result = false;
					break;
				}
				if (i == 0 && str.charAt(i + 1) != 'g') {
					result = false;
					break;
				}
				if (i == str.length() - 1 && str.charAt(i - 1) != 'g') {
					result = false;
					break;
				}
				if (str.length() > 2 && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
					result = false;
					break;
				}
			}
		}
		return result;
	}
}