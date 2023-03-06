package org.example;

import java.util.ArrayDeque;

/**
 * Created by hekun on 2023/2/16 21:24
 */
public class _150 {

    public static int evalRPN(String[] tokens) {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        Integer right = null;
        Integer left = null;
        Integer result = null;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    right = numbers.removeLast();
                    left = numbers.removeLast();
                    result = left + right;
                    numbers.addLast(result);
                    break;
                case "-":
                    right = numbers.removeLast();
                    left = numbers.removeLast();
                    result = left - right;
                    numbers.addLast(result);
                    break;
                case "*":
                    right = numbers.removeLast();
                    left = numbers.removeLast();
                    result = left * right;
                    numbers.addLast(result);
                    break;
                case "/":
                    right = numbers.removeLast();
                    left = numbers.removeLast();
                    result = left / right;
                    numbers.addLast(result);
                    break;
                default:
                    numbers.addLast(Integer.valueOf(token));;
            }
        }
        return numbers.removeLast();
    }
    public static void main(String[] args) {
        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
}
