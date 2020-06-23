package logic_1;

/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */

class FizzString {
	public String fizzString(String str) {
		  boolean isF = str.startsWith("f");
		  boolean isB = str.endsWith("b");
		  
		  if(isF & isB) {
			  return "FizzBuzz";
		  } else if(isF) {
			  return "Fizz";
		  } else if(isB) {
			  return "Buzz";
		  } else {
			  return str;
		  }
	}
}
