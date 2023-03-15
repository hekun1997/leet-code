package org.example.baidu;

/**
 * Created by hekun on 2023/3/14 10:29
 * 给定字符数组 'r' 'e' 'd',一个整数x
 * 输出字符串s，使得s的回文子串数量为x
 */
public class _02 {
    char[] redChars = new char[]{'r', 'e', 'd'};
    String redStr = "red";

    public boolean isPalindromicString(String str) {
        if (str == null || str.length() < 1) {
            return false;
        }
        int start= 0, end = str.length()-1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String solution(int x) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; x > 3 && i < x / 3; i++) {
            res.append(redStr);
        }
        for (int i = 0; i < x % 3; i++) {
            res.append(redChars[i]);
        }
        int count = 0;

        return res.toString();
    }
    public static void main(String[] args) {
        //String str = new _02().solution(5);
        _02 isSub = new _02();
        String str = "aaa";
        int left = 0, right = 1;
        while (left <= right && right < str.length() + 1) {
            String subStr = str.substring(left, right);
            System.out.println(subStr);
            boolean is = isSub.isPalindromicString(subStr);
            System.out.println(is);
            if (is) {
                right ++;
            } else {
                left ++;
            }
        }
    }
}
