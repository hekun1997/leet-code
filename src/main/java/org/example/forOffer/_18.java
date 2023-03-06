package org.example.forOffer;

import org.example.object.ListNode;

/**
 * Created by hekun on 2023/1/21 19:21
 */
public class _18 {
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode pre = head;
        if (head == null) {
            return head;
        }
        if (pre.val == val) {  // head val == val
            return pre.next;
        }
        while (pre != null && pre.next != null && pre.next.val != val) {
            pre = pre.next;
        }
        if (pre.next.val == val) {
            pre.next = pre.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node9 = new ListNode(9);

        node4.next = node5;
        node5.next = node1;
        node1.next = node9;

        ListNode result = deleteNode(null, 9);
        System.out.println(result);
    }
}
