package binarysearch.firstlastoccurrence;

import static binarysearch.firstlastoccurrence.FirstLastOccurrence.findFirstOccurrence;
import static binarysearch.firstlastoccurrence.FirstLastOccurrence.findLastOccurrence;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5}; // Example sorted array
        int target = 2;
        int firstOccurrence = findFirstOccurrence(arr, target);
        int lastOccurrence = findLastOccurrence(arr, target);

        System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
        System.out.println("Last occurrence of " + target + " is at index: " + lastOccurrence);
    }
}
