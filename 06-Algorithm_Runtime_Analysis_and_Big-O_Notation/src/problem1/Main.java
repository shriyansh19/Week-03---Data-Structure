package problem1;

import java.util.Random;

/**
 * This class serves as the entry point for Problem 1.
 * It compares the performance of Linear Search and Binary Search on large datasets.
 */
public class Main {
    public static void main(String[] args) {
        // Generate a large dataset of random integers
        int size = 1_000_000; // Size of the dataset
        int[] dataset = new int[size];
        Random random = new Random();

        // Populate the dataset with random values
        for (int i = 0; i < size; i++) {
            dataset[i] = random.nextInt(size);
        }

        // Select a random target value from the dataset
        int target = dataset[random.nextInt(size)];

        // Measure the time taken by Linear Search
        long startTime = System.nanoTime(); // Start timer
        int linearResult = SearchAlgorithms.linearSearch(dataset, target); // Perform Linear Search
        long endTime = System.nanoTime(); // End timer
        System.out.println("Linear Search Result: " + linearResult + ", Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure the time taken by Binary Search
        startTime = System.nanoTime(); // Start timer
        int binaryResult = SearchAlgorithms.binarySearch(dataset, target); // Perform Binary Search
        endTime = System.nanoTime(); // End timer
        System.out.println("Binary Search Result: " + binaryResult + ", Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}

