package org.example;

/**
 * Created by hekun on 2023/3/11 09:44
 */
public class _1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }
        int space = sum / 2;
        int[] dp = new int[space + 1];

        for (int i = 0; i < stones.length; i++) {
            for (int j = dp.length-1; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j-stones[i]] + stones[i]);
            }
        }

        return sum - dp[dp.length-1] - dp[dp.length-1];
    }
    public static void main(String[] args) {
        int stones[] = new int[]{2,7,4,1,8,1};
        System.out.println(new _1049().lastStoneWeightII(stones));
    }
}
