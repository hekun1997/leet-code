package org.example.algorithm;

import java.util.Arrays;
import org.example.algorithm.Example;

public class Selection {
    public static void mySort(Comparable[] a) {
        for (int key = 0; key < a.length - 1; key ++) {
            int minIndex = key;
            for (int j = key + 1; j < a.length; j++) {
                if (a[minIndex].compareTo(a[j]) > 0) {
                    minIndex = j;
                }
            }
            if (minIndex != key) {
                Comparable temp = a[key];
                a[key] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (Example.less(a[j], a[min])) {
                    min = j;
                }
            }
            Example.exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[] {3, 1, 2, 5, 0, 4};
        sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}
