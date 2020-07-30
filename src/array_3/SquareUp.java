package array_3;

/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */

public class SquareUp {
	public static int[] squareUp(int n) {

		int resultLength = n * n;
		int[] result = new int[resultLength];
		int noGroups = n;
		
		int positionInArr = result.length - 1;
		for (int j = 0; j < noGroups; j++) {

			for (int i = 1; i <= n; i++) {
				result[positionInArr] = i;
				positionInArr--;
			}
			n--;
			positionInArr = positionInArr - j;
		}
		return result;
	}

	public static void main(String[] args) {

		int[] result = squareUp(4);

		for (int x : result)
			System.out.print(x + " ");
	}
}