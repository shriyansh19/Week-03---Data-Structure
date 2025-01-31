package mergesort;

/**
 * Main class to test the Merge Sort implementation.
 */
public class Main {
    public static void main(String[] args) {
        int[] prices = {450, 320, 600, 150, 780};
        System.out.println("Original Book Prices: ");
        printArray(prices);

        MergeSort.mergeSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Book Prices (Ascending Order): ");
        printArray(prices);
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