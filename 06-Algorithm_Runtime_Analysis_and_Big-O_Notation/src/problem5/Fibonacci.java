package problem5;

/**
 * This class contains implementations of Fibonacci computation using recursion and iteration.
 */
public class Fibonacci {

    /**
     * Computes the nth Fibonacci number using recursion.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     *
     * Time Complexity: O(2ⁿ), due to repeated calculations.
     */
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n; // Base case: F(0) = 0, F(1) = 1
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Recursive calls
    }

    /**
     * Computes the nth Fibonacci number using iteration.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     *
     * Time Complexity: O(N), as it iterates through the sequence once.
     */
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n; // Base case: F(0) = 0, F(1) = 1
        }

        int a = 0, b = 1; // Initialize first two Fibonacci numbers
        for (int i = 2; i <= n; i++) {
            int sum = a + b; // Compute the next Fibonacci number
            a = b; // Update previous two numbers
            b = sum;
        }
        return b; // Return the nth Fibonacci number
    }
}