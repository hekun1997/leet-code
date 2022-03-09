package org.example;

public class _977 {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        for (int i = 0; i < nums.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-7,-3,2,3,11};
        nums = sortedSquares(nums);
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
