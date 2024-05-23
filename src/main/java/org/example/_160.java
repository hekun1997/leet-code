package org.example;

import org.example.object.ListNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author hekun
 * @date 2024/5/23 10:23
 * @Description: TODO
 */
public class _160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0, sizeB = 0;
        ListNode pA = headA, pB = headB;

        while (pA != null) {
            sizeA ++;
            pA = pA.next;
        }

        while (pB != null) {
            sizeB ++;
            pB = pB.next;
        }
        //pA is min ListNode
        int subVal = 0;
        if (sizeA > sizeB) {
            subVal = sizeA - sizeB;
            pA = headB;
            pB = headA;
        } else {
            subVal = sizeB - sizeA;
            pA = headA;
            pB = headB;
        }

        for (int i = 0; i < subVal; i++) {
            pB = pB.next;
        }

        while (pA != null && pB != null) {
            if (pA == pB) {
                return pA;
            }
            pA = pA.next;
            pB = pB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode headA = ListNode.createListWithArr(Arrays.asList(2,6,4));
        ListNode headB = ListNode.createListWithArr(Arrays.asList(1,5));
        ListNode same = ListNode.createListWithArr(Arrays.asList(2,4));

        ListNode pA = headA, pB = headB;

        while (pA.next != null) {
            pA = pA.next;
        }

        while (pB.next != null) {
            pB = pB.next;
        }

//        pA.next = same;
//        pB.next = same;

        System.out.println(getIntersectionNode(headA, headB));
    }
}
