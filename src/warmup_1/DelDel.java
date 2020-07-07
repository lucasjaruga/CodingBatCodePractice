package warmup_1;

/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */

public class DelDel {
	public String delDel(String str) {
		  StringBuilder result = new StringBuilder(str);
		  
		  if(result.length() < 4) {
			  return result.toString();
		  } else if (result.substring(1, 4).equals("del")){
			  return result.delete(1, 4).toString();
		  } else {
			  return result.toString();
		  }
	}
}
