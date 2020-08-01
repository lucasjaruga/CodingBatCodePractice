package string_3;

/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
 */

public class SumNumbers {
	public static int sumNumbers(String str) {

		int sum = 0;

		// start searching
		for (int i = 0; i < str.length(); i++) {
			// if char inside String is digit start calculate number to add
			if (Character.isDigit(str.charAt(i))) {
				// creating tmp value
				StringBuilder numberToSum = new StringBuilder();
				// checking if number has more then one digit
				for (int j = i; j <= str.length(); j++) {
					if (j < str.length() && Character.isDigit(str.charAt(j))) {
						numberToSum.append(str.charAt(j));
						// if not then save where checking ended to save time
					} else {
						i = j;
						break;
					}
				}
				// add tmp value to sum
				sum += Integer.parseInt(numberToSum.toString());
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		String str = "a22bbb3";
		System.out.println(sumNumbers(str));
	}
}
