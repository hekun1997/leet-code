package org.example;

import org.example.object.ListNode;

/**
 * @author hekun
 * @date 2024/5/22 14:49
 * @Description: TODO
 */
public class _24 {
    public static ListNode swapPairs(ListNode head) {
        ListNode p = new ListNode();
        ListNode q = p;

        ListNode pre;
        ListNode next;

        while (head != null) {
            pre = head;

            next = pre.next;
            if (next == null) {
                q.next = pre;
                return p.next;
            }

            head = next.next;
            q.next = next;
            pre.next = null;
            next.next = pre;

            q = pre;
        }
        return p.next;
    }

    public static void main(String[] args) {
        System.out.println(swapPairs(ListNode.createList(new int[]{1,2,3})));
    }
}
