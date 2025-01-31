package heapsort;

/**
 * Implements Heap Sort to sort an array of job applicant salaries in ascending order.
 */
public class HeapSort {

    /**
     * Sorts the array using Heap Sort.
     *
     * @param salaries The array of job applicant salaries to be sorted.
     */
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move the current root to the end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    /**
     * Heapifies a subtree rooted at index i.
     *
     * @param salaries The array to be heapified.
     * @param n        The size of the heap.
     * @param i        The index of the root of the subtree.
     */
    private static void heapify(int[] salaries, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int temp = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(salaries, n, largest);
        }
    }
}