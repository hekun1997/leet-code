package org.example.ctrip;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by hekun on 2023/3/7 18:49
 */
public class _2 {
    public int solution(int n, int[] arr) {
        if (arr == null || arr.length < 1) {
            return 0;
        }
        int res = 0;
        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int last = deque.peekLast();
            if (Math.abs(arr[i] - last) <= 1) {
                deque.addLast(arr[i]);
            } else {
                res = Math.max(deque.size(), res);
                deque.clear();
                deque.addLast(arr[i]);
            }
        }
        return Math.max(deque.size(), res);
    }
    public static void main(String[] args) {
        //5
        //2 4 2 3 2
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(new _2().solution(n, arr));
    }
}
