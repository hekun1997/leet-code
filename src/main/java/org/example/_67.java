package org.example;

import java.util.Objects;

/**
 * Created by hekun on 2021/10/10 21:51
 * 111
 *  11
 *
 * 1010
 */
public class _67 {
    public static String addBinary(String a, String b) {

        int len = Math.max(a.length(), b.length());
        int ia = a.length() - 1;
        int ib = b.length() - 1;

        StringBuilder result = new StringBuilder();
        int add = 0;
        while (len > 0) {
            int temp_a = 0;
            int temp_b = 0;

            if (ia > -1){
                temp_a = Integer.parseInt(String.valueOf(a.charAt(ia)));
            }

            if (ib > -1){
                temp_b = Integer.parseInt(String.valueOf(b.charAt(ib)));
            }
            /**
             * 1. 0 + 0 = 0
             * 2. 0 + 1 = 1
             * 3. 1 + 1 = 0， add = 1
             */
            if (add == 1){
                if ((temp_a + temp_b) == 2) {
                    result.append(1);
                }else if ((temp_a + temp_b) == 1){ //1
                    result.append(0);
                }else { //0
                    result.append(1);
                    add = 0;
                }

            }else {
                if ((temp_a + temp_b) == 2) {
                    result.append(0);
                    add = 1;
                }else {
                    result.append(temp_a + temp_b);
                }
            }

            len --;
            ia --;
            ib --;
        }

        if (add == 1){
            result.append(add);
        }

        //System.out.println(result);
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(addBinary("", ""));
    }
}
