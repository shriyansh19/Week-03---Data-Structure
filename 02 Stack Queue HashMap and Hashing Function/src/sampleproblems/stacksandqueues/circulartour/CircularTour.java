package sampleproblems.stacksandqueues.circulartour;

import java.util.LinkedList;
import java.util.Queue;

class CircularTour {
    // Function to find the starting petrol pump
    public static int findStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;

        Queue<Integer> queue = new LinkedList<>();
        int surplus = 0;  // Tracks current surplus petrol
        int deficit = 0;  // Tracks total deficit petrol
        int start = 0;    // Starting index of the tour

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];
            queue.add(i); // Add the current pump to the queue

            // If surplus becomes negative, reset and remove invalid pumps
            while (surplus < 0 && !queue.isEmpty()) {
                int removedPump = queue.poll(); // Remove the first pump
                deficit += petrol[removedPump] - distance[removedPump];
                start = queue.isEmpty() ? i + 1 : queue.peek(); // Update start index
                surplus -= petrol[removedPump] - distance[removedPump];
            }
        }

        // Check if the total petrol (surplus + deficit) is sufficient
        return (surplus + deficit >= 0) ? start : -1;
    }
}



