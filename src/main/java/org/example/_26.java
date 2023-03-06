package org.example;

/**
 * Created by hekun on 2021/10/8 19:35
 */
public class _26 {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i ++){
            int j = i + 1;
            if (nums[i] == nums[j]){
                if (count + j == nums.length){
                    break;
                }
                for (int index = j; index < nums.length - 1; index++){
                    nums[index] = nums[index + 1];
                }
                i--;
                count ++;
            }
        }

        return nums.length - count;
    }

    public static void main(String[] args) {
        int len = removeDuplicates(new int[]{0,0,1});
        System.out.println(len);
    }
}
