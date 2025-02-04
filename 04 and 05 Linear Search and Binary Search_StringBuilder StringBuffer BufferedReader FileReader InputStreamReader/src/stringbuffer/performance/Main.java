package stringbuffer.performance;

import static stringbuffer.performance.PerformanceComparison.measureStringBufferPerformance;
import static stringbuffer.performance.PerformanceComparison.measureStringBuilderPerformance;

public class Main {
    public static void main(String[] args) {
        // Measure performance of StringBuffer
        long stringBufferTime = measureStringBufferPerformance();
        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " nanoseconds");

        // Measure performance of StringBuilder
        long stringBuilderTime = measureStringBuilderPerformance();
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " nanoseconds");

        // Compare the results
        if (stringBufferTime < stringBuilderTime) {
            System.out.println("StringBuffer is faster.");
        } else if (stringBufferTime > stringBuilderTime) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("Both StringBuffer and StringBuilder performed equally.");
        }
    }
}
