package problem3;

/**
 * This class compares the performance of different string concatenation techniques.
 * It includes methods for using String (immutable), StringBuilder (mutable), and StringBuffer (thread-safe).
 */
public class StringConcatenation {

    /**
     * Concatenates strings using the immutable String class.
     *
     * @param n The number of iterations for concatenation.
     * @return The concatenated string.
     *
     * Time Complexity: O(N²), due to repeated creation of new String objects.
     */
    public static String concatWithString(int n) {
        String result = ""; // Initialize an empty String
        for (int i = 0; i < n; i++) {
            result += "a"; // Append "a" to the String (creates a new object each time)
        }
        return result;
    }

    /**
     * Concatenates strings using the mutable StringBuilder class.
     *
     * @param n The number of iterations for concatenation.
     * @return The concatenated string.
     *
     * Time Complexity: O(N), as StringBuilder avoids creating new objects.
     */
    public static String concatWithStringBuilder(int n) {
        StringBuilder sb = new StringBuilder(); // Initialize a StringBuilder
        for (int i = 0; i < n; i++) {
            sb.append("a"); // Append "a" to the StringBuilder
        }
        return sb.toString(); // Convert StringBuilder to String
    }

    /**
     * Concatenates strings using the thread-safe StringBuffer class.
     *
     * @param n The number of iterations for concatenation.
     * @return The concatenated string.
     *
     * Time Complexity: O(N), similar to StringBuilder but slightly slower due to synchronization.
     */
    public static String concatWithStringBuffer(int n) {
        StringBuffer sb = new StringBuffer(); // Initialize a StringBuffer
        for (int i = 0; i < n; i++) {
            sb.append("a"); // Append "a" to the StringBuffer
        }
        return sb.toString(); // Convert StringBuffer to String
    }
}