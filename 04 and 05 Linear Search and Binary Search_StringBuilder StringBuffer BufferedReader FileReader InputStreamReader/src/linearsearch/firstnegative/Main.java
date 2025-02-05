package linearsearch.firstnegative;

import static linearsearch.firstnegative.FirstNegativeNumber.findFirstNegative;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 7, -3, 2, -1, 8}; // Example array
        int index = findFirstNegative(array);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}
