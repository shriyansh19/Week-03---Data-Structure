package inputstreamreader.challenge;

import java.io.IOException;

import static inputstreamreader.challenge.ChallengeProblem.compareFileReading;
import static inputstreamreader.challenge.ChallengeProblem.compareStringConcatenation;

public class Main {
    public static void main(String[] args) {
        // Compare StringBuilder and StringBuffer
        System.out.println("Comparing StringBuilder and StringBuffer:");
        compareStringConcatenation();

        // Compare FileReader and InputStreamReader
        System.out.println("\nComparing FileReader and InputStreamReader:");
        String filePath = "example.txt"; // Replace with the path to your large file
        try {
            compareFileReading(filePath);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
