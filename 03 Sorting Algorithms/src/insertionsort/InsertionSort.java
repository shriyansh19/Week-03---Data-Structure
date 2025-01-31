package insertionsort;

/**
 * Implements Insertion Sort to sort an array of employee IDs in ascending order.
 */
public class InsertionSort {

    /**
     * Sorts the array using Insertion Sort.
     *
     * @param ids The array of employee IDs to be sorted.
     */
    public static void insertionSort(int[] ids) {
        int n = ids.length;
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }
}