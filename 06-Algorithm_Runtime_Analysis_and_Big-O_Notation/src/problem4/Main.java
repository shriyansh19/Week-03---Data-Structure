package problem4;

import java.io.IOException;

/**
 * This class serves as the entry point for Problem 4.
 * It compares the performance of FileReader and InputStreamReader for reading large files.
 */
public class Main {
    public static void main(String[] args) {
        String filePath = "large_file.txt"; // Path to a large file (create this file manually)

        // Measure the time taken by FileReader
        long startTime = System.nanoTime(); // Start timer
        try {
            FileReaderExample.readFileWithFileReader(filePath); // Read file with FileReader
        } catch (IOException e) {
            System.err.println("Error reading file with FileReader: " + e.getMessage());
        }
        long endTime = System.nanoTime(); // End timer
        System.out.println("FileReader Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure the time taken by InputStreamReader
        startTime = System.nanoTime(); // Start timer
        try {
            FileReaderExample.readFileWithInputStreamReader(filePath); // Read file with InputStreamReader
        } catch (IOException e) {
            System.err.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        endTime = System.nanoTime(); // End timer
        System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}