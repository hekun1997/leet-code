package org.example.forOffer;

/**
 * Created by hekun on 2023/1/14 11:07
 */
public class _53_2 {
    public static int missingNumber(int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            // mid即为index，两种可能，mid[index]等于index，确实在右。mid[index]大于index，说明缺失在左。
            if (nums[mid] == mid) { // 缺失的在右边
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (nums[mid] == mid) return mid + 1;
        return mid;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0};
        System.out.println(missingNumber(nums));
    }
}
