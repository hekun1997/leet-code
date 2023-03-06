package org.example;

import java.util.Arrays;

/**
 * Created by hekun on 2021/10/10 15:28
 */
public class _66 {
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        boolean is_overflow = false;
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] == 10){
                digits[i] = 0;
                if (i > 0){
                    digits[i - 1] += 1;
                }else {
                    is_overflow = true;
                }
            }
        }
        if (is_overflow){
            digits = Arrays.copyOf(digits, digits.length + 1);
            for (int i = digits.length - 1; i > 0; i--){
                digits[i] = digits[i - 1];
            }
            digits[0] = 1;
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] nums =  plusOne(new int[]{4,3,2,1});
        for (int num : nums){
            System.out.println(num);
        }
//        int[] a = new int[]{9, 9};
//        int[] b = Arrays.copyOf(a, a.length + 1);
//        System.out.println();
    }
}
