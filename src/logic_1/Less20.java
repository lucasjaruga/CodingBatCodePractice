package logic_1;

/*
Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.

less20(18) → true
less20(19) → true
less20(20) → false
 */

class Less20 {
	public boolean less20(int n) {
		  if(n < 0 | n%20 == 0) {
			  return false;
		  }
		  
		  if( (n + 1)%20 == 0 | (n + 2)%20 == 0) {
			  return true;
		  } else {
			  return false;
		  }
	}
}
