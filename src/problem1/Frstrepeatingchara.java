package problem1;

import java.util.HashSet;

public class Frstrepeatingchara {

    public static void main(String[] args) {
        String str = "java programming";
        System.out.println("First repeating character: " + findFirstRepeatingChar(str));
    }

    public static Character findFirstRepeatingChar(String str) {
        HashSet<Character> charsSet = new HashSet<>();

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // Skip spaces
            if (currentChar == ' ') {
                continue;
            }

            // Check if the character is already in the set
            if (charsSet.contains(currentChar)) {
                return currentChar;
            }

            // Add the character to the set
            charsSet.add(currentChar);
        }

        // Return null if no repeating character is found
        return null;
    }
}

