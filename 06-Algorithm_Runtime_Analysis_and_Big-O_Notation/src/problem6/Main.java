package problem6;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * This class serves as the entry point for Problem 6.
 * It compares the performance of Array, HashSet, and TreeSet for searching elements.
 */
public class Main {
    public static void main(String[] args) {
        int size = 1_000_000; // Size of the dataset
        Random random = new Random();

        // Generate a large dataset of random integers
        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            int value = random.nextInt(size);
            array[i] = value; // Populate array
            hashSet.add(value); // Populate HashSet
            treeSet.add(value); // Populate TreeSet
        }

        // Select a random target value from the dataset
        int target = array[random.nextInt(size)];

        // Measure the time taken by Array search
        long startTime = System.nanoTime(); // Start timer
        boolean arrayResult = SearchDataStructures.searchInArray(array, target); // Perform search in array
        long endTime = System.nanoTime(); // End timer
        System.out.println("Array Search Result: " + arrayResult + ", Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure the time taken by HashSet search
        startTime = System.nanoTime(); // Start timer
        boolean hashSetResult = SearchDataStructures.searchInHashSet(hashSet, target); // Perform search in HashSet
        endTime = System.nanoTime(); // End timer
        System.out.println("HashSet Search Result: " + hashSetResult + ", Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure the time taken by TreeSet search
        startTime = System.nanoTime(); // Start timer
        boolean treeSetResult = SearchDataStructures.searchInTreeSet(treeSet, target); // Perform search in TreeSet
        endTime = System.nanoTime(); // End timer
        System.out.println("TreeSet Search Result: " + treeSetResult + ", Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}

