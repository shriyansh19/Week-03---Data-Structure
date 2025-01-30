package sampleproblems.hashmaps.longestconsecutivesequence;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int findLongestSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
