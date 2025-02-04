package stringbuffer.concatenate;

/**
 * This class demonstrates how to concatenate strings efficiently using StringBuffer.
 */
public class ConcatenateStrings {

    /**
     * Concatenates an array of strings using StringBuffer.
     *
     * @param strings The array of strings to be concatenated.
     * @return The concatenated string.
     */
    public static String concatenateStrings(String[] strings) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Iterate through the array and append each string to the StringBuffer
        for (String str : strings) {
            sb.append(str);
        }

        // Return the concatenated string
        return sb.toString();
    }
}