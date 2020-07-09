package warmup_2;

/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */

public class AltPairs {
	public static String altPairs(String str) {
		StringBuilder result = new StringBuilder();

		int positionInStr = 0;
		while(positionInStr < str.length()) {
			if(positionInStr != str.length() - 1) {
				result.append(str.substring(positionInStr, positionInStr + 2));
			} else {
				result.append(str.substring(positionInStr, positionInStr + 1));
			}
			positionInStr += 4;
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(altPairs("Chocolate"));
	}
}