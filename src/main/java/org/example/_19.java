package org.example;

import org.example.object.ListNode;

import java.util.Arrays;

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

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode slow = dummyNode;
        ListNode fast = dummyNode;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        System.out.println(removeNthFromEnd2(ListNode.createListWithArr(Arrays.asList(1,2)), 2));
    }
}
