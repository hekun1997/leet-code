package org.example;

import org.example.object.ListNode;

/**
 * @author hekun
 * @date 2024/5/22 14:38
 */
public class _206 {
    public static ListNode reverseList(ListNode head) {
        ListNode p = new ListNode();
        while (head != null) {
            ListNode pNext = p.next;
            ListNode headNext = head.next;

            p.next = head;
            head.next = pNext;

            head = headNext;
        }
        return p.next;
    }

    public static void main(String[] args) {
        System.out.println(reverseList(ListNode.createList(new int[]{})));
    }
}
