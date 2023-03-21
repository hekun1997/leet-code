package org.example;

import java.util.Arrays;

/**
 * Created by hekun on 2023/3/19 21:19
 */
public class _169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length - 1) / 2];
    }
    public static void main(String[] args) {

    }
}
