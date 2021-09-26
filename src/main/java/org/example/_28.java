package org.example;

/**
 * Created by hekun on 2021/9/26 22:16
 */
public class _28 {
    public static int strStr(String haystack, String needle) {
        if (needle.length() < 1 || haystack.equals(needle)){
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++){
            if (haystack.charAt(i) == needle.charAt(0) && i + needle.length() <= haystack.length()){
                String sub = haystack.substring(i, i + needle.length());
                if (sub.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("abc", "c"));
    }
}
