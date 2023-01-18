package org.example.forOffer;

/**
 * Created by hekun on 2023/1/18 09:07
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
 * F(0) = 0, F(1)= 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 示例 1：
 * 输入：n = 2
 * 输出：1
 * 示例 2：
 * 输入：n = 5
 * 输出：5
 * 提示：
 * 0 <= n <= 100
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _10_1 {

    static int mod = 1000000007;

    public static int F(int n, int[]cache) {
        if ((cache[n] != 0 && n > 0) || n < 2) {  // has cache
            return cache[n];
        }

        // no cache
        cache[n] = (F(n - 1, cache) + F(n - 2, cache)) % mod;
        return cache[n];
    }
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] cache = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        return F(n, cache);
    }
    public static void main(String[] args) {

        //0，1，1，2，3，5，8，13，21，34，55，89
        System.out.println(fib(3));
        for (int i = 0; i < 12; i++) {
            System.out.println(fib(i));
        }
    }
}
