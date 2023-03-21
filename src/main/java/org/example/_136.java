package org.example;

/**
 * Created by hekun on 2023/3/19 16:38
 */
public class _136 {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                res ^= nums[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(new _136().singleNumber(nums));
    }
}
