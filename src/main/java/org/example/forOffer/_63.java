package org.example.forOffer;

/**
 * Created by hekun on 2023/1/18 10:23
 */
public class _63 {
    public static int maxProfit(int[] prices) {
        // 第i天的最大利润等于，max（第i-1天的最大利润，第i天的价格减去-前i天的最小价格）
//        int[] dp = new int[prices.length];
//        int min = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            min = Math.min(min, prices[i]);
//            dp[i] = Math.max(dp[i-1], prices[i] - min);
//        }
//        return dp[dp.length - 1];
        if(prices.length == 0) return 0;
        int res = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            res = Math.max(res, prices[i] - min);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
