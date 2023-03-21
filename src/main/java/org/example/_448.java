package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/3/20 18:20
 */
public class _448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] isFind = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            isFind[nums[i]] = true;
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 1; i < isFind.length; i++) {
            if (!isFind[i]) {
                res.add(i);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(new _448().findDisappearedNumbers(nums));
    }
}
