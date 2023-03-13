package org.example;

/**
 * Created by hekun on 2023/3/10 09:50
 */
public class _416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        sum /= 2;
        int[][] dp = new int[nums.length][sum + 1];  // dp[i]代表第i个数，dp[i][j]代表最大值为j的最大和
        for (int j = nums[0]; j <= sum; j++) {
            dp[0][j] = nums[0];
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (nums[i] > j) {  // not put
                    dp[i][j] = dp[i-1][j];
                } else {  // put
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-nums[i]] + nums[i]);
                }
                if (dp[i][j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println(new _416().canPartition(nums));
    }
}
