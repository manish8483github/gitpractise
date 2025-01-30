package problem1;
//String str="java programming ";find the first repeatating character

import java.util.HashMap;
import java.util.HashSet;

public class firstrepeatingChar {

	public static void main(String[] args) {

		String str = "java programming";

		System.out.println("firstchar" + firstrepeatingChar(str));

	}

	public static Character firstrepeatingChar(String str) {
		HashSet<Character> CharSet = new HashSet<>();

//iterate
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (currentChar == ' ') {
				continue;
			}

			if (CharSet.contains(currentChar)) {
				return currentChar;
			}

//if no
			CharSet.add(currentChar);
		}
//if no repeating chr return null

		return null;
	}

}
