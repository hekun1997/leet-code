package org.example;

import org.example.object.ListNode;

/**
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 *
 * 返回同样按升序排列的结果链表。
 * Created by hekun on 2021/10/9 19:20
 */
public class _83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode curr = head;
        ListNode next_ = curr.next;

        while (next_ != null){
            if (curr.val == next_.val){
                curr.next = next_.next;
            }else {
                curr = next_;
            }
            next_ = next_.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next = head.setNext(new ListNode(1));
        next = next.setNext(new ListNode(2));
        next = next.setNext(new ListNode(2));
        next = next.setNext(new ListNode(3));
        next = next.setNext(new ListNode(3));
        deleteDuplicates(head);
        System.out.println(head);
    }
}
