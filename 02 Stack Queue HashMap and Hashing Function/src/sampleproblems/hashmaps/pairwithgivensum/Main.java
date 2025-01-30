package sampleproblems.hashmaps.pairwithgivensum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        System.out.println("Pair with sum " + target + " exists: " + CheckPairSum.hasPairWithSum(arr, target));
    }
}
