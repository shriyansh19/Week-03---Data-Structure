package stringbuilder.reverse;

/**
 * This class demonstrates how to reverse a string using StringBuilder.
 */
public class ReverseString {

    /**
     * Reverses the input string using StringBuilder.
     *
     * @param input The string to be reversed.
     * @return The reversed string.
     */
    public static String reverseString(String input) {
        // Create a StringBuilder object and append the input string
        StringBuilder sb = new StringBuilder(input);
        // Use the reverse() method to reverse the string
        sb.reverse();
        // Convert StringBuilder back to a string and return
        return sb.toString();
    }
}