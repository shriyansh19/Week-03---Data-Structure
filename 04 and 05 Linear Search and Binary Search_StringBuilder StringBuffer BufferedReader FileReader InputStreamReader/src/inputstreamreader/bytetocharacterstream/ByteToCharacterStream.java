package inputstreamreader.bytetocharacterstream;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * This class demonstrates how to convert a byte stream to a character stream using InputStreamReader.
 */
public class ByteToCharacterStream {

    /**
     * Reads binary data from a file and prints it as characters using InputStreamReader.
     *
     * @param filePath The path of the file to be read.
     */
    public static void readFile(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

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