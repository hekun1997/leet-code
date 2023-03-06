package org.example;

/**
 * Created by hekun on 2023/3/5 16:40
 */
public class _62 {
    public int dfs(int m, int n, int i, int j) {
        // finish
        if (i == m && j == n) {
            return 1;
        }
        if (i > m || j > n) {
            return 0;
        }
        // curr process

        // next
        return dfs(m, n, i + 1, j) + dfs(m, n, i, j + 1);
    }
    public int uniquePaths(int m, int n) {
        // 1. 确定dp数组下标含义 dp[i][j] 到每一个坐标可能的路径种类
        // 2. 递推公式 dp[i][j] = dp[i-1][j] dp[i][j-1]
        // 3. 初始化 dp[i][0]=1 dp[0][i]=1 初始化横竖就可
        // 4. 遍历顺序 一行一行遍历
        // 5. 推导结果 。。。。。。。。
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        System.out.println(new _62().uniquePaths(3, 2));
    }
}
