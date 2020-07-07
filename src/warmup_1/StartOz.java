package warmup_1;

/*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */

public class StartOz {
	public String startOz(String str) {
		String first = "";
		String second = "";
		
		if(str.length() >= 2) {
			first = str.substring(0, 1);
			second = str.substring(1, 2);
		} else if(str.length() == 1) {
			first = str.substring(0, 1);
		} else {
			return "";
		}
		
		if (first.equals("o") && second.equals("z")) {
			return "oz";
		} else if (first.equals("o")) {
			return "o";
		} else if (second.equals("z")) {
			return "z";
		} else {
			return "";
		}
	}
}
