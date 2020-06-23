package warmup_1;

/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */

class StringE {
	public boolean stringE(String str) {
		boolean result;
		int eCounter = 0;

		char[] strToCheck = str.toCharArray();
		for (char x : strToCheck) {
			if (x == 'e')
				eCounter++;
		}

		if (eCounter != 0 & eCounter < 4) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
