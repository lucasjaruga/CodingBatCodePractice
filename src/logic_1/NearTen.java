package logic_1;

/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10.

nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
 */

class NearTen {
	public boolean nearTen(int num) {
		  if(num < 0) {
			  return false;
		  }
		  
		  boolean near10 = num%10 == 1 | num%10 == 2 | num%10 == 8 | num%10 == 9;
		  
		  if(near10 | num%10 == 0) {
			  return true;
		  } else {
			  return false;
		  }
	}
}