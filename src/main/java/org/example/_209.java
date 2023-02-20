package org.example;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by hekun on 2023/2/10 17:25
 * 给定一个含有n个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 * 
 *
 * 示例 1：
 *
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组[4,3]是该条件下的长度最小的子数组。
 * 示例 2：
 *
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * 示例 3：
 *
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 * 
 *
 * 提示：
 *
 * 1 <= target <= 109
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _209 {
    public static int minSubArrayLen(int target, int[] nums) {
        Deque<Integer> deque = new LinkedList<>();
        int sum = 0, minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            deque.addLast(nums[i]);
            while (sum >= target) {
                if (sum == target) {
                    minLength = Math.min(minLength, deque.size());
                }
                sum -= deque.removeFirst();
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(minSubArrayLen(11, nums));
    }
}
