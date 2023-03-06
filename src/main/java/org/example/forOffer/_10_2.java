package org.example.forOffer;

/**
 * Created by hekun on 2023/1/18 09:53
 */
public class _10_2 {
    static int mod = 1000000007;
    public static int ways(int n, int[] cache) {
        // has cache
        if (n < 3 || (n > 3 && cache[n] != 0)) {
            return cache[n];
        }
        // no cache
        int result = ways(n - 1, cache) + ways(n - 2, cache);
        if (result > mod) {
            cache[n] = result - mod;
        } else {
            cache[n] = result;
        }
        return cache[n];
    }
    public static int numWays(int n) {
        // 0 - 1, 1 - 1, 2 - 2
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return n;
        }
        int[] cache = new int[n + 1];
        cache[1] = 1;
        cache[2] = 2;
        return ways(n, cache);
    }
    public static void main(String[] args) {
        //System.out.println(numWays(44)); 1134903170 1000000007
    }
}
