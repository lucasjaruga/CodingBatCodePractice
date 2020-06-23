package logic_1;

/*
We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

teaParty(6, 8) → 1
teaParty(3, 8) → 0
teaParty(20, 6) → 2
 */

public class TeaParty {
	public int teaParty(int tea, int candy) {
		// 1 -> tea and candy >= 5
		// 2 -> tea or candy more then the other one
		// 0 -> tea or candy < 5
		boolean isNotEnoughTeaOrCandy = tea < 5 | candy < 5;
		boolean isDoubleTea = tea / candy >= 2;
		boolean isDoubleCandy = candy / tea >= 2;
		
		if(isNotEnoughTeaOrCandy) {
			return 0;
		} else if(isDoubleTea | isDoubleCandy) {
			return 2;
		} else {
			return 1;
		}
	}
}