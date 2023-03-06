package org.example.forOffer;

/**
 * Created by hekun on 2023/1/13 09:35
 */
public class _58 {
    public static String reverseLeftWords(String s, int n) {
        String reverseSubStr = s.substring(0, n);
        StringBuffer sb = new StringBuffer(s.substring(n));
        sb.append(reverseSubStr);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("lrloseumgh", 6).equals("umghlrlose"));
    }
}
