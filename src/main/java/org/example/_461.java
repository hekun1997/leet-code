package org.example;

/**
 * Created by hekun on 2023/3/20 18:11
 */
public class _461 {
    public int hammingDistance(int x, int y) {
        x ^= y;
        int res = 0;
        while (x > 0) {
            if ((x & 1) == 1) {
                res ++;
            }
            x >>= 1;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new _461().hammingDistance(1, 3));
    }
}
