package org.example;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by hekun on 2021/10/9 12:08
 */
public class _3 {
    public static int lengthOfLongestSubstring(String s) {
        Deque<Character> queue = new LinkedList<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            while (queue.contains(curr)) {
                queue.removeFirst();
            }
            queue.addLast(curr);
            if (maxLength < queue.size()) {
                maxLength = queue.size();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int len = lengthOfLongestSubstring("bbbbb");
        System.out.println(len);
    }
}
