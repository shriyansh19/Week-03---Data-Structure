package sampleproblems.hashmaps.twosum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSumProblem.findTwoSum(arr, target);
        System.out.println("Indices for two sum: " + Arrays.toString(result));
    }
}
