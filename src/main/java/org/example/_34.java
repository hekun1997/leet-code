package org.example;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回[-1, -1]。
 *
 * 进阶：
 *
 * 你可以设计并实现时间复杂度为O(log n)的算法解决此问题吗？
 * 
 *
 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例2：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 *
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by hekun on 2021/10/8 19:59
 */
public class _34 {
    public static int[] searchRange(int[] nums, int target) {
        int pre = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == target){
                last = i;
                if (pre == -1){
                    pre = last;
                }
            }
        }
        return new int[]{pre, last};
    }
    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{}, 6));
    }
}
