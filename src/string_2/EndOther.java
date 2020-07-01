package string_2;

/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */

public class EndOther {
	public boolean endOther(String a, String b) {
		boolean appearsAtTheEnd = a.toLowerCase().endsWith(b.toLowerCase())
				|| b.toLowerCase().endsWith(a.toLowerCase());

		return appearsAtTheEnd;
	}
}
