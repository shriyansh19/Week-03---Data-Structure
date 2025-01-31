package selectionsort;

/**
 * Implements Selection Sort to sort an array of exam scores in ascending order.
 */
public class SelectionSort {

    /**
     * Sorts the array using Selection Sort.
     *
     * @param scores The array of exam scores to be sorted.
     */
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap scores[i] and scores[minIndex]
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }
}