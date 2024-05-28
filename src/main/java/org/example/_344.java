package org.example;

import java.util.Arrays;

public class _344 {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++;
            end --;
        }
        for(int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }
    public static void main(String[] args) {
        //reverseString(new char[]{'a', 'b', 'c', 'd', 'e', 'f'});
        byte[] binaryData = new byte[]{0b00000001, 0b00000010, 0b00000011, 0b00000100};
        binaryData[0] ^= binaryData[1];
        binaryData[1] ^= binaryData[0];
        binaryData[0] ^= binaryData[1];
        System.out.println();
    }
}
