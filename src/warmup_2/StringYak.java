package warmup_2;

/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */

public class StringYak {
	public String stringYak(String str) {
		StringBuilder result = new StringBuilder(str);
		
		for(int i = 0; i < result.length() - 2; i++) {
			char val1 = result.charAt(i);
			char val2 = result.charAt(i + 2);
			
			if(val1 == 'y' && val2 == 'k') {
				result.delete(i, i + 3);
			}
		}
		
		return result.toString();  
	}
}