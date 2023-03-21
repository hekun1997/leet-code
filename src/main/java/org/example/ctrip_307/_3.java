package org.example.ctrip_307;

import java.util.Scanner;

/**
 * Created by hekun on 2023/3/7 19:13
 */
public class _3 {
    public String solution(String str, int l, int r) {
        if (str == null || str.length() < 1 || l > r || l < 0) {
            return str;
        }
        StringBuilder res = new StringBuilder(str.substring(0, l-1));
        for (int i = l-1; i < r; i++) {
            res.append(str.charAt(i)).
                    append(str.charAt(i));
        }
        res.append(str.substring(r));
        return res.toString();
    }
    public static void main(String[] args) {
        //6 2
        //abcdef
        //2 4
        //3 6
        Scanner scanner = new Scanner(System.in);
        int n, q;
        int l, r;
        n = scanner.nextInt();
        q = scanner.nextInt();
        String str = scanner.next();
        _3 soluClazz = new _3();
        for (int i = 0; i < q; i++) {
            l = scanner.nextInt();
            r = scanner.nextInt();
            str = soluClazz.solution(str, l, r);
        }
        System.out.println(str);
        //System.out.println(new _3().solution("abcd", 2, 3));
    }
}
