package filereader.readfilelinebyline;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * This class demonstrates how to read a file line by line using FileReader and BufferedReader.
 */
public class ReadFileLineByLine {

    /**
     * Reads a file line by line and prints each line to the console.
     *
     * @param filePath The path of the file to be read.
     */
    public static void readFile(String filePath) {
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            // Read each line from the file and print it to the console
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}