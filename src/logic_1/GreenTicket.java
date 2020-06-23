package logic_1;

/*
You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
 */

class GreenTicket {
	public int greenTicket(int a, int b, int c) {
		  boolean allTheSame = a == b & b == c;
		  boolean twoAreTheSame = a == b | b == c | a == c;
		  
		  if(allTheSame) {
			  return 20;
		  } else if(twoAreTheSame) {
			  return 10;
		  } else {
			  return 0;
		  }
		  
	}
}
