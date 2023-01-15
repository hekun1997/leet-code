package org.example;

import java.util.Arrays;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 
 *
 * 示例1：
 *
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 示例2：
 *
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 示例 3：
 *
 * 输入：digits = [0]
 * 输出：[1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by hekun on 2021/10/10 15:28
 */
public class _66 {
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        boolean is_overflow = false;
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] == 10){
                digits[i] = 0;
                if (i > 0){
                    digits[i - 1] += 1;
                }else {
                    is_overflow = true;
                }
            }
        }
        if (is_overflow){
            digits = Arrays.copyOf(digits, digits.length + 1);
            for (int i = digits.length - 1; i > 0; i--){
                digits[i] = digits[i - 1];
            }
            digits[0] = 1;
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] nums =  plusOne(new int[]{4,3,2,1});
        for (int num : nums){
            System.out.println(num);
        }
//        int[] a = new int[]{9, 9};
//        int[] b = Arrays.copyOf(a, a.length + 1);
//        System.out.println();
    }
}
