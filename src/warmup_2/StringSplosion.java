package warmup_2;

/*
Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */

public class StringSplosion {
	public String stringSplosion(String str) {
		StringBuilder result = new StringBuilder(str);

		for (int i = str.length() - 1; i > 0; i--) {
			result.insert(i, str.substring(0, i));
		}

		return result.toString();
	}
}