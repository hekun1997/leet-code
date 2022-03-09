package org.example;

import java.util.Arrays;

public class _283 {
    public static void moveZeroes(int[] nums) {
        for (int curr = 0; curr < nums.length; curr ++){
            if (nums[curr] == 0){  // 如果当前为0
                for (int next = curr; next < nums.length; next ++){
                    if (nums[next] != 0){
                        nums[curr] = nums[next];
                        nums[next] = 0;
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,0};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }
}
