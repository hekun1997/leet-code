package org.example;


import java.util.HashMap;
import java.util.Map;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：2
 * 解释：有两种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶
 * 2. 2 阶
 * 示例 2：
 *
 * 输入：n = 3
 * 输出：3
 * 解释：有三种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶 + 1 阶
 * 2. 1 阶 + 2 阶
 * 3. 2 阶 + 1 阶
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _70 {
    static Map<Integer, Integer> result = new HashMap<>(45);
    public static int climbStairs(int n) {

        if (result.containsKey(n)) {
            System.out.println("has key");
            return result.get(n);
        } else {
            if (n == 1) {
                result.put(1, 1);
                return 1;
            } else if (n == 2) {
                result.put(2, 2);
                return 2;
            } else {
                int pre1 = n - 1;
                int preResult1 = climbStairs(pre1);
                result.put(pre1, preResult1);

                int pre2 = n - 2;
                int preResult2 = climbStairs(pre2);
                result.put(pre2, preResult2);
                return  preResult1 + preResult2;
            }
        }

    }
    public static void main(String[] args) {
        for (int i = 1; i <= 45; i ++) {
            System.out.println(climbStairs(i));
        }
    }
}
