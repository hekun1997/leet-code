package org.example.forOffer;

import org.example.object.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/1/12 10:57
 */

public class _24 {
    public static void reverse(ListNode head) {

    }
    public static ListNode reverseList(ListNode head) {
        List<ListNode> allNodes = new ArrayList<>();
        while (head != null) {
            allNodes.add(head);
            head = head.next;
        }
        ListNode curr = null;
        ListNode temp = null;
        for (int i = allNodes.size() - 1; i > -1; i--) {
            temp = allNodes.get(i);
            temp.next = null;
            if (head == null) {
                head = temp;
                curr = temp;
            } else {
                curr.next = temp;
                curr = curr.next;
            }
        }
        return head;
    }

    public static ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static ListNode reverseList3(ListNode head) {
        ListNode pre = null, cur = head, next = null;
        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 0;
        ListNode curr = head;
        for (int i = 1; i < 4; i++) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }

        ListNode result = reverseList3(head);
        System.out.println(result);
    }
}
