
package problem4;

import java.io.*;

/**
 * This class demonstrates reading large files using FileReader and InputStreamReader.
 */
public class FileReaderExample {

    /**
     * Reads a file using FileReader (character stream).
     *
     * @param filePath The path to the file.
     * @throws IOException If an I/O error occurs.
     */
    public static void readFileWithFileReader(String filePath) throws IOException {
        try (FileReader reader = new FileReader(filePath)) { // Use FileReader for character-based reading
            int character;
            while ((character = reader.read()) != -1) { // Read one character at a time
                // Process the character (no-op here)
            }
        }
    }

    /**
     * Reads a file using InputStreamReader (byte-to-character conversion).
     *
     * @param filePath The path to the file.
     * @throws IOException If an I/O error occurs.
     */
    public static void readFileWithInputStreamReader(String filePath) throws IOException {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath))) {
            int character;
            while ((character = reader.read()) != -1) { // Read one character at a time
                // Process the character (no-op here)
            }
        }
    }
}

