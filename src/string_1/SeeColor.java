package string_1;

/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */

public class SeeColor {
	public String seeColor(String str) {
		boolean isRed = false;
		boolean isBlue = false;

		if (str.length() < 3) {
			return "";
		} else if (str.length() == 3) {
			isRed = str.substring(0, 3).equals("red");
		} else {
			isRed = str.substring(0, 3).equals("red");
			isBlue = str.substring(0, 4).equals("blue");
		}

		if (isRed) {
			return str.substring(0, 3);
		} else if (isBlue) {
			return str.substring(0, 4);
		} else {
			return "";
		}
	}
}