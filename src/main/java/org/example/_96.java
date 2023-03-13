package org.example;

/**
 * Created by hekun on 2023/3/9 16:32
 */
public class _96 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        // dp[i] 表示 i 个节点可以组成多少种不同的二叉树
        // dp[i] = dp[i - 1] + dp[i - 2]
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] * 2 + 1;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new _96().numTrees(3));
    }
}
