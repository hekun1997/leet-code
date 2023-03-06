package org.example.forOffer;

/**
 * Created by hekun on 2023/1/15 09:51
 */
public class _4 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        // h row 水平 行 v col 垂直 列
        if (matrix == null ||matrix.length < 1) {
            return false;
        }
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int[][] matrix1 = new int[][]{{}
        };
        System.out.println(findNumberIn2DArray(matrix1, 18)); // v length
//        System.out.println(matrix1.length); // row
//        System.out.println(matrix1[0].length); //col
        System.out.println(matrix1.length);
    }
}
