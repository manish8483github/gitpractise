package problem2;

public class GetSpecialCharacter2 {
	public static void main(String[] args) {
		String name = "manIsh@#$%^";
		/*
		 * String builder = new StringBuilder(name).reverse().toString();
		 * System.out.println(builder);
		 */
		String reversed = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			if (Character.isUpperCase(ch) ||(!Character.isLetterOrDigit(ch) && (!Character.isWhitespace(ch)))) {
				reversed += ch;
			}
		}
		System.out.println(reversed);
	}
}
