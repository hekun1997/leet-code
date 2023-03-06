package org.example.forOffer;

import org.example.object.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _6 {

    public static void traverseNode(ListNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.next == null) {
            list.add(node.val);
            return;
        }
        traverseNode(node.next, list);
        list.add(node.val);
    }

    public static int[] reversePrint(ListNode head) {
        ListNode curr = head;
        List<Integer> tempResult = new ArrayList<>();
        traverseNode(curr, tempResult);
        int[] result = new int[tempResult.size()];
        for (int i = 0; i < tempResult.size(); i++) {
            result[i] = tempResult.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.val = 0;
        ListNode curr = head;
        for (int i = 1; i < 4; i++) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        int[] result = reversePrint(null);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

