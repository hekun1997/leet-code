package org.example;

import java.util.Arrays;

/**
 * Created by hekun on 2023/3/19 22:35
 */
public class _338 {
    public int getBitCount(int i) {
        int res = 0;
        while (i > 0) {
            if ((i & 1) == 1) {
                res++;
            }
            i >>= 1;
        }
        return res;
    }
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = getBitCount(i);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new _338().countBits(5)));
    }
}
