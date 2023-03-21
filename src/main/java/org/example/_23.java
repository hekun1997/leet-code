package org.example;

import org.example.object.ListNode;

import java.util.PriorityQueue;

/**
 * Created by hekun on 2023/3/18 16:02
 */
public class _23 {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length < 1) {
            return null;
        }

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (o1, o2) -> {
            if (o1.val > o2.val) return 1;
            else if (o1.val == o2.val) return 0;
            return -1;
        });

        for (ListNode curr : lists) {
            if (curr != null) {
                queue.add(curr);
            }
        }

        ListNode head = new ListNode();
        ListNode p = head;

        while (!queue.isEmpty()) {
            ListNode curr = queue.poll();
            p.next = curr;
            p = p.next;
            if (curr.next != null) {
                queue.add(curr.next);
            }
        }

        return head.next;
    }
    public static void main(String[] args) {
        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode41 = new ListNode(4);
        ListNode listNode42 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);

        listNode11.next = listNode41;
        listNode41.next = listNode5;

        listNode12.next = listNode3;
        listNode3.next = listNode42;

        listNode2.next = listNode6;

        mergeKLists(new ListNode[]{listNode11, listNode12, listNode2});
    }
}
