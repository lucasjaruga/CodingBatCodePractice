package logic_2;

/*
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */

class MakeBricks {
	public boolean makeBricks(int small, int big, int goal) {
		// 1 inch small bricks
		// 5 inch big bricks
		
		if(big != 0 & goal/5 <= big) {
			int noSmallBricksNeeded = goal % 5;
			if(noSmallBricksNeeded <= small) {
				return true;
			} else {
				return false;
			}
		} else if(small != 0) {
			int noSmallBricksNeeded = goal - (big*5);
			if(noSmallBricksNeeded <= small) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}