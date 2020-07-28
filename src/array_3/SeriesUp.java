package array_3;

import java.util.ArrayList;

/*
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
 */

public class SeriesUp {
	public int[] seriesUp(int n) {

		ArrayList<Integer> tmp = new ArrayList<>(0);

		// no loops based on n value
		for (int i = 1; i <= n; i++) {

			// value as a first element of each group in pattern
			int value = 1;

			// creating each group in pattern
			for (int j = 1; j <= i; j++) {
				tmp.add(value);
				value++;
			}
		}

		// creating int array for return purpose based on size of tmp ArrayList
		int[] result = new int[tmp.size()];
		for (int i = 0; i < tmp.size(); i++) {
			result[i] = tmp.get(i);
		}
		return result;
	}
}