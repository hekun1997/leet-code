package org.example.forOffer;

/**
 * Created by hekun on 2023/1/14 10:47
 */
public class _53 {
    public static int search(int[] nums, int target) {
        if (nums.length < 1) {
            return 0;
        }
        int start = 0, end = nums.length - 1, mid = 0;
        int count = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                break;
            } else if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //search left
        for (int i = mid - 1; i >= 0 && nums[i] == target; i --) {
            count++;
        }
        //search right
        for (int i = mid; i < nums.length && nums[i] == target; i ++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
