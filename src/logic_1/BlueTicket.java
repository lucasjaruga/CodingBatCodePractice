package logic_1;

/*
You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.

blueTicket(9, 1, 0) → 10
blueTicket(9, 2, 0) → 0
blueTicket(6, 1, 4) → 10
 */

class BlueTicket {
	public int blueTicket(int a, int b, int c) {
		  int abPair = a + b;
		  int bcPair = b + c;
		  int acPair = c + a;
		  
		  boolean anyPair10 = abPair == 10 | bcPair == 10 | acPair == 10;
		  boolean abSum10More = Math.abs(abPair - bcPair) == 10 | Math.abs(abPair - acPair) == 10;
		  
		  if(anyPair10) {
			  return 10;
		  } else if(abSum10More) {
			  return 5;
		  } else {
			  return 0;
		  }
	}
}
