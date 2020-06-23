package logic_1;

/*
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
 */

class TwoAsOne {
	public boolean twoAsOne(int a, int b, int c) {
		  boolean addABtoGetC = a + b == c;
		  boolean addACtoGetB = a + c == b;
		  boolean addBCtoGetA = b + c == a;
		  
		  if(addABtoGetC | addACtoGetB | addBCtoGetA) {
			  return true;
		  } else {
			  return false;
		  }
	}
}