package org.example;

import java.util.HashMap;
import java.util.Map;

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

    public static int climbStairs2(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs2(4));
    }
}
