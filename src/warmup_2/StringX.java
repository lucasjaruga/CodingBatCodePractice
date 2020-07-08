package warmup_2;

/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */

public class StringX {
	public String stringX(String str) {
		if (str.length() < 3)
			return str;

		StringBuilder result = new StringBuilder(str);

		for (int i = result.length() - 2; i > 0; i--) {
			if (result.charAt(i) == 'x')
				result.deleteCharAt(i);
		}

		return result.toString();
	}
}