package logic_2;

/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
 */

class BlackJack {
	public int blackjack(int a, int b) {
		boolean isAGreaterThen21 = a > 21;
		boolean isBGreaterThen21 = b > 21;
		boolean areBothGreaterThen21 = isAGreaterThen21 & isBGreaterThen21;
		
		int aVs21 = Math.abs(21 - a);
		int bVs21 = Math.abs(21 - b);

		if (areBothGreaterThen21) {
			return 0;
		} else if(isAGreaterThen21 & !isBGreaterThen21) {
			return b;
		} else if(isBGreaterThen21 & !isAGreaterThen21) {
			return a;
		} else if(aVs21 < bVs21){
			return a;
		} else {
			return b;
		}
	}
}