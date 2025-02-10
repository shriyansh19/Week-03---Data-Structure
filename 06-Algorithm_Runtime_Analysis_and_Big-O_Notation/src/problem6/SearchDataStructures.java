package problem6;

import java.util.*;

/**
 * This class compares the performance of different data structures for searching elements.
 * It includes methods for searching using Array, HashSet, and TreeSet.
 */
public class SearchDataStructures {

    /**
     * Searches for an element in an array using linear search.
     *
     * @param arr    The array to search within.
     * @param target The value to search for.
     * @return True if the target is found, otherwise false.
     *
     * Time Complexity: O(N), where N is the size of the array.
     */
    public static boolean searchInArray(int[] arr, int target) {
        for (int num : arr) { // Iterate through the array
            if (num == target) {
                return true; // Target found
            }
        }
        return false; // Target not found
    }

    /**
     * Searches for an element in a HashSet.
     *
     * @param hashSet The HashSet to search within.
     * @param target  The value to search for.
     * @return True if the target is found, otherwise false.
     *
     * Time Complexity: O(1) on average, due to hashing.
     */
    public static boolean searchInHashSet(HashSet<Integer> hashSet, int target) {
        return hashSet.contains(target); // Use HashSet's contains() method
    }

    /**
     * Searches for an element in a TreeSet.
     *
     * @param treeSet The TreeSet to search within.
     * @param target  The value to search for.
     * @return True if the target is found, otherwise false.
     *
     * Time Complexity: O(log N), as TreeSet uses a balanced binary search tree.
     */
    public static boolean searchInTreeSet(TreeSet<Integer> treeSet, int target) {
        return treeSet.contains(target); // Use TreeSet's contains() method
    }
}