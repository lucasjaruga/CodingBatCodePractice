package string_3;

/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */

public class MaxBlock {
	public static int maxBlock(String str) {

		int largestBlock = 0;

		for (int i = 0; i < str.length(); i++) {

			// get first char to check and save it in tmp variable
			char charToCheck = str.charAt(i);
			StringBuilder tmpBlock = new StringBuilder(str.substring(i, i + 1));
			int tmpBlockLength = 0;

			// count length of block
			for (int j = i + 1; j < str.length(); j++) {

				// if next char is the same then append it to tmpBlock, else break counting
				if (charToCheck == str.charAt(j)) {
					tmpBlock.append(str.charAt(j));
				} else {
					break;
				}
			}
			// calculate length of found block
			tmpBlockLength = tmpBlock.length();

			// if it's larger then assign new value to largestBlock variable
			if (tmpBlockLength > largestBlock) {
				largestBlock = tmpBlockLength;
			}
		}
		return largestBlock;
	}

	public static void main(String[] args) {

		String str = "xyzz";
		System.out.println(maxBlock(str));
	}
}