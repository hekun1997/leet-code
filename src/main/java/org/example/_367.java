package org.example;

/**
 * Created by hekun on 2023/2/7 10:45
 * 给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 *
 * 完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。
 *
 * 不能使用任何内置的库函数，如 sqrt 。
 *
 * 
 *
 * 示例 1：
 *
 * 输入：num = 16
 * 输出：true
 * 解释：返回 true ，因为 4 * 4 = 16 且 4 是一个整数。
 * 示例 2：
 *
 * 输入：num = 14
 * 输出：false
 * 解释：返回 false ，因为 3.742 * 3.742 = 14 但 3.742 不是一个整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-perfect-square
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _367 {
    public static boolean isPerfectSquare(int num) {
        int start = 0, end = num;
        int mid, square;
        while (start <= end) {
            mid = start + (end - start) / 2;
            square = mid * mid;
            if (num > square) {
                start = mid + 1;
            } else if (num < square) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(-1));
    }
}
