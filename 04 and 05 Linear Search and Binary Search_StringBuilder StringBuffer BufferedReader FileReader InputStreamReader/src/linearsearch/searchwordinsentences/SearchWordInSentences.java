package linearsearch.searchwordinsentences;

/**
 * This class demonstrates how to perform a linear search to find the first sentence containing a specific word.
 */
public class SearchWordInSentences {

    /**
     * Finds the first sentence containing the specified word.
     *
     * @param sentences The array of sentences to search.
     * @param targetWord The word to search for.
     * @return The first sentence containing the word, or "Not Found" if no sentence contains the word.
     */
    public static String findSentenceWithWord(String[] sentences, String targetWord) {
        // Iterate through the list of sentences
        for (String sentence : sentences) {
            // Check if the sentence contains the target word
            if (sentence.contains(targetWord)) {
                return sentence; // Return the sentence containing the word
            }
        }
        // If no sentence contains the word, return "Not Found"
        return "Not Found";
    }
}