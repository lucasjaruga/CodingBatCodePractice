package string_2;

import java.util.ArrayList;

/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
 */

public class SameStarChar {
	public static boolean sameStarChar(String str) {
		boolean result = true;
		ArrayList<Integer> whereIsStar = new ArrayList<>(5);
		
		for(int i = 0; i < str.length(); ) {
			int starPosition = str.indexOf('*', i);
			if(starPosition != -1) {
				whereIsStar.add(starPosition);
				i += 1 + str.indexOf('*');
			} else {
				break;
			}
		}
			
		for(int x = 0; x < whereIsStar.size(); x++) {
			int positionOfStar = whereIsStar.get(x);
			if(positionOfStar == 0 || positionOfStar == str.length() - 1) {
				continue;
			} else if(str.charAt(positionOfStar - 1) == str.charAt(positionOfStar + 1) ) {
				result = true;
			} else {
				result = false;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(sameStarChar("xy*zzz"));
	}
}