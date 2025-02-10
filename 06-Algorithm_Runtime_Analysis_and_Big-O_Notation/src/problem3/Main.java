package problem3;

/**
 * This class serves as the entry point for Problem 3.
 * It compares the performance of String, StringBuilder, and StringBuffer for string concatenation.
 */
public class Main {
    public static void main(String[] args) {
        int iterations = 1_000_000; // Number of concatenations

        // Measure the time taken by String concatenation
        long startTime = System.nanoTime(); // Start timer
        StringConcatenation.concatWithString(iterations); // Perform concatenation with String
        long endTime = System.nanoTime(); // End timer
        System.out.println("String Concatenation Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure the time taken by StringBuilder concatenation
        startTime = System.nanoTime(); // Start timer
        StringConcatenation.concatWithStringBuilder(iterations); // Perform concatenation with StringBuilder
        endTime = System.nanoTime(); // End timer
        System.out.println("StringBuilder Concatenation Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure the time taken by StringBuffer concatenation
        startTime = System.nanoTime(); // Start timer
        StringConcatenation.concatWithStringBuffer(iterations); // Perform concatenation with StringBuffer
        endTime = System.nanoTime(); // End timer
        System.out.println("StringBuffer Concatenation Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}