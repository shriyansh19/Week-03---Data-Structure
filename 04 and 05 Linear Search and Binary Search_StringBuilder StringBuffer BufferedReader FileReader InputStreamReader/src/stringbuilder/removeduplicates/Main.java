package stringbuilder.removeduplicates;

import static stringbuilder.removeduplicates.RemoveDuplicates.removeDuplicates;

public class Main {
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Original String: " + input);
        System.out.println("String without Duplicates: " + removeDuplicates(input));
    }
}
