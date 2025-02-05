package linearsearch.searchwordinsentences;

import static linearsearch.searchwordinsentences.SearchWordInSentences.findSentenceWithWord;

public class Main {
    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "A journey of a thousand miles begins with a single step.",
                "Hello, world!",
                "Programming is fun and challenging."
        };
        String targetWord = "world"; // Word to search for
        String result = findSentenceWithWord(sentences, targetWord);

        System.out.println("Result: " + result);
    }
}
