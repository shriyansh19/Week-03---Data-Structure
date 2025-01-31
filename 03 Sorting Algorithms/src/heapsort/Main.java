package heapsort;

/**
 * Main class to test the Heap Sort implementation.
 */
public class Main {
    public static void main(String[] args) {
        int[] salaries = {50000, 60000, 45000, 70000, 55000};
        System.out.println("Original Salaries: ");
        printArray(salaries);

        HeapSort.heapSort(salaries);

        System.out.println("Sorted Salaries (Ascending Order): ");
        printArray(salaries);
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