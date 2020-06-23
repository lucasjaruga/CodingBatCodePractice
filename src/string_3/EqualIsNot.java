package string_3;

/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */

class EqualIsNot {
	public static boolean equalIsNot(String str) {
	
		//counters
		int noIS = 0;
		int noNOT = 0;
	  
		// first appearance index
		int whereIS = str.indexOf("is");
		int whereNOT = str.indexOf("not");
		
		int isPointer = whereIS;
		int notPointer = whereNOT;
		
		while(isPointer < str.length()) {
			whereIS = str.indexOf("is", isPointer);
			if(whereIS != -1) {
				noIS++;
			}
			isPointer += whereIS;
		}
		
		while(notPointer < str.length()) {
			whereNOT = str.indexOf("not", notPointer);
			if(whereNOT != -1) {
				noNOT++;
			}
			notPointer += whereNOT;
		}
		
		boolean result;
		
		if(noIS == noNOT) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(equalIsNot("This is not"));
	}
}
