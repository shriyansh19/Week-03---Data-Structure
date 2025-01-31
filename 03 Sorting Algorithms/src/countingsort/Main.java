package countingsort;

/**
 * Main class to test the Counting Sort implementation.
 */
public class Main {
    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 14, 16};
        System.out.println("Original Ages: ");
        printArray(ages);

        CountingSort.countingSort(ages);

        System.out.println("Sorted Ages (Ascending Order): ");
        printArray(ages);
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