package org.example;

import java.util.Stack;

/**
 * Created by hekun on 2021/9/24 20:33
 */
public class _20 {
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1){
            return false;
        }
        Stack<Character> left = new Stack<>();
        //Stack<Character> right = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch (c){
                case '(':
                case '[':
                case '{':
                    left.push(c);
                    break;
                case ')':
                case ']':
                case '}':
                    if (!checkRight(left, c)){
                        return false;
                    }
                    break;
                default:
            }
        }

        return left.size() == 0;
    }

    public static boolean checkRight(Stack<Character> left, char right){
        if (left.size() < 1){
            return false;
        }
        char c = left.pop();
        if(c == '(' && right == ')'){
            return true;
        }else if (c == '[' && right == ']'){
            return true;
        }else return c == '{' && right == '}';
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
