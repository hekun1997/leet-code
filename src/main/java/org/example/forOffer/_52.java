package org.example.forOffer;

import org.example.object.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hekun on 2023/1/30 11:00
 */
public class _52 {

    ListNode getIntersectionNodeWithHash(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    ListNode getIntersectionNodeWithTwoPointer(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
    public static void main(String[] args) {

    }
}
