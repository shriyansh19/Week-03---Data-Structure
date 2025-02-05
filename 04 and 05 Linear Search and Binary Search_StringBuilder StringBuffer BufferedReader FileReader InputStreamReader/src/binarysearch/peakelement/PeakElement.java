package binarysearch.peakelement;

/**
 * This class demonstrates how to find a peak element in an array using Binary Search.
 */
public class PeakElement {

    /**
     * Finds a peak element in the array.
     *
     * @param arr The array of integers.
     * @return The index of a peak element.
     */
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the middle element is greater than its right neighbor, search the left half
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                // Otherwise, search the right half
                left = mid + 1;
            }
        }

        // When left == right, we've found a peak element
        return left;
    }
}