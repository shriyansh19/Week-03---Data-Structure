package linearsearch.firstnegative;

/**
 * This class demonstrates how to perform a linear search to find the first negative number in an array.
 */
public class FirstNegativeNumber {

    /**
     * Finds the index of the first negative number in the array.
     *
     * @param array The array of integers to search.
     * @return The index of the first negative number, or -1 if no negative number is found.
     */
    public static int findFirstNegative(int[] array) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is negative
            if (array[i] < 0) {
                return i; // Return the index of the first negative number
            }
        }
        // If no negative number is found, return -1
        return -1;
    }
}