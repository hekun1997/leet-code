package org.example;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hekun on 2023/2/16 21:59
 */
public class _239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        PriorityQueue deque = new PriorityQueue();
        for (int i = 0; i < nums.length; i++) {
            if (deque.size() == k) {
                result[index++] = deque.peek();
                deque.pop(nums[i - k]);
            }
            deque.push(nums[i]);
        }
        result[index] = deque.peek();
        return result;
    }
    public static void main(String[] args) {
//        int[] nums = new int[]{};
//        int k = 1;
//        int[] result = maxSlidingWindow(nums, k);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
        java.util.PriorityQueue<Integer> queue = new java.util.PriorityQueue<>(Comparator.reverseOrder());
        queue.add(3);
        queue.add(1);
        queue.add(2);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

class PriorityQueue {
    List<Integer> list = new LinkedList<>();
    public void pop(Integer data) {
        list.remove(data);
    }

    public void push(Integer data) {
        list.add(data);
        list.sort(Comparator.reverseOrder());
    }

    public int peek() {
        return list.get(0);
    }

    public int size() {
        return list.size();
    }
}
