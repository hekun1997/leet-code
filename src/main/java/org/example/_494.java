package org.example;

/**
 * Created by hekun on 2023/3/11 16:11
 */
public class _494 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        int bagSize = (sum + target) / 2;
        if ( target < 0 && sum < -target) return 0;
        if ((target + sum) % 2 != 0) return 0;
        bagSize = Math.abs(bagSize);
        int[] dp = new int[bagSize + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagSize; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }

        return dp[dp.length -1];
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(new _494().findTargetSumWays(nums, target));
    }
}
