package org.example.bag;

/**
 * Created by hekun on 2023/3/10 09:07
 * 01 背包问题
 */
public class _01 {
    // 二维dp
    public int solution(int bagSize, int[] weight, int[] value) {
        int[][] dp = new int[weight.length][bagSize + 1]; // i 是第 i 件物品， j 是背包空间
        for (int j = weight[0]; j <= bagSize; j++) {
            dp[0][j] = value[0];
        }
        // init
        for (int i = 1; i < dp.length; i++) {  // goods
            for (int j = 1; j < dp[0].length; j++) {  // bag size
                if (weight[i] > j) {  // not get
                    dp[i][j] = dp[i-1][j];
                } else {  // get
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]] + value[i]);
                }
            }
        }
        return dp[weight.length-1][bagSize];
    }

    // 一维dp
    public int solutionWithOneDim(int bagSize, int[] weight, int[] value) {
        int[] dp = new int[bagSize + 1]; // j 是背包空间

        // init
        for (int i = 0; i < weight.length; i++) {
            for (int j = dp.length-1; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        int bagSize = 4;
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        System.out.println(new _01().solutionWithOneDim(bagSize, weight, value));
    }
}
