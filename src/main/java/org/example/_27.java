package org.example;

import java.util.Arrays;

/**
 * Created by hekun on 2021/9/25 22:33
 */
public class _27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                for (int j = i; j < nums.length - 1; j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length - 1] = -1;
                count ++;
                i--;
            }
        }
        nums = Arrays.copyOfRange(nums, 0, nums.length - count);
//        for (int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }
        //System.out.println();
        return nums.length;
    }
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2, 3,2,2,3,2}, 2));
    }
}
