package org.example.forOffer;

/**
 * Created by hekun on 2023/1/14 10:47
 * 统计一个数字在排序数组中出现的次数。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 *  
 *
 * 提示：
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
