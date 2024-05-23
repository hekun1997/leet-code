package org.example;

import org.example.object.ListNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author hekun
 * @date 2024/5/23 10:48
 * @Description: TODO
 */
public class _142 {
    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                ListNode i1 = fast, i2 = head;
                while (i1 != i2) {
                    i1 = i1.next;
                    i2 = i2.next;
                }
                return i1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode head = ListNode.createListWithArr(Arrays.asList(3,2,0,-4));
        ListNode p1 = head, p2 = head;
        while (p1.val != 2) {
            p1 = p1.next;
        }
        while (p2.val != -4) {
            p2 = p2.next;
        }

        p2.next = p1;

        System.out.println(detectCycle(head));
    }
}
