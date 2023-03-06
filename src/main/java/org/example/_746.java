package org.example;

/**
 * Created by hekun on 2023/3/3 18:06
 */
public class _746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }

        return dp[dp.length-1];
    }
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        new _746().minCostClimbingStairs(cost);
    }
}
