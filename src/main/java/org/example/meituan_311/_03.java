package org.example.meituan_311;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by hekun on 2023/3/11 20:12
 * 小美是一位天文爱好者，她收集了接下来一段时间中所有会划过她所在的观测地上空的流星信息。
 * 具体地，她收集了n个流星在她所在观测地上空的出现时刻和消失时刻。
 * 对于一个流星，若其的出现时刻为s，消失时刻为t，那么小美在时间段[s, t]都能够观测到它。
 * 对于一个时刻，观测地上空出现的流星数量越多，则小美认为该时刻越好。
 * 小美希望能够选择一个最佳的时刻进行观测和摄影，使她能观测到最多数量的流星。
 * 现在小美想知道，在这个最佳时刻，她最多能观测到多少个流星以及一共有多少个最佳时刻可供她选择。
 * 输入描述
 * 第一行是一个正整数n，表示流星的数量。
 * 第二行是n个用空格隔开的正整数，第i个数si表示第i个流星的出现时间。
 * 第三行是n个用空格隔开的正整数，第i个数ti表示第i个流星的消失时间。
 * 1<=n<=100000, 1<=si<=ti<=10^9
 */
public class _03 {
    public void solution(int n, int[] start, int[] end) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = start[i]; j <= end[i]; j++) {
                int count = map.getOrDefault(j, 0) + 1;
                max = Math.max(max, count);
                map.put(j, count);
            }
        }
        int count = 0;
        for (Integer key: map.keySet()) {
            if (map.get(key).equals(max)) {
                count++;
            }
        }
        System.out.println(max + " " + count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            end[i] = scanner.nextInt();
        }
        new _03().solution(n, start, end);
    }
}
