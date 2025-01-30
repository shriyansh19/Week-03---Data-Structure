package sampleproblems.hashmaps.findallsubarrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 2, -6, 1, -4, 5};
        System.out.println("Subarrays with zero sum:");
        for (int[] subarray : FindAllSubarrays.findSubarraysWithZeroSum(arr)) {
            System.out.println(Arrays.toString(subarray));
        }
    }
}
