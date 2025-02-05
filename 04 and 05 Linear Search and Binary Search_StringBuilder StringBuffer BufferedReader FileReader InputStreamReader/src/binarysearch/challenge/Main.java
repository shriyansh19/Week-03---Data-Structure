package binarysearch.challenge;

import java.util.Arrays;

import static binarysearch.challenge.ChallengeProblem.findFirstMissingPositive;
import static binarysearch.challenge.ChallengeProblem.findTargetIndex;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1}; // Example array
        int firstMissingPositive = findFirstMissingPositive(arr.clone()); // Clone to avoid modifying the original array
        System.out.println("First missing positive integer: " + firstMissingPositive);

        Arrays.sort(arr); // Sort the array for Binary Search
        int target = 3;
        int targetIndex = findTargetIndex(arr, target);
        System.out.println("Index of target " + target + ": " + targetIndex);
    }
}
