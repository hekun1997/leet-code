package org.example;

/**
 * @author hekun
 * @date 2024/5/28 10:02
 */
public class _541 {
    public static String reverseStr(String s, int k) {
        int length = s.length();
        char[] charArrOfs = s.toCharArray();
        int i = k * 2;
        int start, end;
        while (true) {
            // 正常情况，2k, 反转前k个
            if (i <= length) {
                // 交换
                start = i - k * 2;
                end = start + k - 1;
                swap(charArrOfs, start, end);
            }

            if (i > length) {
                start = i - k * 2;

                if (length - (start + 1) < k) {
                    // all swap.
                    end = length - 1;
                    swap(charArrOfs, start, end);
                } else {
                    // swap 0-k.
                    end = start + k - 1;
                    swap(charArrOfs, start, end);
                }
            }

            if (i > length) {
                break;
            }
            i += k * 2;
        }
        return String.valueOf(charArrOfs);
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
         * 输入：s = "abcdefg", k = 2
         * 输出："bacdfeg"
         * 示例 2：
         *
         * 输入：s = "abcd", k = 2
         * 输出："bacd"
         */
        String s = "abcd";
        String result = "bacd";
        int k = 2;
        System.out.println(reverseStr(s, k).equals(result));
    }
}
