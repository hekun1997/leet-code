package org.example;

import org.example.object.ListNode;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hekun on 2021/9/24 21:12
 */

public class _21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode();
        ListNode head = p;
        while (l1 != null || l2 != null){
            if (l1 == null && l2 != null){
                p.next = l2;
                return head.next;
            }

            if (l1 != null && l2 == null){
                p.next = l1;
                return head.next;
            }

            if (l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }else {
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }
        }

        return head.next;
    }

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(arrayToListNode(Arrays.asList(1, 2, 4)), arrayToListNode(Arrays.asList(1, 3, 4))));
    }

    public static ListNode arrayToListNode(List<Integer> datas){
        ListNode ret = new ListNode(datas.get(0));
        if (datas.size() == 1){
            return ret;
        }
        ListNode curr = ret;

        for (int i = 1; i < datas.size(); i ++){
            ListNode temp = new ListNode(datas.get(i));
            curr.next = temp;
            curr = curr.next;
        }

        return ret;
    }
}