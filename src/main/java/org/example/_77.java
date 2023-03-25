package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/3/2 16:33
 */
public class _77 {

    List<List<Integer>> results = new ArrayList<>();
    List<Integer> result = new ArrayList<>();

    public void backTracing(int n, int k, int start) {
        if (result.size() == k) {
            results.add(new ArrayList<>(result));
            return;
        }
        for (int i = start; i <= n; i++) {
            result.add(i);
            backTracing(n, k, i + 1);
            result.remove(result.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        backTracing(n, k, 1);
        return results;
    }

    public static void main(String[] args) {
        System.out.println(new _77().combine(4, 3));
    }
}
