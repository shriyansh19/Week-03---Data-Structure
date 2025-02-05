package binarysearch.firstlastoccurrence;

/**
 * This class demonstrates how to find the first and last occurrence of a target element in a sorted array using Binary Search.
 */
public class FirstLastOccurrence {

    /**
     * Finds the first occurrence of the target element.
     *
     * @param arr The sorted array.
     * @param target The target element.
     * @return The index of the first occurrence, or -1 if not found.
     */
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    /**
     * Finds the last occurrence of the target element.
     *
     * @param arr The sorted array.
     * @param target The target element.
     * @return The index of the last occurrence, or -1 if not found.
     */
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}