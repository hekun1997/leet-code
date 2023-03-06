package org.example;

/**
 * Created by hekun on 2023/3/5 16:56
 */
public class _63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // 1. 确定dp数组下标含义 dp[i][j] 到每一个坐标可能的路径种类
        // 2. 递推公式 dp[i][j] = dp[i-1][j] dp[i][j-1]
        // 3. 初始化 dp[i][0]=1 dp[0][i]=1 初始化横竖就可
        // 4. 遍历顺序 一行一行遍历
        // 5. 推导结果
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1){
            return 0;
        }

        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1){
                break;
            }
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = obstacleGrid[i][j] == 1 ? dp[i-1][j] + dp[i][j-1] : 0;
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 1}, {0, 0}};
        System.out.println(new _63().uniquePathsWithObstacles(obstacleGrid));
    }
}
