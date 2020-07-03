package logic_2;

/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 */

class MakeChocolate {
	public int makeChocolate(int small, int big, int goal) {
		// small bar - 1
		// big bar - 5

		int bigBarsKilos = big * 5;
		boolean areBigEnough = goal - bigBarsKilos == 0;
		int howManySmall = 0;

		if (areBigEnough) {
			return 0;
		} else if (goal % 5 == 0 && bigBarsKilos + small >= goal) {
			int howManyBig = goal / 5;
			if (howManyBig <= big) {
				howManySmall = goal - (howManyBig * 5);
				return howManySmall;
			} else {
				howManySmall = goal - bigBarsKilos;
				if (howManySmall <= small) {
					return howManySmall;
				} else {
					return -1;
				}
			}
		} else if (goal % 5 != 0 && goal % 5 <= small) {
			if (goal - bigBarsKilos < 0) {
				return howManySmall = goal % 5;
			} else if(goal - bigBarsKilos <= small) {
				howManySmall = goal - bigBarsKilos;
				return howManySmall;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
}