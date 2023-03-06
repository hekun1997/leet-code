package org.example;

/**
 * Created by hekun on 2021/10/8 19:59
 */
public class _34 {
    public static int[] searchRange(int[] nums, int target) {
        int pre = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == target){
                last = i;
                if (pre == -1){
                    pre = last;
                }
            }
        }
        return new int[]{pre, last};
    }
    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{}, 6));
    }
}
