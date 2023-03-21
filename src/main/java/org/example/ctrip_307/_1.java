package org.example.ctrip_307;

import java.util.Scanner;

/**
 * Created by hekun on 2023/3/7 16:50
 */
public class _1 {
    public String updateStr(String str) {
        if (str == null || str.length() < 3) {
            return str;
        }
        StringBuilder res = new StringBuilder();

        char first = str.charAt(0);
        char second = str.charAt(1);

        res.append(first).append(second);

        for (int i = 2; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (first == second && second == curr) {
                // 1
            } else if (first == second && second != curr && (i+1) < str.length() && curr == str.charAt(i+1)) {
                // 2
            } else {
                res.append(curr);
            }
            first = second;
            second = curr;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            System.out.println();
            //System.out.println(new _1().updateStr(str));
        }
    }
}
