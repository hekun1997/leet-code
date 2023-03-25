package org.example.forOffer;

/**
 * Created by hekun on 2023/3/25 10:24
 */
public class _21 {
    public int[] exchange(int[] nums) {
        if (nums == null && nums.length < 2) {
            return nums;
        }
        int left = 0, right = nums.length-1;
        while (left < right) {
            for (; nums[left] % 2 != 0 && left < right; left++);
            for (; nums[right] % 2 == 0 && right > left; right--);
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        new _21().exchange(nums);
    }
}
