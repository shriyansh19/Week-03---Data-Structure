package filereader.countwordoccurrence;

import static filereader.countwordoccurrence.CountWordOccurrence.countWordOccurrence;

public class Main {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Replace with the path to your file
        String targetWord = "Roger"; // Replace with the word to count
        int occurrences = countWordOccurrence(filePath, targetWord);
        System.out.println("The word '" + targetWord + "' occurs " + occurrences + " times.");
    }
}
