package stringbuffer.performance;

/**
 * This class compares the performance of StringBuffer and StringBuilder for string concatenation.
 */
public class PerformanceComparison {

    /**
     * Measures the time taken to concatenate 1 million strings using StringBuffer.
     *
     * @return The time taken in nanoseconds.
     */
    public static long measureStringBufferPerformance() {
        StringBuffer sb = new StringBuffer();
        long startTime = System.nanoTime();

        // Append 1 million strings
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("hello");
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    /**
     * Measures the time taken to concatenate 1 million strings using StringBuilder.
     *
     * @return The time taken in nanoseconds.
     */
    public static long measureStringBuilderPerformance() {
        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();

        // Append 1 million strings
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("hello");
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}