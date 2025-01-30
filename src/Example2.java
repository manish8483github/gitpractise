import java.util.HashSet;


public class Example2 {
	public static void main(String[] args) {
		String s = "manish mhatre";

		// Create a HashSet to store characters that have already been seen
		HashSet<Character> seenChars = new HashSet<>();

		// Loop through each character in the string
		for (char c : s.toCharArray()) {
			// Skip spaces
			if (c != ' ') {
				// If character is already in the set, it's a repeating character
				if (seenChars.contains(c)) {
					System.out.print(c); // Output only the first repeating character
					return; // Exit after finding the first repeating character
				}
				// Add the character to the set
				seenChars.add(c);
			}
		}
	}
}
