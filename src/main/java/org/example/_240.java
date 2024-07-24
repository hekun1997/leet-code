package org.example;

/**
 * @author: hekun
 * @date: 2024/7/24 16:35
 */
public class _240 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int currI = 0;
        int maxI = matrix.length - 1, maxJ = matrix[0].length - 1;

        while (currI <= maxI) {
            // max value of a row more than target and min value of a row less than target value
            // target will be in this row
            if (matrix[currI][maxJ] >= target && matrix[currI][0] <= target) {
                for (int j = 0; j <= maxJ; j++) {
                    if (matrix[currI][j] == target) {
                        System.out.printf("i: %d, j: %d\n", currI, j);
                        return true;
                    }
                }
                currI ++;
            } else {
                currI ++;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 2;
        System.out.println(searchMatrix(matrix, target));
    }
}
