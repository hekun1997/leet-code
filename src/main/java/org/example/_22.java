package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/3/21 9:04
 */
public class _22 {
    List<String> res = new ArrayList<>();

    public void backTrace(String curr, int leftN, int rightN) {
        if (leftN < 0 || leftN > rightN) {
            return;
        }

        if (leftN == 0 && rightN == 0) {
            res.add(curr);
            return;
        }

        backTrace(curr + "(", leftN - 1, rightN);
        backTrace(curr + ")", leftN, rightN  - 1);
    }

    public List<String> generateParenthesis(int n) {
        backTrace("", n, n);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new _22().generateParenthesis(3));
    }
}
