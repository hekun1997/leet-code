package org.example;

/**
 * @author hekun
 * @date 2024/5/21 11:32
 * @Description: 打印螺旋矩阵，directionIndex控制方向，当在边界时或者前方矩阵值为非负时更换方向
 */
public class _59 {
    public static int[][] generateMatrix(int n) {
        String[] direction = new String[]{"right", "down", "left", "top"};
        int directionIndex = 0;
        int[][] retVal = new int[n][n];
        int i = 0, j = 0;

        for (int val = 1; val <= n*n; val++) {
            retVal[i][j] = val;
            if ("right".equals(direction[directionIndex])) {
                if(j == n-1 || retVal[i][j + 1] > 0) {
                    directionIndex++;
                    directionIndex %= 4;
                    i++;
                } else {
                    j++;
                }
            } else if ("down".equals(direction[directionIndex])) {
                if (i == n-1 || retVal[i+1][j] > 0) {
                    directionIndex++;
                    directionIndex %= 4;
                    j--;
                } else {
                    i++;
                }
            } else if ("left".equals(direction[directionIndex])) {
                if (j == 0 || retVal[i][j-1] > 0){
                    directionIndex++;
                    directionIndex %= 4;
                    i--;
                }else {
                    j--;
                }
            } else if ("top".equals(direction[directionIndex])) {
                if (i == 0 || retVal[i-1][j] > 0){
                    directionIndex++;
                    directionIndex %= 4;
                    j++;
                } else {
                    i--;
                }
            }
        }
        return retVal;
    }

    public static void main(String[] args) {
        System.out.println(generateMatrix(5));
    }
}
