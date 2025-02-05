package binarysearch.challenge;

import java.util.Arrays;

/**
 * This class demonstrates how to solve the challenge problem using Linear Search and Binary Search.
 */
public class ChallengeProblem {

    /**
     * Finds the first missing positive integer in the array using Linear Search.
     *
     * @param arr The array of integers.
     * @return The first missing positive integer.
     */
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Mark non-positive numbers and numbers greater than n as irrelevant
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        // Mark the presence of each number in the array
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n) {
                arr[num - 1] = -Math.abs(arr[num - 1]);
            }
        }

        // Find the first index that is not marked
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        // If all numbers are present, return n + 1
        return n + 1;
    }

    /**
     * Finds the index of the target number in the sorted array using Binary Search.
     *
     * @param arr The sorted array.
     * @param target The target number.
     * @return The index of the target number, or -1 if not found.
     */
    public static int findTargetIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}