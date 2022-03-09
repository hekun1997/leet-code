package org.example;

public class _189 {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int temp[] = new int[k];
        int i, j;
        for (i = nums.length - 1, j = k - 1; i >= nums.length - k; i--, j--){
            temp[j] = nums[i];
        }

        for (i = nums.length - 1; i - k >= 0 ; i --){
            nums[i] = nums[i - k];
        }

        for (i = 0; i < k; i ++){
            nums[i] = temp[i];
        }

        /***
         * print
         */

        for (i = 0; i < temp.length; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println();
        for (i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        rotate(nums, 2);
    }
}
