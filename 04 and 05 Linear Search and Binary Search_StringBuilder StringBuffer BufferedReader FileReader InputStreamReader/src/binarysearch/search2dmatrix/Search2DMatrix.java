package binarysearch.search2dmatrix;

/**
 * This class demonstrates how to search for a target value in a 2D sorted matrix using Binary Search.
 */
public class Search2DMatrix {

    /**
     * Searches for a target value in a 2D sorted matrix.
     *
     * @param matrix The 2D sorted matrix.
     * @param target The target value to search for.
     * @return True if the target is found, otherwise false.
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols]; // Convert 1D index to 2D indices

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}