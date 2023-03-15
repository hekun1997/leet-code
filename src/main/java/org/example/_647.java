package org.example;

/**
 * Created by hekun on 2023/3/14 10:54
 */
public class _647 {
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
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res++;
            //System.out.println(s.charAt(i));

            // odd
            int left = i - 1;
            int right = i + 2;
            while (left >= 0 && right <= s.length()
                    && isPalindromicString(s.substring(left, right))) {
                //System.out.println(s.substring(left, right));
                res++;
                left--;
                right++;
            }
            // even
            left = i;
            right = i + 2;
            while (left >= 0 && right <= s.length()
                    && isPalindromicString(s.substring(left, right))) {
                //System.out.println(s.substring(left, right));
                res++;
                left--;
                right++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(new _647().countSubstrings(str));
    }
}
