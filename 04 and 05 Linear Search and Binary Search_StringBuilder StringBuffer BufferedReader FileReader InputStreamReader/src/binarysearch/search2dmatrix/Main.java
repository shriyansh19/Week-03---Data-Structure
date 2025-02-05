package binarysearch.search2dmatrix;

import static binarysearch.search2dmatrix.Search2DMatrix.searchMatrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        int target = 3;
        System.out.println("Target found: " + searchMatrix(matrix, target));
    }
}
