package org.example.algorithm;

import java.util.Arrays;

public class Insert {
    public static void mySort (Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            Comparable curr = a[i];
            int j = 0;
            //找出插入位置
            for (; j < i; j++) {
                if (a[j].compareTo(a[i]) > 0) {
                    break;
                }
            }
            //从插入位置向后移动元素
            for (int k = i; k > j; k--) {
                a[k] = a[k - 1];
            }
            a[j] = curr;
        }
    }

    public static void sort (Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--){
                Example.exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[] {3, 1, 2, 5, 0, 4};
        sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}
