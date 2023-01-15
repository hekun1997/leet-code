package org.example.forOffer;

/**
 * Created by hekun on 2023/1/14 11:07
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [0,1,3]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [0,1,2,3,4,5,6,7,9]
 * 输出: 8
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/que-shi-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
