package bubblesort;

/**
 * Main class to test the Bubble Sort implementation.
 */
public class Main {
    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 90, 65};
        System.out.println("Original Marks: ");
        printArray(marks);

        BubbleSort.bubbleSort(marks);

        System.out.println("Sorted Marks (Ascending Order): ");
        printArray(marks);
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