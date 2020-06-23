package string_3;

/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */

class WithoutString {
	public static String withoutString(String base, String remove) {
		if(base.isEmpty()) {
			return "";
		}
		
		// creating an editable form of >base< String
		StringBuilder afterRemove = new StringBuilder(base);
		// creating  copy of >base< String which won't be case sensitive
		StringBuilder StrBuffer = new StringBuilder(base.toLowerCase());
		// creating copy of >remove< String which won't be case sensitive
		String strToRemove = remove.toLowerCase();
		// checking where exactly the String to remove starts
		int isSthToRemove = StrBuffer.indexOf(strToRemove);
		
		// removing strings
		while(isSthToRemove != -1) {
			int startIndex = isSthToRemove;
			StrBuffer.delete(startIndex, (startIndex + strToRemove.length()));
			afterRemove.delete(startIndex, (startIndex + strToRemove.length()));
			isSthToRemove = StrBuffer.indexOf(strToRemove);
		}
		
		return afterRemove.toString();
	}
	
	public static void main(String[] args) {
		
		// test example
		System.out.println(withoutString("THIS is a FISH", "iS"));
	} 
}
