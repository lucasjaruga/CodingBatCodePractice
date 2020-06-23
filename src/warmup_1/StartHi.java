package warmup_1;

/*
Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */

class StartHi {
	public boolean startHi(String str) {
		boolean result = str.startsWith("hi");

		return result;
	}
}
