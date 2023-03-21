package org.example;

/**
 * Created by hekun on 2023/3/15 16:50
 */
public class _377 {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];

        dp[0] = 1;

        // 组合 外面物品 里面背包
        // 排列 外面背包 里面物品
        for (int i = 0; i <= target; i++) {
            for (int num : nums) {
                if (i >= num){
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 4;
        System.out.println(new _377().combinationSum4(nums, target));
    }
}
