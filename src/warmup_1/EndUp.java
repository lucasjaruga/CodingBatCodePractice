package warmup_1;

/*
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */

public class EndUp {
	public static String endUp(String str) {
		StringBuilder result = new StringBuilder();

		if (str.length() < 3) {
			return str.toUpperCase();
		} else {
			result.append(str.substring(str.length() - 3).toUpperCase());
			result.insert(0, str.substring(0, str.length() - 3));
		}

		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(endUp("Hello"));
	}
}