package org.example;

/**
 * Created by hekun on 2023/2/7 10:45
 */
public class _367 {
    public static boolean isPerfectSquare(int num) {
        int start = 0, end = num;
        int mid, square;
        while (start <= end) {
            mid = start + (end - start) / 2;
            square = mid * mid;
            if (num > square) {
                start = mid + 1;
            } else if (num < square) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(-1));
    }
}
