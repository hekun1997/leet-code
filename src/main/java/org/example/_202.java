package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hekun
 * @date 2024/5/23 17:22
 * @Description: TODO
 */
public class _202 {
    public static boolean isHappy(int n) {
        List<Integer> records = new ArrayList<>();

        while (true) {
            int sum = 0, curr = 0;
            while (n > 0) {
                curr = n % 10;
                sum += curr * curr;
                n /= 10;
            }

            if(sum == 1) {
                return true;
            }

            if (records.contains(sum)) {
                return false;
            } else {
                records.add(sum);
            }
            n = sum;
        }
    }
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
