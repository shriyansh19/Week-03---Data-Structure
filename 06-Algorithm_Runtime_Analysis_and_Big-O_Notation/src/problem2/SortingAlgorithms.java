
package problem2;

import java.util.Arrays;

/**
 * This class contains implementations of sorting algorithms.
 * It includes Bubble Sort (O(N²)), Merge Sort (O(N log N)), and Quick Sort (O(N log N)).
 */
public class SortingAlgorithms {

    /**
     * Implements Bubble Sort to sort an array.
     *
     * @param arr The array to be sorted.
     *
     * Time Complexity: O(N²), where N is the size of the array.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Implements Merge Sort to sort an array.
     *
     * @param arr   The array to be sorted.
     * @param left  The starting index of the subarray.
     * @param right The ending index of the subarray.
     *
     * Time Complexity: O(N log N), where N is the size of the array.
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2; // Find the middle index

            // Recursively sort the left and right halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    /**
     * Merges two sorted subarrays into a single sorted array.
     *
     * @param arr   The array containing the subarrays.
     * @param left  The starting index of the first subarray.
     * @param mid   The ending index of the first subarray.
     * @param right The ending index of the second subarray.
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; // Temporary array to hold merged elements
        int i = left, j = mid + 1, k = 0;

        // Merge elements from both subarrays into the temporary array
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right subarray
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back into the original array
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    /**
     * Implements Quick Sort to sort an array.
     *
     * @param arr  The array to be sorted.
     * @param low  The starting index of the subarray.
     * @param high The ending index of the subarray.
     *
     * Time Complexity: O(N log N), where N is the size of the array.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Partition the array around a pivot
            quickSort(arr, low, pivotIndex - 1); // Sort the left subarray
            quickSort(arr, pivotIndex + 1, high); // Sort the right subarray
        }
    }

    /**
     * Partitions the array around a pivot element.
     *
     * @param arr  The array to be partitioned.
     * @param low  The starting index of the subarray.
     * @param high The ending index of the subarray.
     * @return The index of the pivot element after partitioning.
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of the smaller element

        // Rearrange elements based on the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
    }
}



