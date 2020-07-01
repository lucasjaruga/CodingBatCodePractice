package string_2;

/*
Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
 */

public class RepeatFront {
	public static String repeatFront(String str, int n) {
		if(str.length() == 0) {
			return "";
		}
		
		StringBuilder result = new StringBuilder();
		String firstNCharacters = str.substring(0, n);
		
		for( ; n >= 0; n--) {
			result.append(firstNCharacters, 0, n);
		}
		
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(repeatFront("xyz", 3));
	}
}
