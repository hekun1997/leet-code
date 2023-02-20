package org.example.forOffer;

/**
 * Created by hekun on 2023/1/31 09:19
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量).）。
 *
 * 
 *
 * 提示：
 *
 * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 * 在 Java 中，编译器使用 二进制补码 记法来表示有符号整数。因此，在上面的示例 3中，输入表示有符号整数 -3。
 * 
 *
 * 示例 1：
 *
 * 输入：n = 11 (控制台输入 00000000000000000000000000001011)
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011中，共有三位为 '1'。
 * 示例 2：
 *
 * 输入：n = 128 (控制台输入 00000000000000000000000010000000)
 * 输出：1
 * 解释：输入的二进制串 00000000000000000000000010000000中，共有一位为 '1'。
 * 示例 3：
 *
 * 输入：n = 4294967293 (控制台输入 11111111111111111111111111111101，部分语言中 n = -3）
 * 输出：31
 * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
 * 
 *
 * 提示：
 *
 * 输入必须是长度为 32 的 二进制串 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _15 {
    public static int hammingWeight(int n) {
        long number;
        if (n < 0) {
            number = Integer.toUnsignedLong(n);
        } else {
            number = n;
        }
        long dividend = 2;
        long quotient;
        long remainder;
        StringBuilder result = new StringBuilder();
        do {
            quotient = number / dividend;
            remainder = number % dividend;
            number = quotient;
            result.append(remainder);
        } while (quotient > 0);

        result.reverse();

        int oneCount = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '1') {
                oneCount ++;
            }
        }
        return oneCount;
    }

    public static int hammingWeight2(int n) {
        int oneCount = 0;
        while (n != 0) {
            oneCount += n & 1;
            n >>>= 1;
        }
        return oneCount;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight2(11));
    }
}
