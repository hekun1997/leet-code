package org.example;

/**
 * @author hekun
 * @date 2024/5/28 11:24
 */
public class _151 {
    public static String reverseWords(String s) {
        int pre = 0, curr = 0;
        char[] in = s.trim().toCharArray();
        swap(in, 0, in.length-1);

        while (curr < in.length) {
            if (in[curr] != ' '){
                curr++;
                continue;
            }
            swap(in, pre, curr-1);
            curr++;
            pre = curr;
        }
        return String.valueOf(in);
    }

    public static void swap(char[] charArrOfs, int start, int end) {
        while (start < end) {
            charArrOfs[start] ^= charArrOfs[end];
            charArrOfs[end] ^= charArrOfs[start];
            charArrOfs[start] ^= charArrOfs[end];

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        /**
         * 示例 1：
         *
         * 输入：s = "the sky is blue"
         * 输出："blue is sky the"
         * 示例 2：
         *
         * 输入：s = "  hello world  "
         * 输出："world hello"
         * 解释：反转后的字符串中不能存在前导空格和尾随空格。
         * 示例 3：
         *
         * 输入：s = "a good   example"
         * 输出："example good a"
         * 解释：如果两个单词间有多余的空格，反转后的字符串需要将单词间的空格减少到仅有一个。
         */
        String s = "the sky is blue";
        String out = "blue is sky the";
        System.out.println(reverseWords(s));
    }
}
