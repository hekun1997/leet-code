package org.example.forOffer;

import org.example.object.ListNode;

/**
 * Created by hekun on 2023/1/21 18:11
 */
public class _22 {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head, last = head;
        for (int i = 0; i < k; i++) {
            last = last.next;
        }
        while (last != null) {
            pre = pre.next;
            last = last.next;
        }
        return pre;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        getKthFromEnd(node1, 2);
    }
}
