package org.example;

/**
 * Created by hekun on 2023/1/13 09:56
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * 示例 2：
 *
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] max, min;
        if (nums1[nums1.length - 1] > nums2[nums2.length - 1]) {
            max = nums1;
            min = nums2;
        } else {
            max = nums2;
            min = nums1;
        }

        int maxIndex = max.length - 1;
        int minIndex = 0;

        while (true) {
            if (maxIndex == 0 || (minIndex == min.length - 1)) {
                break;
            }
            if (max[maxIndex - 1] >= min[minIndex + 1]) {
                maxIndex--;
                minIndex++;
            } else {
                break;
            }
        }

        return 0D;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1, 2};
        int[] b = a;
        b[0] = 99;
        System.out.println(a[0]);
    }
}
