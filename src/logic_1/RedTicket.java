package logic_1;

/*
You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.

redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5
 */

class RedTicket {
	public int redTicket(int a, int b, int c) {
		  boolean allAre2 = a == 2 & b == 2 & c == 2;
		  boolean allAreTheSame = a == b & b == c;
		  boolean bAndCDiffFromA = a != c & a != b;
		  
		  if(allAre2) {
			  return 10;
		  } else if(allAreTheSame) {
			  return 5;
		  } else if (bAndCDiffFromA) {
			  return 1;
		  } else {
			  return 0;
		  }
	}
}
