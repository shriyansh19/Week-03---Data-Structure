package quicksort;

/**
 * Implements Quick Sort to sort an array of product prices in ascending order.
 */
public class QuickSort {

    /**
     * Sorts the array using Quick Sort.
     *
     * @param prices The array of product prices to be sorted.
     * @param low    The starting index of the array.
     * @param high   The ending index of the array.
     */
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(prices, low, high);

            // Recursively sort elements before and after partition
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions the array around the pivot element.
     *
     * @param prices The array to be partitioned.
     * @param low    The starting index of the array.
     * @param high   The ending index of the array.
     * @return The index of the pivot element.
     */
    private static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap prices[i + 1] and pivot
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
}