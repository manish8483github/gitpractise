package problem3;

import java.util.HashSet;

public class Example {
	public static void main(String[] args) {
		int[] arr ={ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 10;

		findPairs(arr, sum);
	}

	private static void findPairs(int[] arr, int sum) {
		HashSet<Integer> set = new HashSet<>();

		for (int num : arr) {
			int complement = sum - num; // Find the number needed to reach the sum
			if (set.contains(complement)) {
				System.out.println("Pair: (" + num + ", " + complement + ")");
			}
			set.add(num); // Store the number for future checks
		}
	}
}
