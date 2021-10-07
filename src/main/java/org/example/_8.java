package org.example;

/**
 * Created by hekun on 2021/9/29 17:42
 */
public class _8 {
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.length() < 1 || (s.charAt(0) < '0' || s.charAt(0) > '9') && s.charAt(0) != '-' && s.charAt(0) != '+'){
            return 0;
        }

        boolean isNegative = false;

        if (s.charAt(0) == '-' || s.charAt(0) == '+'){
            if (s.charAt(0) == '-'){
                isNegative = true;
            }
            s = s.substring(1);
        }
        int i = 0;
        int len  = s.length();
        while (true){
            if (i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                i ++;
            }else {
                s = s.substring(0, i);
                break;
            }
        }

        if (isNegative){
            s = '-' + s;
        }
        double temp;
        try{
            temp = Double.parseDouble(s);
        }catch (NumberFormatException e){
            return 0;
        }

        if (temp >= (double)Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if (temp <= (double)Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else{
            return Integer.parseInt(s);
        }
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("2147483646"));
    }
}
