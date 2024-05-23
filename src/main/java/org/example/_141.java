package org.example;

import org.example.object.ListNode;

import java.util.Arrays;
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

    public static boolean hasCycle2(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasCycle2(ListNode.createListWithArr(Arrays.asList(1,2))));
    }
}
