package org.example.object;

import java.util.List;

/**
 * Created by hekun on 2021/9/24 21:24
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode setNext(ListNode next) {
        this.next = next;
        return next;
    }

    public ListNode getNext() {
        return next;
    }

    public static ListNode createList(int[] vals) {
        ListNode head = new ListNode();
        ListNode p = head;

        for (int j : vals) {
            ListNode temp = new ListNode(j);
            p.next = temp;
            p = p.next;
        }

        return head.next;
    }

    @Override
    public String toString() {

        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
