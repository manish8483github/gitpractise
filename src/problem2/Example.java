package problem2;

import java.util.HashMap;

public class Example {
	public static void main(String[] args) {
		String s = "manish mhatre";
		findRepeatingChar(s);
	}

	public static void findRepeatingChar(String s) {

		// Create a HashMap to store character counts
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		// Convert the string to a char array
		for (char c : s.toCharArray()) {
			// Skip spaces or non-alphabetic characters if needed
			if (c != ' ') {
				charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
				// charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
			}
		}

		// Print characters that appear more than once
		System.out.println("Repeating characters:");
		for (char c : charCountMap.keySet()) {
			if (charCountMap.get(c) <= 1) {
				System.out.println(c);
			}
		}
	}
}
