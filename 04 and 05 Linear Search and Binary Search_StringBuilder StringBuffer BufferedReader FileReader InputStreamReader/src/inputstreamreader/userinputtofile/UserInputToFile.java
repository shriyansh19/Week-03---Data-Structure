package inputstreamreader.userinputtofile;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class demonstrates how to read user input from the console and write it to a file using InputStreamReader.
 */
public class UserInputToFile {

    /**
     * Reads user input from the console and writes it to a file.
     *
     * @param filePath The path of the file to write the input to.
     */
    public static void writeUserInputToFile(String filePath) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(filePath)) {

            String userInput;
            System.out.println("Enter text (type 'exit' to stop):");

            // Read user input until "exit" is entered
            while (!(userInput = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(userInput + "\n"); // Write the input to the file
            }
        } catch (IOException e) {
            System.err.println("Error handling input/output: " + e.getMessage());
        }
    }
}