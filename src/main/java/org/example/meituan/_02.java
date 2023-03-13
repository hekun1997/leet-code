package org.example.meituan;

import java.util.Scanner;

/**
 * Created by hekun on 2023/3/11 19:12
 * 小团在一个n*m的网格地图上探索。网格地图上第 i 行第 j 列的格子用坐标(i,j)简记。初始时，小团的位置在地图的左上角，即坐标(1,1)。
 * 地图上的每一个格子上都有一定的金币，特别地，小团位于的初始位置(1,1)上的金币为0。
 * 小团在进行探索移动时，可以选择向右移动一格（即从(x,y)到达(x,y+1)）或向下移动一格（即从(x,y)到达(x+1,y)）。
 * 地图上的每个格子都有一个颜色，红色或蓝色。如果小团一次移动前后的两个格子颜色不同，那么他需要支付 k 个金币才能够完成这一次移动；
 * 如果移动前后的两个格子颜色相同，则不需要支付金币。小团可以在任意格子选择结束探索。现在给你网格地图上每个格子的颜色与金币数量，
 * 假设小团初始时的金币数量为0，请你帮助小团计算出最优规划，使他能获得最多的金币，输出能获得的最多金币数量即可。
 *
 * 注意：要求保证小团任意时刻金币数量不小于零。
 */
public class _02 {
    public int solution(int[][] coins, String[] colors, int cost) {
        int n = coins.length;
        int m = coins[0].length;

        int[][] dp = new int[n][m];
        // 第一行
        for (int i = 1; i < m; i ++) {
            if (dp[0][i-1] < 0) {
                dp[0][i] = -1;
                continue;
            }
            if (colors[0].charAt(i) == colors[0].charAt(i-1)) {  // 颜色相等
                dp[0][i] = dp[0][i-1] + coins[0][i];
            } else {  // 颜色不等
                if ((dp[0][i-1] - cost) < 0) {
                    dp[0][i] = -1;
                } else {
                    dp[0][i] = dp[0][i-1] - cost + coins[0][i];
                }
            }
        }
        // 第一列
        for (int j = 1; j < n; j++) {
            if (dp[j-1][0] < 0) {
                dp[j][0] = -1;
                continue;
            }
            if (colors[j].charAt(0) == colors[j-1].charAt(0)) {  // 颜色相等
                dp[j][0] = dp[j-1][0] + coins[j][0];
            } else {  // 颜色不等
                if ((dp[j-1][0] - cost) < 0) {
                    dp[j][0] = -1;
                } else {
                    dp[j][0] = dp[j-1][0] - cost + coins[j][0];
                }
            }
        }

        // iter
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                Character curr = colors[i].charAt(j);
                Character top = colors[i-1].charAt(j);
                Character left = colors[i].charAt(j-1);

                if (dp[i-1][j] < 0 && dp[i][j-1] < 0) {
                    dp[i][j] = -1;
                    break;
                }

                if (curr.equals(left) && curr.equals(top)) {  // 上 左 颜色都相等
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + coins[i][j];
                } else if (curr.equals(top)) {  // 上 颜色相等
                    dp[i][j] = dp[i-1][j] + coins[i][j];
                } else if (curr.equals(left)) {  // 左 颜色相等
                    dp[i][j] = dp[i][j-1] + coins[i][j];
                } else {  // 上左颜色都不等
                    if (dp[i-1][j] > 0 && dp[i][j-1] > 0) {  // top left not -1
                        if (Math.max(dp[i-1][j], dp[i][j-1]) - cost > 0) {
                            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + coins[i][j] - cost;
                        } else {
                            dp[i][j] = -1;
                        }
                    } else if (dp[i-1][j] > 0 && dp[i-1][j] - cost > 0){
                        dp[i][j] = dp[i-1][j] + coins[i][j] - cost;
                    } else if (dp[i][j-1] > 0 && dp[i][j-1] - cost > 0) {
                        dp[i][j] = dp[i][j-1] + coins[i][j] - cost;
                    } else {
                        dp[i][j] = -1;
                    }
                }

            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m, cost;
        n = scanner.nextInt();
        m = scanner.nextInt();
        cost = scanner.nextInt();

        int[][] coins = new int[n][m];
        String[] colors = new String[n];
        for (int i = 0; i < n; i++) {
            colors[i] = scanner.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                coins[i][j] = scanner.nextInt();
            }
        }
        System.out.println(new _02().solution(coins, colors, cost));
    }
}
