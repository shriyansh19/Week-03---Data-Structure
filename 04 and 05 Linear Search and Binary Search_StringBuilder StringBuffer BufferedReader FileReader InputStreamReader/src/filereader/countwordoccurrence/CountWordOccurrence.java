package filereader.countwordoccurrence;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * This class demonstrates how to count the occurrence of a specific word in a file using FileReader.
 */
public class CountWordOccurrence {

    /**
     * Counts the occurrences of a specific word in a file.
     *
     * @param filePath The path of the file to be read.
     * @param targetWord The word to count occurrences of.
     * @return The number of occurrences of the target word.
     */
    public static int countWordOccurrence(String filePath, String targetWord) {
        int count = 0;

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            // Read each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words and check for the target word
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return count;
    }
}