package insertionsort;

/**
 * Main class to test the Insertion Sort implementation.
 */
public class Main {
    public static void main(String[] args) {
        int[] ids = {102, 105, 101, 103, 104};
        System.out.println("Original Employee IDs: ");
        printArray(ids);

        InsertionSort.insertionSort(ids);

        System.out.println("Sorted Employee IDs (Ascending Order): ");
        printArray(ids);
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