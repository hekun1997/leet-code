package org.example.hengSheng_323;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by hekun on 2023/3/23 17:53
 */
public class _01 {

    private String error = "输入错误";
    private String r = "红";
    private String y = "黄";
    private String b = "蓝";

    public String solution(String str) {
        StringBuilder res = new StringBuilder();
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            Character curr = str.charAt(i);
            switch (curr){
                case '{':
                    deque.addLast(curr);
                    res.append(r);
                    break;
                case '[':
                    deque.addLast(curr);
                    res.append(y);
                    break;
                case '(':
                    deque.addLast(curr);
                    res.append(b);
                    break;
                case '}':
                    if (deque.removeLast() != '{')
                        return error;
                    res.append(r);
                    break;
                case ']':
                    if (deque.removeLast() != '[')
                        return error;
                    res.append(y);
                    break;
                case ')':
                    if (deque.removeLast() != '(')
                        return error;
                    res.append(b);
                    break;
                default:
                    return error;
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(new _01().solution(str).equals("红黄蓝蓝黄红红红黄黄"));
    }
}
