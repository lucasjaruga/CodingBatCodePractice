package warmup_1;

/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */

class MixStart {
	public boolean mixStart(String str) {
		boolean result;

		if (str.length() > 2) {
			CharSequence subStr = str.subSequence(1, 3);
			if (subStr.equals("ix")) {
				result = true;
			} else {
				result = false;
			}
		} else {
			result = false;
		}

		return result;
	}
}
