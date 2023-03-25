package org.example.hengSheng_323;

import java.util.*;

/**
 * Created by hekun on 2023/3/23 19:01
 * 11:[6, 5]
 * 11:[7, 4]
 * 11:[8, 3]
 * 12:[9, 2, 1]
 */
public class _02 {
    public void solution(int[] works, int workerCount) {
        Deque<List<Integer>> temp = new LinkedList<>();

        int startIndex = works.length % workerCount;

        List<Integer> curr;
        for (int i = startIndex; i < workerCount + startIndex; i++) {
            curr = new ArrayList<>();
            curr.add(works[i]);
            temp.addLast(curr);
        }

        boolean lowToHigh = false;
        int i = workerCount + startIndex;
        while (i < works.length) {
            if (lowToHigh) {  // 小到大
                for (int j = temp.size(); j > 0; j--, i++) {
                    curr = temp.removeFirst();
                    curr.add(works[i]);
                    temp.addLast(curr);
                }
            } else {  // 大到小
                for (int j = temp.size(); j > 0; j--, i++) {
                    curr = temp.removeLast();
                    curr.add(works[i]);
                    temp.addFirst(curr);
                }
            }
            lowToHigh = !lowToHigh;
        }
        List<List<Integer>> res = new ArrayList<>(workerCount);
        if (startIndex > 0) {
            while (temp.size() > startIndex) {
                res.add(temp.removeLast());
            }
            for (int j = startIndex-1; j >= 0; j--) {
                curr = temp.removeLast();
                curr.add(works[j]);
                res.add(curr);
            }
        } else {
            while (!temp.isEmpty()) {
                res.add(temp.removeLast());
            }
        }

        for (List<Integer> data : res) {
            int sum = data.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sum + ":" + data);
        }
    }
    public static void main(String[] args) {
        //works=[1,2,3,6,5,4,7,8,9]
        //workerCount=4
//        22:[8, 7, 4, 3]
//        23:[9, 6, 5, 2, 1]
        Scanner scanner = new Scanner(System.in);
        String[] inputWorks = scanner.next().replace("=", "").replace("[","").replace("]", "").split(",");
        String inputCount  = scanner.next();
        int[] nums = {1,2,3,6,5,4,7,8,9};
        int workerCount = Integer.valueOf(inputCount.split("=")[1]);
        Arrays.sort(nums);
        new _02().solution(nums, workerCount);
    }
}
