package string_2;

/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */

class DoubleChar {
	public String doubleChar(String str) {
		  StringBuilder newStr = new StringBuilder();
		  
		  for(int i = 0; i < str.length(); i++) {
			  char tmp = str.charAt(i);
			  newStr.append(tmp).append(tmp);
		  }
		  
		  return newStr.toString();
	}
}
