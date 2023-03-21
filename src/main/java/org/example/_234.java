package org.example;

import org.example.object.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/3/19 21:58
 */
public class _234 {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode p = head;
        List<ListNode> list = new ArrayList<>();
        while (p != null) {
            list.add(p);
            p = p.next;
        }
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (list.get(i).val != list.get(j).val) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
