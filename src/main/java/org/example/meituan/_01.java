package org.example.meituan;

import java.util.Scanner;

/**
 * Created by hekun on 2023/3/11 19:01
 * 小美有一个由数字字符组成的字符串。现在她想对这个字符串进行一些修改。
 * 具体地，她可以将这个字符串中任意位置字符修改为任意的数字字符。
 * 她想知道，至少进行多少次修改，可以使得修改后的字符串不包含两个连续相同的字符？
 *
 * 例如，对于字符串”111222333”，她可以进行3次修改将其变为”121212313”。
 */
public class _01 {
    public int solution(String str) {
        if (str == null || str.length() < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length() - 1;) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //11551111
        System.out.println(new _01().solution(str));
    }
}
