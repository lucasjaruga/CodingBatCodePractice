package string_2;

/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */

class CountCode {
	public int countCode(String str) {
		int counter = 0;
		
		for(int beginning = 0; beginning + 3 < str.length(); beginning++) {
			String testStr = str.substring(beginning, beginning + 2) + str.charAt(beginning + 3);
			if(testStr.equals("coe"))
				counter++;
		}
		return counter;
	}
}