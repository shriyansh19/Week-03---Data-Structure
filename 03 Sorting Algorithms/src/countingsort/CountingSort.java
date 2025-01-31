package countingsort;

/**
 * Implements Counting Sort to sort an array of student ages in ascending order.
 */
public class CountingSort {

    /**
     * Sorts the array using Counting Sort.
     *
     * @param ages The array of student ages to be sorted.
     */
    public static void countingSort(int[] ages) {
        int n = ages.length;
        int max = 18; // Maximum age is 18
        int min = 10; // Minimum age is 10
        int range = max - min + 1;

        // Create a count array to store the frequency of each age
        int[] count = new int[range];
        int[] output = new int[n];

        // Count the frequency of each age
        for (int age : ages) {
            count[age - min]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in their correct positions in the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(output, 0, ages, 0, n);
    }
}