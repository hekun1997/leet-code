package org.example;


/**
 * 给定一个长度为 n 的整数数组height。有n条垂线，第 i 条线的两个端点是(i, 0)和(i, height[i])。
 *
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 *
 * 说明：你不能倾斜容器。
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为49。
 * 示例 2：
 * <p>
 * 输入：height = [1,1]
 * 输出：1
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：<a href="https://leetcode.cn/problems/container-with-most-water">...</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _11 {
    public static int maxArea(int[] height) {
        int maxArea = 0, currArea = 0;
        int start = 0, end = height.length - 1;
        while (start < end) {
            currArea = (Math.min(height[start], height[end])) * (end - start);
            if (currArea > maxArea) {
                maxArea = currArea;
            }
            if (height[start] > height[end]) {
                -- end;
            } else {
                ++ start;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}