package problem1;

import java.util.Arrays;

/**
 * This class contains implementations of search algorithms.
 * It includes Linear Search (O(N)) and Binary Search (O(log N)).
 */
public class SearchAlgorithms {

    /**
     * Performs a Linear Search on an array to find the target element.
     *
     * @param arr    The array to search within.
     * @param target The value to search for.
     * @return The index of the target if found, otherwise -1.
     *
     * Time Complexity: O(N), where N is the size of the array.
     */
    public static int linearSearch(int[] arr, int target) {
        // Iterate through the array to find the target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    /**
     * Performs a Binary Search on a sorted array to find the target element.
     *
     * @param arr    The array to search within (must be sorted).
     * @param target The value to search for.
     * @return The index of the target if found, otherwise -1.
     *
     * Time Complexity: O(log N), where N is the size of the array.
     */
    public static int binarySearch(int[] arr, int target) {
        // Sort the array first (if not already sorted)
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        // Perform binary search using a while loop
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            if (arr[mid] == target) {
                return mid; // Target found at mid index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }
}

