package org.example.bag;

/**
 * Created by hekun on 2023/3/14 15:19
 */
public class _full_bag {
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        int[] weights = {1,3,4};
        int[] values = {15,20,30};

        for (int i = 0; i < weights.length; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= weights[i]) {
                    dp[j] = Math.max(dp[j], dp[j - weights[i]] + values[i]);
                }
            }
            for (int num : dp) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
