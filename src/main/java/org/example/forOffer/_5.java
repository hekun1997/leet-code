package org.example.forOffer;

/**
 * Created by hekun on 2023/1/13 09:18
 */
public class _5 {
    public static String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
    public static String replaceSpace2(String s) {
        if (s == null) {
            return s;
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result.append(s.charAt(i));
                j ++;
            } else {
                result.append("%20");
                j += 3;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(replaceSpace2("").equals(""));
        System.out.println(replaceSpace2(" ").equals("%20"));
        System.out.println(replaceSpace2(null));
    }
}
