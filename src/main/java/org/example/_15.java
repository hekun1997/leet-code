package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>(nums.length / 3);
        Arrays.sort(nums);
        if (nums.length < 3) {
            return results;
        }
        int left, right;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] > 0) {
                return results;
            }
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> result = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                    if (! results.contains(result)) {
                        results.add(result);
                    }
                    //break;
                    left ++;
                } else if (sum < 0) {
                    left ++;
                } else {
                    right --;
                }
            }
        }
        return results;
    }
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-2,0,1,1,2}));
    }
}
