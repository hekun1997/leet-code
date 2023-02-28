package org.example.algorithm;

/**
 * Created by hekun on 2023/2/27 11:32
 */
class QuickSort {
    public void quickSort(int[] nums, int left, int right) {
        int pivot = left, begin = left, end = right;
        if (left > right) return;
        while (left < right) {
            for (; nums[right] > nums[pivot] && right > left; right--);  // 第一个小于pivot的数。
            for (; nums[left] < nums[pivot] && left < right; left++);  // 第一个大于pivot的数。

            // swap left and right
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

        int temp = nums[pivot];
        nums[pivot] = nums[left];
        nums[left] = temp;

        quickSort(nums, begin, left-1);
        quickSort(nums, left+1, end);
    }


    public static void main(String[] args) {
        int[] nums = new int[]{6,1,2,7,9,3,4,5,10,8};
        new QuickSort().quickSort(nums, 0, nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
