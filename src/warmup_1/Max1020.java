package warmup_1;

/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */

public class Max1020 {
	public int max1020(int a, int b) {
		  boolean isAInRange = a > 9 && a < 21;
		  boolean isBInRange = b > 9 && b < 21;
		  
		  int largerNumber = Math.max(a, b);
		  
		  if(isAInRange && isBInRange) {
			  return largerNumber;
		  } else if(isAInRange) {
			  return a;
		  } else if(isBInRange) {
			  return b;
		  } else {
			  return 0;
		  }
	}
}
