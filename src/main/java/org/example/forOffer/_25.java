package org.example.forOffer;

import org.example.object.ListNode;

/**
 * Created by hekun on 2023/1/30 10:05
 * 合并有序链表
 */
public class _25 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(), curr = head;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                curr.next = l2;
                l2 = l2.next;
            } else {
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode14 = new ListNode(4);

        listNode11.next = listNode12;
        listNode12.next = listNode14;

        ListNode listNode21 = new ListNode(1);
        ListNode listNode23 = new ListNode(3);
        ListNode listNode24 = new ListNode(4);

        listNode21.next = listNode23;
        listNode23.next = listNode24;

        mergeTwoLists(listNode11, listNode21);
    }
}
