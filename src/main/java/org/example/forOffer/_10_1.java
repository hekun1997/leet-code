package org.example.forOffer;

/**
 * Created by hekun on 2023/1/18 09:07
 */
public class _10_1 {

    static int mod = 1000000007;

    public static int F(int n, int[]cache) {
        if ((cache[n] != 0 && n > 0) || n < 2) {  // has cache
            return cache[n];
        }

        // no cache
        cache[n] = (F(n - 1, cache) + F(n - 2, cache)) % mod;
        return cache[n];
    }
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] cache = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        return F(n, cache);
    }
    public static void main(String[] args) {

        //0，1，1，2，3，5，8，13，21，34，55，89
        System.out.println(fib(3));
        for (int i = 0; i < 12; i++) {
            System.out.println(fib(i));
        }
    }
}
