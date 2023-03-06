package org.example;

/**
 * Created by hekun on 2021/9/26 22:32
 */
public class _35 {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high){
            mid = (low + high) / 2;
            if (nums[mid] == target){
                break;
            }
            if (nums[mid] < target){
                low = mid + 1;
            }
            if (nums[mid] > target){
                high = mid - 1;
            }
        }

        if (nums[mid] >= target){
            return mid;
        }

        return mid + 1;
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 4));
    }
}
