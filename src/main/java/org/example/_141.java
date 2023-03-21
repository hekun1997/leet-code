package org.example;

import org.example.object.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hekun on 2023/3/19 16:40
 */
public class _141 {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        Set<ListNode> set = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (set.contains(curr)) {
                return false;
            } else {
                set.add(curr);
            }
            curr = curr.next;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
