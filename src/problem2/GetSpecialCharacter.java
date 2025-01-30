package problem2;

public class GetSpecialCharacter {
	public static void main(String[] args) {
		String name = "manisH@#$%^";
		String specialCharacters = getSpecialChar(name);
		System.out.println("Special Characters: " + specialCharacters);
		System.out.println(name.length());
	}

	public static String getSpecialChar(String input) {
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (!Character.isLetterOrDigit(c)) {
				s.append(c);
			}
		}
		return s.toString();
	}
}
