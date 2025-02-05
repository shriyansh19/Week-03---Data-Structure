package binarysearch.rotationpoint;

/**
 * This class demonstrates how to find the rotation point (smallest element) in a rotated sorted array using Binary Search.
 */
public class RotationPoint {

    /**
     * Finds the index of the smallest element (rotation point) in the array.
     *
     * @param arr The rotated sorted array.
     * @return The index of the smallest element.
     */
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the middle element is greater than the rightmost element, the rotation point is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // Otherwise, the rotation point is in the left half (including mid)
                right = mid;
            }
        }

        // When left == right, we've found the rotation point
        return left;
    }
}