package org.example;

import java.util.HashMap;

/**
 * Created by hekun on 2023/2/27 10:13
 */
public class _409 {
    public int longestPalindrome(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        boolean needAdd = false;
        for (Integer value : map.values()) {
            if (value % 2 == 0) {
                result += value;
            } else {
                if (value >= 1) {
                    result += value - 1;
                    needAdd = true;
                }
            }
        }
        if (needAdd) {
            return result + 1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new _409().longestPalindrome("abccccdd"));
    }
}
