package org.example;

/**
 *  Created by hekun on 2021/9/22 15:01
 */
public class _9 {
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int _x = x;
        int reverseNum = 0;

        while(_x > 0){
            reverseNum *= 10;
            reverseNum += _x % 10;
            _x /= 10;
        }
        //System.out.printf("reverseNum: %d, x: %d \n", reverseNum, x);
        return reverseNum == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123454321));
    }
}
