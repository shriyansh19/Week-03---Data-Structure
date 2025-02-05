package inputstreamreader.challenge;

import java.io.*;
import java.util.*;

/**
 * This class demonstrates the comparison of StringBuilder vs StringBuffer for string concatenation
 * and FileReader vs InputStreamReader for reading a large file and counting words.
 */
public class ChallengeProblem {

    /**
     * Compares the performance of StringBuilder and StringBuffer for string concatenation.
     */
    public static void compareStringConcatenation() {
        String str = "hello";
        int iterations = 1_000_000;

        // StringBuilder
        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(str);
        }
        long stringBuilderTime = System.nanoTime() - startTime;

        // StringBuffer
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(str);
        }
        long stringBufferTime = System.nanoTime() - startTime;

        // Print results
        System.out.println("StringBuilder time: " + stringBuilderTime + " nanoseconds");
        System.out.println("StringBuffer time: " + stringBufferTime + " nanoseconds");
        System.out.println("StringBuilder is faster by " + (stringBufferTime - stringBuilderTime) + " nanoseconds");
    }

    /**
     * Counts the number of words in a file using FileReader.
     *
     * @param filePath The path of the file to read.
     * @return The number of words in the file.
     */
    public static int countWordsWithFileReader(String filePath) throws IOException {
        int wordCount = 0;
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        }
        return wordCount;
    }

    /**
     * Counts the number of words in a file using InputStreamReader.
     *
     * @param filePath The path of the file to read.
     * @return The number of words in the file.
     */
    public static int countWordsWithInputStreamReader(String filePath) throws IOException {
        int wordCount = 0;
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        }
        return wordCount;
    }

    /**
     * Compares the performance of FileReader and InputStreamReader for reading a large file and counting words.
     *
     * @param filePath The path of the file to read.
     */
    public static void compareFileReading(String filePath) throws IOException {
        // FileReader
        long startTime = System.nanoTime();
        int fileReaderWordCount = countWordsWithFileReader(filePath);
        long fileReaderTime = System.nanoTime() - startTime;

        // InputStreamReader
        startTime = System.nanoTime();
        int inputStreamReaderWordCount = countWordsWithInputStreamReader(filePath);
        long inputStreamReaderTime = System.nanoTime() - startTime;

        // Print results
        System.out.println("FileReader word count: " + fileReaderWordCount);
        System.out.println("FileReader time: " + fileReaderTime + " nanoseconds");
        System.out.println("InputStreamReader word count: " + inputStreamReaderWordCount);
        System.out.println("InputStreamReader time: " + inputStreamReaderTime + " nanoseconds");
        System.out.println("FileReader is faster by " + (inputStreamReaderTime - fileReaderTime) + " nanoseconds");
    }
}