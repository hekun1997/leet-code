package org.example;

import java.util.Arrays;

/**
 * Created by hekun on 2021/9/25 22:33
 */
public class _27 {
    // 21.9.25
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

    // 23.2.8
    //  1 2 3 4 3 5
    //  i
    //  p
    //    s
    //
    public static int removeElement2(int[] nums, int val) {
        int slowIndex = 0; // pointer and slow pointer.
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (val != nums[fastIndex]) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
    public static void main(String[] args) {
        System.out.println(removeElement2(new int[]{1, 3,9,2,4,2}, 2));
    }
}
