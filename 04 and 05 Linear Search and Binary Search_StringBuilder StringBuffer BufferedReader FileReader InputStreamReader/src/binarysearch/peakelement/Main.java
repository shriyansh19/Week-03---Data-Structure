package binarysearch.peakelement;

import static binarysearch.peakelement.PeakElement.findPeakElement;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0}; // Example array
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element is at index: " + peakIndex);
    }
}
