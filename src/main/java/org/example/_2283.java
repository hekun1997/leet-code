package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个下标从 0开始长度为 n的字符串num，它只包含数字。
 * 如果对于 每个0 <= i < n的下标i，都满足数位i在 num中出现了num[i]次，那么请你返回true，否则返回false。
 * 示例 1：
 * 输入：num = "1210"
 * 输出：true
 * 解释：
 * num[0] = '1' 。数字 0 在 num 中出现了一次。
 * num[1] = '2' 。数字 1 在 num 中出现了两次。
 * num[2] = '1' 。数字 2 在 num 中出现了一次。
 * num[3] = '0' 。数字 3 在 num 中出现了零次。
 * "1210" 满足题目要求条件，所以返回 true 。
 * 示例 2：
 * 输入：num = "030"
 * 输出：false
 * 解释：
 * num[0] = '0' 。数字 0 应该出现 0 次，但是在 num 中出现了一次。
 * num[1] = '3' 。数字 1 应该出现 3 次，但是在 num 中出现了零次。
 * num[2] = '0' 。数字 2 在 num 中出现了 0 次。
 * 下标 0 和 1 都违反了题目要求，所以返回 false 。
 * 
 * 提示：
 * n == num.length
 * 1 <= n <= 10
 * num只包含数字。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/check-if-number-has-equal-digit-count-and-digit-value
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _2283 {
    public static boolean digitCount(String num) {
        Map<Integer, Integer> digitMapCount = new HashMap<>();

        for (int i = 0; i < num.length(); i++) {
            //统计字符出现的次数
            int value = Integer.valueOf(num.charAt(i) + "");
            digitMapCount.put(value, digitMapCount.getOrDefault(value, 0) + 1);
        }

        int count, value;
        for (int i = 0; i < num.length(); i++) {
            count = digitMapCount.getOrDefault(i, 0);
            value = Integer.valueOf(num.charAt(i) + "");
            if (value != count) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(digitCount(""));
    }
}





