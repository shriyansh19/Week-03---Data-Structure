package quicksort;

/**
 * Main class to test the Quick Sort implementation.
 */
public class Main {
    public static void main(String[] args) {
        int[] prices = {1200, 500, 800, 1500, 300};
        System.out.println("Original Product Prices: ");
        printArray(prices);

        QuickSort.quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices (Ascending Order): ");
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