package org.example.algorithm;

import java.util.Arrays;

public class Shell {

    public static void mySort (Comparable[] a) {
        int N = a.length;
        int h = N / 2;
        while (h > 0) {
            //分组
            for (int i = h; i < N; i++) {
                //交换插入排序
                for (int j = i; j >= h; j -= h) {
                    if (a[j].compareTo(a[j - h]) < 0) {
                        Comparable temp = a[j];
                        a[j] = a[j - h];
                        a[j - h] = temp;
                    }
                }
            }
            h = h / 2;
        }
    }
    public static void sort (Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i ++) {
                for (int j = i; j >= h && Example.less(a[j], a[j - h]); j -= h) {
                    Example.exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[] {9, 2, 5, 7, 6, 3, 1};
        //sort(a);
        mySort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}
