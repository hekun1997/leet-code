package org.example;

/**
 * Created by hekun on 2023/3/14 11:32
 */
public class _79 {

    int m, n;
    boolean[][] used = null;

    public boolean backTrace(char[][] board, int i, int j, String word, int index) {
        if (index == word.length() - 1 && board[i][j] == word.charAt(index)) {
            return true;
        }
        used[i][j] = true;
        if (board[i][j] != word.charAt(index)) {
            used[i][j] = false;
            return false;
        }
        boolean top = false, down = false, left = false, right = false;
        if (i-1 >= 0 && !used[i-1][j]) {
            top = backTrace(board, i-1, j, word, index+1);
        }
        if (i+1 < m && !used[i+1][j]) {
            down = backTrace(board, i+1, j, word, index+1);
        }
        if (j-1 >= 0 && !used[i][j-1]) {
            left = backTrace(board, i, j-1, word, index+1);
        }
        if (j+1 < n && !used[i][j+1]) {
            right = backTrace(board, i, j+1, word, index+1);
        }
        used[i][j] = false;
        return top || down || left || right;
    }

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        used = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (backTrace(board, i, j, word, 0)) {
                        return true;
                    }
                    used = new boolean[m][n];
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = {{'A'}};
        String word = "A";
        System.out.println(new _79().exist(board, word));
    }
}