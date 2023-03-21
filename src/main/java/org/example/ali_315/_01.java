package org.example.ali_315;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hekun on 2023/3/13 10:24
 * 计算十六进制数字（比如：0xeeeeeffffffc01abc）转成二进制数字之后，包含1的数量。
 */
public class _01 {
    static Map<Integer, Integer> map = new HashMap<>();
    public static int solution(int[] nums) {
        int res = 0;
        for (int num: map.keySet()) {
            if(map.containsKey(num) && map.containsKey(num+1)) {
                int leftCount = map.get(num);
                int rightCount = map.get(num+1);
                res += (leftCount * rightCount * (leftCount - 1 + rightCount - 1) ) / 2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 2};

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(nums);
        System.out.println(solution(nums));
    }
}
