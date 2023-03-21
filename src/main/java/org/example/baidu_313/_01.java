package org.example.baidu_313;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by hekun on 2023/3/13 18:59
 */
public class _01 {
    public void solution(String str) {
        String yes = "Yes";
        String no = "No";
        if (str == null || str.length() != 5) {
            System.out.println(no);
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), 1);
        }

        String Baidu = "Baidu";
        for (int i = 0; i < Baidu.length(); i++) {
            if (!map.containsKey(Baidu.charAt(i))) {
                System.out.println(no);
                return;
            }
        }
        System.out.println(yes);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        _01 solution = new _01();
        for (int i = 0; i < t; i++) {
            String str = scanner.next();
            solution.solution(str);
        }
    }
}
