package org.example;

import java.util.ArrayList;
import java.util.List;

public class NumReverse {
    public static int reverse(int x) {
        int is_negative = x < 0 ? -1 : 1;
        x *= is_negative;
        long retVal = 0L;
        int multiple = 1;
        List<Integer> nums = new ArrayList<>();
        while (x > 0){
            nums.add(x % 10);
            x /= 10;
        }

        for (int i =  1; i < nums.size(); i ++){
            multiple *= 10;
        }

        for (int num : nums){
            retVal += (long) num * multiple;
            multiple /= 10;
        }

        retVal *= is_negative;

        if (retVal > Integer.MAX_VALUE || retVal < Integer.MIN_VALUE){
            return 0;
        }

        return (int) retVal;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
