public class Example {
	public static void main(String[] args) {
		String text = "PrAnotI@";

		for (char c : text.toCharArray()) { // Check for vowels
			if ("PAI@".indexOf(c) >= 0) {
				System.out.print(c);
			}

		}

		/*
		 * String CleaText = text.replaceAll("[^a-zA-Z0-9]", "");
		 * System.out.println(CleaText);
		 */
	}
}
