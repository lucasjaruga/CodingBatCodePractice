package warmup_1;

/* 
The parameter weekday is true if it is a weekday, and the parameter vacation is true
if we are on vacation. We sleep in if it is not a weekday or we're on vacation.
Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */

class SleepIn {
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  boolean result = false;
		  
		  if( (weekday == true) & (vacation == true) ) {
		    result = true;
		  } else if (weekday == false) {
		    result = true;
		  } else {
		    result = false;
		  }
		  
		  return result;
		}
}