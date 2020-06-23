package logic_1;

/*
Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".

fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"
 */

class FizzString2 {
	public String fizzString2(int n) {
		boolean isDivisible3 = n%3 == 0;
		boolean isDivisible5 = n%5 == 0;
		boolean isDivisibleBoth = n%15 == 0;
		
		if(isDivisibleBoth) {
			return "FizzBuzz!";
		} else if(isDivisible3) {
			return "Fizz!";
		} else if(isDivisible5) {
			return "Buzz!";
		} else {
			return n + "!";
		}
	}
}
