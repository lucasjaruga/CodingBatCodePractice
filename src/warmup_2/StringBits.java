package warmup_2;

/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
class StringBits {
	public String stringBits(String str) {
		String result;
		
		StringBuilder newStr = new StringBuilder();
		
		for(int firstChar = 0; firstChar < str.length(); ) {
			newStr.append(str.charAt(firstChar));
			firstChar += 2;
		}
		
		result = newStr.toString();
		return result;
	}
}
