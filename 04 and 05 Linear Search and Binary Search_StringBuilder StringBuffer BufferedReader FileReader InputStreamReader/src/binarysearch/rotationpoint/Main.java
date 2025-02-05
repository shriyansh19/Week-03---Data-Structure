package binarysearch.rotationpoint;

import static binarysearch.rotationpoint.RotationPoint.findRotationPoint;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3, 4}; // Example rotated sorted array
        int rotationPoint = findRotationPoint(arr);
        System.out.println("Rotation point (smallest element) is at index: " + rotationPoint);
    }
}
