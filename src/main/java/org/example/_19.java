package org.example;

import org.example.object.ListNode;

/**
 * @Author: hekun
 * @Date: 2022-03-10 16:49
 * @Description: 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class _19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = 0;
        while (curr != null){
            curr = curr.next;
            length ++;
        }

        curr = head;
        int removeIndex = length - n;
        int currIndex = 0;
        while (currIndex < removeIndex - 1){
            curr = curr.next;
            currIndex ++;
        }

        if (removeIndex == 0){
            head = head.next;
        }else {
            curr.next = curr.next.next;
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        ListNode next = head.setNext(new ListNode(2));
//        next = next.setNext(new ListNode(3));
//        next = next.setNext(new ListNode(4));
//        next = next.setNext(new ListNode(5));
//        next = next.setNext(new ListNode(6));
        System.out.println(removeNthFromEnd(head, 1));
    }
}
