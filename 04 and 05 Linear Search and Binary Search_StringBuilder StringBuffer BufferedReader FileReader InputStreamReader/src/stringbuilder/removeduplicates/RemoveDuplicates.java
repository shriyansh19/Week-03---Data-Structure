package stringbuilder.removeduplicates;

import java.util.HashSet;

/**
 * This class demonstrates how to remove duplicate characters from a string using StringBuilder.
 */
public class RemoveDuplicates {

    /**
     * Removes duplicate characters from the input string while maintaining the original order.
     *
     * @param input The string from which duplicates are to be removed.
     * @return The string without duplicate characters.
     */
    public static String removeDuplicates(String input) {
        // Create a StringBuilder to store the result
        StringBuilder sb = new StringBuilder();
        // Create a HashSet to track seen characters
        HashSet<Character> seen = new HashSet<>();

        // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // If the character is not in the HashSet, append it to the StringBuilder
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }

        // Return the StringBuilder as a string
        return sb.toString();
    }
}