package org.example.forOffer;

/**
 * Created by hekun on 2023/1/19 10:21
 * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。你可以从棋盘的左上角开始拿格子里的礼物，
 * 并每次向右或者向下移动一格、直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 * 示例 1:
 * 输入: 
 * [
 *  [1,3,1],
 *  [1,5,1],
 *  [4,2,1]
 * ]
 * 输出: 12
 * 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
 * 提示：
 * 0 < grid.length <= 200
 * 0 < grid[0].length <= 200
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _47 {
    public static int maxValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }else if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                } else if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                } else {
                    grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
    public static void main(String[] args) {
        int[][] grid = new int[][]{
//                {1,2,5},
//                {3,2,1}
//                {1,3,1},
//                {1,5,1},
//                {4,2,1}
                {1,4,8,6,2,2,1,7},{4,7,3,1,4,5,5,1},{8,8,2,1,1,8,0,1},{8,9,2,9,8,0,8,9},{5,7,5,7,1,8,5,5},{7,0,9,4,5,6,5,6},{4,9,9,7,9,1,9,0}
        };
        System.out.println(maxValue(grid));
    }
}
