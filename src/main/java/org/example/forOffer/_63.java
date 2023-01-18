package org.example.forOffer;

/**
 * Created by hekun on 2023/1/18 10:23
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/gu-piao-de-zui-da-li-run-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
