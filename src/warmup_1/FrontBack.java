package warmup_1;

/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */

class FrontBack {
	public String frontBack(String str) {
		if(str.length() == 0) {
			return "";
		} else if(str.length() == 1) {
			return String.valueOf(str.charAt(0));
		} else {
			return str.charAt(str.length() -1 ) + str.substring(1, str.length() - 1) + str.charAt(0);
		}
	}
}