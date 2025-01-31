package selectionsort;

/**
 * Main class to test the Selection Sort implementation.
 */
public class Main {
    public static void main(String[] args) {
        int[] scores = {88, 75, 92, 65, 80};
        System.out.println("Original Exam Scores: ");
        printArray(scores);

        SelectionSort.selectionSort(scores);

        System.out.println("Sorted Exam Scores (Ascending Order): ");
        printArray(scores);
    }

    /**
     * Utility method to print an array.
     *
     * @param arr The array to be printed.
     */
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}