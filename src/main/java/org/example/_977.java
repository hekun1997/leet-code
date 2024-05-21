package org.example;

public class _977 {
    // normal
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

    // double pointer
    public static int[] sortedSquares2(int[] nums) {
        int[] result = new int[nums.length];
        int leftIndex = 0, rightIndex = nums.length - 1;
        int leftValue = -1, rightValue = -1;
        int index = nums.length - 1;
        while (leftIndex <= rightIndex) {
            if (leftValue == -1) {
                leftValue = nums[leftIndex] * nums[leftIndex];
            }
            if (rightValue == -1) {
                rightValue = nums[rightIndex] * nums[rightIndex];
            }
            if (leftValue > rightValue) {
                result[index] = leftValue;
                leftValue = -1;
                leftIndex++;
            } else {
                result[index] = rightValue;
                rightValue = -1;
                rightIndex--;
            }
            index--;
        }
        return result;
    }

    public static int[] sortedSquares3(int[] nums) {
        int left = 0, right = nums.length-1;
        int[] retVal = new int[nums.length];
        int pointer = retVal.length-1;

        while (left <= right) {
            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];

            if (leftVal < rightVal) {
                retVal[pointer--] = rightVal;
                right--;
            } else {
                retVal[pointer--] = leftVal;
                left++;
            }
        }

        return retVal;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        nums = sortedSquares3(nums);
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
