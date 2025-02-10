package problem5;

import problem5.Fibonacci;

public class Main {
    public static void main(String[] args) {
        int n = 40; // Position in the Fibonacci sequence

        // Measure the time taken by recursive Fibonacci
        long startTime = System.nanoTime(); // Start timer
        int recursiveResult = Fibonacci.fibonacciRecursive(n); // Compute Fibonacci recursively
        long endTime = System.nanoTime(); // End timer
        System.out.println("Recursive Fibonacci Result: " + recursiveResult + ", Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure the time taken by iterative Fibonacci
        startTime = System.nanoTime(); // Start timer
        int iterativeResult = Fibonacci.fibonacciIterative(n); // Compute Fibonacci iteratively
        endTime = System.nanoTime(); // End timer
        System.out.println("Iterative Fibonacci Result: " + iterativeResult + ", Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
