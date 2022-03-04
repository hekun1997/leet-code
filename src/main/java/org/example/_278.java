package org.example;

public class _278 {
    public static boolean isBadVersion(int n){
        return n >= 1702766719;
    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int middle;
        while(start < end){
            middle = start + (end - start) / 2;
            if (isBadVersion(middle)){
                end = middle;
            }else {
                start = middle + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        /**
         * 2126753390
         * 1702766719
         */
        System.out.println(firstBadVersion(2126753390));
    }
}
