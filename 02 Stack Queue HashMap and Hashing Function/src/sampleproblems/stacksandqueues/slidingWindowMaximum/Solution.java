package sampleproblems.stacksandqueues.slidingWindowMaximum;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * This method returns the maximum values in each sliding window of size k.
     *
     * @param nums The input array of integers.
     * @param k    The size of the sliding window.
     * @return A list containing the maximum values for each sliding window.
     */
    public List<Integer> maxSlidingWindow(int[] nums, int k) {
        // Deque to store indices of elements in the current window
        Deque<Integer> dq = new ArrayDeque<>();
        // List to store the result (maximum values for each window)
        List<Integer> result = new ArrayList<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Remove the index of the element that is out of the current window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // Remove indices of all elements smaller than the current element
            // These elements cannot be the maximum in the current window
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // Add the current element's index to the deque
            dq.offerLast(i);

            // If the window has reached size k, add the maximum to the result
            if (i >= k - 1) {
                result.add(nums[dq.peekFirst()]);
            }
        }

        return result;
    }
}

