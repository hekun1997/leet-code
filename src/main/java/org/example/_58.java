package org.example;

/**
 * Created by hekun on 2021/9/27 16:11
 */
public class _58 {
    public static int lengthOfLastWord(String s) {
        StringBuilder temp = new StringBuilder(s);
        for (int i = s.length() - 1; i >= 0 && s.charAt(i) == ' '; i--){
            temp.replace(i, i + 1, "");
        }
        return temp.length() - 1 - temp.lastIndexOf(" ");
    }
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
}
