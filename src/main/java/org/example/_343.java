package org.example;

/**
 * Created by hekun on 2023/3/6 11:05
 */
public class _343 {

    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i-j; j++) {
                dp[i] = Math.max(dp[i], Math.max(j*(i-j), j*dp[i-j]));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new _343().integerBreak(10));
    }
}
