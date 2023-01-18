package org.example.forOffer;

/**
 * Created by hekun on 2023/1/18 09:53
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 示例 1：
 * 输入：n = 2
 * 输出：2
 * 示例 2：
 * 输入：n = 7
 * 输出：21
 * 示例 3：
 * 输入：n = 0
 * 输出：1
 * 提示：
 * 0 <= n <= 100
 * 注意：本题与主站 70 题相同：https://leetcode-cn.com/problems/climbing-stairs/
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _10_2 {
    static int mod = 1000000007;
    public static int ways(int n, int[] cache) {
        // has cache
        if (n < 3 || (n > 3 && cache[n] != 0)) {
            return cache[n];
        }
        // no cache
        int result = ways(n - 1, cache) + ways(n - 2, cache);
        if (result > mod) {
            cache[n] = result - mod;
        } else {
            cache[n] = result;
        }
        return cache[n];
    }
    public static int numWays(int n) {
        // 0 - 1, 1 - 1, 2 - 2
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return n;
        }
        int[] cache = new int[n + 1];
        cache[1] = 1;
        cache[2] = 2;
        return ways(n, cache);
    }
    public static void main(String[] args) {
        //System.out.println(numWays(44)); 1134903170 1000000007
    }
}
