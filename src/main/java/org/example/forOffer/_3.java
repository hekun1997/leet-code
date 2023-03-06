package org.example.forOffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _3 {
    public static int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0);
            if (count > 0) {
                return nums[i];
            } else {
                map.put(nums[i], count + 1);
            }
        }
        return -1;
    }
    //排序，相邻是否相等
    public static int findRepeatNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 0; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber2(nums));
    }
}
