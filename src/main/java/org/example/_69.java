package org.example;

public class _69 {
    public static int mySqrt(int x) {
        if (x < 1){
            return 0;
        }

        int begin = 1;
        int end = x;
        int middle = 0;

        while (begin <= end){
            middle = (begin + end) / 2;
            if (middle == x / middle){
                return middle;
            }else if (middle < x / middle){
                begin = middle + 1;
            }else {
                end = middle - 1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}
