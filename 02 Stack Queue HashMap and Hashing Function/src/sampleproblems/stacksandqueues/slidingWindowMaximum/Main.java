package sampleproblems.stacksandqueues.slidingWindowMaximum;

import java.util.List;

// Main class to test the Solution
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        // Get the result
        List<Integer> result = solution.maxSlidingWindow(nums, k);

        // Print the result
        System.out.println("Maximum values in each sliding window:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
