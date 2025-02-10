package problem2;

import java.util.Arrays;
import java.util.Random;

/**
 * This class serves as the entry point for Problem 2.
 * It compares the performance of Bubble Sort, Merge Sort, and Quick Sort on large datasets.
 */
public class Main {
    public static void main(String[] args) {
        int size = 10_000; // Size of the dataset
        int[] dataset = new int[size];
        Random random = new Random();

        // Populate the dataset with random values
        for (int i = 0; i < size; i++) {
            dataset[i] = random.nextInt(size);
        }

        // Measure the time taken by Bubble Sort
        int[] bubbleArr = Arrays.copyOf(dataset, dataset.length);
        long startTime = System.nanoTime(); // Start timer
        SortingAlgorithms.bubbleSort(bubbleArr); // Perform Bubble Sort
        long endTime = System.nanoTime(); // End timer
        System.out.println("Bubble Sort Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure the time taken by Merge Sort
        int[] mergeArr = Arrays.copyOf(dataset, dataset.length);
        startTime = System.nanoTime(); // Start timer
        SortingAlgorithms.mergeSort(mergeArr, 0, mergeArr.length - 1); // Perform Merge Sort
        endTime = System.nanoTime(); // End timer
        System.out.println("Merge Sort Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure the time taken by Quick Sort
        int[] quickArr = Arrays.copyOf(dataset, dataset.length);
        startTime = System.nanoTime(); // Start timer
        SortingAlgorithms.quickSort(quickArr, 0, quickArr.length - 1); // Perform Quick Sort
        endTime = System.nanoTime(); // End timer
        System.out.println("Quick Sort Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
