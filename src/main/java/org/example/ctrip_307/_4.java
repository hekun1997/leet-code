package org.example.ctrip_307;

/**
 * Created by hekun on 2023/3/7 19:28
 */
public class _4 {
    public double solution(int v0, int x, int y) {
        // res = t + y / (v0 + t * x)
        double err = 1e-6;
        double maxT = y; // max t
        double t = y / x;
        double res = t + (double)y / (v0 + t * x);
        double pre = maxT;
        double preT = maxT;
        preT = t;        while (Math.abs(res - pre) > err) {

            if (res > pre) {
                t = (preT + t) / 2;
            } else {
                t /= 2;
            }
            pre = res;
            res = t + (double) y / (v0 + t * x);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new _4().solution(0, 1, 2));
    }
}
