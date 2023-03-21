package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by hekun on 2023/3/11 16:45
 */
public class _39 {
    List<List<Integer>> results = new ArrayList<>();
    public void backTrace(int sum, List<Integer> result, int[] candidates, int target) {
        // end
        if (sum == target) {
            Collections.sort(result);
            if (!results.contains(result)) {
                results.add(new ArrayList<>(result));
            }
            return;
        }
        // iter
        for (int num : candidates) {
            if (num + sum <= target) {
                result.add(num);
                backTrace(num + sum, result, candidates, target);
                result.remove(Integer.valueOf(num));
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrace(0, new ArrayList<>(), candidates, target);
        return results;
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(new _39().combinationSum(candidates, target));
    }
}
