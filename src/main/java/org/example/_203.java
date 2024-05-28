package org.example;

import org.example.object.ListNode;

/**
 * @author hekun
 * @date 2024/5/21 15:55
 */
public class _203 {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode p = new ListNode();
        ListNode q = p;

        while (head != null) {
            if (head.val != val){
                //连接到新的链表
                q.next = head;
                //旧链表节点后移
                head = head.next;
                //断开新旧链表节点
                q.next.next = null;
                //新链表节点后移
                q = q.next;
            } else {
                head = head.next;
            }
        }
        return p.next;
    }
    public static void main(String[] args) {
        System.out.println(removeElements(ListNode.createList(new int[]{7,7,7,7}), 7));
    }
}
